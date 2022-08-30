package com.github.ones1kk.asserts.core.time.localdatetime;

import java.time.LocalDateTime;

public interface LocalDateTimesInterface<ELEMENT extends LocalDateTime> {

    void assertIsBefore(ELEMENT actual, ELEMENT expected);

    void assertIsBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsAfter(ELEMENT actual, ELEMENT expected);

    void assertIsAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
