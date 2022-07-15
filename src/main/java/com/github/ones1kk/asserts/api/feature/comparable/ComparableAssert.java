package com.github.ones1kk.asserts.api.feature.comparable;

public interface ComparableAssert<TYPE> {

    void assertIsLessThan(TYPE actual, TYPE expected);

    void assertIsLessThanOrEqualTo(TYPE actual, TYPE expected);

    void assertIsGreaterThan(TYPE actual, TYPE expected);

    void assertIsGreaterThanOrEqualTo(TYPE actual, TYPE expected);

    void assertIsBetween(TYPE actual, TYPE start, TYPE end);

}