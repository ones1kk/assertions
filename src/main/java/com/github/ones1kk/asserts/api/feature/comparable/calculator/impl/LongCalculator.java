package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class LongCalculator implements ComparableCalculatorInterface<Long> {

    @Override
    public boolean isGraterThan(Long actual, Long expected) {
        return Long.compare(actual, expected) == 1;
    }

    @Override
    public boolean isLessThan(Long actual, Long expected) {
        return Long.compare(actual, expected) == -1;
    }

    @Override
    public boolean isLessThanOrEqualTo(Long actual, Long expected) {
        return (Long.compare(actual, expected) == -1 || Long.compare(actual, expected) == 0);
    }

    @Override
    public boolean isGraterThanOrEqualTo(Long actual, Long expected) {
        return (Long.compare(actual, expected) == 1 || Long.compare(actual, expected) == 0);
    }

    @Override
    public boolean is(Long actual, Long expected) {
        return actual.equals(expected);
    }
}
