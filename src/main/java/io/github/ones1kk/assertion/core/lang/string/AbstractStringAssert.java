/*
 * Copyright (c) 2022. Wonsik Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.ones1kk.assertion.core.lang.string;

import io.github.ones1kk.assertion.core.lang.charsequence.AbstractCharSequenceAssert;

import java.util.regex.Pattern;


/**
 * /**
 * <strong> The AbstractFloatAssert class inherits {@link AbstractCharSequenceAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Float type and verify assertion.</p>
 */
public abstract class AbstractStringAssert extends AbstractCharSequenceAssert<AbstractStringAssert, String> implements StringAssertion<AbstractStringAssert, String> {

    private final StringsAssertion<String> strings;

    public AbstractStringAssert(String actual) {
        super(AbstractStringAssert.class, actual);
        this.strings = new Strings();
    }

    /**
     * verify actual has text.
     *
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert hasText() {
        strings.assertHasText(info, actual);
        return self;
    }

    /**
     * verify actual has expected length.
     *
     * @param expected expected.
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert hasLength(int expected) {
        strings.assertHasLength(info, actual, expected);
        return self;
    }

    /**
     * verify actual has same length of expected.
     *
     * @param expected expected.
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert hasSameLength(String expected) {
        strings.assertHasSameLength(info, actual, expected);
        return self;
    }

    /**
     * verify actual matches to regex.
     *
     * @param regex regex
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert matches(String regex) {
        strings.assertNotNull(info, regex);
        strings.assertHasText(info, regex);
        strings.assertMatches(info, actual, regex);
        return self;
    }

    /**
     * verify actual matches expected pattern.
     *
     * @param expected expected.
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert matches(Pattern expected) {
        strings.assertMatches(info, actual, expected);
        return self;
    }
}
