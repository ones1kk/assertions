package com.github.ones1kk.asserts.core.time.localdatetime;

import com.github.ones1kk.asserts.core.time.temporal.AbstractTemporalAssert;

import java.time.LocalDateTime;

public class AbstractLocalDateTimeAssert<SELF extends AbstractLocalDateTimeAssert<SELF, ACTUAL>, ACTUAL> extends AbstractTemporalAssert<SELF, LocalDateTime> {

    public AbstractLocalDateTimeAssert(Class<?> self, LocalDateTime actual) {
        super(self, actual);
    }

}
