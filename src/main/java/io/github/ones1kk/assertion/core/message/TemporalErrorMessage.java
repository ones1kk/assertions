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

package io.github.ones1kk.assertion.core.message;

import io.github.ones1kk.assertion.core.description.Describable;
import io.github.ones1kk.assertion.core.description.Description;
import io.github.ones1kk.assertion.core.description.impl.Description;

import java.time.temporal.TemporalAccessor;

public final class TemporalErrorMessage {

    private TemporalErrorMessage() {
    }

    public static String shouldBeBefore(TemporalAccessor actual, TemporalAccessor expected) {
        return new Description("The given '{}' should be before than '{}'.", actual, expected).toString();
    }

    public static String shouldBeBeforeOrEqualTo(TemporalAccessor actual, TemporalAccessor expected) {
        return new Description("The given '{}' should be before than or equal to '{}'.", actual, expected).toString();
    }

    public static String shouldBeAfter(TemporalAccessor actual, TemporalAccessor expected) {
        return new Description("The given '{}' should be after than '{}'.", actual, expected).toString();
    }

    public static String shouldBeAfterOrEqualTo(TemporalAccessor actual, TemporalAccessor expected) {
        return new Description("The given '{}' should be after than or equal to '{}'.", actual, expected).toString();
    }
}

