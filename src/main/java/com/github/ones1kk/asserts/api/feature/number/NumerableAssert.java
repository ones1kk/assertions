package com.github.ones1kk.asserts.api.feature.number;

import com.github.ones1kk.asserts.api.feature.Offset;

public interface NumerableAssert<SELF, ACTUAL extends Number> {

    SELF isPositive(ACTUAL actual);

    SELF isNotPositive(ACTUAL actual);

    SELF isNegative(ACTUAL actual);

    SELF isNotNegative(ACTUAL actual);

    SELF isZero(ACTUAL actual);

    SELF isNotZero(ACTUAL actual);

    SELF isCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

    SELF isNotCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);
}
