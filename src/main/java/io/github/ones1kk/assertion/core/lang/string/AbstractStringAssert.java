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
public class AbstractStringAssert extends AbstractCharSequenceAssert<String> implements StringAssertion<AbstractStringAssert, String> {

    private final StringsAssertion<String> strings;

    public AbstractStringAssert(String actual) {
        super(actual);
        this.strings = new Strings();
    }

    /**
     * verify actual has text or not.
     *
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert hasText() {
        strings.assertHasText(info, actual);
        return this;
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
        return this;
    }

    /**
     * verify actual has same length of expected or not.
     *
     * @param expected expected.
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert hasSameLength(String expected) {
        strings.assertHasSameLength(info, actual, expected);
        return this;
    }

    /**
     * verify actual matches to regex or not.
     *
     * @param regex regex
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert matches(String regex) {
        objects.assertNotNull(info, regex);
        strings.assertHasText(info, regex);
        strings.assertMatches(info, actual, regex);
        return this;
    }

    /**
     * verify actual matches expected pattern or not.
     *
     * @param expected expected.
     * @return {@link AbstractStringAssert}.
     */
    @Override
    public AbstractStringAssert matches(Pattern expected) {
        strings.assertMatches(info, actual, expected);
        return this;
    }
}
