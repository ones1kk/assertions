package com.github.ones1kk.asserts.api.array.number;

import com.github.ones1kk.asserts.api.feature.iterable.IterableAssert;

public interface NumberArrayAssertInterface<SELF> extends IterableAssert<SELF, Number[], Number> {

    SELF isMax(Number expected);

    SELF isMin(Number expected);
}
