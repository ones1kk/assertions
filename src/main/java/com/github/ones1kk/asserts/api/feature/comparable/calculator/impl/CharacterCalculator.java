package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class CharacterCalculator implements ComparableCalculatorInterface<Character> {

    @Override
    public boolean isGraterThan(Character actual, Character expected) {
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean isLessThan(Character actual, Character expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Character actual, Character expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Character actual, Character expected) {
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean is(Character character, Character expected) {
        return character.equals(expected);
    }
}
