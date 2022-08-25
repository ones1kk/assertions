package com.github.ones1kk.asserts.core.time.temporal.accessor;

import java.time.temporal.TemporalAccessor;

public interface TemporalAccessorsInterface<ELEMENT extends TemporalAccessor & Comparable<ELEMENT>> {

    void assertIsEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsNotEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsBefore(ELEMENT actual, ELEMENT expected);

    void assertIsBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsAfter(ELEMENT actual, ELEMENT expected);

    void assertIsAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
