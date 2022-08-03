package com.github.ones1kk.asserts.core.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.core.feature.comparable.calculator.AbstractComparableCalculator;

public class LongCalculator extends AbstractComparableCalculator<Long> {

    @Override
    public boolean isGraterThan(Long actual, Long expected) {
        if (isPrimitive(actual, expected)) {
            return Long.compare(actual, expected) > 0;
        }
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isLessThan(Long actual, Long expected) {
        if (isPrimitive(actual, expected)) {
            return Long.compare(actual, expected) < 0;
        }
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Long actual, Long expected) {
        if (isPrimitive(actual, expected)) {
            return Long.compare(actual, expected) <= 0;
        }
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Long actual, Long expected) {
        if (isPrimitive(actual, expected)) {
            return Long.compare(actual, expected) >= 0;
        }
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(Long actual, Long expected) {
        return actual.equals(expected);
    }
}
