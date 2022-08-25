package com.github.ones1kk.asserts.core.time.localdate;

import com.github.ones1kk.asserts.core.time.temporal.AbstractTemporalAssert;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public class AbstractLocalDateAssert<SELF extends AbstractLocalDateAssert<SELF, ACTUAL>, ACTUAL extends Temporal> extends AbstractTemporalAssert<SELF, LocalDate> {

    public AbstractLocalDateAssert(Class<?> self, LocalDate actual) {
        super(self, actual);
    }
}
