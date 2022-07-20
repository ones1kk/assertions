package com.github.ones1kk.asserts.api.lang.lng;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;
import com.github.ones1kk.asserts.api.feature.number.Numerable;

public interface LongsInterface<TYPE> extends Comparable<TYPE>, Numerable<Long> {

    void assertIsOdd(TYPE actual);

    void assertIsNotOdd(TYPE actual);

    void assertIsEven(TYPE actual);

    void assertIsNotEven(TYPE actual);
}
