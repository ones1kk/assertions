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

import io.github.ones1kk.assertion.core.description.Description;

public class NumerableErrorMessage {

    private NumerableErrorMessage() {
    }

    public static String shouldBePositive(Number actual) {
        return new Description("The given '{}' should be positive.", actual).toString();
    }

    public static String shouldNotBePositive(Number actual) {
        return new Description("The given '{}' should not be positive.", actual).toString();
    }

    public static String shouldBeNegative(Number actual) {
        return new Description("The given '{}' should be negative.", actual).toString();
    }

    public static String shouldNotBeNegative(Number actual) {
        return new Description("The given '{}' should not be negative.", actual).toString();
    }

    public static String shouldBeZero(Number actual) {
        return new Description("The given '{}' should be zero.", actual).toString();
    }

    public static String shouldNotBeZero(Number actual) {
        return new Description("The given '{}' should not be zero.", actual).toString();
    }
}
