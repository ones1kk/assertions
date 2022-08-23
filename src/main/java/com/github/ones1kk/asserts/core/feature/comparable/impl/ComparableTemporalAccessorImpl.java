package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableTemporalAccessor;

import java.time.temporal.TemporalAccessor;

public class ComparableTemporalAccessorImpl<ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> implements ComparableTemporalAccessor<ACTUAL> {

    @Override
    public boolean isEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) == 0;
    }

    @Override
    public boolean isNotEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) != 0;
    }

    @Override
    public boolean isBefore(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isBeforeOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isAfter(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isAfterOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) >= 0;
    }
}