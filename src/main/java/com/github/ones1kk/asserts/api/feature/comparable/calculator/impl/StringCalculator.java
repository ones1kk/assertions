package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;

public class StringCalculator implements ComparableCalculatorInterface<String> {
    @Override
    public boolean isGraterThan(String actual, String expected) {
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean isLessThan(String actual, String expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(String actual, String expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(String actual, String expected) {
        return actual.compareTo(expected) > 0;
    }

}
