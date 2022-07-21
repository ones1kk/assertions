package com.github.ones1kk.asserts.api.lang.lng;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;
import com.github.ones1kk.asserts.api.feature.number.Numerable;

public interface LongsInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Long> {

    void assertIsOdd(ACTUAL actual);

    void assertIsNotOdd(ACTUAL actual);

    void assertIsEven(ACTUAL actual);

    void assertIsNotEven(ACTUAL actual);
}
