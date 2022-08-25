package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.localdatetime.AbstractLocalDateTimeAssert;

import java.time.LocalDateTime;

public class LocalDateTimeAssert extends AbstractLocalDateTimeAssert<LocalDateTimeAssert, LocalDateTime> {

    public LocalDateTimeAssert(LocalDateTime actual) {
        super(LocalDateTimeAssert.class, actual);
    }
}
