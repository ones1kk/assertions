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

import com.github.ones1kk.asserts.core.feature.comparable.SizeComparableAssert;

import java.util.Map;

/**
 * <strong> The MapAssertInterface class is for a comparable, assertable, iterable interface class.</strong>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public interface MapAssertInterface<SELF, ACTUAL extends Map<K, V>, K, V> extends SizeComparableAssert<SELF, ACTUAL> {

    SELF isEmpty();

    SELF isNotEmpty();

    SELF isNullOrEmpty();

    SELF containsKey(K expected);

    SELF containsAllKey(Map<? extends K, ?> expected);

    SELF containsValue(V expected);

    SELF containsAllValue(Map<?, ? extends V> expected);

    SELF hasSizeOf(int expected);

    SELF hasSameSizeOf(Map<?, ?> expected);

    SELF doesNotHaveSameSizeOf(Map<?, ?> expected);
}
