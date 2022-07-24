package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class FloatCalculator implements ComparableCalculatorInterface<Float> {

    @Override
    public boolean isGraterThan(Float actual, Float expected) {
        return Float.compare(actual, expected) > 0;
    }

    @Override
    public boolean isLessThan(Float actual, Float expected) {
        return Float.compare(actual, expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Float actual, Float expected) {
        return Float.compare(actual, expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Float actual, Float expected) {
        return Float.compare(actual, expected) >= 0;
    }

    @Override
    public boolean is(Float actual, Float expected) {
        return actual.equals(expected);
    }
}
