package com.github.ones1kk.asserts.core.lang.lng;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.number.NumerableAssert;

public interface LongAssertInterface<SELF> extends NumerableAssert<SELF, Long>, ComparableAssert<SELF, Long> {

    SELF isOdd();

    SELF isNotOdd();

    SELF isEven();

    SELF isNotEven();

}
