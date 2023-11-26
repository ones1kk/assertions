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

import io.github.ones1kk.assertion.core.feature.DivisibleType;
import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;
import io.github.ones1kk.assertion.core.lang.number.DivisiblesAssertion;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.ComparableErrorMessage;
import io.github.ones1kk.assertion.core.message.DataErrorMessage;
import io.github.ones1kk.assertion.core.message.DivisibleTypeErrorMessage;
import io.github.ones1kk.assertion.core.message.NumerableErrorMessage;

public class Bytes extends Objects<Byte> implements DivisiblesAssertion<Byte> {

    private final ComparableLanguage<Byte> comparable = new ComparableLanguageImpl<>();

    /**
     * assert actual is ood.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertOdd(AssertionsInfo info, Byte actual) {
        if (DivisibleType.of(actual).isEven()) {
            throw failures.failure(info, DivisibleTypeErrorMessage.shouldBeOdd(actual));
        }
    }

    /**
     * assert actual is not odd.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotOdd(AssertionsInfo info, Byte actual) {
        if (DivisibleType.of(actual).isOdd()) {
            throw failures.failure(info, DivisibleTypeErrorMessage.shouldNotBeOdd(actual));
        }
    }

    /**
     * assert actual is even.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertEven(AssertionsInfo info, Byte actual) {
        if (DivisibleType.of(actual).isOdd()) {
            throw failures.failure(info, DivisibleTypeErrorMessage.shouldBeEven(actual));
        }
    }

    /**
     * assert actual is not even.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotEven(AssertionsInfo info, Byte actual) {
        if (DivisibleType.of(actual).isEven()) {
            throw failures.failure(info, DivisibleTypeErrorMessage.shouldNotBeEven(actual));
        }
    }

    /**
     * assert actual is positive.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertPositive(AssertionsInfo info, Byte actual) {
        if (comparable.isLessThanOrEqualTo(actual, (byte) 0)) {
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
    public void assertNotPositive(AssertionsInfo info, Byte actual) {
        if (comparable.isGreaterThan(actual, (byte) 0)) {
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
    public void assertNegative(AssertionsInfo info, Byte actual) {
        if (comparable.isGreaterThanOrEqualTo(actual, (byte) 0)) {
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
    public void assertNotNegative(AssertionsInfo info, Byte actual) {
        if (comparable.isLessThan(actual, (byte) 0)) {
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
    public void assertZero(AssertionsInfo info, Byte actual) {
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
    public void assertNotZero(AssertionsInfo info, Byte actual) {
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
    public void assertCloseTo(AssertionsInfo info, Byte actual, Byte expected, Offset<Byte> offset) {
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
    public void assertCloseTo(AssertionsInfo info, Byte actual, Byte expected, Percentage<Byte> percentage) {
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
    public void assertNotCloseTo(AssertionsInfo info, Byte actual, Byte expected, Offset<Byte> offset) {
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
    public void assertNotCloseTo(AssertionsInfo info, Byte actual, Byte expected, Percentage<Byte> percentage) {
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
    public void assertLessThan(AssertionsInfo info, Byte actual, Byte expected) {
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
    public void assertLessThanOrEqualTo(AssertionsInfo info, Byte actual, Byte expected) {
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
    public void assertGreaterThan(AssertionsInfo info, Byte actual, Byte expected) {
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
    public void assertGreaterThanOrEqualTo(AssertionsInfo info, Byte actual, Byte expected) {
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
    public void assertBetween(AssertionsInfo info, Byte actual, Byte start, Byte end) {
        if (comparable.isLessThan(actual, start) || comparable.isGreaterThan(actual, end)) {
            throw failures.failure(info, ComparableErrorMessage.shouldBeBetween(actual, start, end));
        }
    }

    private void setAssertClose(AssertionsInfo info, Byte actual, Offset<Byte> offset) {
        throw failures.failure(info, DataErrorMessage.shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
    }

    private void setAssertClose(AssertionsInfo info, Byte actual, Percentage<Byte> percentage) {
        throw failures.failure(info, DataErrorMessage.shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
    }

}
