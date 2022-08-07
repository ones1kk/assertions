package com.github.ones1kk.asserts.core.feature.number;

public interface NumerableAssert<SELF, ACTUAL extends Number> {

    SELF isPositive();

    SELF isNotPositive();

    SELF isNegative();

    SELF isNotNegative();

    SELF isZero();

    SELF isNotZero();

    SELF isCloseTo(ACTUAL expected, ACTUAL offset);

    SELF isNotCloseTo(ACTUAL expected, ACTUAL offset);
}
