package com.github.ones1kk.asserts.api.feature.number;

import com.github.ones1kk.asserts.api.feature.Offset;

public interface Numerable<ACTUAL extends Number> {

    void assertIsPositive(ACTUAL actual);

    void assertIsNotPositive(ACTUAL actual);

    void assertIsNegative(ACTUAL actual);

    void assertIsNotNegative(ACTUAL actual);

    void assertIsZero(ACTUAL actual);

    void assertIsNotZero(ACTUAL actual);

    void assertIsCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

    void assertIsNotCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

}
