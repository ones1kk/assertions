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

package com.github.ones1kk.asserts.core.message;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.description.impl.Description;

public final class ComparableErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private ComparableErrorMessages() {
    }

    public static String shouldBeLessThan(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be less than {}.", actual, expected);
    }

    public static String shouldBeLessThanOrEqualTo(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be less than or equal to {}.", actual, expected);
    }

    public static String shouldBeGreaterThan(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be greater than {}.", actual, expected);
    }

    public static String shouldBeGreaterThanOrEqualTo(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be greater than or equal to {}.", actual, expected);
    }

    public static String shouldBeBetween(Object actual, Object start, Object end) {
        return DESCRIBABLE.as("The given {} should be between {} and {}.", actual, start, end);
    }
}
