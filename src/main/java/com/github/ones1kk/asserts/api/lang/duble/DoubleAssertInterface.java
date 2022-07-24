package com.github.ones1kk.asserts.api.lang.duble;

import com.github.ones1kk.asserts.api.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.api.feature.number.NumerableAssert;

public interface DoubleAssertInterface<SELF> extends NumerableAssert<SELF, Double>, ComparableAssert<SELF, Double> {

    SELF isInfinity();

    SELF isFinite();

    SELF isNaN();

}
