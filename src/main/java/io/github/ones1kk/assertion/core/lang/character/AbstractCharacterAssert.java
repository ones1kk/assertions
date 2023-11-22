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

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractCharacterAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Character type and verify assertion.</p>
 */
public class AbstractCharacterAssert extends AbstractObjectAssert<Character> implements CharacterAssertion<AbstractCharacterAssert> {

    private final CharactersAssertion characters;

    public AbstractCharacterAssert(Character character) {
        super(character);
        this.characters = new Characters();
    }

    /**
     * verify actual is lower case or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isLowerCase() {
        objects.assertNotNull(info, actual);
        characters.assertLowerCase(info, actual);
        return this;
    }

    /**
     * verify actual is not lower case or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotLowerCase() {
        objects.assertNotNull(info, actual);
        characters.assertNotLowerCase(info, actual);
        return this;
    }

    /**
     * verify actual is upper case or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isUpperCase() {
        objects.assertNotNull(info, actual);
        characters.assertUpperCase(info, actual);
        return this;
    }

    /**
     * verify actual is not upper case or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotUpperCase() {
        objects.assertNotNull(info, actual);
        characters.assertNotUpperCase(info, actual);
        return this;
    }

    /**
     * verify actual is letter or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isLetter() {
        objects.assertNotNull(info, actual);
        characters.assertLetter(info, actual);
        return this;
    }

    /**
     * verify actual is not letter or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotLetter() {
        objects.assertNotNull(info, actual);
        characters.assertNotLetter(info, actual);
        return this;
    }

    /**
     * verify actual is digit or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isDigit() {
        objects.assertNotNull(info, actual);
        characters.assertDigit(info, actual);
        return this;
    }

    /**
     * verify actual is not digit or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotDigit() {
        objects.assertNotNull(info, actual);
        characters.assertNotDigit(info, actual);
        return this;
    }

    /**
     * verify actual is white space or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isWhitespace() {
        objects.assertNotNull(info, actual);
        characters.assertWhitespace(info, actual);
        return this;
    }

    /**
     * verify actual is not white space or not.
     *
     * @return {@link AbstractCharacterAssert}.
     */
    @Override
    public AbstractCharacterAssert isNotWhitespace() {
        objects.assertNotNull(info, actual);
        characters.assertNotWhitespace(info, actual);
        return this;
    }
}
