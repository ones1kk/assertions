package com.github.ones1kk.asserts.api.lang.string.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.impl.StringCalculator;
import com.github.ones1kk.asserts.api.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.api.lang.string.StringsInterface;

public class Strings extends CharSequences implements StringsInterface<String> {

    private final ComparableCalculatorInterface<String> calculator = new StringCalculator();

    public Strings(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLessThan(String actual, String expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(String actual, String expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(String actual, String expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(String actual, String expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(String actual, String start, String end) {
        if (calculator.isLessThan(actual, start) || calculator.isGraterThan(actual, end)) {
            // TODO : getter
            String description = handler.getDescribable().as("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

}
