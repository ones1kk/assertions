package com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime;

import java.time.LocalDateTime;

public interface ComparableLocalDateTime<ELEMENT extends LocalDateTime> {

    boolean isBefore(ELEMENT actual, ELEMENT expected);

    boolean isBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isAfter(ELEMENT actual, ELEMENT expected);

    boolean isAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
