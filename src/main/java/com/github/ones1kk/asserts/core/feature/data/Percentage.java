package com.github.ones1kk.asserts.core.feature.data;

import com.github.ones1kk.asserts.core.Asserts;

public final class Percentage<T extends Number> {

    private final Double value;

    private Double startingRage;

    private Double endingRage;

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

    public boolean isRange(T actual, T expected) {
        Asserts.that(expected.doubleValue())
                .as("Negative numbers cannot be compared")
                .isPositive();
        init(actual);
        return expected.doubleValue() >= startingRage && expected.doubleValue() <= endingRage;
    }

    @Deprecated
    public boolean isStartingRange(T actual, T expected) {
        init(actual);
        return expected.doubleValue() >= startingRage && expected.doubleValue() <= endingRage;
    }

    @Deprecated
    public boolean isEndingRange(T actual, T expected) {
        init(actual);
        return expected.doubleValue() >= startingRage && expected.doubleValue() <= endingRage;
    }

    private Double getStandard(T actual) {
        return (actual.doubleValue() / value);
    }

    public Double getStartingRage() {
        return startingRage;
    }

    public Double getEndingRage() {
        return endingRage;
    }

    private void init(T actual) {
        setStartingRage(actual);
        setEndingRage(actual);
    }

    private void setStartingRage(T actual) {
        this.startingRage = actual.doubleValue() - getStandard(actual);
    }

    private void setEndingRage(T actual) {
        this.endingRage = actual.doubleValue() + getStandard(actual);
    }
}
