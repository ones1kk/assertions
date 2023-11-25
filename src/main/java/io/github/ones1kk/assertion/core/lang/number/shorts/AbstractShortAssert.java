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
package io.github.ones1kk.assertion.core.lang.number.shorts;

import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.compare.Comparable;
import io.github.ones1kk.assertion.core.lang.number.DivisiblesAssertion;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractShortAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Short type and verify assertion.</p>
 */
public abstract class AbstractShortAssert extends AbstractObjectAssert<AbstractShortAssert, Short> implements ShortAssertion<AbstractShortAssert, Short>, Comparable<AbstractShortAssert, Short> {

    private final DivisiblesAssertion<Short> shorts;

    public AbstractShortAssert(Class<?> self, Short actual) {
        super(self, actual);
        this.shorts = new Shorts();
    }

    /**
     * verify actual is odd.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isOdd() {
        objects.assertNotNull(info, actual);
        shorts.assertOdd(info, actual);
        return self;
    }

    /**
     * verify actual is not odd.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNotOdd() {
        objects.assertNotNull(info, actual);
        shorts.assertNotOdd(info, actual);
        return self;
    }

    /**
     * verify actual is even.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isEven() {
        objects.assertNotNull(info, actual);
        shorts.assertEven(info, actual);
        return self;
    }

    /**
     * verify actual is not even.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNotEven() {
        objects.assertNotNull(info, actual);
        shorts.assertNotEven(info, actual);
        return self;
    }

    /**
     * verify actual is positive.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isPositive() {
        objects.assertNotNull(info, actual);
        shorts.assertPositive(info, actual);
        return self;
    }

    /**
     * verify actual is not positive.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNotPositive() {
        objects.assertNotNull(info, actual);
        shorts.assertNotPositive(info, actual);
        return self;
    }

    /**
     * verify actual is negative.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNegative() {
        objects.assertNotNull(info, actual);
        shorts.assertNegative(info, actual);
        return self;
    }

    /**
     * verify actual is not negative.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNotNegative() {
        objects.assertNotNull(info, actual);
        shorts.assertNotNegative(info, actual);
        return self;
    }

    /**
     * verify actual is zero.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isZero() {
        objects.assertNotNull(info, actual);
        shorts.assertZero(info, actual);
        return self;
    }

    /**
     * verify actual is not zero.
     *
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNotZero() {
        objects.assertNotNull(info, actual);
        shorts.assertNotZero(info, actual);
        return self;
    }

    /**
     * verify actual is close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isCloseTo(Short expected, Offset<Short> offset) {
        objects.assertNotNull(info, actual);
        shorts.assertCloseTo(info, actual, expected, offset);
        return self;
    }

    /**
     * verify actual is close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isCloseTo(Short expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        shorts.assertCloseTo(info, actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * verify actual is not close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNotCloseTo(Short expected, Offset<Short> offset) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        shorts.assertNotCloseTo(info, actual, expected, offset);
        return self;
    }

    /**
     * verify actual is not close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isNotCloseTo(Short expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        shorts.assertNotCloseTo(info, actual, expected, Percentage.of(percentage));
        return self;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isLessThan(Short expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        shorts.assertLessThan(info, actual, expected);
        return self;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isLessThanOrEqualTo(Short expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        shorts.assertLessThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isGreaterThan(Short expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        shorts.assertGreaterThan(info, actual, expected);
        return self;
    }


    /**
     * verify actual is greater that or equal to expected
     *
     * @param expected expected
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isGreaterThanOrEqualTo(Short expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        shorts.assertGreaterThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractShortAssert}.
     */
    @Override
    public AbstractShortAssert isBetween(Short start, Short end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        shorts.assertBetween(info, actual, start, end);
        return self;
    }
}
