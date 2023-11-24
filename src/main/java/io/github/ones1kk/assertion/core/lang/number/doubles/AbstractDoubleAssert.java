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
package io.github.ones1kk.assertion.core.lang.number.doubles;

import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.compare.Comparable;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractDoubleAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Double type and verify assertion.</p>
 */
public abstract class AbstractDoubleAssert extends AbstractObjectAssert<AbstractDoubleAssert, Double> implements DoubleAssertion<AbstractDoubleAssert, Double>, Comparable<AbstractDoubleAssert, Double> {

    DoublesAssertion<Double> doubles;

    public AbstractDoubleAssert(Class<?> self, Double actual) {
        super(self, actual);
        this.doubles = new Doubles();
    }

    /**
     * verify actual is infinite.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isInfinite() {
        objects.assertNotNull(info, actual);
        doubles.assertInfinite(info, actual);
        return this;
    }

    /**
     * verify actual is finite.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isFinite() {
        objects.assertNotNull(info, actual);
        doubles.assertFinite(info, actual);
        return this;
    }

    /**
     * verify actual is NaN.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isNaN() {
        objects.assertNotNull(info, actual);
        doubles.assertNaN(info, actual);
        return this;
    }

    /**
     * verify actual is positive.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isPositive() {
        objects.assertNotNull(info, actual);
        doubles.assertPositive(info, actual);
        return this;
    }

    /**
     * verify actual is not positive.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isNotPositive() {
        objects.assertNotNull(info, actual);
        doubles.assertNotPositive(info, actual);
        return this;
    }

    /**
     * verify actual is negative.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isNegative() {
        objects.assertNotNull(info, actual);
        doubles.assertNegative(info, actual);
        return this;
    }

    /**
     * verify actual is not negative.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isNotNegative() {
        objects.assertNotNull(info, actual);
        doubles.assertNotNegative(info, actual);
        return this;
    }

    /**
     * verify actual is zero.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isZero() {
        objects.assertNotNull(info, actual);
        doubles.assertZero(info, actual);
        return this;
    }

    /**
     * verify actual is not zero.
     *
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isNotZero() {
        objects.assertNotNull(info, actual);
        doubles.assertNotZero(info, actual);
        return this;
    }

    /**
     * verify actual is close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isCloseTo(Double expected, Offset<Double> offset) {
        objects.assertNotNull(info, actual);
        doubles.assertCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isCloseTo(Double expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        doubles.assertCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is not close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isNotCloseTo(Double expected, Offset<Double> offset) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        doubles.assertNotCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is not close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isNotCloseTo(Double expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        doubles.assertNotCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isLessThan(Double expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        doubles.assertLessThan(info, actual, expected);
        return this;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isLessThanOrEqualTo(Double expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        doubles.assertLessThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isGreaterThan(Double expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        doubles.assertGreaterThan(info, actual, expected);
        return this;
    }


    /**
     * verify actual is greater that or equal to expected
     *
     * @param expected expected
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isGreaterThanOrEqualTo(Double expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        doubles.assertGreaterThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractDoubleAssert}.
     */
    @Override
    public AbstractDoubleAssert isBetween(Double start, Double end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        doubles.assertBetween(info, actual, start, end);
        return this;
    }

}
