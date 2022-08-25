package com.github.ones1kk.asserts.core.time.temporal;

import java.time.temporal.Temporal;

public interface TemporalsInterface<ELEMENT extends Temporal> {

    void assertIsEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsNotEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsBefore(ELEMENT actual, ELEMENT expected);

    void assertIsBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsAfter(ELEMENT actual, ELEMENT expected);

    void assertIsAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
