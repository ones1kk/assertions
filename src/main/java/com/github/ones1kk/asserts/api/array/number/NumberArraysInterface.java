package com.github.ones1kk.asserts.api.array.number;

import com.github.ones1kk.asserts.api.feature.iterable.Iterable;

public interface NumberArraysInterface<ELEMENT> extends Iterable<Number> {

    void assertIsMax(ELEMENT[] actual, ELEMENT expected);

    void assertIsMin(ELEMENT[] actual, ELEMENT expected);

    void assertIsSum(ELEMENT[] actual, ELEMENT expected);
}
