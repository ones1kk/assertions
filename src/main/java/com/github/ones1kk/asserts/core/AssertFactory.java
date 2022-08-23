package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.array.impl.Arrays;
import com.github.ones1kk.asserts.core.array.number.impl.NumberArrays;
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
import com.github.ones1kk.asserts.core.time.temporal.impl.TemporalAccessors;
import com.github.ones1kk.asserts.core.time.year.impl.Years;

import java.io.File;
import java.net.URL;
import java.time.Year;
import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AssertFactory {

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

    public Files createAssert(File actual, AsAssert<?> asAssert) {
        return new Files(asAssert);
    }

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

    public Urls createAssert(URL actual, AsAssert<?> asAssert) {
        return new Urls(asAssert);
    }

    public <ELEMENT extends TemporalAccessor & Comparable<ELEMENT>> TemporalAccessors<ELEMENT> createAssert(TemporalAccessor actual, AsAssert<?> asAssert) {
        return new TemporalAccessors<>(asAssert);
    }

    public Years createAssert(Year actual, AsAssert<?> asAssert) {
        return new Years(asAssert);
    }
}
