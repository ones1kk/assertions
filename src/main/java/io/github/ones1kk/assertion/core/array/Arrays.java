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

package io.github.ones1kk.assertion.core.array;

import io.github.ones1kk.assertion.core.feature.comparable.array.ArrayComparable;
import io.github.ones1kk.assertion.core.feature.comparable.array.ArrayComparableImpl;
import io.github.ones1kk.assertion.core.feature.containable.array.ArrayContainable;
import io.github.ones1kk.assertion.core.feature.containable.array.ArrayContainableImpl;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.IterableErrorMessage;
import io.github.ones1kk.assertion.core.message.LengthComparableErrorMessage;

import java.util.function.Predicate;

import static java.util.Objects.isNull;
import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

/**
 * <strong> The Arrays class inherits {@link Objects} </strong>
 *
 * @param <ELEMENT> {@code actual}.
 */
public final class Arrays<ELEMENT> extends Objects<ELEMENT> implements ArraysAssertion<ELEMENT> {

    private final ArrayContainable<ELEMENT> containable = new ArrayContainableImpl<>();

    private final ArrayComparable<ELEMENT> comparable = new ArrayComparableImpl<>();

    /**
     * assert {@code actual} is empty
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertEmpty(AssertionsInfo info, ELEMENT[] actual) {
        if (isNotEmpty(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldBeEmpty(actual));
        }
    }

    /**
     * assert {@code actual} is not empty
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotEmpty(AssertionsInfo info, ELEMENT[] actual) {
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
    public void assertNullOrEmpty(AssertionsInfo info, ELEMENT[] actual) {
        if (isNotEmpty(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldBeNullOrEmpty(actual));
        }
    }

    /**
     * assert {@code actual} is null or empty.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotNullOrNotEmpty(AssertionsInfo info, ELEMENT[] actual) {
        if (isNull(actual) || isEmpty(actual)) {
            throw failures.failure(info, IterableErrorMessage.shouldNotBeNullOrEmpty(actual));
        }
    }

    /**
     * assert {@code actual} contains {@code expected}
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertContains(AssertionsInfo info, ELEMENT[] actual, ELEMENT expected) {
        if (containable.doesNotContain(actual, expected)) {
            throw failures.failure(info, IterableErrorMessage.shouldContain(actual, expected));
        }
    }

    /**
     * assert {@code actual} does not contain {@code expected}
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertDoesNotContain(AssertionsInfo info, ELEMENT[] actual, ELEMENT expected) {
        if (containable.contains(actual, expected)) {
            throw failures.failure(info, IterableErrorMessage.shouldDoNotContain(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains all of {@code expected}
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    @SuppressWarnings("AssertionsInfo info, unchecked")
    public void assertContainsAll(AssertionsInfo info, ELEMENT[] actual, ELEMENT... expected) {
        if (containable.containsNotAll(actual, expected)) {
            throw failures.failure(info, IterableErrorMessage.shouldContainAll(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains any of {@code expected}
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    @SuppressWarnings("AssertionsInfo info, unchecked")
    public void assertContainsAny(AssertionsInfo info, ELEMENT[] actual, ELEMENT... expected) {
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
    public void assertContainsNull(AssertionsInfo info, ELEMENT[] actual) {
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
    public void assertDoesNotContainNull(AssertionsInfo info, ELEMENT[] actual) {
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
    public void assertAllMatch(AssertionsInfo info, ELEMENT[] actual, Predicate<ELEMENT> expected) {
        for (ELEMENT value : actual) {
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
    public void assertNoneMatch(AssertionsInfo info, ELEMENT[] actual, Predicate<ELEMENT> expected) {
        for (ELEMENT value : actual) {
            if (expected.test(value)) {
                throw failures.failure(info, IterableErrorMessage.shouldDoNotMatch(actual));
            }
        }
    }

    /**
     * assert actual has same expected size.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     * @param size   size
     */
    @Override
    public void assertHasSize(AssertionsInfo info, ELEMENT[] actual, int size) {
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
    public void assertShorterThan(AssertionsInfo info, ELEMENT[] actual, ELEMENT[] expected) {
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
    public void assertShorterThanOrEqualTo(AssertionsInfo info, ELEMENT[] actual, ELEMENT[] expected) {
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
    public void assertLongerThan(AssertionsInfo info, ELEMENT[] actual, ELEMENT[] expected) {
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
    public void assertLongerThanOrEqualTo(AssertionsInfo info, ELEMENT[] actual, ELEMENT[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            throw failures.failure(info, LengthComparableErrorMessage.shouldBeLongerThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is between {@code start} and {@code end}
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     * @param start  start
     * @param end    end
     */
    @Override
    public void assertBetweenLengthOf(AssertionsInfo info, ELEMENT[] actual, ELEMENT[] start, ELEMENT[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            throw failures.failure(info, LengthComparableErrorMessage.shouldBeBetween(actual, start, end));
        }
    }
}
