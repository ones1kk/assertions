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

    }

    @Override
    public void assertIsNotLowerCase(Character actual) {

    }

    @Override
    public void assertIsUpperCase(Character actual) {

    }

    @Override
    public void assertIsNotUpperCase(Character actual) {

    }

    @Override
    public void assertIsLetter(Character actual) {

    }

    @Override
    public void assertIsNotLetter(Character actual) {

    }

    @Override
    public void assertIsDigit(Character actual) {

    }

    @Override
    public void assertIsNotDigit(Character actual) {

    }

    @Override
    public void assertIsWhitespace(Character actual) {

    }

    @Override
    public void assertIsNotWhitespace(Character actual) {

    }

    @Override
    public void assertIsLessThan(Character actual, Character expected) {

    }

    @Override
    public void assertIsLessThanOrEqualTo(Character actual, Character expected) {

    }

    @Override
    public void assertIsGreaterThan(Character actual, Character expected) {

    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Character actual, Character expected) {

    }

    @Override
    public void assertIsBetween(Character actual, Character start, Character end) {

    }

}
