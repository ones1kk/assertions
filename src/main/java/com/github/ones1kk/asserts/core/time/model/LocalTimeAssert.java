package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.time.AbstractLocalTimeAssert;

import java.time.LocalTime;

public class LocalTimeAssert extends AbstractLocalTimeAssert<LocalTimeAssert, LocalTime> {

    public LocalTimeAssert(LocalTime actual) {
        super(LocalTimeAssert.class, actual);
    }
}
