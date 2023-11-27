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
import io.github.ones1kk.assertion.core.collection.map.MapAssert;
import io.github.ones1kk.assertion.core.io.FileAssert;
import io.github.ones1kk.assertion.core.lang.character.AbstractCharacterAssert;
import io.github.ones1kk.assertion.core.lang.character.CharacterAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.AbstractCharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.CharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.number.bytes.AbstractByteAssert;
import io.github.ones1kk.assertion.core.lang.number.bytes.ByteAssert;
import io.github.ones1kk.assertion.core.lang.number.doubles.DoubleAssert;
import io.github.ones1kk.assertion.core.lang.number.floats.FloatAssert;
import io.github.ones1kk.assertion.core.lang.number.integers.IntegerAssert;
import io.github.ones1kk.assertion.core.lang.number.longs.LongAssert;
import io.github.ones1kk.assertion.core.lang.number.shorts.ShortAssert;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.ObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.AbstractStringAssert;
import io.github.ones1kk.assertion.core.lang.string.StringAssert;
import io.github.ones1kk.assertion.core.net.UrlAssert;
import io.github.ones1kk.assertion.core.time.localdate.LocalDateAssert;
import io.github.ones1kk.assertion.core.time.localdatetime.LocalDateTimeAssert;
import io.github.ones1kk.assertion.core.time.month.MonthAssert;
import io.github.ones1kk.assertion.core.time.monthday.MonthDayAssert;
import io.github.ones1kk.assertion.core.time.time.LocalTimeAssert;
import io.github.ones1kk.assertion.core.time.year.YearAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.*;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class AssertsTest {

    @Nested
    @DisplayName("create Asserts")
    class Test01 {

        @Test
        @DisplayName("assert actual of object type")
        void testCreateObjectAsserts() {
            // given
            Object actual = new Object();

            // when
            ObjectAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractObjectAssert.class);
        }

        @Test
        @DisplayName("assert actual of charSequence type")
        void testCreateCharSequenceAsserts() {
            // given
            CharSequence actual = "actual";

            // when
            CharSequenceAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractCharSequenceAssert.class);
        }

        @Test
        @DisplayName("assert actual of character type")
        void testCreateCharacterAsserts() {
            // given
            Character actual = 'a';

            // when
            CharacterAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractCharacterAssert.class);
        }

        @Test
        @DisplayName("assert actual of string type")
        void testCreateStringAsserts() {
            // given
            String actual = "actual";

            // when
            StringAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractStringAssert.class);
        }

        @Test
        @DisplayName("assert actual of byte type")
        void testCreateByteAsserts() {
            // given
            Byte actual = 1;

            // when
            ByteAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractByteAssert.class);
        }

        @Test
        @DisplayName("assert actual of short type")
        void testCreateShortAsserts() {
            // given
            Short actual = 1;

            // when
            ShortAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(ShortAssert.class);
        }

        @Test
        @DisplayName("assert actual of integer type")
        void testCreateIntegerAsserts() {
            // given
            Integer actual = 1;

            // when
            IntegerAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(IntegerAssert.class);
        }

        @Test
        @DisplayName("assert actual of long type")
        void testCreateLongAsserts() {
            // given
            Long actual = 1L;

            // when
            LongAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(LongAssert.class);
        }

        @Test
        @DisplayName("assert actual of double type")
        void testCreateDoubleAsserts() {
            // given
            Double actual = 1.0;

            // when
            DoubleAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(DoubleAssert.class);
        }

        @Test
        @DisplayName("assert actual of float type")
        void testCreateFloatAsserts() {
            // given
            Float actual = 1.0F;

            // when
            FloatAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(FloatAssert.class);
        }

        @Test
        @DisplayName("assert actual of array type")
        void testCreateArrayAsserts() {
            // given
            String[] actual = {"1", "2"};

            // when
            ArrayAssert<?> result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(ArrayAssert.class);
        }

        @Test
        @DisplayName("assert actual of number array type")
        void testCreateNumberArrayAsserts() {
            // given
            Integer[] actual = {1, 2};

            // when
            NumberArrayAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(NumberArrayAssert.class);
        }

        @Test
        @DisplayName("assert actual of collection type")
        void testCreateCollectionAsserts() {
            // given
            Collection<String> actual = List.of("1", "2");

            // when
            CollectionAssert<?> result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(CollectionAssert.class);
        }

        @Test
        @DisplayName("assert actual of stack type")
        void testCreateStackAsserts() {
            // given
            Stack<String> actual = new Stack<>();

            // when
            CollectionAssert<?> result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(CollectionAssert.class);
        }

        @Test
        @DisplayName("assert actual of queue type")
        void testCreateQueueAsserts() {
            // given
            Queue<String> actual = new ArrayDeque<>();

            // when
            CollectionAssert<?> result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(CollectionAssert.class);
        }

        @Test
        @DisplayName("assert actual of set type")
        void testCreateSetAsserts() {
            // given
            Set<Integer> actual = Set.of(1, 2, 3);

            // when
            CollectionAssert<?> result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(CollectionAssert.class);
        }

        @Test
        @DisplayName("assert actual of map type")
        void testCreateMapAsserts() {
            // given
            Map<Integer, Integer> actual = Map.of(1, 1);

            // when
            MapAssert<?, ?, ?> result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(MapAssert.class);
        }

        @Test
        @DisplayName("assert actual of local date type")
        void testCreateLocalDateAsserts() {
            // given
            LocalDate actual = LocalDate.now();

            // when
            LocalDateAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(LocalDateAssert.class);
        }

        @Test
        @DisplayName("assert actual of local date time type")
        void testCreateLocalDateTimeAsserts() {
            // given
            LocalDateTime actual = LocalDateTime.now();

            // when
            LocalDateTimeAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(LocalDateTimeAssert.class);
        }

        @Test
        @DisplayName("assert actual of month type")
        void testCreateMonthAsserts() {
            // given
            Month actual = Month.of(1);

            // when
            MonthAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(MonthAssert.class);
        }

        @Test
        @DisplayName("assert actual of month day type")
        void testCreateMonthDayAsserts() {
            // given
            MonthDay actual = MonthDay.of(1, 1);

            // when
            MonthDayAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(MonthDayAssert.class);
        }

        @Test
        @DisplayName("assert actual of local time type")
        void testCreateLocalTimeAsserts() {
            // given
            LocalTime actual = LocalTime.now();

            // when
            LocalTimeAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(LocalTimeAssert.class);
        }

        @Test
        @DisplayName("assert actual of year type")
        void testCreateYearAsserts() {
            // given
            Year actual = Year.now();

            // when
            YearAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(YearAssert.class);
        }

        @Test
        @DisplayName("assert actual of file type")
        void testCreateFileAsserts() {
            // given
            File actual = new File("");

            // when
            FileAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(FileAssert.class);
        }

        @Test
        @DisplayName("assert actual of url type")
        void testCreateUrlAsserts() throws MalformedURLException {
            // given
            URL actual = new URL("https://google.com");

            // when
            UrlAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(UrlAssert.class);
        }

    }

}