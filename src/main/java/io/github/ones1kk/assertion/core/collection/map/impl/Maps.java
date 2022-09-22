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

package io.github.ones1kk.assertion.core.collection.map.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.collection.map.MapsInterface;
import io.github.ones1kk.assertion.core.feature.comparable.collection.impl.MapComparable;
import io.github.ones1kk.assertion.core.feature.iterable.containable.collection.impl.MapContainable;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.MapErrorMessages;

import java.util.Map;

import static io.github.ones1kk.assertion.core.message.IterableErrorMessages.*;
import static io.github.ones1kk.assertion.core.message.SizeComparableErrorMessages.*;

/**
 * <strong> The Maps class inherits {@link AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public final class Maps<ACTUAL extends Map<K, V>, K, V> extends Objects<ACTUAL> implements MapsInterface<ACTUAL, K, V> {

    private final MapContainable<ACTUAL, K, V> containable = new MapContainable<>();
    private final MapComparable<ACTUAL, K, V> comparable = new MapComparable<>();

    public Maps(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(ACTUAL actual) {
        if (!actual.isEmpty()) {
            handler.receive(actual, shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(ACTUAL actual) {
        if (actual.isEmpty()) {
            handler.receive(actual, shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.receive(actual, shouldNotBeNullOrEmpty(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContainsKey(ACTUAL actual, K expected) {
        if (!actual.containsKey(expected)) {
            handler.receive(actual, expected, MapErrorMessages.shouldContainKey(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAllKey(ACTUAL actual, Map<? extends K, ?> expected) {
        if (containable.doesNotContainAllKey(actual, expected)) {
            handler.receive(actual, expected, MapErrorMessages.shouldContainAllKey(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsValue(ACTUAL actual, V expected) {
        if (!actual.containsValue(expected)) {
            handler.receive(actual, expected, MapErrorMessages.shouldContainValue(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAllValue(ACTUAL actual, Map<?, ? extends V> expected) {
        if (containable.doesNotContainAllValue(actual, expected)) {
            handler.receive(actual, expected, MapErrorMessages.shouldContainAllValue(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasSizeOf(ACTUAL actual, int expected) {
        if (actual.size() != expected) {
            handler.receive(actual, expected, MapErrorMessages.shouldHasSameSizeOf(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasSameSizeOf(ACTUAL actual, Map<?, ?> expected) {
        if (comparable.doesNotHaveSameSizeOf(actual, expected)) {
            handler.receive(actual, expected.size(), MapErrorMessages.shouldHasSameSizeOf(actual, expected.size()));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHaveSameSizeOf(ACTUAL actual, Map<?, ?> expected) {
        if (comparable.hasSameSizeOf(actual, expected)) {
            handler.receive(actual, expected, MapErrorMessages.shouldDoNotHaveSizeOf(actual, expected.size()));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThan(ACTUAL actual, ACTUAL expected) {
        if (comparable.isLargerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeSmallerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThanOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isLargerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeSmallerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThan(ACTUAL actual, ACTUAL expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeLargerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThanOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLargerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenSizeOf(ACTUAL actual, ACTUAL start, ACTUAL end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLargerThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
