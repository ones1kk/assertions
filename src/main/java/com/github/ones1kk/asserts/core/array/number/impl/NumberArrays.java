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
import org.apache.commons.lang3.ArrayUtils;

import java.util.function.Predicate;

/**
 * <strong> The NumberArrays class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public class NumberArrays extends Objects<Number[]> implements NumberArraysInterface<Number> {

    private final NumberArrayContainableImpl<Number> containable = new NumberArrayContainableImpl<>();

    private final ArrayComparable<Number> comparable = new ArrayComparableImpl<>();

    public NumberArrays(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsMax(Number[] actual, Number expected) {
        if (!containable.isMax(actual, expected)) {
            handler.setDescription(handler.from(expected, "max of actual is not {}."));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsMin(Number[] actual, Number expected) {
        if (!containable.isMin(actual, expected)) {
            handler.setDescription(handler.from(expected, "minimum of actual is not {}."));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSum(Number[] actual, Number expected) {
        if (!containable.isSum(actual, expected)) {
            handler.setDescription(handler.from(expected, "sum of actual is not {}."));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEmpty(Number[] actual) {
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from("The actual is not empty."));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Number[] actual) {
        if (ArrayUtils.isEmpty(actual)) {
            handler.setDescription(handler.from(actual, "The actual is empty."));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Number[] actual) {
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from(actual, "The actual is not null or not empty."));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(Number[] actual, Number expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual does not contain of {}."));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Number[] actual, Number expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual is contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAll(Number[] actual, Number... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAny(Number[] actual, Number... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Number[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from("The actual does not contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Number[] actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from("The actual is contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Number[] actual, Predicate<Number> expected) {
        for (Number number : actual) {
            if (!expected.test(number)) {
                handler.setDescription(handler.from("The actual is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Number[] actual, Predicate<Number> expected) {
        for (Number number : actual) {
            if (expected.test(number)) {
                handler.setDescription(handler.from(actual, "The actual is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsShorterThan(Number[] actual, Number[] expected) {
        if (comparable.isLongerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not shorter than length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsShorterThanOrEqualTo(Number[] actual, Number[] expected) {
        if (comparable.isLongerThan(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not shorter than or equal to length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThan(Number[] actual, Number[] expected) {
        if (comparable.isShorterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not longer than length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThanOrEqualTo(Number[] actual, Number[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not longer than or equal to length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenLengthOf(Number[] actual, Number[] start, Number[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            String description = handler.getDescribable().as("length of actual is not between {} and {}", start.length, end.length);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
