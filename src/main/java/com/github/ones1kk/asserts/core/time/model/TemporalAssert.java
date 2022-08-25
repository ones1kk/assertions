package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.temporal.AbstractTemporalAssert;

import java.time.temporal.Temporal;

public class TemporalAssert<ACTUAL extends Temporal> extends AbstractTemporalAssert<TemporalAssert<ACTUAL>, ACTUAL> {


    public TemporalAssert(ACTUAL actual) {
        super(TemporalAssert.class, actual);
    }
}
