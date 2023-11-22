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
package io.github.ones1kk.assertion.core;

import io.github.ones1kk.assertion.core.lang.charsequence.CharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.object.ObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.StringAssert;

/**
 * <strong> Assertions is an library that can verify jdk type of value in a chaining method.</strong>
 *
 * <p> The idea of this library and the structure leading to the AbstractAssert class referenced the <b>AssertJ API</b>.</p>
 *
 * @see <a href="https://assertj.github.io/doc/">AssertJ API document</a>
 */
public class Asserts {

    /**
     * For the stable operation of the library, construct is limited to private.
     */
    private Asserts() {
    }

    public static ObjectAssert that(Object actual) {
        return AssertsForType.that(actual);
    }

    public static CharSequenceAssert that(CharSequence actual) {
        return AssertsForType.that(actual);
    }

    public static StringAssert that(String actual) {
        return AssertsForType.that(actual);
    }

}
