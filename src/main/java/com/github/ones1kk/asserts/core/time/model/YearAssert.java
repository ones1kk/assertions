package com.github.ones1kk.asserts.core.time.model;

import com.github.ones1kk.asserts.core.time.year.AbstractYearAssert;

import java.time.Year;

public class YearAssert extends AbstractYearAssert<YearAssert, Year> {

    public YearAssert(Year actual) {
        super(YearAssert.class, actual);
    }
}
