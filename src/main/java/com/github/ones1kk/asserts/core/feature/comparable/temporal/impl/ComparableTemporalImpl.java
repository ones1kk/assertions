package com.github.ones1kk.asserts.core.feature.comparable.temporal.impl;

import com.github.ones1kk.asserts.core.feature.comparable.temporal.ComparableTemporal;

import java.time.chrono.ChronoLocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

public class ComparableTemporalImpl<ACTUAL extends Temporal & Comparable<? extends Temporal>> implements ComparableTemporal<ACTUAL> {
    @Override
    public boolean isEqualTo(ACTUAL actual, ACTUAL expected) {
        return false;
    }

    @Override
    public boolean isNotEqualTo(ACTUAL actual, ACTUAL expected) {
        return false;
    }

    @Override
    public boolean isBefore(ACTUAL actual, ACTUAL expected) {
        return false;
    }

    @Override
    public boolean isBeforeOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return false;
    }

    @Override
    public boolean isAfter(ACTUAL actual, ACTUAL expected) {
        return false;
    }

    @Override
    public boolean isAfterOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return false;
    }
}
