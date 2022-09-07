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

package com.github.ones1kk.asserts.core.lang.number.bte;

import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractByteAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br><br>
 * <p> This is that implements the assertion method of the Byte type and verify assertion.</p>
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractByteAssert<SELF extends AbstractByteAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Byte> implements ByteAssertInterface<SELF> {

    private final BytesInterface<Byte> bytes;

    public AbstractByteAssert(Class<?> self, Byte actual) {
        super(self, actual);
        this.bytes = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is odd or not
     * @return {@code self}
     */
    @Override
    public SELF isOdd() {
        bytes.assertIsOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not odd or not
     * @return {@code self}
     */
    @Override
    public SELF isNotOdd() {
        bytes.assertIsNotOdd(actual);
        return self;
    }

    /**
     * Verify {@code actual} is even or not
     * @return {@code self}
     */
    @Override
    public SELF isEven() {
        bytes.assertIsEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not even or not
     * @return {@code self}
     */
    @Override
    public SELF isNotEven() {
        bytes.assertIsNotEven(actual);
        return self;
    }

    /**
     * Verify {@code actual} is less than {@code expected}
     * @param expected greater than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThan(Byte expected) {
        bytes.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThanOrEqualTo(Byte expected) {
        bytes.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThan(Byte expected) {
        bytes.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to{ @code expected}
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Byte expected) {
        bytes.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is between {@code start} and {@code end}
     * @param start less than or Equal to {@code actual}
     * @param end greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isBetween(Byte start, Byte end) {
        bytes.assertIsBetween(actual, start, end);
        return self;
    }

    /**
     * Verify {@code actual} is positive or not
     * @return {@code self}
     */
    @Override
    public SELF isPositive() {
        bytes.assertIsPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not positive or not
     * @return {@code self}
     */
    @Override
    public SELF isNotPositive() {
        bytes.assertIsNotPositive(actual);
        return self;
    }

    /**
     * Verify {@code actual} is negative or not
     * @return {@code self}
     */
    @Override
    public SELF isNegative() {
        bytes.assertIsNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not negative or not
     * @return {@code self}
     */
    @Override
    public SELF isNotNegative() {
        bytes.assertIsNotNegative(actual);
        return self;
    }

    /**
     * Verify {@code actual} is zero or not
     * @return {@code self}
     */
    @Override
    public SELF isZero() {
        bytes.assertIsZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not zero or not
     * @return {@code self}
     */
    @Override
    public SELF isNotZero() {
        bytes.assertIsNotZero(actual);
        return self;
    }

    /**
     * Verify {@code actual} is close to {@code expected} by {@code percentage}
     * @param expected closed by difference of {@code percentage} from {@code actual}
     * @param percentage percentage value {@link  Percentage#of(Double)}
     * @return {@code self}
     */
    @Override
    public SELF isCloseTo(Byte expected, Double percentage) {
        bytes.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * Verify {@code actual} is not close to {@code expected} by {@code percentage}
     * @param expected closed by difference of {@code percentage} from {@code actual}
     * @param percentage percentage value {@link  Percentage#of(Double)}
     * @return {@code self}
     */
    @Override
    public SELF isNotCloseTo(Byte expected, Double percentage) {
        bytes.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
