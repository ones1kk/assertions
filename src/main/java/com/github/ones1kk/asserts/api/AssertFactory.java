package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

public final class AssertFactory {

    public Objects createAssert(Object actual, String asDescription) {
        return new Objects(asDescription);
    }

    public CharSequences createAssert(CharSequence actual, String asDescription) {
        return new CharSequences(asDescription);
    }
}
