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

package io.github.ones1kk.assertion.core.collection.map;

import io.github.ones1kk.assertion.core.feature.comparable.collection.MapComparable;
import io.github.ones1kk.assertion.core.feature.containable.collection.MapContainable;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.IterableErrorMessage;
import io.github.ones1kk.assertion.core.message.MapErrorMessage;
import io.github.ones1kk.assertion.core.message.SizeComparableErrorMessage;

import java.util.Map;


/**
 * <strong> The Maps class inherits {@link AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public final class Maps<ACTUAL extends Map<K, V>, K, V> extends Objects<ACTUAL> implements MapsAssertion<ACTUAL, K, V> {

    private final MapContainable<ACTUAL, K, V> containable = new MapContainable<>();
    private final MapComparable<ACTUAL, K, V> comparable = new MapComparable<>();

    /**
     * assert {@code actual} is empty or not.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertEmpty(AssertionsInfo info, ACTUAL actual) {
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
    public void assertNotEmpty(AssertionsInfo info, ACTUAL actual) {
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
    public void assertNullOrEmpty(AssertionsInfo info, ACTUAL actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                throw failures.failure(info, IterableErrorMessage.shouldNotBeNullOrEmpty(actual));
            }
        }
    }

    /**
     * assert {@code actual} contains key of {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertContainsKey(AssertionsInfo info, ACTUAL actual, K expected) {
        if (!actual.containsKey(expected)) {
            throw failures.failure(info, MapErrorMessage.shouldContainKey(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains all key of {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertContainsAllKey(AssertionsInfo info, ACTUAL actual, Map<? extends K, ?> expected) {
        if (containable.doesNotContainAllKey(actual, expected)) {
            throw failures.failure(info, MapErrorMessage.shouldContainAllKey(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains value of {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertContainsValue(AssertionsInfo info, ACTUAL actual, V expected) {
        if (!actual.containsValue(expected)) {
            throw failures.failure(info, MapErrorMessage.shouldContainValue(actual, expected));
        }
    }

    /**
     * assert {@code actual} contains all value of {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertContainsAllValue(AssertionsInfo info, ACTUAL actual, Map<?, ? extends V> expected) {
        if (containable.doesNotContainAllValue(actual, expected)) {
            throw failures.failure(info, MapErrorMessage.shouldContainAllValue(actual, expected));
        }
    }

    /**
     * assert {@code actual} is equal size of {@code expected} or not.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertHasSize(AssertionsInfo info, ACTUAL actual, int expected) {
        if (actual.size() != expected) {
            throw failures.failure(info, MapErrorMessage.shouldHasSameSizeOf(actual, expected));
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
    public void assertSmallerThan(AssertionsInfo info, ACTUAL actual, ACTUAL expected) {
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
    public void assertSmallerThanOrEqualTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected) {
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
    public void assertLargerThan(AssertionsInfo info, ACTUAL actual, ACTUAL expected) {
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
    public void assertLargerThanOrEqualTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeLargerThanOrEqualTo(actual, expected));
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
    public void assertBetweenSizeOf(AssertionsInfo info, ACTUAL actual, ACTUAL start, ACTUAL end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLargerThan(actual, end)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeBetween(actual, start, end));
        }
    }
}
