package com.github.ones1kk.asserts.core.feature.comparable;

public interface ComparableAssert<SELF, ELEMENT> {

    SELF isLessThan(ELEMENT expected);

    SELF isLessThanOrEqualTo(ELEMENT expected);

    SELF isGreaterThan(ELEMENT expected);

    SELF isGreaterThanOrEqualTo(ELEMENT expected);

    SELF isBetween(ELEMENT start, ELEMENT end);

}