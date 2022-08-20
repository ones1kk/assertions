package com.github.ones1kk.asserts.core.feature;

import com.github.ones1kk.asserts.core.Asserts;

public final class Percentage<T extends Number> {

    private final Double value;

    private Percentage(Double value) {
        Asserts.that(value)
                .as("the percentage value can not be null")
                .isNotNull()
                .as("the percentage value should be greater than or equal to zero")
                .isGreaterThanOrEqualTo(0.0);
        this.value = value;
    }

    public static <T extends Number> Percentage<T> of(Double value) {
        return new Percentage<>(value);
    }

    public boolean isStartingRange(T actual, T expected) {
        Double startingRage = actual.doubleValue() - getStandard(actual);
        return startingRage.equals(expected.doubleValue());
    }

    public boolean isEndingRange(T actual, T expected) {
        Double endingRage = actual.doubleValue() + getStandard(actual);
        return endingRage.equals(expected.doubleValue());
    }
    private Double getStandard(T actual) {
        return (actual.doubleValue() / value);
    }
}
