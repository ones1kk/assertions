package com.github.ones1kk.asserts.api.lang.integer;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;
import com.github.ones1kk.asserts.api.feature.number.Numerable;

public interface IntegersInterface<TYPE> extends Comparable<TYPE>, Numerable<Integer> {

    void assertIsOdd(TYPE actual);

    void assertIsNotOdd(TYPE actual);

    void assertIsEven(TYPE actual);

    void assertIsNotEven(TYPE actual);
}
