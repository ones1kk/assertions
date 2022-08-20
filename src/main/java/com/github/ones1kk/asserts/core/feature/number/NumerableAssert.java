package com.github.ones1kk.asserts.core.feature.number;

import com.github.ones1kk.asserts.core.feature.data.Percentage;

public interface NumerableAssert<SELF, ACTUAL extends Number> {

    SELF isPositive();

    SELF isNotPositive();

    SELF isNegative();

    SELF isNotNegative();

    SELF isZero();

    SELF isNotZero();

    SELF isCloseTo(ACTUAL expected, Double percentage);

    SELF isNotCloseTo(ACTUAL expected, Double percentage);
}
