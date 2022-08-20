package com.github.ones1kk.asserts.core.lang.number.lng;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.number.NumerableAssert;
import com.github.ones1kk.asserts.core.lang.number.NumberAssertInterface;

public interface LongAssertInterface<SELF> extends NumberAssertInterface<SELF>, NumerableAssert<SELF, Long>, ComparableAssert<SELF, Long> {
}
