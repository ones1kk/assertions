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

package io.github.ones1kk.asserts.core.lang.number.duble;

import io.github.ones1kk.asserts.core.feature.data.Offset;
import io.github.ones1kk.asserts.core.feature.data.Percentage;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractDoubleAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Double type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractDoubleAssert<SELF extends AbstractDoubleAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Double> implements DoubleAssertInterface<SELF> {

    private final DoublesInterface<Double> doubles;

    public AbstractDoubleAssert(Class<?> self, Double actual) {
        super(self, actual);
        this.doubles = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is infinity or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isInfinity() {
        doubles.assertIsInfinity(actual);
        return self;
    }

    /**
     * Verify {@code actual} is finite or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isFinite() {
        doubles.assertIsFinite(actual);
        return self;
    }

    /**
     * Verify {@code actual} is NaN or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNaN() {
        doubles.assertIsNaN(actual);
        return self;
    }

    /**
     * Verify {@code actual} is positive or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isPositive() {
        doubles.assertIsPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not positive or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotPositive() {
        doubles.assertIsNotPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is negative or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNegative() {
        doubles.assertIsNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not negative or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotNegative() {
        doubles.assertIsNotNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is zero or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isZero() {
        doubles.assertIsZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not zero or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotZero() {
        doubles.assertIsNotZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is less than {@code expected}.
     *
     * @param expected greater than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLessThan(Double expected) {
        doubles.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}.
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLessThanOrEqualTo(Double expected) {
        doubles.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThan(Double expected) {
        doubles.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Double expected) {
        doubles.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is between {@code start} and {@code end}
     *
     * @param start less than or Equal to {@code actual}
     * @param end   greater than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isBetween(Double start, Double end) {
        doubles.assertIsBetween(actual, start, end);
        return self;
    }

    /**
     * Verify {@code actual} is close to {@code expected} by {@code offset}.
     *
     * @param expected closed by difference of {@code offset} from {@code actual}.
     * @param offset   offset value {@link Offset#offset(Number)}.
     * @return {@code self}.
     */
    @Override
    public SELF isCloseTo(Double expected, Offset<Double> offset) {
        doubles.assertIsCloseTo(actual, expected, offset);
        return self;
    }

    /**
     * Verify {@code actual} is close to {@code expected} by {@code percentage}.
     *
     * @param expected   closed by difference of {@code percentage} from {@code actual}.
     * @param percentage percentage value {@link  Percentage#of(Double)}.
     * @return {@code self}.
     */
    @Override
    public SELF isCloseTo(Double expected, Double percentage) {
        doubles.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * Verify {@code actual} is not close to {@code expected} by {@code offset}.
     *
     * @param expected closed by difference of {@code offset} from {@code actual}.
     * @param offset   offset value {@link Offset#offset(Number)}.
     * @return {@code self}.
     */
    @Override
    public SELF isNotCloseTo(Double expected, Offset<Double> offset) {
        doubles.assertIsNotCloseTo(actual, expected, offset);
        return self;
    }

    /**
     * Verify {@code actual} is not close to {@code expected} by {@code percentage}.
     *
     * @param expected   closed by difference of {@code percentage} from {@code actual}.
     * @param percentage percentage value {@link  Percentage#of(Double)}.
     * @return {@code self}.
     */
    @Override
    public SELF isNotCloseTo(Double expected, Double percentage) {
        doubles.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
