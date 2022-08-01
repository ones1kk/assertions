package com.github.ones1kk.asserts.api.array.number;

import com.github.ones1kk.asserts.api.feature.iterable.Iterable;

public interface NumberArraysInterface<ACTUAL> extends Iterable<Number> {

    void assertIsMax(ACTUAL[] actual, ACTUAL expected);

    void assertIsMin(ACTUAL[] actual, ACTUAL expected);

    void assertIsSum(ACTUAL[] actual, ACTUAL expected);
}
