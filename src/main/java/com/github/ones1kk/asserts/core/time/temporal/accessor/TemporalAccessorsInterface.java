package com.github.ones1kk.asserts.core.time.temporal.accessor;

import java.time.temporal.TemporalAccessor;

public interface TemporalAccessorsInterface<ELEMENT extends TemporalAccessor> {

    void assertIsBefore(ELEMENT actual, ELEMENT expected);

    void assertIsBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsAfter(ELEMENT actual, ELEMENT expected);

    void assertIsAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
