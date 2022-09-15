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

package com.github.ones1kk.asserts.core.feature.iterable.containable.array.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.array.ArrayContainable;

import java.util.Arrays;
import java.util.List;

/**
 * <strong> The ArrayContainableImpl class is Implementation class that calculates the containable of an array. </strong>
 *
 * @param <ELEMENT>
 */
public final class ArrayContainableImpl<ELEMENT> implements ArrayContainable<ELEMENT> {

    @Override
    public boolean contains(ELEMENT[] actual, ELEMENT expected) {
        return Arrays.asList(actual).contains(expected);
    }

    @Override
    public boolean doesNotContain(ELEMENT[] actual, ELEMENT expected) {
        return !(contains(actual, expected));
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean containsAll(ELEMENT[] actual, ELEMENT... expected) {
        List<ELEMENT> actuals = Arrays.asList(actual);
        for (ELEMENT value : expected) {
            if (!actuals.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean containsNotAll(ELEMENT[] actual, ELEMENT... expected) {
        return !(containsAll(actual, expected));
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean containsAny(ELEMENT[] actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (Arrays.asList(actual).contains(value)) return true;
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean doseNotContainAny(ELEMENT[] actual, ELEMENT... expected) {
        List<ELEMENT> actuals = Arrays.asList(actual);
        for (ELEMENT value : expected) {
            if (actuals.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNull(ELEMENT[] actual) {
        return Arrays.asList(actual).contains(null);
    }

    @Override
    public boolean doesNotContainNull(ELEMENT[] actual) {
        return !(Arrays.asList(actual).contains(null));
    }

}
