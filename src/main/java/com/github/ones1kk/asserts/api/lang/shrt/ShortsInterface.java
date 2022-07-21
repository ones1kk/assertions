package com.github.ones1kk.asserts.api.lang.shrt;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;
import com.github.ones1kk.asserts.api.feature.number.Numerable;

public interface ShortsInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Short> {

    void assertIsOdd(ACTUAL actual);

    void assertIsNotOdd(ACTUAL actual);

    void assertIsEven(ACTUAL actual);

    void assertIsNotEven(ACTUAL actual);
}
