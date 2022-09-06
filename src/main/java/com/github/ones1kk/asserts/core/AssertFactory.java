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

import com.github.ones1kk.asserts.core.array.impl.Arrays;
import com.github.ones1kk.asserts.core.array.number.impl.NumberArrays;
import com.github.ones1kk.asserts.core.clazz.enumtype.impl.Enums;
import com.github.ones1kk.asserts.core.clazz.impl.Classes;
import com.github.ones1kk.asserts.core.collection.impl.Collections;
import com.github.ones1kk.asserts.core.collection.list.impl.Lists;
import com.github.ones1kk.asserts.core.collection.map.impl.Maps;
import com.github.ones1kk.asserts.core.collection.set.impl.Sets;
import com.github.ones1kk.asserts.core.file.impl.Files;
import com.github.ones1kk.asserts.core.lang.bolean.impl.Booleans;
import com.github.ones1kk.asserts.core.lang.character.impl.Characters;
import com.github.ones1kk.asserts.core.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.core.lang.number.bte.impl.Bytes;
import com.github.ones1kk.asserts.core.lang.number.duble.impl.Doubles;
import com.github.ones1kk.asserts.core.lang.number.flot.impl.Floats;
import com.github.ones1kk.asserts.core.lang.number.integer.impl.Integers;
import com.github.ones1kk.asserts.core.lang.number.lng.impl.Longs;
import com.github.ones1kk.asserts.core.lang.number.shrt.impl.Shorts;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.lang.string.impl.Strings;
import com.github.ones1kk.asserts.core.net.impl.Urls;
import com.github.ones1kk.asserts.core.time.localdate.impl.LocalDates;
import com.github.ones1kk.asserts.core.time.localdatetime.impl.LocalDateTimes;
import com.github.ones1kk.asserts.core.time.temporal.accessor.impl.TemporalAccessors;
import com.github.ones1kk.asserts.core.time.year.impl.Years;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <strong> The AssertFactory class is responsible for declaring the corresponding
 * Assertion implementation according to the actual value.</strong>
 * <br><br>
 * <p> Unlike the class name, because the generic type must be specified directly,
 * it <b>does not follow</b> the actual <b>Factory design pattern</b>.</p>
 */
public final class AssertFactory {

    /******************************* java.lang *******************************/

    public Objects<Object> createAssert(Object actual, AsAssert<?> asAssert) {
        return new Objects<>(asAssert);
    }

    public CharSequences createAssert(CharSequence actual, AsAssert<?> asAssert) {
        return new CharSequences(asAssert);
    }

    public Strings createAssert(String actual, AsAssert<?> asAssert) {
        return new Strings(asAssert);
    }

    public Characters createAssert(Character actual, AsAssert<?> asAssert) {
        return new Characters(asAssert);
    }

    public Integers createAssert(Integer actual, AsAssert<?> asAssert) {
        return new Integers(asAssert);
    }

    public Longs createAssert(Long actual, AsAssert<?> asAssert) {
        return new Longs(asAssert);
    }

    public Shorts createAssert(Short actual, AsAssert<?> asAssert) {
        return new Shorts(asAssert);
    }

    public Doubles createAssert(Double actual, AsAssert<?> asAssert) {
        return new Doubles(asAssert);
    }

    public Floats createAssert(Float actual, AsAssert<?> asAssert) {
        return new Floats(asAssert);
    }

    public Bytes createAssert(Byte actual, AsAssert<?> asAssert) {
        return new Bytes(asAssert);
    }

    public Booleans createAssert(Boolean actual, AsAssert<?> asAssert) {
        return new Booleans(asAssert);
    }

    public Arrays<Object> createAssert(Object[] actual, AsAssert<?> asAssert) {
        return new Arrays<>(asAssert);
    }

    public NumberArrays createAssert(Number[] actual, AsAssert<?> asAssert) {
        return new NumberArrays(asAssert);
    }

    public Arrays<CharSequence> createAssert(CharSequence[] actual, AsAssert<?> asAssert) {
        return new Arrays<>(asAssert);
    }

    public Arrays<String> createAssert(String[] actual, AsAssert<?> asAssert) {
        return new Arrays<>(asAssert);
    }

    public Arrays<Character> createAssert(Character[] actual, AsAssert<?> asAssert) {
        return new Arrays<>(asAssert);
    }

    public Arrays<Boolean> createAssert(Boolean[] actual, AsAssert<?> asAssert) {
        return new Arrays<>(asAssert);
    }

    /******************************* java.io *******************************/

    public Files createAssert(File actual, AsAssert<?> asAssert) {
        return new Files(asAssert);
    }

    /******************************* java.collection *******************************/

    public <ELEMENT> Collections<ELEMENT> createAssert(Collection<? extends ELEMENT> actual, AsAssert<?> asAssert) {
        return new Collections<>(asAssert);
    }

    public <ELEMENT> Lists<ELEMENT> createAssert(List<? extends ELEMENT> actual, AsAssert<?> asAssert) {
        return new Lists<>(asAssert);
    }

    public <ELEMENT> Sets<ELEMENT> createAssert(Set<? extends ELEMENT> actual, AsAssert<?> asAssert) {
        return new Sets<>(asAssert);
    }

    public <ELEMENT extends Map<K, V>, K, V> Maps<ELEMENT, K, V> createAssert(Map<K, V> actual, AsAssert<?> asAssert) {
        return new Maps<>(asAssert);
    }

    /******************************* java.net *******************************/

    public Urls createAssert(URL actual, AsAssert<?> asAssert) {
        return new Urls(asAssert);
    }

    /******************************* java.time *******************************/

    public <ELEMENT extends TemporalAccessor & Comparable<ELEMENT>> TemporalAccessors<ELEMENT> createAssert(TemporalAccessor actual, AsAssert<?> asAssert) {
        return new TemporalAccessors<>(asAssert);
    }

    public Years createAssert(Year actual, AsAssert<?> asAssert) {
        return new Years(asAssert);
    }

    public LocalDates<LocalDate> createAssert(LocalDate actual, AsAssert<?> asAssert) {
        return new LocalDates<>(asAssert);
    }

    public LocalDateTimes<LocalDateTime> createAssert(LocalDateTime actual, AsAssert<?> asAssert) {
        return new LocalDateTimes<>(asAssert);
    }

    /******************************* java.lang.class *******************************/

    public Classes createAssert(Class<?> actual, AsAssert<?> asAssert) {
        return new Classes(asAssert);
    }

    public <ACTUAL extends Enum<ACTUAL>> Enums<ACTUAL> createAssert(ACTUAL actual, AsAssert<?> asAssert) {
        return new Enums<>(asAssert);
    }
}
