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

package io.github.ones1kk.assertion.core.feature.iterable.collection;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;

import java.util.Map;
import java.util.function.Predicate;

/**
 * <strong> The MapIterable is for {@link Map} assertion assertion to implement iterable class.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public interface MapIterable<ELEMENT extends Map<K, V>, K, V> {

    void assertEmpty(AssertionsInfo info, ELEMENT actual);

    void assertNotEmpty(AssertionsInfo info, ELEMENT actual);

    void assertNullOrEmpty(AssertionsInfo info, ELEMENT actual);

    void assertContainsKey(AssertionsInfo info, ELEMENT actual, K expected);

    void assertContainsAllKey(AssertionsInfo info, ELEMENT actual, Map<? extends K, ?> expected);

    void assertContainsValue(AssertionsInfo info, ELEMENT actual, V expected);

    void assertContainsAllValue(AssertionsInfo info, ELEMENT actual, Map<?, ? extends V> expected);

    void assertHasSize(AssertionsInfo info, ELEMENT actual, int expected);

}
