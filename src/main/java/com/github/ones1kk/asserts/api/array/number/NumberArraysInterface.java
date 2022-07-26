package com.github.ones1kk.asserts.api.array.number;

import com.github.ones1kk.asserts.api.feature.iterable.Iterable;

public interface NumberArraysInterface<ACTUAL, EXPECTED> extends Iterable<ACTUAL, Number> {

    void assertIsMax(ACTUAL actual, EXPECTED expected);

    void assertIsMin(ACTUAL actual, EXPECTED expected);
}
