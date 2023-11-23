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
package io.github.ones1kk.assertion.core.lang.character;

import io.github.ones1kk.assertion.core.feature.compare.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.compare.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.CharacterErrorMessage;

/**
 * <strong> The Characters class inherits {@link AbstractObjectAssert} </strong>
 */
public class Characters extends Objects<Character> implements CharactersAssertion {

    private final ComparableLanguage<Character> comparable = new ComparableLanguageImpl<>();

    /**
     * assert actual is lower case.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertLowerCase(AssertionsInfo info, Character actual) {
        if (!Character.isLowerCase(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldBeLowerCase(actual));
        }
    }

    /**
     * assert actual is not lower case.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotLowerCase(AssertionsInfo info, Character actual) {
        if (Character.isLowerCase(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldNotBeLowerCase(actual));
        }
    }

    /**
     * assert actual is upper case.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertUpperCase(AssertionsInfo info, Character actual) {
        if (!Character.isUpperCase(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldBeUpperCase(actual));
        }
    }

    /**
     * assert actual is not upper case.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotUpperCase(AssertionsInfo info, Character actual) {
        if (Character.isUpperCase(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldNotBeUpperCase(actual));
        }
    }

    /**
     * assert actual is letter.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertLetter(AssertionsInfo info, Character actual) {
        if (!Character.isLetter(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldBeLetter(actual));
        }
    }

    /**
     * assert actual is not letter.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotLetter(AssertionsInfo info, Character actual) {
        if (Character.isLetter(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldNotBeLetter(actual));
        }
    }

    /**
     * assert actual is digit.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertDigit(AssertionsInfo info, Character actual) {
        if (!Character.isDigit(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldBeDigit(actual));
        }
    }

    /**
     * assert actual is not digit.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotDigit(AssertionsInfo info, Character actual) {
        if (Character.isDigit(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldNotBeDigit(actual));
        }
    }

    /**
     * assert actual is whitespace.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertWhitespace(AssertionsInfo info, Character actual) {
        if (!Character.isWhitespace(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldBeWhitespace(actual));
        }
    }

    /**
     * assert actual is not whitespace.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotWhitespace(AssertionsInfo info, Character actual) {
        if (Character.isWhitespace(actual)) {
            throw failures.failure(info, CharacterErrorMessage.shouldNotBeWhitespace(actual));
        }
    }

    /**
     * assert actual is less than expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLessThan(AssertionsInfo info, Character actual, Character expected) {
        if (comparable.isGreaterThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessages.shouldBeLessThan(actual, expected));
        }

    }

    /**
     * assert actual is less than or equal to expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLessThanOrEqualTo(AssertionsInfo info, Character actual, Character expected) {
        if (comparable.isGreaterThan(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessages.shouldBeLessThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert actual is greater than expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertGreaterThan(AssertionsInfo info, Character actual, Character expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessages.shouldBeGreaterThan(actual, expected));
        }
    }

    /**
     * assert actual is greater than or equal to expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertGreaterThanOrEqualTo(AssertionsInfo info, Character actual, Character expected) {
        if (comparable.isLessThan(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessages.shouldBeGreaterThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert actual is between start and end.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     * @param start  start
     * @param end    end
     */
    @Override
    public void assertBetween(AssertionsInfo info, Character actual, Character start, Character end) {
        if (comparable.isLessThan(actual, start) || comparable.isGreaterThan(actual, end)) {
            throw failures.failure(info, ComparableErrorMessages.shouldBeBetween(actual, start, end));
        }
    }
}
