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

import io.github.ones1kk.assertion.core.Asserts;
import io.github.ones1kk.assertion.core.lang.charsequence.AbstractCharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.number.integer.AbstractIntegerAssert;

import java.util.regex.Pattern;

/**
 * /**
 * <strong> The AbstractFloatAssert class inherits {@link AbstractCharSequenceAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Float type and verify assertion.</p>
 *
 * @param <SELF> {@code self}.
 */
public class AbstractStringAssert<SELF extends AbstractStringAssert<SELF>> extends AbstractCharSequenceAssert<SELF, String> implements StringAssertInterface<SELF, String> {

    private final StringsInterface<String> strings;

    public AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
        this.strings = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} has text or not.
     *
     * @return {@code self}.
     */
    public SELF hasText() {
        strings.assertHasText(actual);
        return self;
    }

    /**
     * Verify {@code actual} is matched to {@code expected} or not.
     *
     * @return {@code self}.
     */
    public SELF matches(String expected) {
        strings.assertMatches(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is matched to {@code expected} or not.
     *
     * @return {@code self}.
     */
    public SELF matches(Pattern expected) {
        strings.assertMatches(actual, expected);
        return self;
    }

    /**
     * Convert length of {@code actual}
     *
     * @return {@link AbstractIntegerAssert}
     */
    public AbstractIntegerAssert<?, ?> asLength() {
        return Asserts.that(actual.length());
    }
}
