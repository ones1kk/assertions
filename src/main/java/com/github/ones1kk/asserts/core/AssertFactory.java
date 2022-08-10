package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.array.impl.Arrays;
import com.github.ones1kk.asserts.core.array.number.impl.NumberArrays;
import com.github.ones1kk.asserts.core.collection.list.impl.Lists;
import com.github.ones1kk.asserts.core.file.impl.Files;
import com.github.ones1kk.asserts.core.lang.bolean.impl.Booleans;
import com.github.ones1kk.asserts.core.lang.bte.impl.Bytes;
import com.github.ones1kk.asserts.core.lang.character.impl.Characters;
import com.github.ones1kk.asserts.core.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.core.lang.duble.impl.Doubles;
import com.github.ones1kk.asserts.core.lang.flot.impl.Floats;
import com.github.ones1kk.asserts.core.lang.integer.impl.Integers;
import com.github.ones1kk.asserts.core.lang.lng.impl.Longs;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.lang.shrt.impl.Shorts;
import com.github.ones1kk.asserts.core.lang.string.impl.Strings;

import java.io.File;
import java.util.List;

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

    public Lists<Object> createAssert(List<Object> actual, AsAssert<?> asAssert) {
        return new Lists<>(asAssert);
    }

}
