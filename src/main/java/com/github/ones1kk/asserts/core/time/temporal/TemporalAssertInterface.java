package com.github.ones1kk.asserts.core.time.temporal;

import java.time.temporal.Temporal;

public interface TemporalAssertInterface<SELF, ACTUAL extends Temporal> {

    SELF isBefore(ACTUAL expected);

    SELF isBeforeOrEqualTo(ACTUAL expected);

    SELF isAfter(ACTUAL expected);

    SELF isAfterOrEqualTo(ACTUAL expected);

}
