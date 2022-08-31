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

package com.github.ones1kk.asserts.core.array.number;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.function.Predicate;

public class AbstractNumberArrayAssert<SELF extends AbstractNumberArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Number[]> implements NumberArrayAssertInterface<SELF> {

    private final NumberArraysInterface<Number> numberArrays;

    public AbstractNumberArrayAssert(Class<?> self, Number[] actual) {
        super(self, actual);
        this.numberArrays = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isMax(Number expected) {
        numberArrays.assertIsMax(actual, expected);
        return self;
    }

    @Override
    public SELF isMin(Number expected) {
        numberArrays.assertIsMin(actual, expected);
        return self;
    }

    @Override
    public SELF isSum(Number expected) {
        numberArrays.assertIsSum(actual, expected);
        return self;
    }

    @Override
    public SELF isEmpty() {
        numberArrays.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        numberArrays.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        numberArrays.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(Number expected) {
        numberArrays.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(Number expected) {
        numberArrays.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(Number... expected) {
        numberArrays.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(Number... expected) {
        numberArrays.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        numberArrays.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        numberArrays.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<Number> expected) {
        numberArrays.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<Number> expected) {
        numberArrays.assertNoneMatch(actual, expected);
        return self;
    }
}
