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

package io.github.ones1kk.asserts.core.collection.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.collection.CollectionsInterface;
import io.github.ones1kk.asserts.core.feature.comparable.collection.CollectionComparable;
import io.github.ones1kk.asserts.core.feature.comparable.collection.impl.CollectionComparableImpl;
import io.github.ones1kk.asserts.core.feature.iterable.containable.collection.CollectionContainable;
import io.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl.CollectionContainableImpl;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.Collection;
import java.util.function.Predicate;

import static io.github.ones1kk.asserts.core.message.IterableErrorMessages.*;
import static io.github.ones1kk.asserts.core.message.SizeComparableErrorMessages.*;

/**
 * <strong> The Collections class inherits {@link AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public final class Collections<ACTUAL> extends Objects<ACTUAL> implements CollectionsInterface<ACTUAL> {

    private final CollectionContainable<ACTUAL> containable = new CollectionContainableImpl<>();

    private final CollectionComparable<ACTUAL> comparable = new CollectionComparableImpl<>();

    public Collections(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(Collection<? extends ACTUAL> actual) {
        if (!actual.isEmpty()) {
            handler.receive(actual, shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Collection<? extends ACTUAL> actual) {
        if (actual.isEmpty()) {
            handler.receive(actual, shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Collection<? extends ACTUAL> actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.receive(actual, shouldNotBeNullOrEmpty(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContains(Collection<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.receive(actual, expected, shouldContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Collection<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.receive(actual, expected, shouldDoNotContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(Collection<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.receive(actual, expected, shouldContainAll(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(Collection<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.receive(actual, expected, shouldContainAny(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Collection<? extends ACTUAL> actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.receive(actual, shouldContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Collection<? extends ACTUAL> actual) {
        if (containable.containsNull(actual)) {
            handler.receive(actual, shouldDoNotContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Collection<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.receive(actual, shouldBeAllMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Collection<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.receive(actual, shouldDoNotMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsSmallerThan(Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isLargerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeSmallerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThanOrEqualTo(Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isLargerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeSmallerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThan(Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeLargerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThanOrEqualTo(Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLargerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenSizeOf(Collection<? extends ACTUAL> actual, Collection<? extends ACTUAL> start, Collection<? extends ACTUAL> end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLargerThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
