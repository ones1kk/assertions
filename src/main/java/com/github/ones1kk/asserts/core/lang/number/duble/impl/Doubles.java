package com.github.ones1kk.asserts.core.lang.number.duble.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.number.duble.DoublesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.DoubleArithmeticUnit.of;

public class Doubles extends Objects<Double> implements DoublesInterface<Double> {

    private final ComparableLanguage<Double> comparable = new ComparableLanguageImpl<>();

    public Doubles(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsInfinity(Double actual) {
        if (!Double.isInfinite(actual)) {
            handler.setDescription(handler.from(actual, "{} is not infinity"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFinite(Double actual) {
        if (!Double.isFinite(actual)) {
            handler.setDescription(handler.from(actual, "{} is not finite"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNaN(Double actual) {
        if (!Double.isNaN(actual)) {
            handler.setDescription(handler.from(actual, "{} is not NaN"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Double actual, Double expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Double actual, Double expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Double actual, Double expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Double actual, Double expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Double actual, Double start, Double end) {
        if (comparable.isLessThan(actual, start)
                || comparable.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Double actual) {
        if (comparable.isLessThanOrEqualTo(actual, (double) 0)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Double actual) {
        if (comparable.isGraterThan(actual, (double) 0)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Double actual) {
        if (comparable.isGraterThanOrEqualTo(actual, (double) 0)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Double actual) {
        if (comparable.isLessThan(actual, (double) 0)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Double actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Double actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Double actual, Double expected, Percentage<Double> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Double actual, Double expected, Percentage<Double> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Double actual, Percentage<Double> percentage) {
        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                percentage.getStartingRage() + " ~ " + percentage.getEndingRage());
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}
