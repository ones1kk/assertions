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
package io.github.ones1kk.assertion.core.lang.number.longs;

import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.compare.Comparable;
import io.github.ones1kk.assertion.core.lang.number.DivisiblesAssertion;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

public class AbstractLongAssert extends AbstractObjectAssert<Long> implements LongAssertion<AbstractLongAssert, Long>, Comparable<AbstractLongAssert, Long> {

    private final DivisiblesAssertion<Long> longs;

    public AbstractLongAssert(Long actual) {
        super(actual);
        this.longs = new Longs();
    }

    /**
     * verify actual is odd.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isOdd() {
        objects.assertNotNull(info, actual);
        longs.assertOdd(info, actual);
        return this;
    }

    /**
     * verify actual is not odd.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNotOdd() {
        objects.assertNotNull(info, actual);
        longs.assertNotOdd(info, actual);
        return this;
    }

    /**
     * verify actual is even.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isEven() {
        objects.assertNotNull(info, actual);
        longs.assertEven(info, actual);
        return this;
    }

    /**
     * verify actual is not even.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNotEven() {
        objects.assertNotNull(info, actual);
        longs.assertNotEven(info, actual);
        return this;
    }

    /**
     * verify actual is positive.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isPositive() {
        objects.assertNotNull(info, actual);
        longs.assertPositive(info, actual);
        return this;
    }

    /**
     * verify actual is not positive.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNotPositive() {
        objects.assertNotNull(info, actual);
        longs.assertNotPositive(info, actual);
        return this;
    }

    /**
     * verify actual is negative.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNegative() {
        objects.assertNotNull(info, actual);
        longs.assertNegative(info, actual);
        return this;
    }

    /**
     * verify actual is not negative.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNotNegative() {
        objects.assertNotNull(info, actual);
        longs.assertNotNegative(info, actual);
        return this;
    }

    /**
     * verify actual is zero.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isZero() {
        objects.assertNotNull(info, actual);
        longs.assertZero(info, actual);
        return this;
    }

    /**
     * verify actual is not zero.
     *
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNotZero() {
        objects.assertNotNull(info, actual);
        longs.assertNotZero(info, actual);
        return this;
    }

    /**
     * verify actual is close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isCloseTo(Long expected, Offset<Long> offset) {
        objects.assertNotNull(info, actual);
        longs.assertCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isCloseTo(Long expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        longs.assertCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is not close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNotCloseTo(Long expected, Offset<Long> offset) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        longs.assertNotCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is not close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isNotCloseTo(Long expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        longs.assertNotCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isLessThan(Long expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        longs.assertLessThan(info, actual, expected);
        return this;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isLessThanOrEqualTo(Long expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        longs.assertLessThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isGreaterThan(Long expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        longs.assertGreaterThan(info, actual, expected);
        return this;
    }


    /**
     * verify actual is greater that or equal to expected
     *
     * @param expected expected
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isGreaterThanOrEqualTo(Long expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        longs.assertGreaterThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractLongAssert}.
     */
    @Override
    public AbstractLongAssert isBetween(Long start, Long end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        longs.assertBetween(info, actual, start, end);
        return this;
    }
}
