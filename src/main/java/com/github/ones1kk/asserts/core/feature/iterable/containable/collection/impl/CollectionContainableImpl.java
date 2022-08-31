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

package com.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.CollectionContainable;

import java.util.Collection;

public class CollectionContainableImpl<ELEMENT> implements CollectionContainable<ELEMENT> {

    @Override
    public boolean contains(Collection<? extends ELEMENT> actual, ELEMENT expected) {
        return actual.contains(expected);
    }

    @Override
    public boolean doesNotContain(Collection<? extends ELEMENT> actual, ELEMENT expected) {
        return !(contains(actual, expected));
    }

    @Override
    public boolean containsAll(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (!actual.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNotAll(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        return !(containsAll(actual, expected));
    }

    @Override
    public boolean containsAny(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (actual.contains(value)) return true;
        }
        return false;
    }

    @Override
    public boolean doseNotContainAny(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (actual.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNull(Collection<? extends ELEMENT> actual) {
        return actual.contains(null);
    }

    @Override
    public boolean doesNotContainNull(Collection<? extends ELEMENT> actual) {
        return !(containsNull(actual));
    }
}
