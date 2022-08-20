package com.github.ones1kk.asserts.core.lang.number.integer;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.number.NumerableAssert;
import com.github.ones1kk.asserts.core.lang.number.NumberAssertInterface;

public interface IntegerAssertInterface<SELF> extends NumberAssertInterface<SELF>, NumerableAssert<SELF, Integer>, ComparableAssert<SELF, Integer> {
}
