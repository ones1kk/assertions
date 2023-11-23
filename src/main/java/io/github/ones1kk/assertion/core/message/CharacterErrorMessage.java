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

public final class CharacterErrorMessage {

    private CharacterErrorMessage() {
    }

    public static String shouldBeLowerCase(Character actual) {
        return new Description("The given '{}' should be lower case.", actual).toString();
    }

    public static String shouldNotBeLowerCase(Character actual) {
        return new Description("The given '{}' should not be lower case.", actual).toString();
    }

    public static String shouldBeUpperCase(Character actual) {
        return new Description("The given '{}' should be upper case.", actual).toString();
    }

    public static String shouldNotBeUpperCase(Character actual) {
        return new Description("The given '{}' should not be upper case.", actual).toString();
    }

    public static String shouldBeLetter(Character actual) {
        return new Description("The given '{}' should be letter.", actual).toString();
    }

    public static String shouldNotBeLetter(Character actual) {
        return new Description("The given '{}' should not be letter.", actual).toString();
    }

    public static String shouldBeDigit(Character actual) {
        return new Description("The given '{}' should be digit.", actual).toString();
    }

    public static String shouldNotBeDigit(Character actual) {
        return new Description("The give '{}' should not be digit.", actual).toString();
    }

    public static String shouldBeWhitespace(Character actual) {
        return new Description("The give '{}' should be whitespace.", actual).toString();
    }

    public static String shouldNotBeWhitespace(Character actual) {
        return new Description("The give '{}' should not be whitespace.", actual).toString();
    }
}
