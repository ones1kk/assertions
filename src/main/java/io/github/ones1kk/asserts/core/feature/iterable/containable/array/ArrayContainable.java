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

package io.github.ones1kk.asserts.core.feature.iterable.containable.array;

/**
 * The ArrayContainable class is for classes to implement containable array calculations.
 *
 * @param <ELEMENT>
 */
public interface ArrayContainable<ELEMENT> {

    boolean contains(ELEMENT[] actual, ELEMENT expected);

    boolean doesNotContain(ELEMENT[] actual, ELEMENT expected);

    @SuppressWarnings("unchecked")
    boolean containsAll(ELEMENT[] actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    boolean containsNotAll(ELEMENT[] actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    boolean containsAny(ELEMENT[] actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    boolean doseNotContainAny(ELEMENT[] actual, ELEMENT... expected);

    boolean containsNull(ELEMENT[] actual);

    boolean doesNotContainNull(ELEMENT[] actual);

}
