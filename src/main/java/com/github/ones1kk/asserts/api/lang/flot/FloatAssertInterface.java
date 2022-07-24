package com.github.ones1kk.asserts.api.lang.flot;

import com.github.ones1kk.asserts.api.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.api.feature.number.NumerableAssert;

public interface FloatAssertInterface<SELF> extends NumerableAssert<SELF, Float>, ComparableAssert<SELF, Float> {

    SELF isInfinity();

    SELF isFinite();

    SELF isNaN();

}
