package com.github.ones1kk.asserts.api.lang.duble;

import com.github.ones1kk.asserts.api.feature.Offset;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

public class AbstractDoubleAssert<SELF extends AbstractDoubleAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Double> implements DoubleAssertInterface<SELF> {

    private final DoublesInterface<Double> doubles;

    public AbstractDoubleAssert(Class<?> self, Double aDouble) {
        super(self, aDouble);
        this.doubles = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isInfinity() {
        doubles.assertIsInfinity(actual);
        return self;
    }

    @Override
    public SELF isFinite() {
        doubles.assertIsFinite(actual);
        return self;
    }

    @Override
    public SELF isNaN() {
        doubles.assertIsNaN(actual);
        return self;
    }

    @Override
    public SELF isPositive() {
        doubles.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        doubles.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        doubles.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        doubles.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        doubles.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        doubles.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isCloseTo(Double expected, Offset<Double> offset) {
        doubles.assertIsCloseTo(actual, expected, offset);
        return self;
    }

    @Override
    public SELF isNotCloseTo(Double expected, Offset<Double> offset) {
        doubles.assertIsNotCloseTo(actual, expected, offset);
        return self;
    }

    @Override
    public SELF isLessThan(Double expected) {
        doubles.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Double expected) {
        doubles.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Double expected) {
        doubles.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Double expected) {
        doubles.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Double start, Double end) {
        doubles.assertIsBetween(actual, start, end);
        return self;
    }

}
