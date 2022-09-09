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

package com.github.ones1kk.asserts.core.lang.character;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractCharacterAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br><br>
 * <p> This is that implements the assertion method of the Character type and verify assertion.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractCharacterAssert<SELF extends AbstractCharacterAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Character> implements CharacterAssertInterface<SELF> {

    private final CharactersInterface<Character> characters;

    public AbstractCharacterAssert(Class<?> self, Character actual) {
        super(self, actual);
        this.characters = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is lower case or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isLowerCase() {
        characters.assertIsLowerCase(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not lower case or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotLowerCase() {
        characters.assertIsNotLowerCase(actual);
        return self;
    }

    /**
     * Verify {@code actual} is upper case or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isUpperCase() {
        characters.assertIsUpperCase(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not upper case or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotUpperCase() {
        characters.assertIsNotUpperCase(actual);
        return self;
    }

    /**
     * Verify {@code actual} is letter or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isLetter() {
        characters.assertIsLetter(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not letter or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotLetter() {
        characters.assertIsNotLetter(actual);
        return self;
    }

    /**
     * Verify {@code actual} is digit or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isDigit() {
        characters.assertIsDigit(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not digit or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotDigit() {
        characters.assertIsNotDigit(actual);
        return self;
    }

    /**
     * Verify {@code actual} is whitespace or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isWhitespace() {
        characters.assertIsWhitespace(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not whitespace or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotWhitespace() {
        characters.assertIsNotWhitespace(actual);
        return self;
    }

    /**
     * Verify {@code actual} is less than {@code expected}
     *
     * @param expected greater than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThan(Character expected) {
        characters.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThanOrEqualTo(Character expected) {
        characters.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThan(Character expected) {
        characters.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to {@code expected}
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Character expected) {
        characters.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is between {@code start} and {@code end}
     *
     * @param start less than or Equal to {@code actual}
     * @param end   greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isBetween(Character start, Character end) {
        characters.assertIsBetween(actual, start, end);
        return self;
    }
}
