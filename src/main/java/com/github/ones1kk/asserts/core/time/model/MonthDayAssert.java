package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.monthday.AbstractMonthDayAssert;

import java.time.MonthDay;

public class MonthDayAssert extends AbstractMonthDayAssert<MonthDayAssert, MonthDay> {

    public MonthDayAssert(MonthDay actual) {
        super(MonthDayAssert.class, actual);
    }
}
