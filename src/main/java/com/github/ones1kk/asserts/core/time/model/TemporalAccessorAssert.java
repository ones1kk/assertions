package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.temporal.AbstractTemporalAccessorAssert;

import java.time.temporal.TemporalAccessor;

public class TemporalAccessorAssert<ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> extends AbstractTemporalAccessorAssert<TemporalAccessorAssert<ACTUAL>, ACTUAL> {

    public TemporalAccessorAssert(ACTUAL actual) {
        super(TemporalAccessorAssert.class, actual);
    }
}
