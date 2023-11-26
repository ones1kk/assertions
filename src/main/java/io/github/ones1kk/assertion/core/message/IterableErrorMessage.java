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

public final class IterableErrorMessage {

    private IterableErrorMessage() {
    }

    public static String shouldBeEmpty(Object actual) {
        return new Description("The given '{}' should be empty.", actual).toString();
    }

    public static String shouldNotBeEmpty(Object actual) {
        return new Description("The given '{}' should not be empty.", actual).toString();
    }

    public static String shouldNotBeNullOrEmpty(Object actual) {
        return new Description("The given '{}' should not be null or empty.", actual).toString();
    }

    public static String shouldContain(Object actual, Object expected) {
        return new Description("The given '{}' should contain '{}'.", actual, expected).toString();
    }

    public static String shouldDoNotContain(Object actual, Object expected) {
        return new Description("The given '{}' should do not contain '{}'.", actual, expected).toString();
    }

    public static String shouldContainAll(Object actual, Object expected) {
        return new Description("The given '{}' should contain all of '{}'.", actual, expected).toString();
    }

    public static String shouldContainAny(Object actual, Object expected) {
        return new Description("The given '{}' should contain any of '{}'.", actual, expected).toString();
    }

    public static String shouldContainNull(Object actual) {
        return new Description("The given '{}' should contain null.", actual).toString();
    }

    public static String shouldDoNotContainNull(Object actual) {
        return new Description("The given '{}' should do not contain null.", actual).toString();
    }

    public static String shouldBeAllMatch(Object actual) {
        return new Description("The given '{}' should match all.", actual).toString();
    }

    public static String shouldDoNotMatch(Object actual) {
        return new Description("The given '{}' should do not match.", actual).toString();
    }

    public static String shouldHaveSameSize(int size) {
        return new Description("The given 'actual' size should have {} size.", size).toString();
    }
}
