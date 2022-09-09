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

package com.github.ones1kk.asserts.core.lang.number.integer;

import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractIntegerAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br><br>
 * <p> This is that implements the assertion method of the Integer type and verify assertion.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractIntegerAssert<SELF extends AbstractIntegerAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Integer> implements IntegerAssertInterface<SELF> {

    private final IntegersInterface<Integer> integers;

    public AbstractIntegerAssert(Class<?> self, Integer actual) {
        super(self, actual);
        this.integers = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is odd or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isOdd() {
        integers.assertIsOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not odd or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotOdd() {
        integers.assertIsNotOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is even or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isEven() {
        integers.assertIsEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not even or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotEven() {
        integers.assertIsNotEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is positive or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isPositive() {
        integers.assertIsPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not positive or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotPositive() {
        integers.assertIsNotPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is negative or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNegative() {
        integers.assertIsNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not negative or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotNegative() {
        integers.assertIsNotNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is zero or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isZero() {
        integers.assertIsZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not zero or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotZero() {
        integers.assertIsNotZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is less than {@code expected}
     *
     * @param expected greater than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThan(Integer expected) {
        integers.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThanOrEqualTo(Integer expected) {
        integers.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThan(Integer expected) {
        integers.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to {@code expected}
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Integer expected) {
        integers.assertIsGreaterThanOrEqualTo(actual, expected);
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
    public SELF isBetween(Integer start, Integer end) {
        integers.assertIsBetween(actual, start, end);
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
    public SELF isCloseTo(Integer expected, Double percentage) {
        integers.assertIsCloseTo(actual, expected, Percentage.of(percentage));
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
    public SELF isNotCloseTo(Integer expected, Double percentage) {
        integers.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
