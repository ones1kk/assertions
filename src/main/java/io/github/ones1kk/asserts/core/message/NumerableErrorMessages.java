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

package io.github.ones1kk.asserts.core.message;

import io.github.ones1kk.asserts.core.description.Describable;
import io.github.ones1kk.asserts.core.description.impl.Description;

public final class NumerableErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    public static String shouldBePositive(Number actual) {
        return DESCRIBABLE.as("The given {} should be positive.", actual);
    }

    public static String shouldNotBePositive(Number actual) {
        return DESCRIBABLE.as("The given {} should not be positive.", actual);
    }

    public static String shouldBeNegative(Number actual) {
        return DESCRIBABLE.as("The given {} should be negative.", actual);
    }

    public static String shouldNotBeNegative(Number actual) {
        return DESCRIBABLE.as("The given {} should not be negative.", actual);
    }

    public static String shouldBeZero(Number actual) {
        return DESCRIBABLE.as("The given {} should be zero.", actual);
    }

    public static String shouldNotBeZero(Number actual) {
        return DESCRIBABLE.as("The given {} should not be zero.", actual);
    }
}
