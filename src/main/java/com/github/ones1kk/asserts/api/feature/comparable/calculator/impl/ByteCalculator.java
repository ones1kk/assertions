package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class ByteCalculator implements ComparableCalculatorInterface<Byte> {

    @Override
    public boolean isGraterThan(Byte actual, Byte expected) {
        return Byte.compare(actual, expected) > 0;
    }

    @Override
    public boolean isLessThan(Byte actual, Byte expected) {
        return Byte.compare(actual, expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(Byte actual, Byte expected) {
        return Byte.compare(actual, expected) <= 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(Byte actual, Byte expected) {
        return Byte.compare(actual, expected) >= 0;
    }

    @Override
    public boolean is(Byte actual, Byte expected) {
        return actual.equals(expected);
    }
}
