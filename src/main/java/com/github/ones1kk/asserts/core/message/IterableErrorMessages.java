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

public final class IterableErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private IterableErrorMessages() {

    }

    public static String shouldBeEmpty(Object actual) {
        return DESCRIBABLE.as("The given {} should be empty.", actual);
    }

    public static String shouldNotBeEmpty(Object actual) {
        return DESCRIBABLE.as("The given {} should not be empty.", actual);
    }

    public static String shouldNotBeNullOrEmpty(Object actual) {
        return DESCRIBABLE.as("The given {} should not be null or empty.", actual);
    }

    public static String shouldContain(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should contain {}.", actual, expected);
    }

    public static String shouldDoNotContain(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should do not contain {}.", actual, expected);
    }

    public static String shouldContainAll(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should contain all of {}.", actual, expected);
    }

    public static String shouldContainAny(Object actual, Object expected) {
        return DESCRIBABLE.as("The given {} should contain any of {}.", actual, expected);
    }

    public static String shouldContainNull(Object actual) {
        return DESCRIBABLE.as("The given {} should contain null.", actual);
    }

    public static String shouldDoNotContainNull(Object actual) {
        return DESCRIBABLE.as("The given {} should do not contain null.", actual);
    }

    public static String shouldBeAllMatch(Object actual) {
        return DESCRIBABLE.as("The given {} should match all.", actual);
    }

    public static String shouldDoNotMatch(Object actual) {
        return DESCRIBABLE.as("The given {} should do not match.", actual);
    }
}
