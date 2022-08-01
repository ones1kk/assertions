package com.github.ones1kk.asserts.api.array.model;

import com.github.ones1kk.asserts.api.array.AbstractArrayAssert;

public class ArrayAssert<ACTUAL, EXPECTED> extends AbstractArrayAssert<ArrayAssert<ACTUAL, EXPECTED>, ACTUAL, EXPECTED> {

    public ArrayAssert(ACTUAL actual) {
        super(ArrayAssert.class, actual);
    }
}
