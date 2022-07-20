package com.github.ones1kk.asserts.api.lang.lng;

import com.github.ones1kk.asserts.api.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.api.feature.number.NumerableAssert;

public interface LongAssertInterface<SELF> extends NumerableAssert<SELF, Long>, ComparableAssert<SELF, Long> {

    SELF isOdd();

    SELF isNotOdd();

    SELF isEven();

    SELF isNotEven();

}
