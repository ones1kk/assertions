package com.github.ones1kk.asserts.core.feature.data;

import com.github.ones1kk.asserts.core.Asserts;

public final class Percentage<T extends Number> {

    private final Double value;

    private Double startingRage;

    private Double endingRage;

    private Percentage(Double value) {
        Asserts.that(value)
                .as("The percentage value can not be null")
                .isNotNull()
                .as("The percentage value should be greater than or equal to zero")
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
        setRange(actual);
        return expected.doubleValue() >= startingRage && expected.doubleValue() <= endingRage;
    }

    /**
     * After 2.0, it will be deprecated.
     *
     * @since 1.0
     */
    @Deprecated
    public boolean isStartingRange(T actual, T expected) {
        setRange(actual);
        return expected.doubleValue() >= startingRage && expected.doubleValue() <= endingRage;
    }

    /**
     * After 2.0, it will be deprecated.
     *
     * @since 1.0
     */
    @Deprecated
    public boolean isEndingRange(T actual, T expected) {
        setRange(actual);
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

    private void setRange(T actual) {
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
