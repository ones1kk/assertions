package com.github.ones1kk.asserts.core.time;

import java.time.temporal.Temporal;

public interface TimesAssertInterface<SELF, ACTUAL extends Temporal> {

    SELF isMidnight();

    SELF isNoon();

    SELF isBeforeNoon();

    SELF isBeforeOrEqualToNoon();

    SELF isAfternoon();

    SELF isAfterOrEqualToNoon();
}
