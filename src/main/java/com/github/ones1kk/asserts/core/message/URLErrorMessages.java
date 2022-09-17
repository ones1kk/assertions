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

import java.net.URL;

public final class URLErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private URLErrorMessages() {
    }

    public static String shouldHaveHost(URL actual, String expected) {
        return DESCRIBABLE.as("The given {} should have host as {}.", actual, expected);
    }

    public static String shouldDoNotHaveHost(URL actual) {
        return DESCRIBABLE.as("The given {} should do not have host.", actual);
    }

    public static String shouldHavePort(URL actual, int expected) {
        return DESCRIBABLE.as("The given {} should have port as {}.", actual, expected);
    }

    public static String shouldDoNotHavePort(URL actual) {
        return DESCRIBABLE.as("The given {} should do not have port.", actual);
    }

    public static String shouldHavePath(URL actual, String expected) {
        return DESCRIBABLE.as("The given {} should have path as {}.", actual, expected);
    }

    public static String shouldDoNotHavePath(URL actual) {
        return DESCRIBABLE.as("The given {} should do not have path.", actual);
    }
}
