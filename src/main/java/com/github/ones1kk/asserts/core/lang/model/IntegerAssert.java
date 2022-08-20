package com.github.ones1kk.asserts.core.lang.model;

import com.github.ones1kk.asserts.core.lang.number.integer.AbstractIntegerAssert;

public class IntegerAssert extends AbstractIntegerAssert<IntegerAssert, Integer> {

    public IntegerAssert(Integer actual) {
        super(IntegerAssert.class, actual);
    }
}
