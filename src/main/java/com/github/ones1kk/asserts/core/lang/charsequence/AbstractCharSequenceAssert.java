package com.github.ones1kk.asserts.core.lang.charsequence;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL extends CharSequence> extends AbstractObjectAssert<SELF, ACTUAL> implements CharSequenceAssertInterface<SELF, CharSequence> {

    private final CharSequencesInterface<CharSequence> charSequences;

    protected AbstractCharSequenceAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.charSequences = assertFactory.createAssert(actual, this);
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
