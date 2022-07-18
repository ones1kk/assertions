package com.github.ones1kk.asserts.api.feature.comparable;

public interface ComparableAssert<SELF, ACTUAL> {

    SELF isLessThan(ACTUAL expected);

    SELF isLessThanOrEqualTo(ACTUAL expected);

    SELF isGreaterThan(ACTUAL expected);

    SELF isGreaterThanOrEqualTo(ACTUAL expected);

    SELF isBetween(ACTUAL start, ACTUAL end);

}