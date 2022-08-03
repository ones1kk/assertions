package com.github.ones1kk.asserts.core.lang.model;

import com.github.ones1kk.asserts.core.lang.bolean.AbstractBooleanAssert;

public class BooleanAssert extends AbstractBooleanAssert<BooleanAssert, Boolean> {

    public BooleanAssert(Boolean actual) {
        super(BooleanAssert.class, actual);
    }
}
