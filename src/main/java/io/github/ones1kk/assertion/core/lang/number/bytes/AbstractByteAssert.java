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
package io.github.ones1kk.assertion.core.lang.number.bytes;

import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.compare.Comparable;
import io.github.ones1kk.assertion.core.lang.number.DivisiblesAssertion;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractByteAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Byte type and verify assertion.</p>
 */
public abstract class AbstractByteAssert extends AbstractObjectAssert<AbstractByteAssert, Byte> implements ByteAssertion<AbstractByteAssert, Byte>, Comparable<AbstractByteAssert, Byte> {

    private final DivisiblesAssertion<Byte> bytes;

    public AbstractByteAssert(Class<?> self, Byte actual) {
        super(self, actual);
        this.bytes = new Bytes();
    }

    /**
     * verify actual is odd.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isOdd() {
        objects.assertNotNull(info, actual);
        bytes.assertOdd(info, actual);
        return self;
    }

    /**
     * verify actual is not odd.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNotOdd() {
        objects.assertNotNull(info, actual);
        bytes.assertNotOdd(info, actual);
        return self;
    }

    /**
     * verify actual is even.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isEven() {
        objects.assertNotNull(info, actual);
        bytes.assertEven(info, actual);
        return self;
    }

    /**
     * verify actual is not even.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNotEven() {
        objects.assertNotNull(info, actual);
        bytes.assertNotEven(info, actual);
        return self;
    }

    /**
     * verify actual is positive.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isPositive() {
        objects.assertNotNull(info, actual);
        bytes.assertPositive(info, actual);
        return self;
    }

    /**
     * verify actual is not positive.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNotPositive() {
        objects.assertNotNull(info, actual);
        bytes.assertNotPositive(info, actual);
        return self;
    }

    /**
     * verify actual is negative.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNegative() {
        objects.assertNotNull(info, actual);
        bytes.assertNegative(info, actual);
        return self;
    }

    /**
     * verify actual is not negative.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNotNegative() {
        objects.assertNotNull(info, actual);
        bytes.assertNotNegative(info, actual);
        return self;
    }

    /**
     * verify actual is zero.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isZero() {
        objects.assertNotNull(info, actual);
        bytes.assertZero(info, actual);
        return self;
    }

    /**
     * verify actual is not zero.
     *
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNotZero() {
        objects.assertNotNull(info, actual);
        bytes.assertNotZero(info, actual);
        return self;
    }

    /**
     * verify actual is close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isCloseTo(Byte expected, Offset<Byte> offset) {
        objects.assertNotNull(info, actual);
        bytes.assertCloseTo(info, actual, expected, offset);
        return self;
    }

    /**
     * verify actual is close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isCloseTo(Byte expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        bytes.assertCloseTo(info, actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * verify actual is not close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNotCloseTo(Byte expected, Offset<Byte> offset) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        bytes.assertNotCloseTo(info, actual, expected, offset);
        return self;
    }

    /**
     * verify actual is not close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isNotCloseTo(Byte expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        bytes.assertNotCloseTo(info, actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isLessThan(Byte expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        bytes.assertLessThan(info, actual, expected);
        return self;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isLessThanOrEqualTo(Byte expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        bytes.assertLessThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isGreaterThan(Byte expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        bytes.assertGreaterThan(info, actual, expected);
        return self;
    }


    /**
     * verify actual is greater that or equal to expected
     *
     * @param expected expected
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isGreaterThanOrEqualTo(Byte expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        bytes.assertGreaterThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractByteAssert}.
     */
    @Override
    public AbstractByteAssert isBetween(Byte start, Byte end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        bytes.assertBetween(info, actual, start, end);
        return self;
    }

}
