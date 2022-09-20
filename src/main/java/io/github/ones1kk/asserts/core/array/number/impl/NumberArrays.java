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

package io.github.ones1kk.asserts.core.array.number.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.array.number.NumberArraysInterface;
import io.github.ones1kk.asserts.core.feature.comparable.array.ArrayComparable;
import io.github.ones1kk.asserts.core.feature.comparable.array.impl.ArrayComparableImpl;
import io.github.ones1kk.asserts.core.feature.iterable.containable.array.impl.NumberArrayContainableImpl;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.impl.Objects;
import io.github.ones1kk.asserts.core.message.IterableErrorMessages;
import io.github.ones1kk.asserts.core.message.LengthComparableErrorMessages;

import java.util.function.Predicate;

import static io.github.ones1kk.asserts.core.message.NumberArrayErrorMessages.*;
import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

/**
 * <strong> The NumberArrays class inherits {@link AbstractObjectAssert} </strong>
 */
public final class NumberArrays extends Objects<Number[]> implements NumberArraysInterface<Number> {

    private final NumberArrayContainableImpl<Number> containable = new NumberArrayContainableImpl<>();

    private final ArrayComparable<Number> comparable = new ArrayComparableImpl<>();

    public NumberArrays(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsMax(Number[] actual, Number expected) {
        if (!containable.isMax(actual, expected)) {
            handler.receive(actual, expected, shouldBeMax(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsMin(Number[] actual, Number expected) {
        if (!containable.isMin(actual, expected)) {
            handler.receive(actual, expected, shouldBeMin(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSum(Number[] actual, Number expected) {
        if (!containable.isSum(actual, expected)) {
            handler.receive(actual, expected, shouldBeSum(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEmpty(Number[] actual) {
        if (isNotEmpty(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Number[] actual) {
        if (isEmpty(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Number[] actual) {
        if (isNotEmpty(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldNotBeNullOrEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(Number[] actual, Number expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Number[] actual, Number expected) {
        if (containable.contains(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldDoNotContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(Number[] actual, Number... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContainAll(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(Number[] actual, Number... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.receive(actual, expected, IterableErrorMessages.shouldContainAny(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Number[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Number[] actual) {
        if (containable.containsNull(actual)) {
            handler.receive(actual, IterableErrorMessages.shouldDoNotContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Number[] actual, Predicate<Number> expected) {
        for (Number value : actual) {
            if (!expected.test(value)) {
                handler.receive(actual, IterableErrorMessages.shouldBeAllMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Number[] actual, Predicate<Number> expected) {
        for (Number value : actual) {
            if (expected.test(value)) {
                handler.receive(actual, IterableErrorMessages.shouldDoNotMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsShorterThan(Number[] actual, Number[] expected) {
        if (comparable.isLongerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeShorterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsShorterThanOrEqualTo(Number[] actual, Number[] expected) {
        if (comparable.isLongerThan(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeShorterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThan(Number[] actual, Number[] expected) {
        if (comparable.isShorterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeLongerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThanOrEqualTo(Number[] actual, Number[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            handler.receive(actual, expected, LengthComparableErrorMessages.shouldBeLongerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenLengthOf(Number[] actual, Number[] start, Number[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            handler.receive(LengthComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
