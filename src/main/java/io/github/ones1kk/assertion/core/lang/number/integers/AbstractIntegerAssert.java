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
package io.github.ones1kk.assertion.core.lang.number.integers;

import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.compare.Comparable;
import io.github.ones1kk.assertion.core.lang.number.DivisiblesAssertion;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractIntegerAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Integer type and verify assertion.</p>
 */
public abstract class AbstractIntegerAssert extends AbstractObjectAssert<AbstractIntegerAssert, Integer> implements IntegerAssertion<AbstractIntegerAssert, Integer>, Comparable<AbstractIntegerAssert, Integer> {

    private final DivisiblesAssertion<Integer> integers;

    public AbstractIntegerAssert(Class<?> self, Integer actual) {
        super(self, actual);
        this.integers = new Integers();
    }

    /**
     * verify actual is odd.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isOdd() {
        objects.assertNotNull(info, actual);
        integers.assertOdd(info, actual);
        return self;
    }

    /**
     * verify actual is not odd.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNotOdd() {
        objects.assertNotNull(info, actual);
        integers.assertNotOdd(info, actual);
        return self;
    }

    /**
     * verify actual is even.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isEven() {
        objects.assertNotNull(info, actual);
        integers.assertEven(info, actual);
        return self;
    }

    /**
     * verify actual is not even.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNotEven() {
        objects.assertNotNull(info, actual);
        integers.assertNotEven(info, actual);
        return self;
    }

    /**
     * verify actual is positive.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isPositive() {
        objects.assertNotNull(info, actual);
        integers.assertPositive(info, actual);
        return self;
    }

    /**
     * verify actual is not positive.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNotPositive() {
        objects.assertNotNull(info, actual);
        integers.assertNotPositive(info, actual);
        return self;
    }

    /**
     * verify actual is negative.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNegative() {
        objects.assertNotNull(info, actual);
        integers.assertNegative(info, actual);
        return self;
    }

    /**
     * verify actual is not negative.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNotNegative() {
        objects.assertNotNull(info, actual);
        integers.assertNotNegative(info, actual);
        return self;
    }

    /**
     * verify actual is zero.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isZero() {
        objects.assertNotNull(info, actual);
        integers.assertZero(info, actual);
        return self;
    }

    /**
     * verify actual is not zero.
     *
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNotZero() {
        objects.assertNotNull(info, actual);
        integers.assertNotZero(info, actual);
        return self;
    }

    /**
     * verify actual is close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isCloseTo(Integer expected, Offset<Integer> offset) {
        objects.assertNotNull(info, actual);
        integers.assertCloseTo(info, actual, expected, offset);
        return self;
    }

    /**
     * verify actual is close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isCloseTo(Integer expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertCloseTo(info, actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * verify actual is not close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNotCloseTo(Integer expected, Offset<Integer> offset) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertNotCloseTo(info, actual, expected, offset);
        return self;
    }

    /**
     * verify actual is not close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isNotCloseTo(Integer expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertNotCloseTo(info, actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isLessThan(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertLessThan(info, actual, expected);
        return self;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isLessThanOrEqualTo(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertLessThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isGreaterThan(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertGreaterThan(info, actual, expected);
        return self;
    }


    /**
     * verify actual is greater that or equal to expected
     *
     * @param expected expected
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isGreaterThanOrEqualTo(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertGreaterThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractIntegerAssert}.
     */
    @Override
    public AbstractIntegerAssert isBetween(Integer start, Integer end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        integers.assertBetween(info, actual, start, end);
        return self;
    }

}
