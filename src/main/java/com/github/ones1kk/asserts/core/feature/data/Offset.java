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

package com.github.ones1kk.asserts.core.feature.data;


import com.github.ones1kk.asserts.core.Asserts;

public final class Offset<T extends Number> {

    private final T value;

    private Offset(T value) {
        Asserts.that(value)
                .as("Offset value can not be null")
                .isNotNull()
                .isInstanceOf(Number.class);
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        return new Offset<>(value);
    }

    public T getValue() {
        return value;
    }

    public double getBefore(T expected) {
        return (offset(expected).getValueInternal() - value.doubleValue());
    }

    public double getAfter(T expected) {
        return (offset(expected).getValueInternal() + value.doubleValue());
    }

    private double getValueInternal() {
        return offset(value).getValue().doubleValue();
    }

}
