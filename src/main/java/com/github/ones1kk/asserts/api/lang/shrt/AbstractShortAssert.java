package com.github.ones1kk.asserts.api.lang.shrt;

import com.github.ones1kk.asserts.api.feature.Offset;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

public class AbstractShortAssert<SELF extends AbstractShortAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Short> implements ShortAssertInterface<SELF>  {

    private final ShortsInterface<Short> shorts;

    public AbstractShortAssert(Class<?> self, Short actual) {
        super(self, actual);
        this.shorts = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isOdd() {
        shorts.assertIsOdd(actual);
        return self;
    }

    @Override
    public SELF isNotOdd() {
        shorts.assertIsNotOdd(actual);
        return self;
    }

    @Override
    public SELF isEven() {
        shorts.assertIsEven(actual);
        return self;
    }

    @Override
    public SELF isNotEven() {
        shorts.assertIsNotEven(actual);
        return self;
    }

    @Override
    public SELF isLessThan(Short expected) {
        shorts.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Short expected) {
        shorts.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Short expected) {
        shorts.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Short expected) {
        shorts.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Short start, Short end) {
        shorts.assertIsBetween(actual, start, end);
        return self;
    }

    @Override
    public SELF isPositive() {
        shorts.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        shorts.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        shorts.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        shorts.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        shorts.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        shorts.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isCloseTo(Short expected, Offset<Short> offset) {
        shorts.assertIsCloseTo(actual, expected, offset);
        return self;
    }

    @Override
    public SELF isNotCloseTo(Short expected, Offset<Short> offset) {
        shorts.assertIsNotCloseTo(actual, expected, offset);
        return self;
    }
}
