package com.github.ones1kk.asserts.core.array.model;

import com.github.ones1kk.asserts.core.array.AbstractArrayAssert;

public class ArrayAssert<ACTUAL> extends AbstractArrayAssert<ArrayAssert<ACTUAL>, ACTUAL> {

    public ArrayAssert(ACTUAL[] actual) {
        super(ArrayAssert.class, actual);
    }
}
