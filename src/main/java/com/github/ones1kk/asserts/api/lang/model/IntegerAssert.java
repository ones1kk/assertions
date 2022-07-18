package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.integer.AbstractIntegerAssert;

public class IntegerAssert extends AbstractIntegerAssert<IntegerAssert, Integer> {

    public IntegerAssert( Integer actual) {
        super(IntegerAssert.class, actual);
    }
}
