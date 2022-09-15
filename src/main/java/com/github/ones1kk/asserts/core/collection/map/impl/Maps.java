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

package com.github.ones1kk.asserts.core.collection.map.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.collection.map.MapsInterface;
import com.github.ones1kk.asserts.core.feature.comparable.collection.impl.MapComparable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl.MapContainable;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.Map;

/**
 * <strong> The Maps class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL>
 */
public class Maps<ACTUAL extends Map<K, V>, K, V> extends Objects<ACTUAL> implements MapsInterface<ACTUAL, K, V> {

    private final MapContainable<ACTUAL, K, V> containable = new MapContainable<>();
    private final MapComparable<ACTUAL, K, V> comparable = new MapComparable<>();

    public Maps(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(ACTUAL actual) {
        if (!actual.isEmpty()) {
            handler.setDescription(handler.from("The actual is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(ACTUAL actual) {
        if (actual.isEmpty()) {
            handler.setDescription(handler.from("The actual is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.setDescription(handler.from("The actual is not null or not empty"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContainsKey(ACTUAL actual, K expected) {
        if (!actual.containsKey(expected)) {
            handler.setDescription(handler.from("The actual does not contain any of key"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAllKey(ACTUAL actual, Map<? extends K, ?> expected) {
        if (containable.doesNotContainAllKey(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain all of key"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsValue(ACTUAL actual, V expected) {
        if (!actual.containsValue(expected)) {
            handler.setDescription(handler.from(expected, "The actual does not contain value of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAllValue(ACTUAL actual, Map<?, ? extends V> expected) {
        if (containable.doesNotContainAllValue(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain all of value"));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasSizeOf(ACTUAL actual, int expected) {
        if (actual.size() != expected) {
            handler.setDescription(handler.from(expected, "size of actual is not {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasSameSizeOf(ACTUAL actual, Map<?, ?> expected) {
        if (comparable.doesNotHaveSameSizeOf(actual, expected)) {
            handler.setDescription(handler.from("size of actual does not have same size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHaveSameSizeOf(ACTUAL actual, Map<?, ?> expected) {
        if (comparable.hasSameSizeOf(actual, expected)) {
            handler.setDescription(handler.from("size of actual has same size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThan(ACTUAL actual, ACTUAL expected) {
        if (comparable.isLagerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThanOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isLagerThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLagerThan(ACTUAL actual, ACTUAL expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLagerThanOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenSizeOf(ACTUAL actual, ACTUAL start, ACTUAL end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLagerThan(actual, end)) {
            String description = handler.getDescribable().as("size of actual is not between {} and {}", start.size(), end.size());
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
