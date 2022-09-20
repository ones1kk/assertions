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

package io.github.ones1kk.asserts.core.lang.number.flot;

import io.github.ones1kk.asserts.core.feature.data.Offset;
import io.github.ones1kk.asserts.core.feature.data.Percentage;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractFloatAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Float type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractFloatAssert<SELF extends AbstractFloatAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Float> implements FloatAssertInterface<SELF> {

    private final FloatsInterface<Float> floats;

    public AbstractFloatAssert(Class<?> self, Float actual) {
        super(self, actual);
        this.floats = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is infinity or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isInfinity() {
        floats.assertIsInfinity(actual);
        return self;
    }

    /**
     * Verify {@code actual} is finite or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isFinite() {
        floats.assertIsFinite(actual);
        return self;
    }

    /**
     * Verify {@code actual} is NaN or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNaN() {
        floats.assertIsNaN(actual);
        return self;
    }

    /**
     * Verify {@code actual} is positive or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isPositive() {
        floats.assertIsPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not positive or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotPositive() {
        floats.assertIsNotPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is negative or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNegative() {
        floats.assertIsNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not negative or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotNegative() {
        floats.assertIsNotNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is zero or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isZero() {
        floats.assertIsZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not zero or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotZero() {
        floats.assertIsNotZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is less than {@code expected}.
     *
     * @param expected greater than {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isLessThan(Float expected) {
        floats.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}.
     *
     * @param expected greater than or Equal to {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isLessThanOrEqualTo(Float expected) {
        floats.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}.
     *
     * @param expected less than {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThan(Float expected) {
        floats.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to {@code expected}.
     *
     * @param expected less than {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Float expected) {
        floats.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is between {@code start} and {@code end}.
     *
     * @param start less than or Equal to {@code actual}.
     * @param end   greater than or Equal to {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isBetween(Float start, Float end) {
        floats.assertIsBetween(actual, start, end);
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
    public SELF isCloseTo(Float expected, Offset<Float> offset) {
        floats.assertIsCloseTo(actual, expected, offset);
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
    public SELF isCloseTo(Float expected, Double percentage) {
        floats.assertIsCloseTo(actual, expected, Percentage.of(percentage));
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
    public SELF isNotCloseTo(Float expected, Offset<Float> offset) {
        floats.assertIsNotCloseTo(actual, expected, offset);
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
    public SELF isNotCloseTo(Float expected, Double percentage) {
        floats.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
