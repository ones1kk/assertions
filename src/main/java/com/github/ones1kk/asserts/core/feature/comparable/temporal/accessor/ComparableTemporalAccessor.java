package com.github.ones1kk.asserts.core.feature.comparable.temporal.accessor;

import java.time.temporal.TemporalAccessor;

public interface ComparableTemporalAccessor<ELEMENT extends TemporalAccessor & java.lang.Comparable<ELEMENT>> {

    boolean isBefore(ELEMENT actual, ELEMENT expected);

    boolean isBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isAfter(ELEMENT actual, ELEMENT expected);

    boolean isAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
