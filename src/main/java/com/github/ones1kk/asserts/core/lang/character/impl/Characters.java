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
            handler.setDescription(handler.from(actual, "{} is not lower case"));
            throw handler.getException();
        }

    }

    @Override
    public void assertIsNotLowerCase(Character actual) {
        if (Character.isLowerCase(actual)) {
            handler.setDescription(handler.from(actual, "{} is lower case"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsUpperCase(Character actual) {
        if (!Character.isUpperCase(actual)) {
            handler.setDescription(handler.from(actual, "{} is not upper case"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotUpperCase(Character actual) {
        if (Character.isUpperCase(actual)) {
            handler.setDescription(handler.from(actual, "{} is upper case"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLetter(Character actual) {
        if (!Character.isLetter(actual)) {
            handler.setDescription(handler.from(actual, "{} is not letter"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotLetter(Character actual) {
        if (Character.isLetter(actual)) {
            handler.setDescription(handler.from(actual, "{} is letter"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsDigit(Character actual) {
        if (!Character.isDigit(actual)) {
            handler.setDescription(handler.from(actual, "{} is not digit"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotDigit(Character actual) {
        if (Character.isDigit(actual)) {
            handler.setDescription(handler.from(actual, "{} is digit"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsWhitespace(Character actual) {
        if (!Character.isWhitespace(actual)) {
            handler.setDescription(handler.from(actual, "{} is not whitespace"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotWhitespace(Character actual) {
        if (Character.isWhitespace(actual)) {
            handler.setDescription(handler.from(actual, "{} is whitespace"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Character actual, Character expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Character actual, Character expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Character actual, Character expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Character actual, Character expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Character actual, Character start, Character end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            String description = handler.getDescribable().as("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

}
