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

package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.array.AbstractArrayAssert;
import com.github.ones1kk.asserts.core.array.number.AbstractNumberArrayAssert;
import com.github.ones1kk.asserts.core.clazz.AbstractClassAssert;
import com.github.ones1kk.asserts.core.clazz.enumtype.AbstractEnumAssert;
import com.github.ones1kk.asserts.core.collection.AbstractCollectionAssert;
import com.github.ones1kk.asserts.core.collection.list.AbstractListAssert;
import com.github.ones1kk.asserts.core.collection.map.AbstractMapAssert;
import com.github.ones1kk.asserts.core.collection.set.AbstractSetAssert;
import com.github.ones1kk.asserts.core.file.AbstractFileAssert;
import com.github.ones1kk.asserts.core.lang.bolean.AbstractBooleanAssert;
import com.github.ones1kk.asserts.core.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.core.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.core.lang.number.bte.AbstractByteAssert;
import com.github.ones1kk.asserts.core.lang.number.duble.AbstractDoubleAssert;
import com.github.ones1kk.asserts.core.lang.number.flot.AbstractFloatAssert;
import com.github.ones1kk.asserts.core.lang.number.integer.AbstractIntegerAssert;
import com.github.ones1kk.asserts.core.lang.number.lng.AbstractLongAssert;
import com.github.ones1kk.asserts.core.lang.number.shrt.AbstractShortAssert;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.lang.string.AbstractStringAssert;
import com.github.ones1kk.asserts.core.net.AbstractUrlAssert;
import com.github.ones1kk.asserts.core.time.localdate.AbstractLocalDateAssert;
import com.github.ones1kk.asserts.core.time.localdatetime.AbstractLocalDateTimeAssert;
import com.github.ones1kk.asserts.core.time.month.AbstractMonthAssert;
import com.github.ones1kk.asserts.core.time.monthday.AbstractMonthDayAssert;
import com.github.ones1kk.asserts.core.time.temporal.accessor.AbstractTemporalAccessorAssert;
import com.github.ones1kk.asserts.core.time.time.AbstractLocalTimeAssert;
import com.github.ones1kk.asserts.core.time.year.AbstractYearAssert;

import java.io.File;
import java.net.URL;
import java.time.*;
import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <strong> Asserts library is an Assertion library that can check the validity of each type of value in a chaining method when declaring a class having the corresponding value,
 * such as an instance variable, a first-class collection, or a primitive variable.</strong>
 *
 * <p> In each package, the Assert in the model package is written for declaration and casting, and the class receiving DI for the actual Assertion is composed of the AbstractAssert class. </p>
 * <p> Each Assert class is resolved as a type parameter called '{@code SELF}', and the actual Assertions value is resolved as a type parameter of '{@code ACTUAL}'. </p>
 *
 * <p> The idea of this library and the structure leading to the AbstractAssert class referenced the <b>AssertJ API</b>.</p>
 *
 * @see <a href="https://assertj.github.io/doc/">AssertJ API document</a>
 */
public final class Asserts {

    /**
     * For the stable operation of the library, construct is limited to private for a certain period of time.
     */
    private Asserts() {
    }

    /******************************* java.lang *******************************/

    public static AbstractObjectAssert<?, Object> that(Object actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractCharSequenceAssert<?, CharSequence> that(CharSequence actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractStringAssert<?> that(String actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractCharacterAssert<?, Character> that(Character actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractIntegerAssert<?, Integer> that(Integer actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractLongAssert<?, Long> that(Long actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractShortAssert<?, Short> that(Short actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractDoubleAssert<?, Double> that(Double actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractFloatAssert<?, Float> that(Float actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractByteAssert<?, Byte> that(Byte actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractBooleanAssert<?, Boolean> that(Boolean actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, Object> that(Object[] actual) {
        return AssertsForType.that(actual);
    }

    /******************************* java.array *******************************/

    public static AbstractNumberArrayAssert<?, Number[]> that(Number[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, CharSequence> that(CharSequence[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, String> that(String[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, Character> that(Character[] actual) {
        return AssertsForType.that(actual);
    }

    /******************************* java.io *******************************/

    public static AbstractFileAssert<?> that(File actual) {
        return AssertsForType.that(actual);
    }

    /******************************* java.collection *******************************/

    public static <ELEMENT> AbstractCollectionAssert<?, ELEMENT> that(Collection<ELEMENT> actual) {
        return AssertsForType.that(actual);
    }

    public static <ELEMENT> AbstractListAssert<?, ELEMENT> that(List<ELEMENT> actual) {
        return AssertsForType.that(actual);
    }

    public static <ELEMENT> AbstractSetAssert<?, ELEMENT> that(Set<ELEMENT> actual) {
        return AssertsForType.that(actual);
    }

    public static <ACTUAL extends Map<K, V>, K, V> AbstractMapAssert<?, ACTUAL, K, V> that(ACTUAL actual) {
        return AssertsForType.that(actual);
    }

    /******************************* java.net *******************************/

    public static AbstractUrlAssert<?> that(URL actual) {
        return AssertsForType.that(actual);
    }

    /******************************* java.time *******************************/

    public static <ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> AbstractTemporalAccessorAssert<?, ACTUAL> that(ACTUAL actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractLocalTimeAssert<?, LocalTime> that(LocalTime actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractMonthAssert<?, Month> that(Month actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractYearAssert<?, Year> that(Year actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractMonthDayAssert<?, MonthDay> that(MonthDay actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractLocalDateTimeAssert<?, LocalDateTime> that(LocalDateTime actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractLocalDateAssert<?, LocalDate> that(LocalDate actual) {
        return AssertsForType.that(actual);
    }

    /******************************* java.lang.class *******************************/

    public static AbstractClassAssert<?> that(Class<?> actual) {
        return AssertForClass.that(actual);
    }

    public static <ACTUAL extends Enum<ACTUAL>> AbstractEnumAssert<?, ACTUAL> that(ACTUAL actual) {
        return AssertForClass.that(actual);
    }
}
