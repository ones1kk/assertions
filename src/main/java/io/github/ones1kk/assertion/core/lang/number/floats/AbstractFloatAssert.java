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
package io.github.ones1kk.assertion.core.lang.number.floats;

import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.compare.Comparable;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractFloatAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Float type and verify assertion.</p>
 */
public abstract class AbstractFloatAssert extends AbstractObjectAssert<Float> implements FloatAssertion<AbstractFloatAssert, Float>, Comparable<AbstractFloatAssert, Float> {

    FloatsAssertion<Float> floats;

    public AbstractFloatAssert(Float actual) {
        super(actual);
        this.floats = new Floats();
    }

    /**
     * verify actual is infinite.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isInfinite() {
        objects.assertNotNull(info, actual);
        floats.assertInfinite(info, actual);
        return this;
    }

    /**
     * verify actual is finite.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isFinite() {
        objects.assertNotNull(info, actual);
        floats.assertFinite(info, actual);
        return this;
    }

    /**
     * verify actual is NaN.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isNaN() {
        objects.assertNotNull(info, actual);
        floats.assertNaN(info, actual);
        return this;
    }

    /**
     * verify actual is positive.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isPositive() {
        objects.assertNotNull(info, actual);
        floats.assertPositive(info, actual);
        return this;
    }

    /**
     * verify actual is not positive.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isNotPositive() {
        objects.assertNotNull(info, actual);
        floats.assertNotPositive(info, actual);
        return this;
    }

    /**
     * verify actual is negative.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isNegative() {
        objects.assertNotNull(info, actual);
        floats.assertNegative(info, actual);
        return this;
    }

    /**
     * verify actual is not negative.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isNotNegative() {
        objects.assertNotNull(info, actual);
        floats.assertNotNegative(info, actual);
        return this;
    }

    /**
     * verify actual is zero.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isZero() {
        objects.assertNotNull(info, actual);
        floats.assertZero(info, actual);
        return this;
    }

    /**
     * verify actual is not zero.
     *
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isNotZero() {
        objects.assertNotNull(info, actual);
        floats.assertNotZero(info, actual);
        return this;
    }

    /**
     * verify actual is close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isCloseTo(Float expected, Offset<Float> offset) {
        objects.assertNotNull(info, actual);
        floats.assertCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isCloseTo(Float expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        floats.assertCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is not close to expected as offset.
     *
     * @param expected expected
     * @param offset   offset
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isNotCloseTo(Float expected, Offset<Float> offset) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        floats.assertNotCloseTo(info, actual, expected, offset);
        return this;
    }

    /**
     * verify actual is not close to expected as percentage.
     *
     * @param expected   expected
     * @param percentage percentage
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isNotCloseTo(Float expected, Double percentage) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        floats.assertNotCloseTo(info, actual, expected, Percentage.of(percentage));
        return this;
    }

    /**
     * verify actual is less than expected.
     *
     * @param expected expected
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isLessThan(Float expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        floats.assertLessThan(info, actual, expected);
        return this;
    }

    /**
     * verify actual is less than or equal to expected.
     *
     * @param expected expected
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isLessThanOrEqualTo(Float expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        floats.assertLessThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is greater than expected.
     *
     * @param expected expected
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isGreaterThan(Float expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        floats.assertGreaterThan(info, actual, expected);
        return this;
    }


    /**
     * verify actual is greater that or equal to expected
     *
     * @param expected expected
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isGreaterThanOrEqualTo(Float expected) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, expected);
        floats.assertGreaterThanOrEqualTo(info, actual, expected);
        return this;
    }

    /**
     * verify actual is between start and end.
     *
     * @param start start
     * @param end   end
     * @return {@link AbstractFloatAssert}.
     */
    @Override
    public AbstractFloatAssert isBetween(Float start, Float end) {
        objects.assertNotNull(info, actual);
        objects.assertNotNull(info, start);
        objects.assertNotNull(info, end);
        floats.assertBetween(info, actual, start, end);
        return this;
    }

}
