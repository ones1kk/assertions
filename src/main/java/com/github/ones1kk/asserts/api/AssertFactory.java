package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.character.impl.Characters;
import com.github.ones1kk.asserts.api.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.api.lang.integer.impl.Integers;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;
import com.github.ones1kk.asserts.api.lang.string.impl.Strings;

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
}
