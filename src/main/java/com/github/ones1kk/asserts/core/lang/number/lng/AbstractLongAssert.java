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

package com.github.ones1kk.asserts.core.lang.number.lng;

import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractLongAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br><br>
 * <p> This is that implements the assertion method of the Long type and verify assertion.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractLongAssert<SELF extends AbstractLongAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Long> implements LongAssertInterface<SELF> {

    private final LongsInterface<Long> longs;

    public AbstractLongAssert(Class<?> self, Long actual) {
        super(self, actual);
        this.longs = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is odd or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isOdd() {
        longs.assertIsOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not odd or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotOdd() {
        longs.assertIsNotOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is even or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isEven() {
        longs.assertIsEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not even or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotEven() {
        longs.assertIsNotEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is positive or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isPositive() {
        longs.assertIsPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not positive or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotPositive() {
        longs.assertIsNotPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is negative or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNegative() {
        longs.assertIsNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not negative or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotNegative() {
        longs.assertIsNotNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is zero or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isZero() {
        longs.assertIsZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not zero or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotZero() {
        longs.assertIsNotZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is less than {@code expected}.
     *
     * @param expected greater than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLessThan(Long expected) {
        longs.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}.
     *
     * @param expected greater than or Equal to {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isLessThanOrEqualTo(Long expected) {
        longs.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}.
     *
     * @param expected less than {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThan(Long expected) {
        longs.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Long expected) {
        longs.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is between {@code start} and {@code end}
     *
     * @param start less than or Equal to {@code actual}
     * @param end   greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isBetween(Long start, Long end) {
        longs.assertIsBetween(actual, start, end);
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
    public SELF isCloseTo(Long expected, Offset<Long> offset) {
        longs.assertIsCloseTo(actual, expected, offset);
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
    public SELF isCloseTo(Long expected, Double percentage) {
        longs.assertIsCloseTo(actual, expected, Percentage.of(percentage));
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
    public SELF isNotCloseTo(Long expected, Offset<Long> offset) {
        longs.assertIsNotCloseTo(actual, expected, offset);
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
    public SELF isNotCloseTo(Long expected, Double percentage) {
        longs.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
