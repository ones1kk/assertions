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

import io.github.ones1kk.assertion.core.description.Describable;
import io.github.ones1kk.assertion.core.description.impl.Description;

public final class CharacterErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private CharacterErrorMessages() {
    }

    public static String shouldBeLowerCase(Character actual) {
        return DESCRIBABLE.as("The given '{}' should be lower case.", actual);
    }

    public static String shouldNotBeLowerCase(Character actual) {
        return DESCRIBABLE.as("The given '{}' should not be lower case.", actual);
    }

    public static String shouldBeUpperCase(Character actual) {
        return DESCRIBABLE.as("The given '{}' should be upper case.", actual);
    }

    public static String shouldNotBeUpperCase(Character actual) {
        return DESCRIBABLE.as("The given '{}' should not be upper case.", actual);
    }

    public static String shouldBeLetter(Character actual) {
        return DESCRIBABLE.as("The given '{}' should be letter.", actual);
    }

    public static String shouldNotBeLetter(Character actual) {
        return DESCRIBABLE.as("The given '{}' should not be letter.", actual);
    }

    public static String shouldBeDigit(Character actual) {
        return DESCRIBABLE.as("The given '{}' should be digit.", actual);
    }

    public static String shouldNotBeDigit(Character actual) {
        return DESCRIBABLE.as("The give '{}' should not be digit.", actual);
    }

    public static String shouldBeWhitespace(Character actual) {
        return DESCRIBABLE.as("The give '{}' should be whitespace.", actual);
    }

    public static String shouldNotBeWhitespace(Character actual) {
        return DESCRIBABLE.as("The give '{}' should not be whitespace.", actual);
    }
}
