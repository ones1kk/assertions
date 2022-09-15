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

public final class CommonErrorMessages {

    private static final String ACTUAL = "actual";
    private static final String EXPECTED = "expected";

    private CommonErrorMessages() {
    }

    public static String asActual() {
        return ACTUAL;
    }

    public static String asExpected() {
        return EXPECTED;
    }

    public static String isNull() {
        return "The given actual should be null.";
    }

    public static String isNotNull() {
        return "The given actual should not be null.";
    }

    public static String isEqualTo() {
        return "The given actual should be equal to expected.";
    }

    public static String isNotEqualTo() {
        return "The given actual should not be equal to expected.";
    }

    public static String isSameAs() {
        return "The given actual should be same as expected.";
    }

    public static String isNotSameAs() {
        return "The given actual should not be same as expected.";
    }

    public static String isAssignableFrom() {
        return "The given actual should be assignable from expected.";
    }

    public static String isNotAssignableFrom() {
        return "The given actual should not be assignable from expected.";
    }

    public static String isInstanceOf() {
        return "The given actual should be instance of expected.";
    }

    public static String isNotInstanceOf() {
        return "The given actual should not be instance of expected.";
    }

    public static String isEmpty() {
        return "The given {} should be empty.";
    }

    public static String isNotEmpty() {
        return "The given {} should not be empty.";
    }
}
