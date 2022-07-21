package com.github.ones1kk.asserts.api.lang.shrt;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;
import com.github.ones1kk.asserts.api.feature.number.Numerable;

public interface ShortsInterface<TYPE> extends Comparable<TYPE>, Numerable<Short> {

    void assertIsOdd(TYPE actual);

    void assertIsNotOdd(TYPE actual);

    void assertIsEven(TYPE actual);

    void assertIsNotEven(TYPE actual);
}
