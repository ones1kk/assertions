package com.github.ones1kk.asserts.core.lang.string.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.core.feature.comparable.impl.StringComparableImpl;
import com.github.ones1kk.asserts.core.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.core.lang.string.StringsInterface;

public class Strings extends CharSequences implements StringsInterface<String> {

    private final ComparableCalculatorInterface<String> comparable = new StringComparableImpl();

    public Strings(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLessThan(String actual, String expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(String actual, String expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(String actual, String expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(String actual, String expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(String actual, String start, String end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            String description = handler.getDescribable().as("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

}
