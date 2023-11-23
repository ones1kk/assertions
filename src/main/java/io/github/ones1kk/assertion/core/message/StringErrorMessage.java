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

public final class StringErrorMessage {

    private StringErrorMessage() {
    }

    public static String shouldHasText(CharSequence actual) {
        return new Description("The given '{}' should has text.", actual).toString();
    }

    public static String shouldHasNotText(CharSequence actual) {
        return new Description("The given '{}' should not has text.", actual).toString();
    }

    public static String shouldHasLength(CharSequence actual) {
        return new Description("The given '{}' should be length of '{}'.", actual, actual.length()).toString();
    }

    public static String shouldHasSameLength(CharSequence actual, CharSequence expected) {
        return new Description("The given '{}' should has same length of '{}'.", actual, expected).toString();
    }

    public static String shouldMatches(String actual, Object expected) {
        return new Description("The given '{}' should be matched '{}'", actual, expected).toString();
    }
}
