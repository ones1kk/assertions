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

package io.github.ones1kk.asserts.core.feature.iterable.collection;

import java.util.List;
import java.util.function.Predicate;

/**
 * <strong> The ListIterable is for {@link List} assertion to implement iterable class.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public interface ListIterable<ELEMENT> {

    void assertIsEmpty(List<? extends ELEMENT> actual);

    void assertIsNotEmpty(List<? extends ELEMENT> actual);

    void assertIsNullOrEmpty(List<? extends ELEMENT> actual);

    void assertContains(List<? extends ELEMENT> actual, ELEMENT expected);

    void assertDoesNotContain(List<? extends ELEMENT> actual, ELEMENT expected);

    @SuppressWarnings("unchecked")
    void assertContainsAll(List<? extends ELEMENT> actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    void assertContainsAny(List<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsNull(List<? extends ELEMENT> actual);

    void assertDoesNotContainNull(List<? extends ELEMENT> actual);

    void assertAllMatch(List<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(List<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

}
