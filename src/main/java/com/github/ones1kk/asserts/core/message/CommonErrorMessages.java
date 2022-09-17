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

public final class CommonErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private static final String ACTUAL = "actual";
    private static final String EXPECTED = "expected";

    private CommonErrorMessages() {
    }

    public static String getActualAsPlain() {
        return ACTUAL;
    }

    public static String getExpectedAsPlain() {
        return EXPECTED;
    }

    public static String shouldBeNull(Object actual) {
        return DESCRIBABLE.as("The given {} should be null.", actual);
    }

    public static String shouldNotBeNull(Object actual) {
        return DESCRIBABLE.as("The given {} should not be null.", actual);
    }

    public static String shouldBeEqualTo(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be equal to {}.", actual, expected);
    }

    public static String shouldNotBeEqualTo(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should not be equal to {}.", actual, expected);
    }

    public static String shouldBeSameAS(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be same as {}.", actual, expected);
    }

    public static String shouldNotBeSameAS(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should not be same as {}.", actual, expected);
    }

    public static String shouldBeAssignableFrom(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be assignable from {}.", actual, expected);
    }

    public static String shouldNotBeAssignableFrom(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should not be assignable from {}.", actual, expected);
    }

    public static String shouldBeInstanceOf(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be instance of {}.", actual, expected);
    }

    public static String shouldBeNotInstanceOf(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should not be instance of {}.", actual, expected);
    }
}
