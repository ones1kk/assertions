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

package com.github.ones1kk.asserts.core.feature.iterable.collection;

import java.util.Set;
import java.util.function.Predicate;

/**
 * <strong> The SetIterable is for {@link Set} assertion to implement iterable class.</strong>
 *
 * @param <ELEMENT>
 */
public interface SetIterable<ELEMENT> {

    void assertIsEmpty(Set<? extends ELEMENT> actual);

    void assertIsNotEmpty(Set<? extends ELEMENT> actual);

    void assertIsNullOrEmpty(Set<? extends ELEMENT> actual);

    void assertContains(Set<? extends ELEMENT> actual, ELEMENT expected);

    void assertDoesNotContain(Set<? extends ELEMENT> actual, ELEMENT expected);

    @SuppressWarnings("unchecked")
    void assertContainsAll(Set<? extends ELEMENT> actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    void assertContainsAny(Set<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsNull(Set<? extends ELEMENT> actual);

    void assertDoesNotContainNull(Set<? extends ELEMENT> actual);

    void assertAllMatch(Set<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(Set<? extends ELEMENT> actual, Predicate<ELEMENT> expected);
}
