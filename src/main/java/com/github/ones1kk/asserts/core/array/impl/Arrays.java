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
import org.apache.commons.lang3.ArrayUtils;

import java.util.function.Predicate;

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
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from("The actual is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(ACTUAL[] actual) {
        if (ArrayUtils.isEmpty(actual)) {
            handler.setDescription(handler.from("The actual is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL[] actual) {
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from("The actual is not null or not empty."));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(ACTUAL[] actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual does not contain of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(ACTUAL[] actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual is contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAll(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void assertContainsAny(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(ACTUAL[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from("The actual does not contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(ACTUAL[] actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from("The actual is contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.setDescription(handler.from("The actual is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.setDescription(handler.from("The actual is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsShorterThan(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isLongerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not shorter than length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsShorterThanOrEqualTo(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isLongerThan(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not shorter than or equal to length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThan(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isShorterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not longer than length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLongerThanOrEqualTo(ACTUAL[] actual, ACTUAL[] expected) {
        if (comparable.isShorterThan(actual, expected)) {
            handler.setDescription(handler.from("length of actual is not longer than or equal to length of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenLengthOf(ACTUAL[] actual, ACTUAL[] start, ACTUAL[] end) {
        if (comparable.isShorterThan(actual, start) || comparable.isLongerThan(actual, end)) {
            String description = handler.getDescribable().as("length of actual is not between {} and {}", start.length, end.length);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
