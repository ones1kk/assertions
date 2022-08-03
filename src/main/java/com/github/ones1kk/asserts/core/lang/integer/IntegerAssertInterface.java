package com.github.ones1kk.asserts.core.lang.integer;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.number.NumerableAssert;

public interface IntegerAssertInterface<SELF> extends NumerableAssert<SELF, Integer>, ComparableAssert<SELF, Integer> {

    SELF isOdd();

    SELF isNotOdd();

    SELF isEven();

    SELF isNotEven();

}
