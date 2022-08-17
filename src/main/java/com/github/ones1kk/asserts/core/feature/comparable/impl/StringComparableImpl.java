package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;

public class StringComparableImpl implements ComparableCalculatorInterface<String> {

    @Override
    public boolean isGraterThan(String actual, String expected) {
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isLessThan(String actual, String expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(String actual, String expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(String actual, String expected) {
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(String actual, String expected) {
        return actual.equals(expected);
    }

}
