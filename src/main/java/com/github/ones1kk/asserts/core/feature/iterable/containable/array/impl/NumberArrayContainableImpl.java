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
import java.util.HashSet;
import java.util.List;

public class NumberArrayContainableImpl<ELEMENT extends Number> implements ArrayContainable<ELEMENT> {

    @Override
    public boolean contains(Number[] actual, Number expected) {
        return Arrays.asList(actual).contains(expected);
    }

    @Override
    public boolean doesNotContain(Number[] actual, Number expected) {
        return !(Arrays.asList(actual).contains(expected));
    }

    @Override
    public boolean containsAll(Number[] actual, Number... expected) {
        List<Number> numbers = Arrays.asList(actual);
        for (Number number : expected) {
            if (!numbers.contains(number)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNotAll(Number[] actual, Number... expected) {
        return !(new HashSet<>(Arrays.asList(actual))
                .containsAll(Arrays.asList(expected)));
    }

    @Override
    public boolean containsAny(Number[] actual, Number... expected) {
        for (Number number : expected) {
            if (Arrays.asList(actual).contains(number)) return true;
        }
        return false;
    }

    @Override
    public boolean doseNotContainAny(Number[] actual, Number... expected) {
        List<Number> numbers = Arrays.asList(actual);
        for (Number value : expected) {
            if (numbers.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNull(Number[] actual) {
        return Arrays.asList(actual).contains(null);
    }

    @Override
    public boolean doesNotContainNull(Number[] actual) {
        return !(Arrays.asList(actual).contains(null));
    }

    public boolean isMax(Number[] actual, Number expected) {
        double max = actual[0].doubleValue();
        for (Number value : actual) {
            if (value.doubleValue() > max)
                max = value.doubleValue();
        }
        return max == expected.doubleValue();
    }

    public boolean isMin(Number[] actual, Number expected) {
        double min = actual[0].doubleValue();
        for (Number value : actual) {
            if (value.doubleValue() < min)
                min = value.doubleValue();
        }
        return min == expected.doubleValue();
    }


    public boolean isSum(Number[] actual, Number expected) {
        double sum = 0;
        for (Number number : actual) {
            sum += number.doubleValue();
        }
        return sum == expected.doubleValue();
    }
}
