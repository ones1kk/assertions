package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.AbstractComparableCalculator;

public class IntegerComparableImpl extends AbstractComparableCalculator<Integer> {

    @Override
    public boolean isGraterThan(Integer actual, Integer expected) {
        if (isPrimitive(actual, expected)) {
            return Integer.compare(actual, expected) > 0;
        }
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isLessThan(Integer actual, Integer expected) {
        if (isPrimitive(actual, expected)) {
            return Integer.compare(actual, expected) < 0;
        }
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Integer actual, Integer expected) {
        if (isPrimitive(actual, expected)) {
            return Integer.compare(actual, expected) <= 0;
        }
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Integer actual, Integer expected) {
        if (isPrimitive(actual, expected)) {
            return Integer.compare(actual, expected) >= 0;
        }
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(Integer actual, Integer expected) {
        return actual.equals(expected);
    }
}
