/*
 * Copyright (c) 2022. Wonsik Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.ones1kk.assertion.core.feature;

import io.github.ones1kk.assertion.core.Asserts;

/**
 * <strong> The Percentage class receives the figure of the Number class as input. </strong>
 * <br>
 * <p> After inputting the necessary values for creation, the calculation is performed by entering the standard and expected values.</p>
 * <p> All number type variables are controlled by casting to Double type with the largest data size among Number types.</p>
 *
 * @param <T> inherits {@link Number}.
 */
public final class Percentage<T extends Number> {

    /**
     * The value of {@link Percentage} is  used as percentage
     * to calculate whether it is close to within the range.
     */
    private final Double value;

    /**
     * The result will be always Double type.
     */
    private Double startingRange;

    /**
     * The result will be always Double type.
     */
    private Double endingRange;

    private Percentage(Double value) {
        Asserts.that(value)
                .as("The percentage value cannot be null.")
                .isNotNull()
                .as("The percentage value should be greater than or equal to zero.")
                .isGreaterThanOrEqualTo(0.0);
        this.value = value;
    }

    public static <T extends Number> Percentage<T> of(Double value) {
        return new Percentage<>(value);
    }

    public static <T extends Number> Percentage<T> of(T value) {
        return new Percentage<>(value.doubleValue());
    }

    /**
     * Verify {@code expected} is within range
     *
     * @param actual   reference value.
     * @param expected expected To be within range.
     * @return expected to be within range
     */
    public boolean isRange(T actual, T expected) {
        Asserts.that(expected.doubleValue())
                .as("Negative numbers cannot be compared.")
                .isPositive();
        setRange(actual);
        return expected.doubleValue() >= startingRange && expected.doubleValue() <= endingRange;
    }

    @Deprecated
    public boolean isStartingRange(T actual, T expected) {
        setRange(actual);
        return expected.doubleValue() >= startingRange && expected.doubleValue() <= endingRange;
    }

    @Deprecated
    public boolean isEndingRange(T actual, T expected) {
        setRange(actual);
        return expected.doubleValue() >= startingRange && expected.doubleValue() <= endingRange;
    }

    private Double getStandard(T actual) {
        return (actual.doubleValue() * (value / 100));
    }

    /**
     * The {@code endingRange} is {@code actual} minus {@link Percentage#value}.
     *
     * @return starting point value.
     */
    public Double getStartingRange() {
        return startingRange;
    }

    /**
     * The {@code endingRange} is {@code actual} added {@link Percentage#value}.
     *
     * @return ending point value.
     */
    public Double getEndingRange() {
        return endingRange;
    }

    private void setRange(T actual) {
        setStartingRange(actual);
        setEndingRange(actual);
    }

    private void setStartingRange(T actual) {
        this.startingRange = actual.doubleValue() - getStandard(actual);
    }

    private void setEndingRange(T actual) {
        this.endingRange = actual.doubleValue() + getStandard(actual);
    }
}
