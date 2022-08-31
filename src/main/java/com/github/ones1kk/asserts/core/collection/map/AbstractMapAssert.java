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

package com.github.ones1kk.asserts.core.collection.map;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.Map;

public class AbstractMapAssert<SELF extends AbstractMapAssert<SELF, ACTUAL, K, V>, ACTUAL extends Map<K, V>, K, V> extends AbstractObjectAssert<SELF, ACTUAL> implements MapAssertInterface<SELF, ACTUAL, K, V> {

    private final MapsInterface<ACTUAL, K, V> maps;

    public AbstractMapAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.maps = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isEmpty() {
        maps.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        maps.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        maps.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF containsKey(K expected) {
        maps.assertContainsKey(actual, expected);
        return self;
    }

    @Override
    public SELF containsAllKey(Map<? extends K, ?> expected) {
        maps.assertContainsAllKey(actual, expected);
        return self;
    }

    @Override
    public SELF containsValue(V expected) {
        maps.assertContainsValue(actual, expected);
        return self;
    }

    @Override
    public SELF containsAllValue(Map<?, ? extends V> expected) {
        maps.assertContainsAllValue(actual, expected);
        return self;
    }

    @Override
    public SELF hasSizeOf(int expected) {
        maps.assertHasSizeOf(actual, expected);
        return self;
    }

    @Override
    public SELF hasSameSizeOf(Map<?, ?> expected) {
        maps.assertHasSameSizeOf(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotHaveSameSizeOf(Map<?, ?> expected) {
        maps.assertDoesNotHaveSameSizeOf(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThan(ACTUAL expected) {
        maps.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(ACTUAL expected) {
        maps.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(ACTUAL expected) {
        maps.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(ACTUAL expected) {
        maps.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(ACTUAL start, ACTUAL end) {
        maps.assertIsBetween(actual, start, end);
        return self;
    }
}
