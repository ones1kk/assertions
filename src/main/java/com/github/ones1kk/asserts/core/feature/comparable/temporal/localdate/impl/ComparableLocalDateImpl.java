package com.github.ones1kk.asserts.core.feature.comparable.temporal.localdate.impl;

import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdate.ComparableLocalDate;

import java.time.LocalDate;

public class ComparableLocalDateImpl<ACTUAL extends LocalDate> implements ComparableLocalDate<ACTUAL> {

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
