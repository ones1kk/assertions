package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;

public class CharSequenceAssert extends AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> {

    public CharSequenceAssert(CharSequence actual) {
        super(CharSequenceAssert.class, actual);
    }
}
