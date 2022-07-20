package com.github.ones1kk.asserts.api.lang.lng;

import com.github.ones1kk.asserts.api.feature.Offset;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

public class AbstractLongAssert<SELF extends AbstractLongAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Long> implements LongAssertInterface<SELF> {

    private final LongsInterface<Long> longs;

    public AbstractLongAssert(Class<?> self, Long actual) {
        super(self, actual);
        this.longs = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isOdd() {
        longs.assertIsOdd(actual);
        return self;
    }

    @Override
    public SELF isNotOdd() {
        longs.assertIsNotOdd(actual);
        return self;
    }

    @Override
    public SELF isEven() {
        longs.assertIsEven(actual);
        return self;
    }

    @Override
    public SELF isNotEven() {
        longs.assertIsNotEven(actual);
        return self;
    }

    @Override
    public SELF isPositive() {
        longs.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        longs.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        longs.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        longs.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        longs.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        longs.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isLessThan(Long expected) {
        longs.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Long expected) {
        longs.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Long expected) {
        longs.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Long expected) {
        longs.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Long start, Long end) {
        longs.assertIsBetween(actual, start, end);
        return self;
    }

    @Override
    public SELF isCloseTo(Long expected, Offset<Long> offset) {
        longs.assertIsCloseTo(actual, expected, offset);
        return self;
    }

    @Override
    public SELF isNotCloseTo(Long expected, Offset<Long> offset) {
        longs.assertIsNotCloseTo(actual, expected, offset);
        return self;
    }

}
