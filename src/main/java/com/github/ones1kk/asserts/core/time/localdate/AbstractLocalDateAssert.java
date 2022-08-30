package com.github.ones1kk.asserts.core.time.localdate;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.time.temporal.accessor.TemporalAccessorAssertInterface;

import java.time.LocalDate;

public class AbstractLocalDateAssert<SELF extends AbstractLocalDateAssert<SELF, ACTUAL>, ACTUAL extends LocalDate> extends AbstractObjectAssert<SELF, ACTUAL> implements TemporalAccessorAssertInterface<SELF, ACTUAL> {

    private final LocalDatesInterface<LocalDate> localDates;

    public AbstractLocalDateAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.localDates = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isBefore(ACTUAL expected) {
        localDates.assertIsBefore(actual, expected);
        return self;
    }

    @Override
    public SELF isBeforeOrEqualTo(ACTUAL expected) {
        localDates.assertIsBeforeOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isAfter(ACTUAL expected) {
        localDates.assertIsAfter(actual, expected);
        return self;
    }

    @Override
    public SELF isAfterOrEqualTo(ACTUAL expected) {
        localDates.assertIsAfterOrEqualTo(actual, expected);
        return self;
    }
}
