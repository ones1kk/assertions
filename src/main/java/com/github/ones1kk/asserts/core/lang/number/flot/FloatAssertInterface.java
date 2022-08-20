package com.github.ones1kk.asserts.core.lang.number.flot;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.number.NumerableAssert;

public interface FloatAssertInterface<SELF> extends NumerableAssert<SELF, Float>, ComparableAssert<SELF, Float> {

    SELF isInfinity();

    SELF isFinite();

    SELF isNaN();
}
