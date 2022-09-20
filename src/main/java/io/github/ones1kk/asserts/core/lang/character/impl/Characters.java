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

package io.github.ones1kk.asserts.core.lang.character.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.asserts.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.asserts.core.lang.character.CharactersInterface;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.impl.Objects;
import io.github.ones1kk.asserts.core.message.CharacterErrorMessages;
import io.github.ones1kk.asserts.core.message.ComparableErrorMessages;

/**
 * <strong> The Characters class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Characters extends Objects<Character> implements CharactersInterface<Character> {

    private final ComparableLanguage<Character> comparable = new ComparableLanguageImpl<>();

    public Characters(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLowerCase(Character actual) {
        if (!Character.isLowerCase(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldBeLowerCase(actual));
            throw handler.getException();
        }

    }

    @Override
    public void assertIsNotLowerCase(Character actual) {
        if (Character.isLowerCase(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldNotBeLowerCase(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsUpperCase(Character actual) {
        if (!Character.isUpperCase(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldBeUpperCase(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotUpperCase(Character actual) {
        if (Character.isUpperCase(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldNotBeUpperCase(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLetter(Character actual) {
        if (!Character.isLetter(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldBeLetter(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotLetter(Character actual) {
        if (Character.isLetter(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldNotBeLetter(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsDigit(Character actual) {
        if (!Character.isDigit(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldBeDigit(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotDigit(Character actual) {
        if (Character.isDigit(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldNotBeDigit(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsWhitespace(Character actual) {
        if (!Character.isWhitespace(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldBeWhitespace(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotWhitespace(Character actual) {
        if (Character.isWhitespace(actual)) {
            handler.receive(actual, CharacterErrorMessages.shouldNotBeWhitespace(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Character actual, Character expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Character actual, Character expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Character actual, Character expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Character actual, Character expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Character actual, Character start, Character end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

}
