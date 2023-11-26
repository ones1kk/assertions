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

public final class MapErrorMessage {

    private MapErrorMessage() {
    }

    public static String shouldContainKey(Object actual, Object expected) {
        return new Description("The given '{}' should contain '{}' as key.", actual, expected).toString();
    }

    public static String shouldContainAllKey(Object actual, Object expected) {
        return new Description("The given '{}' should contain all keys of '{}'.", actual, expected).toString();
    }

    public static String shouldContainValue(Object actual, Object expected) {
        return new Description("The given '{}' should contain '{}'. as value.", actual, expected).toString();
    }

    public static String shouldContainAllValue(Object actual, Object expected) {
        return new Description("The given '{}' should contain all values of '{}'.", actual, expected).toString();
    }

    public static String shouldHasSameSizeOf(Object actual, int expected) {
        return new Description("The given '{}' should have '{}' size.", actual, expected).toString();
    }

    public static String shouldDoNotHaveSizeOf(Object actual, int expected) {
        return new Description("The given '{}' should have '{}' size.", actual, expected).toString();
    }
}
