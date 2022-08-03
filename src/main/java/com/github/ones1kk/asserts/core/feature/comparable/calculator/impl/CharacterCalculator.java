package com.github.ones1kk.asserts.core.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.core.feature.comparable.calculator.AbstractComparableCalculator;

public class CharacterCalculator extends AbstractComparableCalculator<Character> {

    @Override
    public boolean isGraterThan(Character actual, Character expected) {
        if (isPrimitive(actual, expected)) {
            return Character.compare(actual, expected) > 0;
        }
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isLessThan(Character actual, Character expected) {
        if (isPrimitive(actual, expected)) {
            return Character.compare(actual, expected) < 0;
        }
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Character actual, Character expected) {
        if (isPrimitive(actual, expected)) {
            return Character.compare(actual, expected) <= 0;
        }
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Character actual, Character expected) {
        if (isPrimitive(actual, expected)) {
            return Character.compare(actual, expected) >= 0;
        }
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(Character character, Character expected) {
        return character.equals(expected);
    }
}
