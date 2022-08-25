package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.localdate.AbstractLocalDateAssert;

import java.time.LocalDate;

public class LocalDateAssert extends AbstractLocalDateAssert<LocalDateAssert, LocalDate> {

    public LocalDateAssert(LocalDate actual) {
        super(LocalDateAssert.class, actual);
    }
}
