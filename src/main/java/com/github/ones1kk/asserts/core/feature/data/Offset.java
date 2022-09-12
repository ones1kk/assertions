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

package com.github.ones1kk.asserts.core.feature.data;


import com.github.ones1kk.asserts.core.Asserts;

/**
 * <strong> The Offset class receives the offset of the Number class as input. </strong>
 * <br>
 * <p> Various methods related to offset are provided through verification of whether the input value can be used internally.</p>
 *
 * @param <T> inherits {@link Number}.
 */
public final class Offset<T extends Number> {

    private final T value;

    private Offset(T value) {
        Asserts.that(value)
                .as("The offset value cannot be null.")
                .isNotNull();
        Asserts.that(value.doubleValue())
                .as("The offset value should be greater than or equal to zero.")
                .isGreaterThanOrEqualTo(0.0);
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        return new Offset<>(value);
    }

    private T getValue() {
        return value;
    }

    /**
     * Verify {@code expected} is in offset area or not.
     *
     * @param actual   reference value.
     * @param expected expected in offset area.
     * @return expected is in offset or not.
     */
    public boolean isOffset(T actual, T expected) {
        Asserts.that(expected)
                .as("expected cannot be null.")
                .isNotNull();
        Asserts.that(expected.doubleValue())
                .as("Negative numbers cannot be compared.")
                .isPositive();
        return isAfter(getBefore(actual), expected.doubleValue()) &&
                isBefore(getAfter(actual), expected.doubleValue());
    }

    private boolean isBefore(Double after, Double expected) {
        return expected <= after;
    }

    private boolean isAfter(Double before, Double expected) {
        return expected >= before;
    }

    /**
     * Get address locations minus a base address.
     *
     * @param actual reference value.
     * @return address locations minus a base address.
     */
    public double getBefore(T actual) {
        return (offset(actual).getValueInternal() - value.doubleValue());
    }

    /**
     * Get address locations added to a base address.
     *
     * @param actual reference value.
     * @return address locations added to a base address.
     */
    public double getAfter(T actual) {
        return (offset(actual).getValueInternal() + value.doubleValue());
    }

    private double getValueInternal() {
        return offset(value).getValue().doubleValue();
    }

}
