package com.github.ones1kk.asserts.core.array.number;

import com.github.ones1kk.asserts.core.feature.iterable.IterableAssert;

public interface NumberArrayAssertInterface<SELF> extends IterableAssert<SELF, Number> {

    SELF isMax(Number expected);

    SELF isMin(Number expected);

    SELF isSum(Number expected);
}
