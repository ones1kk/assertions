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
import com.github.ones1kk.asserts.core.array.model.ArrayAssert;
import com.github.ones1kk.asserts.core.array.model.NumberArrayAssert;
import com.github.ones1kk.asserts.core.array.number.AbstractNumberArrayAssert;
import com.github.ones1kk.asserts.core.collection.AbstractCollectionAssert;
import com.github.ones1kk.asserts.core.collection.list.AbstractListAssert;
import com.github.ones1kk.asserts.core.collection.map.AbstractMapAssert;
import com.github.ones1kk.asserts.core.collection.model.CollectionAssert;
import com.github.ones1kk.asserts.core.collection.model.ListAssert;
import com.github.ones1kk.asserts.core.collection.model.MapAssert;
import com.github.ones1kk.asserts.core.collection.model.SetAssert;
import com.github.ones1kk.asserts.core.collection.set.AbstractSetAssert;
import com.github.ones1kk.asserts.core.file.AbstractFileAssert;
import com.github.ones1kk.asserts.core.file.model.FileAssert;
import com.github.ones1kk.asserts.core.lang.bolean.AbstractBooleanAssert;
import com.github.ones1kk.asserts.core.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.core.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.core.lang.model.*;
import com.github.ones1kk.asserts.core.lang.number.bte.AbstractByteAssertAssert;
import com.github.ones1kk.asserts.core.lang.number.duble.AbstractDoubleAssert;
import com.github.ones1kk.asserts.core.lang.number.flot.AbstractFloatAssert;
import com.github.ones1kk.asserts.core.lang.number.integer.AbstractIntegerAssertAssert;
import com.github.ones1kk.asserts.core.lang.number.lng.AbstractLongAssertAssert;
import com.github.ones1kk.asserts.core.lang.number.shrt.AbstractShortAssertAssert;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.lang.string.AbstractStringAssert;
import com.github.ones1kk.asserts.core.net.AbstractUrlAssert;
import com.github.ones1kk.asserts.core.net.model.UrlAssert;
import com.github.ones1kk.asserts.core.time.localdate.AbstractLocalDateAssert;
import com.github.ones1kk.asserts.core.time.localdatetime.AbstractLocalDateTimeAssert;
import com.github.ones1kk.asserts.core.time.model.*;
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
 * <strong> The AssertsForType class has the role of passing the values of Type type that are entered for Assertion to each Assert. </strong>
 *
 * <p> The role of declaration referring to the <b>SRP(Single Responsibility Principle)</b>
 * is designed by separating the Assert class and the AbstractAssert class to perform the actual assertion.</p>
 */
public final class AssertsForType {

    /******************************* java.lang *******************************/

    public static AbstractObjectAssert<?, Object> that(Object actual) {
        return new ObjectAssert(actual);
    }

    public static AbstractCharSequenceAssert<?, CharSequence> that(CharSequence actual) {
        return new CharSequenceAssert(actual);
    }

    public static AbstractStringAssert<?> that(String actual) {
        return new StringAssert(actual);
    }

    public static AbstractCharacterAssert<?, Character> that(Character actual) {
        return new CharacterAssert(actual);
    }

    public static AbstractIntegerAssertAssert<?, Integer> that(Integer actual) {
        return new IntegerAssertAssert(actual);
    }

    public static AbstractLongAssertAssert<?, Long> that(Long actual) {
        return new LongAssertAssert(actual);
    }

    public static AbstractShortAssertAssert<?, Short> that(Short actual) {
        return new ShortAssertAssert(actual);
    }

    public static AbstractDoubleAssert<?, Double> that(Double actual) {
        return new DoubleAssert(actual);
    }

    public static AbstractFloatAssert<?, Float> that(Float actual) {
        return new FloatAssert(actual);
    }

    public static AbstractByteAssertAssert<?, Byte> that(Byte actual) {
        return new ByteAssertAssert(actual);
    }

    public static AbstractBooleanAssert<?, Boolean> that(Boolean actual) {
        return new BooleanAssert(actual);
    }

    public static AbstractArrayAssert<?, Object> that(Object[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static AbstractNumberArrayAssert<?, Number[]> that(Number[] actual) {
        return new NumberArrayAssert(actual);
    }

    public static AbstractArrayAssert<?, CharSequence> that(CharSequence[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static AbstractArrayAssert<?, String> that(String[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static AbstractArrayAssert<?, Character> that(Character[] actual) {
        return new ArrayAssert<>(actual);
    }

    /******************************* java.io *******************************/

    public static AbstractFileAssert<?> that(File actual) {
        return new FileAssert(actual);
    }

    /******************************* java.collection *******************************/

    public static <ELEMENT> AbstractCollectionAssert<?, ELEMENT> that(Collection<ELEMENT> actual) {
        return new CollectionAssert<>(actual);
    }

    public static <ELEMENT> AbstractListAssert<?, ELEMENT> that(List<ELEMENT> actual) {
        return new ListAssert<>(actual);
    }

    public static <ELEMENT> AbstractSetAssert<?, ELEMENT> that(Set<ELEMENT> actual) {
        return new SetAssert<>(actual);
    }

    public static <ACTUAL extends Map<K, V>, K, V> AbstractMapAssert<?, ACTUAL, K, V> that(ACTUAL actual) {
        return new MapAssert<>(actual);
    }

    /******************************* java.net *******************************/

    public static AbstractUrlAssert<?> that(URL actual) {
        return new UrlAssert(actual);
    }

    /******************************* java.time *******************************/

    public static <ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> AbstractTemporalAccessorAssert<?, ACTUAL> that(ACTUAL actual) {
        return new TemporalAccessorAssert<>(actual);
    }

    public static AbstractLocalTimeAssert<?, LocalTime> that(LocalTime actual) {
        return new LocalTimeAssert(actual);
    }

    public static AbstractMonthAssert<?, Month> that(Month actual) {
        return new MonthAssert(actual);
    }

    public static AbstractYearAssert<?, Year> that(Year actual) {
        return new YearAssert(actual);
    }

    public static AbstractMonthDayAssert<?, MonthDay> that(MonthDay actual) {
        return new MonthDayAssert(actual);
    }

    public static AbstractLocalDateTimeAssert<?, LocalDateTime> that(LocalDateTime actual) {
        return new LocalDateTimeAssert(actual);
    }

    public static AbstractLocalDateAssert<?, LocalDate> that(LocalDate actual) {
        return new LocalDateAssert(actual);
    }
}
