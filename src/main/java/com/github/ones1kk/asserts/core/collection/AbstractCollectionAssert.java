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

package com.github.ones1kk.asserts.core.collection;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.Collection;
import java.util.function.Predicate;

public class AbstractCollectionAssert<SELF extends AbstractCollectionAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Collection<ACTUAL>> implements CollectionAssertInterface<SELF, ACTUAL> {

    private final CollectionsInterface<ACTUAL> collections;

    public AbstractCollectionAssert(Class<?> self, Collection<ACTUAL> actual) {
        super(self, actual);
        this.collections = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isNotEmpty() {
        collections.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        collections.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(ACTUAL expected) {
        collections.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(ACTUAL expected) {
        collections.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(ACTUAL... expected) {
        collections.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(ACTUAL... expected) {
        collections.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        collections.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        collections.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        collections.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        collections.assertNoneMatch(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThan(Collection<? extends ACTUAL> expected) {
        collections.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Collection<? extends ACTUAL> expected) {
        collections.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Collection<? extends ACTUAL> expected) {
        collections.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Collection<? extends ACTUAL> expected) {
        collections.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Collection<? extends ACTUAL> start, Collection<? extends ACTUAL> end) {
        collections.assertIsBetween(actual, start, end);
        return self;
    }

    @Override
    public SELF isEmpty() {
        collections.assertIsEmpty(actual);
        return self;
    }
}
