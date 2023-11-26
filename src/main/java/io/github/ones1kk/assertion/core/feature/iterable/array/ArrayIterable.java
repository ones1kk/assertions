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

package io.github.ones1kk.assertion.core.feature.iterable.array;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;

import java.util.function.Predicate;

/**
 * <strong> The ArrayIterable is for iterable assertion to implement iterable class.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public interface ArrayIterable<ELEMENT> {

    void assertEmpty(AssertionsInfo info, ELEMENT[] actual);

    void assertNotEmpty(AssertionsInfo info, ELEMENT[] actual);

    void assertNullOrEmpty(AssertionsInfo info, ELEMENT[] actual);

    void assertContains(AssertionsInfo info, ELEMENT[] actual, ELEMENT expected);

    void assertDoesNotContain(AssertionsInfo info, ELEMENT[] actual, ELEMENT expected);

    @SuppressWarnings("unchecked")
    void assertContainsAll(AssertionsInfo info, ELEMENT[] actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    void assertContainsAny(AssertionsInfo info, ELEMENT[] actual, ELEMENT... expected);

    void assertContainsNull(AssertionsInfo info, ELEMENT[] actual);

    void assertDoesNotContainNull(AssertionsInfo info, ELEMENT[] actual);

    void assertAllMatch(AssertionsInfo info, ELEMENT[] actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(AssertionsInfo info, ELEMENT[] actual, Predicate<ELEMENT> expected);

    void assertHasSize(AssertionsInfo info, ELEMENT[] actual, int size);

}
