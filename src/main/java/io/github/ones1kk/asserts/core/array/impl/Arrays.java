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

package io.github.ones1kk.asserts.core.array.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.array.ArraysInterface;
import io.github.ones1kk.asserts.core.feature.comparable.array.ArrayComparable;
import io.github.ones1kk.asserts.core.feature.comparable.array.impl.ArrayComparableImpl;
import io.github.ones1kk.asserts.core.feature.iterable.containable.array.ArrayContainable;
import io.github.ones1kk.asserts.core.feature.iterable.containable.array.impl.ArrayContainableImpl;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.impl.Objects;
import io.github.ones1kk.asserts.core.message.IterableErrorMessages;
import io.github.ones1kk.asserts.core.message.LengthComparableErrorMessages;

import java.util.function.Predicate;

import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

/**
 * <strong> The Arrays class inherits {@link AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public final class Arrays<ACTUAL> extends Objects<ACTUAL> implements ArraysInterface<ACTUAL> {

    private final ArrayContainable<ACTUAL> containable = new ArrayContainableImpl<>();

    private final ArrayComparable<ACTUAL> comparable = new ArrayComparableImpl<>();

    public Arrays(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(ACTUAL[] actual) {
        if (isNotEmpty(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(ACTUAL[] actual) {
        if (isEmpty(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL[] actual) {
        if (isNotEmpty(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldNotBeNullOrEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(ACTUAL[] actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(ACTUAL[] actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldDoNotContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContainAll(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContainAny(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(ACTUAL[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(ACTUAL[] actual) {
        if (containable.containsNull(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldDoNotContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.receive(actual, IterableErrorMessages.shouldBeAllMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.receive(actual, IterableErrorMessages.shouldDoNotMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsShorterThan(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isLongerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeShorterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsShorterThanOrEqualTo(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isLongerThan(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeShorterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThan(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isShorterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeLongerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThanOrEqualTo(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeLongerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenLengthOf(ACTUAL[] actual, ACTUAL[] start, ACTUAL[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            handler.receive(LengthComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
