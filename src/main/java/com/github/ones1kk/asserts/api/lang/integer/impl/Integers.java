package com.github.ones1kk.asserts.api.lang.integer.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.feature.Offset;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.impl.IntegerCalculator;
import com.github.ones1kk.asserts.api.lang.integer.IntegersInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

public class Integers extends Objects<Integer> implements IntegersInterface<Integer> {

    private final ComparableCalculatorInterface<Integer> calculator = new IntegerCalculator();

    public Integers(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLessThan(Integer actual, Integer expected) {

    }

    @Override
    public void assertIsLessThanOrEqualTo(Integer actual, Integer expected) {

    }

    @Override
    public void assertIsGreaterThan(Integer actual, Integer expected) {

    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Integer actual, Integer expected) {

    }

    @Override
    public void assertIsBetween(Integer actual, Integer start, Integer end) {

    }

    @Override
    public void assertIsPositive(Integer actual) {

    }

    @Override
    public void assertIsNotPositive(Integer actual) {

    }

    @Override
    public void assertIsNegative(Integer actual) {

    }

    @Override
    public void assertIsNotNegative(Integer actual) {

    }

    @Override
    public void assertIsZero(Integer actual) {

    }

    @Override
    public void assertIsNotZero(Integer actual) {

    }

    @Override
    public void assertIsCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {

    }

    @Override
    public void assertIsNotCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {

    }
}
