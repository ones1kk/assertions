package com.github.ones1kk.asserts.core.time.month;

import com.github.ones1kk.asserts.core.time.temporal.AbstractTemporalAccessorAssert;

import java.time.Month;

public class AbstractMonthAssert<SELF extends AbstractMonthAssert<SELF, ACTUAL>, ACTUAL> extends AbstractTemporalAccessorAssert<SELF, Month> {

    public AbstractMonthAssert(Class<?> self, Month actual) {
        super(self, actual);
    }

}
