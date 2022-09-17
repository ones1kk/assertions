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

public final class DescriptionErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private DescriptionErrorMessages() {
    }

    public static String shouldDoNotInsertPercentSign() {
        return DESCRIBABLE.as("The special character '%s' should don't be entered in description.");
    }

    public static String ShouldBeEnteredArguments() {
        return DESCRIBABLE.as("The arguments should be entered.");
    }

    public static String ShouldBeExpressedInBraces() {
        return DESCRIBABLE.as("The arguments should be expressed in only braces.");
    }
}
