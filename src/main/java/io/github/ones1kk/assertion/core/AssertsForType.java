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

import io.github.ones1kk.assertion.core.array.ArrayAssert;
import io.github.ones1kk.assertion.core.array.number.NumberArrayAssert;
import io.github.ones1kk.assertion.core.collection.CollectionAssert;
import io.github.ones1kk.assertion.core.collection.list.ListAssert;
import io.github.ones1kk.assertion.core.collection.map.MapAssert;
import io.github.ones1kk.assertion.core.collection.queue.QueueAssert;
import io.github.ones1kk.assertion.core.collection.set.SetAssert;
import io.github.ones1kk.assertion.core.collection.stack.StackAssert;
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
import io.github.ones1kk.assertion.core.time.month.MonthAssert;
import io.github.ones1kk.assertion.core.time.monthday.MonthDayAssert;
import io.github.ones1kk.assertion.core.time.time.LocalTimeAssert;
import io.github.ones1kk.assertion.core.time.year.YearAssert;

import java.io.File;
import java.net.URL;
import java.time.*;
import java.util.*;

/**
 * The AssertsForType Class is for Assertions of JDK Type.
 */
public class AssertsForType {

    private AssertsForType() {
    }

    public static ObjectAssert that(Object actual) {
        return new ObjectAssert(actual);
    }

    public static CharSequenceAssert that(CharSequence actual) {
        return new CharSequenceAssert(actual);
    }

    public static StringAssert that(String actual) {
        return new StringAssert(actual);
    }

    public static CharacterAssert that(Character actual) {
        return new CharacterAssert(actual);
    }

    public static IntegerAssert that(Integer actual) {
        return new IntegerAssert(actual);
    }

    public static LongAssert that(Long actual) {
        return new LongAssert(actual);
    }

    public static ByteAssert that(Byte actual) {
        return new ByteAssert(actual);
    }

    public static DoubleAssert that(Double actual) {
        return new DoubleAssert(actual);
    }

    public static FloatAssert that(Float actual) {
        return new FloatAssert(actual);
    }

    public static BooleanAssert that(Boolean actual) {
        return new BooleanAssert(actual);
    }

    public static ClassAssert that(Class<?> actual) {
        return new ClassAssert(actual);
    }

    public static UrlAssert that(URL actual) {
        return new UrlAssert(actual);
    }

    public static FileAssert that(File actual) {
        return new FileAssert(actual);
    }

    public static LocalDateAssert that(LocalDate actual) {
        return new LocalDateAssert(actual);
    }

    public static LocalDateTimeAssert that(LocalDateTime actual) {
        return new LocalDateTimeAssert(actual);
    }

    public static MonthAssert that(Month actual) {
        return new MonthAssert(actual);
    }

    public static MonthDayAssert that(MonthDay actual) {
        return new MonthDayAssert(actual);
    }

    public static LocalTimeAssert that(LocalTime actual) {
        return new LocalTimeAssert(actual);
    }

    public static YearAssert that(Year actual) {
        return new YearAssert(actual);
    }

    public static ArrayAssert<?> that(Object[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static NumberArrayAssert that(Number[] actual) {
        return new NumberArrayAssert(actual);
    }

    public static <ELEMENT> CollectionAssert<?> that(Collection<ELEMENT> actual) {
        return new CollectionAssert<>(actual);
    }

    public static ListAssert<?> that(List<?> actual) {
        return new ListAssert<>(actual);
    }

    public static MapAssert<?, ?, ?> that(Map<?, ?> actual) {
        return new MapAssert<>(actual);
    }

    public static QueueAssert<?> that(Queue<?> actual) {
        return new QueueAssert<>(actual);
    }

    public static SetAssert<?> that(Set<?> actual) {

        return new SetAssert<>(actual);
    }

    public static StackAssert<?> that(Stack<?> actual) {
        return new StackAssert<>(actual);
    }

}
