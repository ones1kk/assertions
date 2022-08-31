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

package com.github.ones1kk.asserts.core.array;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.function.Predicate;

public class AbstractArrayAssert<SELF extends AbstractArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, ACTUAL[]> implements ArrayAssertInterface<SELF, ACTUAL> {

    private final ArraysInterface<ACTUAL> arrays;

    @SuppressWarnings("unchecked")
    public AbstractArrayAssert(Class<?> self, ACTUAL[] actual) {
        super(self, actual);
        this.arrays = (ArraysInterface<ACTUAL>) assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isEmpty() {
        arrays.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        arrays.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        arrays.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(ACTUAL expected) {
        arrays.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(ACTUAL expected) {
        arrays.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(ACTUAL... expected) {
        arrays.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(ACTUAL... expected) {
        arrays.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        arrays.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        arrays.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        arrays.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        arrays.assertNoneMatch(actual, expected);
        return self;
    }
}
