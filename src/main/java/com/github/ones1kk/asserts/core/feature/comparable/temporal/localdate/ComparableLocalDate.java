package com.github.ones1kk.asserts.core.feature.comparable.temporal.localdate;

import java.time.LocalDate;

public interface ComparableLocalDate<ELEMENT extends LocalDate> {

    boolean isBefore(ELEMENT actual, ELEMENT expected);

    boolean isBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isAfter(ELEMENT actual, ELEMENT expected);

    boolean isAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
