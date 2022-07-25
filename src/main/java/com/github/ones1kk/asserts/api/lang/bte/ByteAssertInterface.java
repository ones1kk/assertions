package com.github.ones1kk.asserts.api.lang.bte;

import com.github.ones1kk.asserts.api.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.api.feature.number.NumerableAssert;

public interface ByteAssertInterface<SELF> extends NumerableAssert<SELF, Byte>, ComparableAssert<SELF, Byte> {

    SELF isOdd();

    SELF isNotOdd();

    SELF isEven();

    SELF isNotEven();
}
