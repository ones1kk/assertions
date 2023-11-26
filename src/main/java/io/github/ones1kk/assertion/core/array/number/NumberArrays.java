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

package io.github.ones1kk.assertion.core.array.number;

import io.github.ones1kk.assertion.core.feature.comparable.array.ArrayComparable;
import io.github.ones1kk.assertion.core.feature.comparable.array.ArrayComparableImpl;
import io.github.ones1kk.assertion.core.feature.containable.array.NumberArrayContainableImpl;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.IterableErrorMessage;
import io.github.ones1kk.assertion.core.message.LengthComparableErrorMessage;
import io.github.ones1kk.assertion.core.message.NumberArrayErrorMessage;

import java.util.function.Predicate;

import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

/**
 * <strong> The NumberArrays class inherits {@link Objects} </strong>
 */
public final class NumberArrays extends Objects<Number[]> implements NumberArraysAssertion<Number> {

    private final NumberArrayContainableImpl<Number> containable = new NumberArrayContainableImpl<>();

    private final ArrayComparable<Number> comparable = new ArrayComparableImpl<>();

    /**
     * assert {@code expected} is max of {@code actual}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertMax(AssertionsInfo info, Number[] actual, Number expected) {
        if (!containable.isMax(actual, expected)) {
            throw failures.failure(info, NumberArrayErrorMessage.shouldBeMax(actual, expected));
        }
    }

    /**
     * assert {@code expected} is min of {@code actual}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertMin(AssertionsInfo info, Number[] actual, Number expected) {
        if (!containable.isMin(actual, expected)) {
            throw failures.failure(info, NumberArrayErrorMessage.shouldBeMin(actual, expected));
        }
    }

    /**
     * assert {@code expected} is sum of {@code actual}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertSum(AssertionsInfo info, Number[] actual, Number expected) {
        if (!containable.isSum(actual, expected)) {
            throw failures.failure(info, NumberArrayErrorMessage.shouldBeSum(actual, expected));
        }
    }

    /**
     * assert {@code actual} is empty or not.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertEmpty(AssertionsInfo info, Number[] actual) {
        if (isNotEmpty(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldBeEmpty(actual));
        }
    }

    /**
     * assert {@code actual} is not empty or not.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotEmpty(AssertionsInfo info, Number[] actual) {
        if (isEmpty(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldNotBeEmpty(actual));
        }
    }

    /**
     * assert {@code actual} is null or empty.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNullOrEmpty(AssertionsInfo info, Number[] actual) {
        if (isNotEmpty(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldNotBeNullOrEmpty(actual));
        }
    }

    /**
     * assert {@code actual} contains {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertContains(AssertionsInfo info, Number[] actual, Number expected) {
        if (containable.doesNotContain(actual, expected)) {
            throw failures.failure(info, IterableErrorMessage.shouldContain(actual, expected));
        }
    }

    /**
     * assert {@code actual} does not contain {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertDoesNotContain(AssertionsInfo info, Number[] actual, Number expected) {
        if (containable.contains(actual, expected)) {
            throw failures.failure(info, IterableErrorMessage.shouldDoNotContain(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains all of {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertContainsAll(AssertionsInfo info, Number[] actual, Number... expected) {
        if (containable.containsNotAll(actual, expected)) {
            throw failures.failure(info, IterableErrorMessage.shouldContainAll(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains any of {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(AssertionsInfo info, Number[] actual, Number... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            throw failures.failure(info, IterableErrorMessage.shouldContainAny(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains null.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertContainsNull(AssertionsInfo info, Number[] actual) {
        if (containable.doesNotContainNull(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldContainNull(actual));
        }
    }

    /**
     * assert {@code actual} does not contain null.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertDoesNotContainNull(AssertionsInfo info, Number[] actual) {
        if (containable.containsNull(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldDoNotContainNull(actual));
        }
    }

    /**
     * assert {@code actual} is all matched from all conditions.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertAllMatch(AssertionsInfo info, Number[] actual, Predicate<Number> expected) {
        for (Number value : actual) {
            if (!expected.test(value)) {
                throw failures.failure(info, IterableErrorMessage.shouldBeAllMatch(actual));
            }
        }
    }

    /**
     * assert {@code actual} is not matched from all conditions.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertNoneMatch(AssertionsInfo info, Number[] actual, Predicate<Number> expected) {
        for (Number value : actual) {
            if (expected.test(value)) {
                throw failures.failure(info, IterableErrorMessage.shouldDoNotMatch(actual));
            }
        }
    }

    /**
     * assert {@code actual} has same expected size.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     * @param size   expected
     */
    @Override
    public void assertHasSize(AssertionsInfo info, Number[] actual, int size) {
        if (actual.length != size) {
            throw failures.failure(info, IterableErrorMessage.shouldHaveSameSize(size));
        }
    }

    /**
     * assert {@code actual} size is shorter than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertShorterThan(AssertionsInfo info, Number[] actual, Number[] expected) {
        if (comparable.isLongerThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, LengthComparableErrorMessage.shouldBeShorterThan(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is shorter than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertShorterThanOrEqualTo(AssertionsInfo info, Number[] actual, Number[] expected) {
        if (comparable.isLongerThan(actual, expected)) {
            throw failures.failure(info, LengthComparableErrorMessage.shouldBeShorterThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is longer than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLongerThan(AssertionsInfo info, Number[] actual, Number[] expected) {
        if (comparable.isShorterThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, LengthComparableErrorMessage.shouldBeLongerThan(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is longer than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLongerThanOrEqualTo(AssertionsInfo info, Number[] actual, Number[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            throw failures.failure(info, LengthComparableErrorMessage.shouldBeLongerThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is between {@code start} and {@code end}.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     * @param start  start
     * @param end    end
     */
    @Override
    public void assertBetweenLengthOf(AssertionsInfo info, Number[] actual, Number[] start, Number[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            throw failures.failure(info, LengthComparableErrorMessage.shouldBeBetween(actual, start, end));
        }
    }
}
