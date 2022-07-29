package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.AbstractComparableCalculator;

public class DoubleCalculator extends AbstractComparableCalculator<Double> {

    @Override
    public boolean isGraterThan(Double actual, Double expected) {
        if (isPrimitive(actual, expected)) {
            return Double.compare(actual, expected) > 0;
        }
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isLessThan(Double actual, Double expected) {
        if (isPrimitive(actual, expected)) {
            return Double.compare(actual, expected) < 0;
        }
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Double actual, Double expected) {
        if (isPrimitive(actual, expected)) {
            return Double.compare(actual, expected) <= 0;
        }
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Double actual, Double expected) {
        if (isPrimitive(actual, expected)) {
            return Double.compare(actual, expected) >= 0;
        }
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(Double actual, Double expected) {
        return actual.equals(expected);
    }
}
