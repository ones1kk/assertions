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

public final class LengthComparableErrorMessage {

    private LengthComparableErrorMessage() {
    }

    public static String shouldBeShorterThan(Object actual, Object expected) {
        return new Description("The given length of '{}' should be shorter than length of '{}'.", actual, expected).toString();
    }

    public static String shouldBeShorterThanOrEqualTo(Object actual, Object expected) {
        return new Description("The given length of '{}' should be shorter than or equal to length of '{}'.", actual, expected).toString();
    }

    public static String shouldBeLongerThan(Object actual, Object expected) {
        return new Description("The given length of '{}' should be longer than length of '{}'.", actual, expected).toString();
    }

    public static String shouldBeLongerThanOrEqualTo(Object actual, Object expected) {
        return new Description("The given length of '{}' should be longer than or equal to length of '{}'.", actual, expected).toString();
    }

    public static String shouldBeBetween(Object actual, Object start, Object end) {
        return new Description("The given length of '{}' should be between length of '{}' and length of '{}'.", actual, start, end).toString();
    }
}
