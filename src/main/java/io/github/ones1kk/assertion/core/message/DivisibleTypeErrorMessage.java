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

public class DivisibleTypeErrorMessage {

    private DivisibleTypeErrorMessage() {
    }

    public static String shouldBeOdd(Number actual) {
        return new Description("The given '{}' should be odd.", actual).toString();
    }

    public static String shouldNotBeOdd(Number actual) {
        return new Description("The given '{}' should not be odd.", actual).toString();
    }

    public static String shouldBeEven(Number actual) {
        return new Description("The given '{}' should be even.", actual).toString();
    }

    public static String shouldNotBeEven(Number actual) {
        return new Description("The given '{}' should not be even.", actual).toString();
    }

}
