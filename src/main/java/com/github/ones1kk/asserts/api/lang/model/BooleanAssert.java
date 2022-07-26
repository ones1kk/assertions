package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.bolean.AbstractBooleanAssert;

public class BooleanAssert extends AbstractBooleanAssert<BooleanAssert, Boolean> {

    public BooleanAssert(Boolean actual) {
        super(BooleanAssert.class, actual);
    }
}
