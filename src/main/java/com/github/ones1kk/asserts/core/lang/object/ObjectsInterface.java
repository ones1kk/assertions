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

package com.github.ones1kk.asserts.core.lang.object;

public interface ObjectsInterface<ACTUAL> {

    void assertIsNull(ACTUAL actual);

    void assertIsNotNull(ACTUAL actual);

    void assertIsSameAs(ACTUAL actual, ACTUAL expected);

    void assertIsNotSameAs(ACTUAL actual, ACTUAL expected);

    void assertIsEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsNotEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsAssignableFrom(ACTUAL actual, Class<?> expected);

    void assertIsNotAssignableFrom(ACTUAL actual, Class<?> expected);

    void assertIsInstanceOf(ACTUAL actual, Class<?> expected);

    void assertIsNotInstanceOf(ACTUAL actual, Class<?> expected);
}
