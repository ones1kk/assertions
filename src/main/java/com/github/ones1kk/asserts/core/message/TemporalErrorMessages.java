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

import java.time.temporal.Temporal;

public final class TemporalErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private TemporalErrorMessages() {
    }

    public static String shouldBeBefore(Temporal actual, Temporal expected) {
        return DESCRIBABLE.as("The given {} should be before than {}.", actual, expected);
    }

    public static String shouldBeBeforeOrEqualTo(Temporal actual, Temporal expected) {
        return DESCRIBABLE.as("The given {} should be before than or equal to {}.", actual, expected);
    }

    public static String shouldBeAfter(Temporal actual, Temporal expected) {
        return DESCRIBABLE.as("The given {} should be after than {}.", actual, expected);
    }

    public static String shouldBeAfterOrEqualTo(Temporal actual, Temporal expected) {
        return DESCRIBABLE.as("The given {} should be after than or equal to {}.", actual, expected);
    }
}

