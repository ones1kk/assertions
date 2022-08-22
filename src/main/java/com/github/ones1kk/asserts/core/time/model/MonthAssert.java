package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.month.AbstractMonthAssert;

import java.time.Month;

public class MonthAssert extends AbstractMonthAssert<MonthAssert, Month> {

    public MonthAssert(Month actual) {
        super(MonthAssert.class, actual);
    }
}
