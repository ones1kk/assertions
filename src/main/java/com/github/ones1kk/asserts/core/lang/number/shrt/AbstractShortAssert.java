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

package com.github.ones1kk.asserts.core.lang.number.shrt;

import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractShortAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br><br>
 * <p> This is that implements the assertion method of the Short type and verify assertion.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractShortAssert<SELF extends AbstractShortAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Short> implements ShortAssertInterface<SELF> {

    private final ShortsInterface<Short> shorts;

    public AbstractShortAssert(Class<?> self, Short actual) {
        super(self, actual);
        this.shorts = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is odd or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isOdd() {
        shorts.assertIsOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not odd or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotOdd() {
        shorts.assertIsNotOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is even or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isEven() {
        shorts.assertIsEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not even or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotEven() {
        shorts.assertIsNotEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is positive or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isPositive() {
        shorts.assertIsPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not positive or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotPositive() {
        shorts.assertIsNotPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is negative or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNegative() {
        shorts.assertIsNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not negative or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotNegative() {
        shorts.assertIsNotNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is zero or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isZero() {
        shorts.assertIsZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not zero or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotZero() {
        shorts.assertIsNotZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is less than {@code expected}
     *
     * @param expected greater than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThan(Short expected) {
        shorts.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThanOrEqualTo(Short expected) {
        shorts.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThan(Short expected) {
        shorts.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to {@code expected}
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Short expected) {
        shorts.assertIsGreaterThanOrEqualTo(actual, expected);
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
    public SELF isBetween(Short start, Short end) {
        shorts.assertIsBetween(actual, start, end);
        return self;
    }

    /**
     * Verify {@code actual} is close to {@code expected} by {@code offset}
     *
     * @param expected closed by difference of {@code offset} from {@code actual}
     * @param offset   offset value {@link Offset#offset(Number)}
     * @return {@code self}
     */
    @Override
    public SELF isCloseTo(Short expected, Offset<Short> offset) {
        shorts.assertIsCloseTo(actual, expected, offset);
        return self;
    }

    /**
     * Verify {@code actual} is close to {@code expected} by {@code percentage}
     *
     * @param expected   closed by difference of {@code percentage} from {@code actual}
     * @param percentage percentage value {@link  Percentage#of(Double)}
     * @return {@code self}
     */
    @Override
    public SELF isCloseTo(Short expected, Double percentage) {
        shorts.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * Verify {@code actual} is not close to {@code expected} by {@code offset}
     *
     * @param expected closed by difference of {@code offset} from {@code actual}
     * @param offset   offset value {@link Offset#offset(Number)}
     * @return {@code self}
     */
    @Override
    public SELF isNotCloseTo(Short expected, Offset<Short> offset) {
        shorts.assertIsNotCloseTo(actual, expected, offset);
        return self;
    }

    /**
     * Verify {@code actual} is not close to {@code expected} by {@code percentage}
     *
     * @param expected   closed by difference of {@code percentage} from {@code actual}
     * @param percentage percentage value {@link  Percentage#of(Double)}
     * @return {@code self}
     */
    @Override
    public SELF isNotCloseTo(Short expected, Double percentage) {
        shorts.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
