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

package com.github.ones1kk.asserts.core.array.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.array.ArraysInterface;
import com.github.ones1kk.asserts.core.feature.comparable.array.ArrayComparable;
import com.github.ones1kk.asserts.core.feature.comparable.array.impl.ArrayComparableImpl;
import com.github.ones1kk.asserts.core.feature.iterable.containable.array.ArrayContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.array.impl.ArrayContainableImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.function.Predicate;

import static com.github.ones1kk.asserts.core.message.IterableErrorMessages.*;
import static com.github.ones1kk.asserts.core.message.LengthComparableErrorMessages.*;
import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

/**
 * <strong> The Arrays class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 *
 * @param <ACTUAL>
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
            handler.receive(actual, shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(ACTUAL[] actual) {
        if (isEmpty(actual)) {
            handler.receive(actual, shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL[] actual) {
        if (isNotEmpty(actual)) {
            handler.receive(actual, shouldNotBeNullOrEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(ACTUAL[] actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.receive(actual, expected, shouldContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(ACTUAL[] actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.receive(actual, expected, shouldDoNotContain(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.receive(actual, expected, shouldContainAll(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.receive(actual, expected, shouldContainAny(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(ACTUAL[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.receive(actual, shouldContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(ACTUAL[] actual) {
        if (containable.containsNull(actual)) {
            handler.receive(actual, shouldDoNotContainNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.receive(actual, shouldBeAllMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.receive(actual, shouldDoNotMatch(actual));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsShorterThan(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isLongerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeShorterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsShorterThanOrEqualTo(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isLongerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeShorterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThan(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isShorterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeLongerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThanOrEqualTo(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLongerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenLengthOf(ACTUAL[] actual, ACTUAL[] start, ACTUAL[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            handler.receive(shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
