package com.github.ones1kk.asserts.core.time.temporal;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.time.temporal.impl.Temporals;

import java.time.temporal.Temporal;

public abstract class AbstractTemporalAssert<SELF extends AbstractTemporalAssert<SELF, ACTUAL>, ACTUAL extends Temporal> extends AbstractObjectAssert<SELF, ACTUAL> implements TemporalAssertInterface<SELF, ACTUAL> {

    private final Temporals<ACTUAL> temporals;

    public AbstractTemporalAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.temporals = assertFactory.createAssert(actual, this);
    }

    @Override
    @SuppressWarnings("all")
    public SELF isEqualTo(Object expected) {
        temporals.assertIsEqualTo(actual, (ACTUAL) expected);
        return self;
    }

    @Override
    @SuppressWarnings("all")
    public SELF isNotEqualTo(Object expected) {
        temporals.assertIsNotEqualTo(actual, (ACTUAL) expected);
        return self;
    }

    @Override
    public SELF isBefore(ACTUAL expected) {
        temporals.assertIsBefore(actual, expected);
        return self;
    }

    @Override
    public SELF isBeforeOrEqualTo(ACTUAL expected) {
        temporals.assertIsBeforeOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isAfter(ACTUAL expected) {
        temporals.assertIsAfter(actual, expected);
        return self;
    }

    @Override
    public SELF isAfterOrEqualTo(ACTUAL expected) {
        temporals.assertIsAfterOrEqualTo(actual, expected);
        return self;
    }
}
