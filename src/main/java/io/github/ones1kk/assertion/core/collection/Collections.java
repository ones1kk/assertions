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
package io.github.ones1kk.assertion.core.collection;

import io.github.ones1kk.assertion.core.feature.comparable.collection.CollectionComparable;
import io.github.ones1kk.assertion.core.feature.comparable.collection.CollectionComparableImpl;
import io.github.ones1kk.assertion.core.feature.containable.collection.CollectionContainable;
import io.github.ones1kk.assertion.core.feature.containable.collection.CollectionContainableImpl;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.IterableErrorMessage;
import io.github.ones1kk.assertion.core.message.SizeComparableErrorMessage;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * <strong> The Collections class inherits {@link Objects} </strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public class Collections<ACTUAL> extends Objects<Collection<ACTUAL>> implements CollectionsAssertion<ACTUAL> {

    private final CollectionContainable<ACTUAL> containable = new CollectionContainableImpl<>();

    private final CollectionComparable<ACTUAL> comparable = new CollectionComparableImpl<>();

    /**
     * assert {@code actual} is empty or not.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertEmpty(AssertionsInfo info, Collection<? extends ACTUAL> actual) {
        if (!actual.isEmpty()) {
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
    public void assertNotEmpty(AssertionsInfo info, Collection<? extends ACTUAL> actual) {
        if (actual.isEmpty()) {
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
    public void assertNullOrEmpty(AssertionsInfo info, Collection<? extends ACTUAL> actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                throw failures.failure(info, IterableErrorMessage.shouldNotBeNullOrEmpty(actual));
            }
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
    public void assertContains(AssertionsInfo info, Collection<? extends ACTUAL> actual, ACTUAL expected) {
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
    public void assertDoesNotContain(AssertionsInfo info, Collection<? extends ACTUAL> actual, ACTUAL expected) {
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
    @SuppressWarnings("unchecked")
    public void assertContainsAll(AssertionsInfo info, Collection<? extends ACTUAL> actual, ACTUAL... expected) {
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
    public void assertContainsAny(AssertionsInfo info, Collection<? extends ACTUAL> actual, ACTUAL... expected) {
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
    public void assertContainsNull(AssertionsInfo info, Collection<? extends ACTUAL> actual) {
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
    public void assertDoesNotContainNull(AssertionsInfo info, Collection<? extends ACTUAL> actual) {
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
    public void assertAllMatch(AssertionsInfo info, Collection<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
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
    public void assertNoneMatch(AssertionsInfo info, Collection<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                throw failures.failure(info, IterableErrorMessage.shouldDoNotMatch(actual));
            }
        }
    }

    /**
     * assert {@code actual} size is smaller than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertSmallerThan(AssertionsInfo info, Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isLargerThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeSmallerThan(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertSmallerThanOrEqualTo(AssertionsInfo info, Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isLargerThan(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeSmallerThanOrEqualTo(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is larger than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLargerThan(AssertionsInfo info, Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeLargerThan(actual, expected));
        }
    }

    /**
     * assert {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLargerThanOrEqualTo(AssertionsInfo info, Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeLargerThanOrEqualTo(actual, expected));
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
    public void assertBetweenSizeOf(AssertionsInfo info, Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> start, Collection<? extends ACTUAL> end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLargerThan(actual, end)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeBetween(actual, start, end));
        }
    }
}
