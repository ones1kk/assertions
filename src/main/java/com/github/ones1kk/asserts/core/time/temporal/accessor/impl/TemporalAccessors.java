package com.github.ones1kk.asserts.core.time.temporal.accessor.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.accessor.ComparableTemporalAccessor;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.accessor.impl.ComparableTemporalAccessorImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.time.temporal.accessor.TemporalAccessorsInterface;

import java.time.temporal.TemporalAccessor;

public class TemporalAccessors<ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> extends Objects<ACTUAL> implements TemporalAccessorsInterface<ACTUAL> {

    private final ComparableTemporalAccessor<ACTUAL> comparable = new ComparableTemporalAccessorImpl<>();

    public TemporalAccessors(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsBefore(ACTUAL actual, ACTUAL expected) {
        if (comparable.isAfterOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is after or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBeforeOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isAfter(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is after {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAfter(ACTUAL actual, ACTUAL expected) {
        if (comparable.isBeforeOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is before or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAfterOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isBefore(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is before {}"));
            throw handler.getException();
        }
    }
}
