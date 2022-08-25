package com.github.ones1kk.asserts.core.feature.comparable;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

public interface ComparableTemporal<ELEMENT extends TemporalAccessor & java.lang.Comparable<ELEMENT>> {


    boolean isEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isNotEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isBefore(ELEMENT actual, ELEMENT expected);

    boolean isBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isAfter(ELEMENT actual, ELEMENT expected);

    boolean isAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
