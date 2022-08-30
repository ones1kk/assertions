package com.github.ones1kk.asserts.core.time.localdate.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdate.ComparableLocalDate;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdate.impl.ComparableLocalDateImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.time.localdate.LocalDatesInterface;

import java.time.LocalDate;

public class LocalDates<ACTUAL extends LocalDate> extends Objects<ACTUAL> implements LocalDatesInterface<ACTUAL> {

    private final ComparableLocalDate<ACTUAL> comparable = new ComparableLocalDateImpl<>();

    public LocalDates(AsAssert<?> asAssert) {
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
