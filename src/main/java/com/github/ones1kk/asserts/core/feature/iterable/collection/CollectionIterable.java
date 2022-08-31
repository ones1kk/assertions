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

import java.util.Collection;
import java.util.function.Predicate;

public interface CollectionIterable<ELEMENT> {

    void assertIsEmpty(Collection<? extends ELEMENT> actual);

    void assertIsNotEmpty(Collection<? extends ELEMENT> actual);

    void assertIsNullOrEmpty(Collection<? extends ELEMENT> actual);

    void assertContains(Collection<? extends ELEMENT> actual, ELEMENT expected);

    void assertDoesNotContain(Collection<? extends ELEMENT> actual, ELEMENT expected);

    void assertContainsAll(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsAny(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsNull(Collection<? extends ELEMENT> actual);

    void assertDoesNotContainNull(Collection<? extends ELEMENT> actual);

    void assertAllMatch(Collection<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(Collection<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

}