package com.github.ones1kk.asserts.core.array.model;

import com.github.ones1kk.asserts.core.array.number.AbstractNumberArrayAssert;

public class NumberArrayAssert extends AbstractNumberArrayAssert<NumberArrayAssert, Number[]> {

    public NumberArrayAssert(Number[] actual) {
        super(NumberArrayAssert.class, actual);
    }
}
