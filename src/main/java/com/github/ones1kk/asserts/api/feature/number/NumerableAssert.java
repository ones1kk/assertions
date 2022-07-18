package com.github.ones1kk.asserts.api.feature.number;

import com.github.ones1kk.asserts.api.feature.Offset;

public interface NumerableAssert<SELF, ACTUAL extends Number> {

    SELF isPositive();

    SELF isNotPositive();

    SELF isNegative();

    SELF isNotNegative();

    SELF isZero();

    SELF isNotZero();

    SELF isCloseTo(ACTUAL expected, Offset<ACTUAL> offset);

    SELF isNotCloseTo(ACTUAL expected, Offset<ACTUAL> offset);
}
