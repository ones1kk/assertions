package com.github.ones1kk.asserts.api.feature.comparable;

public interface Comparable<SELF, ACTUAL> {

    SELF isLessThan(ACTUAL actual, ACTUAL expected);

    SELF isLessThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    SELF isGreaterThan(ACTUAL actual, ACTUAL expected);

    SELF isGreaterThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    SELF isBetween(ACTUAL actual, ACTUAL start, ACTUAL end);

}