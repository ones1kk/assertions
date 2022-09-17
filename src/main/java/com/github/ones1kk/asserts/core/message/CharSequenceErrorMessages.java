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

public final class CharSequenceErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    public static String shouldBeEmpty(CharSequence actual, String placeholder) {
        return DESCRIBABLE.as(placeholder, actual);
    }

    public static String shouldNotBeEmpty(CharSequence actual, String placeholder) {
        return DESCRIBABLE.as(placeholder, actual);
    }

    public static String shouldBeBlank(CharSequence actual) {
        return DESCRIBABLE.as("The given {} should be blank.", actual);
    }

    public static String shouldNotBeBlank(CharSequence actual) {
        return DESCRIBABLE.as("The given {} should not be blank.", actual);
    }

    public static String shouldBeEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        return DESCRIBABLE.as("The given {} should be equal to {}, case insensitively.", actual, expected);
    }

    public static String shouldBeNotEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        return DESCRIBABLE.as("The given {} should not be equal to {}, case insensitively.", actual, expected);
    }
}
