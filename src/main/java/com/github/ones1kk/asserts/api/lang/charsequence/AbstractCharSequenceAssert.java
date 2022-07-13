package com.github.ones1kk.asserts.api.lang.charsequence;

import com.github.ones1kk.asserts.api.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

public class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, CharSequence> implements CharSequenceAssertInterface<SELF, CharSequence> {

    private final CharSequences charSequences;

    protected AbstractCharSequenceAssert(Class<?> self, CharSequence actual, String asDescription) {
        super(self, actual, asDescription);
        this.charSequences = assertFactory.createAssert(actual, asDescription);
    }

    @Override
    public SELF isEmpty() {
        charSequences.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        charSequences.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isBlank() {
        charSequences.assertIsBlank(actual);
        return self;
    }

    @Override
    public SELF isNotBlank() {
        charSequences.assertIsNotBlank(actual);
        return self;
    }

    @Override
    public SELF isEqualToIgnoreCase(CharSequence expected) {
        charSequences.assertIsEqualToIgnoreCase(actual, expected);
        return self;
    }
}
