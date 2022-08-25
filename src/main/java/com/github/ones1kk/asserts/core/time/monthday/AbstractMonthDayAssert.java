package com.github.ones1kk.asserts.core.time.monthday;

import com.github.ones1kk.asserts.core.time.temporal.accessor.AbstractTemporalAccessorAssert;

import java.time.MonthDay;

public class AbstractMonthDayAssert<SELF extends AbstractMonthDayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractTemporalAccessorAssert<SELF, MonthDay> {

    public AbstractMonthDayAssert(Class<?> self, MonthDay monthDay) {
        super(self, monthDay);
    }
}
