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

package io.github.ones1kk.assertion.core.feature.comparable.array.impl;

import io.github.ones1kk.assertion.core.feature.comparable.array.ArrayComparable;

/**
 * <strong> The ArrayComparableImpl is an implementation class that compares the length of Array type.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public final class ArrayComparableImpl<ELEMENT> implements ArrayComparable<ELEMENT> {

    @Override
    public boolean isLongerThan(ELEMENT[] actual, ELEMENT[] expected) {
        return actual.length > expected.length;
    }

    @Override
    public boolean isLongerThanOrEqualTo(ELEMENT[] actual, ELEMENT[] expected) {
        return actual.length >= expected.length;
    }

    @Override
    public boolean isShorterThan(ELEMENT[] actual, ELEMENT[] expected) {
        return actual.length < expected.length;
    }

    @Override
    public boolean isShorterThanOrEqualTo(ELEMENT[] actual, ELEMENT[] expected) {
        return actual.length <= expected.length;
    }

    @Override
    public boolean is(ELEMENT[] actual, ELEMENT[] expected) {
        return actual.length == expected.length;
    }
}
