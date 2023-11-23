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
public class AbstractIntegerAssertion extends AbstractObjectAssert<Integer> implements IntegerAssertion<AbstractIntegerAssertion, Integer>, Comparable<AbstractIntegerAssertion, Integer> {

    private final DivisiblesAssertion<Integer> integers;

    public AbstractIntegerAssertion(Integer integer) {
        super(integer);
        this.integers = new Integers();
    }

    /**
     * verify actual is odd.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isOdd() {
        objects.assertNotNull(info, actual);
        integers.assertOdd(info, actual);
        return this;
    }

    /**
     * verify actual is not odd.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNotOdd() {
        objects.assertNotNull(info, actual);
        integers.assertNotOdd(info, actual);
        return this;
    }

    /**
     * verify actual is even.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isEven() {
        objects.assertNotNull(info, actual);
        integers.assertEven(info, actual);
        return this;
    }

    /**
     * verify actual is not even.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNotEven() {
        objects.assertNotNull(info, actual);
        integers.assertNotEven(info, actual);
        return this;
    }

    /**
     * verify actual is positive.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isPositive() {
        objects.assertNotNull(info, actual);
        integers.assertPositive(info, actual);
        return this;
    }

    /**
     * verify actual is not positive.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNotPositive() {
        objects.assertNotNull(info, actual);
        integers.assertNotPositive(info, actual);
        return this;
    }

    /**
     * verify actual is negative.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNegative() {
        objects.assertNotNull(info, actual);
        integers.assertNegative(info, actual);
        return this;
    }

    /**
     * verify actual is not negative.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNotNegative() {
        objects.assertNotNull(info, actual);
        integers.assertNotNegative(info, actual);
        return this;
    }

    /**
     * verify actual is zero.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isZero() {
        objects.assertNotNull(info, actual);
        integers.assertZero(info, actual);
        return this;
    }

    /**
     * verify actual is not zero.
     *
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNotZero() {
        objects.assertNotNull(info, actual);
        integers.assertNotZero(info, actual);
        return this;
    }

    /**
     * verify actual is close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isCloseTo(Integer expected, Offset<Integer> offset) {
        objects.assertNotNull(info, actual);
        integers.assertCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isCloseTo(Integer expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is not close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNotCloseTo(Integer expected, Offset<Integer> offset) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertNotCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is not close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isNotCloseTo(Integer expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertNotCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isLessThan(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertLessThan(info, actual, expected);
        return this;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isLessThanOrEqualTo(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertLessThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isGreaterThan(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertGreaterThan(info, actual, expected);
        return this;
    }


    @Override
    public AbstractIntegerAssertion isGreaterThanOrEqualTo(Integer expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        integers.assertGreaterThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractIntegerAssertion}.
     */
    @Override
    public AbstractIntegerAssertion isBetween(Integer start, Integer end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        integers.assertBetween(info, actual, start, end);
        return this;
    }

}
