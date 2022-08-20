package com.github.ones1kk.asserts.core.lang.number.duble;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.number.NumerableAssert;

public interface DoubleAssertInterface<SELF> extends NumerableAssert<SELF, Double>, ComparableAssert<SELF, Double> {

    SELF isInfinity();

    SELF isFinite();

    SELF isNaN();

}
