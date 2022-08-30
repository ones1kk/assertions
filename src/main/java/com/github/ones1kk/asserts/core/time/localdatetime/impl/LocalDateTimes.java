package com.github.ones1kk.asserts.core.time.localdatetime.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.ComparableLocalDateTime;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.impl.ComparableLocalDateTimeImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.time.localdatetime.LocalDateTimesInterface;

import java.time.LocalDateTime;

public class LocalDateTimes<ACTUAL extends LocalDateTime> extends Objects<LocalDateTime> implements LocalDateTimesInterface<ACTUAL> {

    private final ComparableLocalDateTime<ACTUAL> comparable = new ComparableLocalDateTimeImpl<>();

    public LocalDateTimes(AsAssert<?> asAssert) {
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
