package com.github.ones1kk.asserts.core.time.temporal;

import java.time.temporal.TemporalAccessor;

public interface TemporalAccessorAssertInterface<SELF, ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> {

    SELF isBefore(ACTUAL expected);

    SELF isBeforeOrEqualTo(ACTUAL expected);

    SELF isAfter(ACTUAL expected);

    SELF isAfterOrEqualTo(ACTUAL expected);

}
