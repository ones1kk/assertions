package com.github.ones1kk.asserts.api.feature.comparable;

public interface Comparable<ACTUAL> {

    void assertIsLessThan(ACTUAL actual, ACTUAL expected);

    void assertIsLessThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsGreaterThan(ACTUAL actual, ACTUAL expected);

    void assertIsGreaterThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsBetween(ACTUAL actual, ACTUAL start, ACTUAL end);

}