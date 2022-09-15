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

package com.github.ones1kk.asserts.core.feature.comparable.collection.impl;

import java.util.Map;

/**
 * <strong> The MapComparable is an implementation class that compares the size of Map type.</strong>
 *
 * @param <ELEMENT>
 */
public class MapComparable<ELEMENT extends Map<K, V>, K, V> {

    public boolean isLargerThan(ELEMENT actual, ELEMENT expected) {
        return actual.size() > expected.size();
    }

    public boolean isSmallerThan(ELEMENT actual, ELEMENT expected) {
        return actual.size() < expected.size();
    }

    public boolean isSmallerThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.size() <= expected.size();
    }

    public boolean isLargerThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.size() >= expected.size();
    }

    public boolean hasSameSizeOf(ELEMENT actual, Map<?, ?> expected) {
        return actual.size() == expected.size();
    }

    public boolean doesNotHaveSameSizeOf(ELEMENT actual, Map<?, ?> expected) {
        return actual.size() != expected.size();
    }
}
