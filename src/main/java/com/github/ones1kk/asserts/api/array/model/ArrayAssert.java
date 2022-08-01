package com.github.ones1kk.asserts.api.array.model;

import com.github.ones1kk.asserts.api.array.AbstractArrayAssert;

public class ArrayAssert<ACTUAL> extends AbstractArrayAssert<ArrayAssert<ACTUAL>, ACTUAL> {

    public ArrayAssert(ACTUAL[] actual) {
        super(ArrayAssert.class, actual);
    }
}
