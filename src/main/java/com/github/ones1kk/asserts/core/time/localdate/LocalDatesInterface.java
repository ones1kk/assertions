package com.github.ones1kk.asserts.core.time.localdate;

import java.time.LocalDate;

public interface LocalDatesInterface<ELEMENT extends LocalDate> {

    void assertIsBefore(ELEMENT actual, ELEMENT expected);

    void assertIsBeforeOrEqualTo(ELEMENT actual, ELEMENT expected);

    void assertIsAfter(ELEMENT actual, ELEMENT expected);

    void assertIsAfterOrEqualTo(ELEMENT actual, ELEMENT expected);
}
