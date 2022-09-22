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

package io.github.ones1kk.assertion.core.collection.set.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.collection.set.SetsInterfaces;
import io.github.ones1kk.assertion.core.feature.comparable.collection.CollectionComparable;
import io.github.ones1kk.assertion.core.feature.comparable.collection.impl.CollectionComparableImpl;
import io.github.ones1kk.assertion.core.feature.iterable.containable.collection.CollectionContainable;
import io.github.ones1kk.assertion.core.feature.iterable.containable.collection.impl.CollectionContainableImpl;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.IterableErrorMessages;
import io.github.ones1kk.assertion.core.message.SizeComparableErrorMessages;

import java.util.Set;
import java.util.function.Predicate;

/**
 * <strong> The Sets class inherits {@link AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public final class Sets<ACTUAL> extends Objects<ACTUAL> implements SetsInterfaces<ACTUAL> {

    private final CollectionContainable<ACTUAL> containable = new CollectionContainableImpl<>();

    private final CollectionComparable<ACTUAL> comparable = new CollectionComparableImpl<>();

    public Sets(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(Set<? extends ACTUAL> actual) {
        if (!actual.isEmpty()) {
            handler.receive(actual, IterableErrorMessages.shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Set<? extends ACTUAL> actual) {
        if (actual.isEmpty()) {
            handler.receive(actual, IterableErrorMessages.shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Set<? extends ACTUAL> actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.receive(actual, IterableErrorMessages.shouldNotBeNullOrEmpty(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContains(Set<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Set<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldDoNotContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(Set<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContainAll(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(Set<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContainAny(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Set<? extends ACTUAL> actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Set<? extends ACTUAL> actual) {
        if (containable.containsNull(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldDoNotContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Set<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.receive(actual, IterableErrorMessages.shouldBeAllMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Set<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.receive(actual, IterableErrorMessages.shouldDoNotMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsSmallerThan(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isLargerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, SizeComparableErrorMessages.shouldBeSmallerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThanOrEqualTo(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isLargerThan(actual, expected)) {
            handler.receive(actual, expected, SizeComparableErrorMessages.shouldBeSmallerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThan(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, SizeComparableErrorMessages.shouldBeLargerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThanOrEqualTo(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.receive(actual, expected, SizeComparableErrorMessages.shouldBeLargerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenSizeOf(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> start, Set<? extends ACTUAL> end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLargerThan(actual, end)) {
            handler.receive(actual, SizeComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
