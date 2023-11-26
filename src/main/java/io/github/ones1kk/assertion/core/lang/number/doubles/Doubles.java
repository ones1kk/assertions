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

import io.github.ones1kk.assertion.core.feature.DivisibleType;
import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.ComparableErrorMessage;
import io.github.ones1kk.assertion.core.message.DataErrorMessage;
import io.github.ones1kk.assertion.core.message.IndivisibleErrorMessage;
import io.github.ones1kk.assertion.core.message.NumerableErrorMessage;

public class Doubles extends Objects<Double> implements DoublesAssertion<Double> {

    ComparableLanguage<Double> comparable = new ComparableLanguageImpl<>();

    /**
     * assert actual is infinite.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertInfinite(AssertionsInfo info, Double actual) {
        if (!Double.isInfinite(actual)) {
            throw failures.failure(info, IndivisibleErrorMessage.shouldBeInfinity(actual));
        }
    }

    /**
     * assert actual is finite.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertFinite(AssertionsInfo info, Double actual) {
        if (!Double.isFinite(actual)) {
            throw failures.failure(info, IndivisibleErrorMessage.shouldBeFinite(actual));
        }
    }

    /**
     * assert actual is NaN.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNaN(AssertionsInfo info, Double actual) {
        if (!Double.isNaN(actual)) {
            throw failures.failure(info, IndivisibleErrorMessage.shouldBeNaN(actual));
        }
    }

    /**
     * assert actual is positive.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertPositive(AssertionsInfo info, Double actual) {
        if (comparable.isLessThanOrEqualTo(actual, (double) 0)) {
            throw failures.failure(info, NumerableErrorMessage.shouldBePositive(actual));
        }
    }

    /**
     * assert actual is not positive.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotPositive(AssertionsInfo info, Double actual) {
        if (comparable.isGreaterThan(actual, (double) 0)) {
            throw failures.failure(info, NumerableErrorMessage.shouldNotBePositive(actual));
        }
    }

    /**
     * assert actual is negative.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNegative(AssertionsInfo info, Double actual) {
        if (comparable.isGreaterThanOrEqualTo(actual, (double) 0)) {
            throw failures.failure(info, NumerableErrorMessage.shouldBeNegative(actual));
        }
    }

    /**
     * assert actual is not negative.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotNegative(AssertionsInfo info, Double actual) {
        if (comparable.isLessThan(actual, (double) 0)) {
            throw failures.failure(info, NumerableErrorMessage.shouldNotBeNegative(actual));
        }
    }

    /**
     * assert actual is zero.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertZero(AssertionsInfo info, Double actual) {
        if (DivisibleType.of(actual).isNotZero()) {
            throw failures.failure(info, NumerableErrorMessage.shouldBeZero(actual));
        }
    }

    /**
     * assert actual is not zero.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotZero(AssertionsInfo info, Double actual) {
        if (DivisibleType.of(actual).isZero()) {
            throw failures.failure(info, NumerableErrorMessage.shouldNotBeZero(actual));
        }
    }

    /**
     * assert actual is close to expected as offset.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     * @param offset   offset
     */
    @Override
    public void assertCloseTo(AssertionsInfo info, Double actual, Double expected, Offset<Double> offset) {
        if (!offset.isOffset(actual, expected)) {
            setAssertClose(info, actual, offset);
        }
    }

    /**
     * assert actual is close to expected as percentage.
     *
     * @param info       {@link ErrorMessageInfo}
     * @param actual     actual
     * @param expected   expected
     * @param percentage percentage
     */
    @Override
    public void assertCloseTo(AssertionsInfo info, Double actual, Double expected, Percentage<Double> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(info, actual, percentage);
        }
    }

    /**
     * assert actual is not close to expected as offset.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     * @param offset   offset
     */
    @Override
    public void assertNotCloseTo(AssertionsInfo info, Double actual, Double expected, Offset<Double> offset) {
        if (offset.isOffset(actual, expected)) {
            setAssertClose(info, actual, offset);
        }
    }

    /**
     * assert actual is not close to expected as percentage.
     *
     * @param info       {@link ErrorMessageInfo}
     * @param actual     actual
     * @param expected   expected
     * @param percentage percentage
     */
    @Override
    public void assertNotCloseTo(AssertionsInfo info, Double actual, Double expected, Percentage<Double> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(info, actual, percentage);
        }
    }

    /**
     * assert actual is less than expected
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLessThan(AssertionsInfo info, Double actual, Double expected) {
        if (comparable.isGreaterThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessage.shouldBeLessThan(actual, expected));
        }
    }

    /**
     * assert actual is less than or equal to expected
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLessThanOrEqualTo(AssertionsInfo info, Double actual, Double expected) {
        if (comparable.isGreaterThan(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessage.shouldBeLessThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert actual is greater than expected
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertGreaterThan(AssertionsInfo info, Double actual, Double expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessage.shouldBeGreaterThan(actual, expected));
        }
    }

    /**
     * assert actual is greater than or equal to expected
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertGreaterThanOrEqualTo(AssertionsInfo info, Double actual, Double expected) {
        if (comparable.isLessThan(actual, expected)) {
            throw failures.failure(info, ComparableErrorMessage.shouldBeGreaterThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert actual is between start and end.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     * @param start  start
     * @param end    end
     */
    @Override
    public void assertBetween(AssertionsInfo info, Double actual, Double start, Double end) {
        if (comparable.isLessThan(actual, start) || comparable.isGreaterThan(actual, end)) {
            throw failures.failure(info, ComparableErrorMessage.shouldBeBetween(actual, start, end));
        }
    }

    private void setAssertClose(AssertionsInfo info, Double actual, Offset<Double> offset) {
        throw failures.failure(info, DataErrorMessage.shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
    }

    private void setAssertClose(AssertionsInfo info, Double actual, Percentage<Double> percentage) {
        throw failures.failure(info, DataErrorMessage.shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
    }

}
