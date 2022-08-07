package com.github.ones1kk.asserts.core.lang.flot;

import com.github.ones1kk.asserts.core.feature.Offset;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractFloatAssert<SELF extends AbstractFloatAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Float> implements FloatAssertInterface<SELF> {

    private final FloatsInterface<Float> floats;

    public AbstractFloatAssert(Class<?> self, Float actual) {
        super(self, actual);
        this.floats = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isInfinity() {
        floats.assertIsInfinity(actual);
        return self;
    }

    @Override
    public SELF isFinite() {
        floats.assertIsFinite(actual);
        return self;
    }

    @Override
    public SELF isNaN() {
        floats.assertIsNaN(actual);
        return self;
    }

    @Override
    public SELF isPositive() {
        floats.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        floats.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        floats.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        floats.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        floats.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        floats.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isCloseTo(Float expected, Float offset) {
        floats.assertIsCloseTo(actual, expected, Offset.offset(offset));
        return self;
    }

    @Override
    public SELF isNotCloseTo(Float expected, Float offset) {
        floats.assertIsNotCloseTo(actual, expected, Offset.offset(offset));
        return self;
    }

    @Override
    public SELF isLessThan(Float expected) {
        floats.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Float expected) {
        floats.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Float expected) {
        floats.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Float expected) {
        floats.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Float start, Float end) {
        floats.assertIsBetween(actual, start, end);
        return self;
    }
}
