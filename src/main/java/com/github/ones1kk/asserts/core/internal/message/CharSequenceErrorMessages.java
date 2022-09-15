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

package com.github.ones1kk.asserts.core.internal.message;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.description.impl.Description;

public final class CharSequenceErrorMessages {

    private static final Describable describable = new Description();

    public static String isEmpty(CharSequence actual, String placeholder) {
        return describable.as(placeholder, actual);
    }

    public static String isNotEmpty(CharSequence actual, String placeholder) {
        return describable.as(placeholder, actual);
    }

    public static String isBlank(CharSequence actual) {
        return describable.as("The given {} should be blank.", actual);
    }

    public static String isNotBlank(CharSequence actual) {
        return describable.as("The given {} should not be blank.", actual);
    }

    public static String isEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        return describable.as("The given {} should not be equal to {} ignore case.", actual, expected);
    }


}
