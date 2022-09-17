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

package com.github.ones1kk.asserts.core.array.number.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.array.number.NumberArraysInterface;
import com.github.ones1kk.asserts.core.feature.comparable.array.ArrayComparable;
import com.github.ones1kk.asserts.core.feature.comparable.array.impl.ArrayComparableImpl;
import com.github.ones1kk.asserts.core.feature.iterable.containable.array.impl.NumberArrayContainableImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.function.Predicate;

import static com.github.ones1kk.asserts.core.message.IterableErrorMessages.*;
import static com.github.ones1kk.asserts.core.message.LengthComparableErrorMessages.*;
import static com.github.ones1kk.asserts.core.message.NumberArrayErrorMessages.*;
import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

/**
 * <strong> The NumberArrays class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
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
            handler.receive(actual, shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Number[] actual) {
        if (isEmpty(actual)) {
            handler.receive(actual, shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Number[] actual) {
        if (isNotEmpty(actual)) {
            handler.receive(actual, shouldNotBeNullOrEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(Number[] actual, Number expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.receive(actual, expected, shouldContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Number[] actual, Number expected) {
        if (containable.contains(actual, expected)) {
            handler.receive(actual, expected, shouldDoNotContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(Number[] actual, Number... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.receive(actual, expected, shouldContainAll(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(Number[] actual, Number... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.receive(actual, expected, shouldContainAny(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Number[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.receive(actual, shouldContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Number[] actual) {
        if (containable.containsNull(actual)) {
            handler.receive(actual, shouldDoNotContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Number[] actual, Predicate<Number> expected) {
        for (Number value : actual) {
            if (!expected.test(value)) {
                handler.receive(actual, shouldBeAllMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Number[] actual, Predicate<Number> expected) {
        for (Number value : actual) {
            if (expected.test(value)) {
                handler.receive(actual, shouldDoNotMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsShorterThan(Number[] actual, Number[] expected) {
        if (comparable.isLongerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeShorterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsShorterThanOrEqualTo(Number[] actual, Number[] expected) {
        if (comparable.isLongerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeShorterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThan(Number[] actual, Number[] expected) {
        if (comparable.isShorterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeLongerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThanOrEqualTo(Number[] actual, Number[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLongerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenLengthOf(Number[] actual, Number[] start, Number[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            handler.receive(shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
