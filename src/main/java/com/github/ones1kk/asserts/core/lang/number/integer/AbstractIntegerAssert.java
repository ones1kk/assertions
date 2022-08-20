package com.github.ones1kk.asserts.core.lang.number.integer;

import com.github.ones1kk.asserts.core.feature.Offset;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractIntegerAssert<SELF extends AbstractIntegerAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Integer> implements IntegerAssertInterface<SELF> {

    private final IntegersInterface<Integer> integers;

    public AbstractIntegerAssert(Class<?> self, Integer actual) {
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
    public SELF isCloseTo(Integer expected, Integer offset) {
        integers.assertIsCloseTo(actual, expected, Offset.offset(offset));
        return self;
    }

    @Override
    public SELF isNotCloseTo(Integer expected, Integer offset) {
        integers.assertIsNotCloseTo(actual, expected, Offset.offset(offset));
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
