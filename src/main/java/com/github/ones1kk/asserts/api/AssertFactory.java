package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;
import com.github.ones1kk.asserts.api.lang.string.impl.Strings;

public final class AssertFactory {

    public Objects<Object> createAssert(Object actual, AsAssert<?> asAssert) {
        return new Objects<>(actual, asAssert);
    }

    public CharSequences createAssert(CharSequence actual, AsAssert<?> asAssert) {
        return new CharSequences(actual, asAssert);
    }

    public Strings createAssert(String actual, AsAssert<?> asAssert) {
        return new Strings(actual, asAssert);
    }
}
