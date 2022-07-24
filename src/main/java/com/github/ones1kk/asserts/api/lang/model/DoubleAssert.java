package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.duble.AbstractDoubleAssert;

public class DoubleAssert extends AbstractDoubleAssert<DoubleAssert, Double> {

    public DoubleAssert(Double aDouble) {
        super(DoubleAssert.class, aDouble);
    }
}
