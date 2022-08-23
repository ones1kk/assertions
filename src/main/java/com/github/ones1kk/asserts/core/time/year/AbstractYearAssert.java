package com.github.ones1kk.asserts.core.time.year;

import com.github.ones1kk.asserts.core.time.temporal.AbstractTemporalAccessorAssert;

import java.time.Year;

public class AbstractYearAssert<SELF extends AbstractYearAssert<SELF, ACTUAL>, ACTUAL> extends AbstractTemporalAccessorAssert<SELF, Year> implements YearAssertInterface<SELF> {

    private final YearsInterface years;

    public AbstractYearAssert(Class<?> self, Year actual) {
        super(self, actual);
        this.years = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isLeapYear() {
        years.assertIsLeapYear(actual);
        return self;
    }

    @Override
    public SELF isNotLeapYear() {
        years.assertIsNotLeapYear(actual);
        return self;
    }
}
