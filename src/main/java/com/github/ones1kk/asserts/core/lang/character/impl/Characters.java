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

package com.github.ones1kk.asserts.core.lang.character.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.lang.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.lang.character.CharactersInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.message.CharacterErrorMessages.*;
import static com.github.ones1kk.asserts.core.message.ComparableErrorMessages.*;

/**
 * <strong> The Characters class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public final class Characters extends Objects<Character> implements CharactersInterface<Character> {

    private final ComparableLanguage<Character> comparable = new ComparableLanguageImpl<>();

    public Characters(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLowerCase(Character actual) {
        if (!Character.isLowerCase(actual)) {
            handler.receive(actual, shouldBeLowerCase(actual));
            throw handler.getException();
        }

    }

    @Override
    public void assertIsNotLowerCase(Character actual) {
        if (Character.isLowerCase(actual)) {
            handler.receive(actual, shouldNotBeLowerCase(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsUpperCase(Character actual) {
        if (!Character.isUpperCase(actual)) {
            handler.receive(actual, shouldBeUpperCase(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotUpperCase(Character actual) {
        if (Character.isUpperCase(actual)) {
            handler.receive(actual, shouldNotBeUpperCase(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLetter(Character actual) {
        if (!Character.isLetter(actual)) {
            handler.receive(actual, shouldBeLetter(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotLetter(Character actual) {
        if (Character.isLetter(actual)) {
            handler.receive(actual, shouldNotBeLetter(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsDigit(Character actual) {
        if (!Character.isDigit(actual)) {
            handler.receive(actual, shouldBeDigit(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotDigit(Character actual) {
        if (Character.isDigit(actual)) {
            handler.receive(actual, shouldNotBeDigit(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsWhitespace(Character actual) {
        if (!Character.isWhitespace(actual)) {
            handler.receive(actual, shouldBeWhitespace(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotWhitespace(Character actual) {
        if (Character.isWhitespace(actual)) {
            handler.receive(actual, shouldNotBeWhitespace(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Character actual, Character expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Character actual, Character expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Character actual, Character expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Character actual, Character expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Character actual, Character start, Character end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

}
