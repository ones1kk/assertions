package com.github.ones1kk.asserts.core.lang.number.integer;

import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractIntegerAssertAssert<SELF extends AbstractIntegerAssertAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Integer> implements IntegerAssertAssertInterface<SELF> {

    private final IntegersInterface<Integer> integers;

    public AbstractIntegerAssertAssert(Class<?> self, Integer actual) {
        super(self, actual);
        this.integers = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isOdd() {
        integers.assertIsOdd(actual);
        return self;
    }

    @Override
    public SELF isNotOdd() {
        integers.assertIsNotOdd(actual);
        return self;
    }

    @Override
    public SELF isEven() {
        integers.assertIsEven(actual);
        return self;
    }

    @Override
    public SELF isNotEven() {
        integers.assertIsNotEven(actual);
        return self;
    }

    @Override
    public SELF isPositive() {
        integers.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        integers.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        integers.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        integers.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        integers.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        integers.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isCloseTo(Integer expected, Double percentage) {
        integers.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    @Override
    public SELF isNotCloseTo(Integer expected, Double percentage) {
        integers.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    @Override
    public SELF isLessThan(Integer expected) {
        integers.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Integer expected) {
        integers.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Integer expected) {
        integers.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Integer expected) {
        integers.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Integer start, Integer end) {
        integers.assertIsBetween(actual, start, end);
        return self;
    }

}
