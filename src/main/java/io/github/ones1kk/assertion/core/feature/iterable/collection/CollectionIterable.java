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

import java.util.Collection;
import java.util.function.Predicate;

/**
 * <strong> The CollectionIterable is for {@link Collection} assertion to implement iterable class.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public interface CollectionIterable<ELEMENT> {

    void assertEmpty(AssertionsInfo info, Collection<? extends ELEMENT> actual);

    void assertNotEmpty(AssertionsInfo info, Collection<? extends ELEMENT> actual);

    void assertNullOrEmpty(AssertionsInfo info, Collection<? extends ELEMENT> actual);

    void assertContains(AssertionsInfo info, Collection<? extends ELEMENT> actual, ELEMENT expected);

    void assertDoesNotContain(AssertionsInfo info, Collection<? extends ELEMENT> actual, ELEMENT expected);

    @SuppressWarnings("unchecked")
    void assertContainsAll(AssertionsInfo info, Collection<? extends ELEMENT> actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    void assertContainsAny(AssertionsInfo info, Collection<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsNull(AssertionsInfo info, Collection<? extends ELEMENT> actual);

    void assertDoesNotContainNull(AssertionsInfo info, Collection<? extends ELEMENT> actual);

    void assertAllMatch(AssertionsInfo info, Collection<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(AssertionsInfo info, Collection<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertHasSize(AssertionsInfo info, Collection<? extends ELEMENT> actual, int expected);

}