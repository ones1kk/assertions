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

import io.github.ones1kk.assertion.core.AbstractAssert;
import io.github.ones1kk.assertion.core.feature.comparable.Comparable;

/**
 * <strong> The AbstractCharacterAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Character type and verify assertion.</p>
 */
public abstract class AbstractCharacterAssert extends AbstractAssert<AbstractCharacterAssert, Character> implements CharacterAssertion<AbstractCharacterAssert>, Comparable<AbstractCharacterAssert, Character> {

    private final CharactersAssertion characters;

    public AbstractCharacterAssert(Class<?> self, Character actual) {
        super(self, actual);
        this.characters = new Characters();
    }

    /**
     * verify actual is lower case.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isLowerCase() {
        objects.assertNotNull(info, actual);
        characters.assertLowerCase(info, actual);
        return self;
    }

    /**
     * verify actual is not lower case.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotLowerCase() {
        objects.assertNotNull(info, actual);
        characters.assertNotLowerCase(info, actual);
        return self;
    }

    /**
     * verify actual is upper case.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isUpperCase() {
        objects.assertNotNull(info, actual);
        characters.assertUpperCase(info, actual);
        return self;
    }

    /**
     * verify actual is not upper case.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotUpperCase() {
        objects.assertNotNull(info, actual);
        characters.assertNotUpperCase(info, actual);
        return self;
    }

    /**
     * verify actual is letter.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isLetter() {
        objects.assertNotNull(info, actual);
        characters.assertLetter(info, actual);
        return self;
    }

    /**
     * verify actual is not letter.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotLetter() {
        objects.assertNotNull(info, actual);
        characters.assertNotLetter(info, actual);
        return self;
    }

    /**
     * verify actual is digit.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isDigit() {
        objects.assertNotNull(info, actual);
        characters.assertDigit(info, actual);
        return self;
    }

    /**
     * verify actual is not digit.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotDigit() {
        objects.assertNotNull(info, actual);
        characters.assertNotDigit(info, actual);
        return self;
    }

    /**
     * verify actual is white space.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isWhitespace() {
        objects.assertNotNull(info, actual);
        characters.assertWhitespace(info, actual);
        return self;
    }

    /**
     * verify actual is not white space.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotWhitespace() {
        objects.assertNotNull(info, actual);
        characters.assertNotWhitespace(info, actual);
        return self;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isLessThan(Character expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        characters.assertLessThan(info, actual, expected);
        return self;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isLessThanOrEqualTo(Character expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        characters.assertLessThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isGreaterThan(Character expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        characters.assertGreaterThan(info, actual, expected);
        return self;
    }

    /**
     * verify actual is greater than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isGreaterThanOrEqualTo(Character expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        characters.assertGreaterThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isBetween(Character start, Character end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        characters.assertBetween(info, actual, start, end);
        return self;
    }
}
