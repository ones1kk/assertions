package com.github.ones1kk.asserts.core.time.time;

import com.github.ones1kk.asserts.core.time.temporal.AbstractTemporalAccessorAssert;

import java.time.LocalTime;

public class AbstractLocalTimeAssert<SELF extends AbstractLocalTimeAssert<SELF>> extends AbstractTemporalAccessorAssert<SELF, LocalTime> implements LocalTimeAssertInterface<SELF> {

    public AbstractLocalTimeAssert(Class<?> self, LocalTime actual) {
        super(self, actual);
    }

    @Override
    public SELF isMidnight() {
        super.isEqualTo(LocalTime.MIDNIGHT);
        return self;
    }

    @Override
    public SELF isNoon() {
        super.isEqualTo(LocalTime.NOON);
        return self;
    }

    @Override
    public SELF isBeforeNoon() {
        super.isBefore(LocalTime.NOON);
        return self;
    }

    @Override
    public SELF isBeforeOrEqualToNoon() {
        super.isBeforeOrEqualTo(LocalTime.NOON);
        return self;
    }

    @Override
    public SELF isAfternoon() {
        super.isAfter(LocalTime.NOON);
        return self;
    }

    @Override
    public SELF isAfterOrEqualToNoon() {
        super.isAfterOrEqualTo(LocalTime.NOON);
        return self;
    }
}
