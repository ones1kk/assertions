package com.github.ones1kk.asserts.api.lang.character.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.impl.CharacterCalculator;
import com.github.ones1kk.asserts.api.lang.character.CharactersInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

public class Characters extends Objects<Character> implements CharactersInterface<Character> {

    private final ComparableCalculatorInterface<Character> calculator = new CharacterCalculator();

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
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Character actual, Character expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Character actual, Character expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Character actual, Character expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Character actual, Character start, Character end) {
        if (calculator.isLessThan(actual, start) || calculator.isGraterThan(actual, end)) {
            // TODO : getter
            String description = handler.getDescribable().as("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

}
