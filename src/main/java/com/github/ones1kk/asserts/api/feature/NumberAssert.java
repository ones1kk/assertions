package com.github.ones1kk.asserts.api.feature;

public interface NumberAssert<TYPE extends Number> {

    void assertIsPositive(TYPE actual);

    void assertIsNotPositive(TYPE actual);

    void assertIsNegative(TYPE actual);

    void assertIsNotNegative(TYPE actual);

    void assertIsZero(TYPE actual);

    void assertIsNotZero(TYPE actual);

    void assertIsCloseTo(TYPE actual, TYPE expected, Offset<TYPE> offset);

    void assertIsNotCloseTo(TYPE actual, TYPE expected, Offset<TYPE> offset);

}
