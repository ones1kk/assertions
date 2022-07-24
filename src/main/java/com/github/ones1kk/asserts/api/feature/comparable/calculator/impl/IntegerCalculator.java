package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class IntegerCalculator implements ComparableCalculatorInterface<Integer> {

    @Override
    public boolean isGraterThan(Integer actual, Integer expected) {
        return Integer.compare(actual, expected) > 0;
    }

    @Override
    public boolean isLessThan(Integer actual, Integer expected) {
        return Integer.compare(actual, expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Integer actual, Integer expected) {
        return Integer.compare(actual, expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Integer actual, Integer expected) {
        return Integer.compare(actual, expected) >= 0;
    }

    @Override
    public boolean is(Integer actual, Integer expected) {
        return actual.equals(expected);
    }
}
