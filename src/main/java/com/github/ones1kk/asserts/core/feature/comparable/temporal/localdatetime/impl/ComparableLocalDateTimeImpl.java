package com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.impl;

import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.ComparableLocalDateTime;

import java.time.LocalDateTime;

public class ComparableLocalDateTimeImpl<ACTUAL extends LocalDateTime> implements ComparableLocalDateTime<ACTUAL> {

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
