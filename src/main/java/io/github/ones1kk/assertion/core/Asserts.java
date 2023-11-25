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

import io.github.ones1kk.assertion.core.io.FileAssert;
import io.github.ones1kk.assertion.core.lang.booleans.BooleanAssert;
import io.github.ones1kk.assertion.core.lang.character.CharacterAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.CharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.clazz.ClassAssert;
import io.github.ones1kk.assertion.core.lang.number.bytes.ByteAssert;
import io.github.ones1kk.assertion.core.lang.number.doubles.DoubleAssert;
import io.github.ones1kk.assertion.core.lang.number.floats.FloatAssert;
import io.github.ones1kk.assertion.core.lang.number.integers.IntegerAssert;
import io.github.ones1kk.assertion.core.lang.number.longs.LongAssert;
import io.github.ones1kk.assertion.core.lang.object.ObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.StringAssert;
import io.github.ones1kk.assertion.core.net.UrlAssert;
import io.github.ones1kk.assertion.core.time.localdate.LocalDateAssert;
import io.github.ones1kk.assertion.core.time.localdatetime.LocalDateTimeAssert;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <strong> Assertions is an library that can verify jdk type of value in a chaining method.</strong>
 *
 * <p> The idea of this library and the structure leading to the AbstractAssert class referenced the <b>AssertJ API</b>.</p>
 *
 * @see <a href="https://assertj.github.io/doc/">AssertJ API document</a>
 */
public final class Asserts {

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

    public static CharacterAssert that(Character actual) {
        return AssertsForType.that(actual);
    }

    public static IntegerAssert that(Integer actual) {
        return AssertsForType.that(actual);
    }

    public static LongAssert that(Long actual) {
        return AssertsForType.that(actual);
    }

    public static ByteAssert that(Byte actual) {
        return AssertsForType.that(actual);
    }

    public static DoubleAssert that(Double actual) {
        return AssertsForType.that(actual);
    }

    public static FloatAssert that(Float actual) {
        return AssertsForType.that(actual);
    }

    public static BooleanAssert that(Boolean actual) {
        return AssertsForType.that(actual);
    }

    public static ClassAssert that(Class<?> actual) {
        return AssertsForType.that(actual);
    }

    public static UrlAssert that(URL actual) {
        return AssertsForType.that(actual);
    }

    public static FileAssert that(File actual) {
        return AssertsForType.that(actual);
    }

    public static LocalDateAssert that(LocalDate actual) {
        return AssertsForType.that(actual);
    }

    public static LocalDateTimeAssert that(LocalDateTime actual) {
        return AssertsForType.that(actual);
    }

}
