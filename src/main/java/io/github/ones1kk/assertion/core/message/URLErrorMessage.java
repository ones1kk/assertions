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

import java.net.URL;

public final class URLErrorMessage {

    private URLErrorMessage() {
    }

    public static String shouldHaveHost(URL actual, String expected) {
        return new Description("The given '{}' should have host as '{}'.", actual, expected).toString();
    }

    public static String shouldDoNotHaveHost(URL actual) {
        return new Description("The given '{}' should do not have host.", actual).toString();
    }

    public static String shouldHavePort(URL actual, int expected) {
        return new Description("The given '{}' should have port as '{}'.", actual, expected).toString();
    }

    public static String shouldDoNotHavePort(URL actual) {
        return new Description("The given '{}' should do not have port.", actual).toString();
    }

    public static String shouldHavePath(URL actual, String expected) {
        return new Description("The given '{}' should have path as '{}'.", actual, expected).toString();
    }

    public static String shouldDoNotHavePath(URL actual) {
        return new Description("The given '{}' should do not have path.", actual).toString();
    }
}
