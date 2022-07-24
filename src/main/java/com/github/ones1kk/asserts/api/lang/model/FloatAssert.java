package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.flot.AbstractFloatAssert;

public class FloatAssert extends AbstractFloatAssert<FloatAssert, Float> {

    public FloatAssert(Float actual) {
        super(FloatAssert.class, actual);
    }
}
