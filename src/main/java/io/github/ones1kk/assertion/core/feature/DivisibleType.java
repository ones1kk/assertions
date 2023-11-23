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

package io.github.ones1kk.assertion.core.feature;

import io.github.ones1kk.assertion.core.Asserts;

public class DivisibleType {

    private final Double value;

    private DivisibleType(Number value) {
        Asserts.that(value).isNotNull();
        this.value = value.doubleValue();
    }

    public static DivisibleType of(Byte value) {
        return new DivisibleType(value);
    }

    public static DivisibleType of(Short value) {
        return new DivisibleType(value);
    }

    public static DivisibleType of(Integer value) {
        return new DivisibleType(value);
    }

    public static DivisibleType of(Long value) {
        return new DivisibleType(value);
    }

    public static DivisibleType of(Double value) {
        return new DivisibleType(value);
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
