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

package io.github.ones1kk.assertion.core.feature.number.arithmetic;

import io.github.ones1kk.assertion.core.Asserts;

/**
 * <strong> The NumerableUnit class provides basic and simple operations and mathematical expressions of number type.</strong>
 *
 * <p> All Number types are casted by Double type, because Double type has most big data size in java language. </p>
 */
public final class NumerableUnit {

    private final Double value;

    private <T extends Number> NumerableUnit(T value) {
        Asserts.that(value)
                .isNotNull()
                .isInstanceOf(Number.class);
        this.value = value.doubleValue();
    }

    public static <T extends Number> NumerableUnit of(T value) {
        return new NumerableUnit(value);
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isNotZero() {
        return value != 0;
    }

    public boolean isEven() {
        return (value % 2 == 0);
    }

    public boolean isOdd() {
        return (value % 2 != 0);
    }
}
