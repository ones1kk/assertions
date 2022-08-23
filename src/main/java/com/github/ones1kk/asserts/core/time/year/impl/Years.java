package com.github.ones1kk.asserts.core.time.year.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.time.year.YearsInterface;

import java.time.Year;

public class Years extends Objects<Year> implements YearsInterface {

    public Years(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLeapYear(Year actual) {
        if (!actual.isLeap()) {
            handler.setDescription(handler.from(actual, "{} is not leap year"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotLeapYear(Year actual) {
        if (actual.isLeap()) {
            handler.setDescription(handler.from(actual, "{} is leap year"));
            throw handler.getException();
        }
    }
}
