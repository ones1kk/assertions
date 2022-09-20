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

package io.github.ones1kk.asserts.core.feature.comparable;

/**
 * <strong> The Comparable class is for a comparable, assertable assertion implementation class.</strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public interface Comparable<ACTUAL> {

    void assertIsLessThan(ACTUAL actual, ACTUAL expected);

    void assertIsLessThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsGreaterThan(ACTUAL actual, ACTUAL expected);

    void assertIsGreaterThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsBetween(ACTUAL actual, ACTUAL start, ACTUAL end);

}