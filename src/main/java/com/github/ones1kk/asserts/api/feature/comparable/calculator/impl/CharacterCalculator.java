package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class CharacterCalculator implements ComparableCalculatorInterface<Character> {

    @Override
    public boolean isGraterThan(Character character, Character expected) {
        return false;
    }

    @Override
    public boolean isLessThan(Character character, Character expected) {
        return false;
    }

    @Override
    public boolean isLessThanOrEqualTo(Character character, Character expected) {
        return false;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Character character, Character expected) {
        return false;
    }
}
