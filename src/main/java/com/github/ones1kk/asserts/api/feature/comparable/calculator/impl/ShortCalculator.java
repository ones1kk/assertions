package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class ShortCalculator implements ComparableCalculatorInterface<Short> {

    @Override
    public boolean isGraterThan(Short actual, Short expected) {
        return Short.compare(actual, expected) > 0;
    }

    @Override
    public boolean isLessThan(Short actual, Short expected) {
        return Short.compare(actual, expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Short actual, Short expected) {
        return Short.compare(actual, expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Short actual, Short expected) {
        return Short.compare(actual, expected) >= 0;
    }

    @Override
    public boolean is(Short actual, Short expected) {
        return actual.equals(expected);
    }
}