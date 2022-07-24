package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class DoubleCalculator implements ComparableCalculatorInterface<Double> {

    @Override
    public boolean isGraterThan(Double actual, Double expected) {
        return Double.compare(actual, expected) > 0;
    }

    @Override
    public boolean isLessThan(Double actual, Double expected) {
        return Double.compare(actual, expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Double actual, Double expected) {
        return Double.compare(actual, expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Double actual, Double expected) {
        return Double.compare(actual, expected) >= 0;
    }

    @Override
    public boolean is(Double actual, Double expected) {
        return actual.equals(expected);
    }
}
