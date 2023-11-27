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

package io.github.ones1kk.assertion.core.feature.containable.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * <strong> The NumberArrayContainableImpl class is Implementation class that calculates the containable of an array of type Number.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public final class NumberArrayContainableImpl<ELEMENT extends Number> implements NumberArrayContainable<ELEMENT> {

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

    /**
     * Verify {@code expected} is max in array
     * <p> Cast to Double with the largest data size among number type.</p>
     *
     * @param actual   reference value.
     * @param expected to max in array.
     * @return {@code expected} is max
     */
    @Override
    public boolean isMax(Number[] actual, Number expected) {
        double max = actual[0].doubleValue();
        for (Number value : actual) {
            if (value.doubleValue() > max)
                max = value.doubleValue();
        }
        return max == expected.doubleValue();
    }

    /**
     * Verify {@code expected} is min in array
     * <p> Cast to Double with the largest data size among number type.</p>
     *
     * @param actual   reference value.
     * @param expected to min in array.
     * @return {@code expected} is min
     */
    @Override
    public boolean isMin(Number[] actual, Number expected) {
        double min = actual[0].doubleValue();
        for (Number value : actual) {
            if (value.doubleValue() < min)
                min = value.doubleValue();
        }
        return min == expected.doubleValue();
    }

    /**
     * Verify {@code expected} is sum in array
     * <p> Cast to Double with the largest data size among number type.</p>
     *
     * @param actual   reference value.
     * @param expected to sum in array.
     * @return {@code expected} is sum
     */
    @Override
    public boolean isSum(Number[] actual, Number expected) {
        double sum = 0;
        for (Number number : actual) {
            sum += number.doubleValue();
        }
        return sum == expected.doubleValue();
    }
}
