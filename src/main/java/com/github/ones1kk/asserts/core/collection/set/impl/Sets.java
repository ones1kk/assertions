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

package com.github.ones1kk.asserts.core.collection.set.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.collection.set.SetsInterfaces;
import com.github.ones1kk.asserts.core.feature.comparable.collection.CollectionComparable;
import com.github.ones1kk.asserts.core.feature.comparable.collection.impl.CollectionComparableImpl;
import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.CollectionContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl.CollectionContainableImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.Set;
import java.util.function.Predicate;

/**
 * <strong> The Sets class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL>
 */
public class Sets<ACTUAL> extends Objects<ACTUAL> implements SetsInterfaces<ACTUAL> {

    private final CollectionContainable<ACTUAL> containable = new CollectionContainableImpl<>();

    private final CollectionComparable<ACTUAL> comparable = new CollectionComparableImpl<>();

    public Sets(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(Set<? extends ACTUAL> actual) {
        if (!actual.isEmpty()) {
            handler.setDescription(handler.from("The actual is is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Set<? extends ACTUAL> actual) {
        if (actual.isEmpty()) {
            handler.setDescription(handler.from("The actual is is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Set<? extends ACTUAL> actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.setDescription(handler.from("The actual is is not null or not empty"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContains(Set<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual does not contain of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Set<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual is contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(Set<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(Set<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Set<? extends ACTUAL> actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from("The actual does not contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Set<? extends ACTUAL> actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from("The actual is contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Set<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.setDescription(handler.from("The actual is is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Set<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.setDescription(handler.from("The actual is is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsSmallerThan(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isLagerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThanOrEqualTo(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isLagerThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLagerThan(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLagerThanOrEqualTo(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenSizeOf(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> start, Set<? extends ACTUAL> end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLagerThan(actual, end)) {
            String description = handler.getDescribable().as("size of actual is not between {} and {}", start.size(), end.size());
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
