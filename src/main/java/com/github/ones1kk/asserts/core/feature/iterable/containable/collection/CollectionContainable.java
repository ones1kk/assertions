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

package com.github.ones1kk.asserts.core.feature.iterable.containable.collection;

import java.util.Collection;

/**
 * The CollectionContainable class is for classes to implement containable collection calculations.
 *
 * @param <ELEMENT>
 */
public interface CollectionContainable<ELEMENT> {

    boolean contains(Collection<? extends ELEMENT> actual, ELEMENT expected);

    boolean doesNotContain(Collection<? extends ELEMENT> actual, ELEMENT expected);

    @SuppressWarnings("unchecked")
    boolean containsAll(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    boolean containsNotAll(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    boolean containsAny(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    @SuppressWarnings("unchecked")
    boolean doseNotContainAny(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    boolean containsNull(Collection<? extends ELEMENT> actual);

    boolean doesNotContainNull(Collection<? extends ELEMENT> actual);
}
