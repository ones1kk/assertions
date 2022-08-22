package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.time.AbstractLocalTimeAssert;

import java.time.LocalTime;

public class LocalTimeAccessorAssert extends AbstractLocalTimeAssert<LocalTimeAccessorAssert> {

    public LocalTimeAccessorAssert(LocalTime actual) {
        super(LocalTimeAccessorAssert.class, actual);
    }
}
