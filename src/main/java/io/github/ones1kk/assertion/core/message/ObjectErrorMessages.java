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

public final class ObjectErrorMessages {

    private static final String ACTUAL = "actual";
    private static final String EXPECTED = "expected";

    private ObjectErrorMessages() {
    }

    public static String getActualAsPlain() {
        return ACTUAL;
    }

    public static String getExpectedAsPlain() {
        return EXPECTED;
    }

    public static String shouldBeNull(Object actual) {
        return new Description("The given '{}' should be null.", actual).toString();
    }

    public static String shouldNotBeNull(Object actual) {
        return new Description("The given '{}' should not be null.", actual).toString();
    }

    public static String shouldBeEqualTo(Object actual, Object expected) {
        return new Description("The given '{}' should be equal to '{}'.", actual, expected).toString();
    }

    public static String shouldNotBeEqualTo(Object actual, Object expected) {
        return new Description("The given '{}' should not be equal to '{}'.", actual, expected).toString();
    }

    public static String shouldBeSameAS(Object actual, Object expected) {
        return new Description("The given '{}' should be same as '{}'.", actual, expected).toString();
    }

    public static String shouldNotBeSameAS(Object actual, Object expected) {
        return new Description("The given '{}' should not be same as '{}'.", actual, expected).toString();
    }

    public static String shouldBeAssignableFrom(Object actual, Object expected) {
        return new Description("The given '{}' should be assignable from '{}'.", actual, expected).toString();
    }

    public static String shouldNotBeAssignableFrom(Object actual, Object expected) {
        return new Description("The given '{}' should not be assignable from '{}'.", actual, expected).toString();
    }

    public static String shouldBeInstanceOf(Object actual, Object expected) {
        return new Description("The given '{}' should be instance of {}.", actual, expected).toString();
    }

    public static String shouldBeNotInstanceOf(Object actual, Object expected) {
        return new Description("The given '{}' should not be instance of '{}'.", actual, expected).toString();
    }

    public static String shouldSatisfyGivenCondition(Object actual) {
        return new Description("The given '{}' should be satisfied of given condition.", actual).toString();
    }

    public static String shouldNotSatisfyGivenCondition(Object actual) {
        return new Description("The given '{}' should not be satisfied of given condition.", actual).toString();
    }

    public static String shouldReturnGivenValue(Object actual) {
        return new Description("The given '{}' should be returned of given value.", actual).toString();
    }
}
