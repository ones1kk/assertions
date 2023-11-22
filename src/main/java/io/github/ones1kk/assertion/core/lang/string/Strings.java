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

import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;
import io.github.ones1kk.assertion.core.lang.charsequence.CharSequences;
import io.github.ones1kk.assertion.core.message.StringErrorMessages;

import java.util.regex.Pattern;

/**
 * <strong> The Strings class inherits {@link CharSequences} </strong>
 */
public class Strings extends CharSequences<String> implements StringsAssertion<String> {

    /**
     * assert actual has text.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertHasText(AssertionsInfo info, String actual) {
        for (char c : actual.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                return;
            }
        }
        throw failures.failure(info, StringErrorMessages.shouldHasText(actual));
    }

    /**
     * assert actual has expected length.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertHasLength(AssertionsInfo info, String actual, int expected) {
        if (actual.length() != expected) {
            throw failures.failure(info, StringErrorMessages.shouldHasLength(actual));
        }
    }

    /**
     * assert actual has same length of expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertHasSameLength(AssertionsInfo info, String actual, String expected) {
        if (actual.length() != expected.length()) {
            throw failures.failure(info, StringErrorMessages.shouldHasSameLength(actual, expected));
        }
    }

    /**
     * assert actual matches regex.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     * @param regex  regex
     */
    @Override
    public void assertMatches(AssertionsInfo info, String actual, String regex) {
        if (!actual.matches(regex)) {
            throw failures.failure(info, StringErrorMessages.shouldMatches(actual, regex));
        }
    }

    /**
     * assert actual matches expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertMatches(AssertionsInfo info, String actual, Pattern expected) {
        if (!expected.matcher(actual).matches()) {
            throw failures.failure(info, StringErrorMessages.shouldMatches(actual, expected));
        }
    }
}
