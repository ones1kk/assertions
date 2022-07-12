package com.github.ones1kk.core.api.lang.charsequence;

import com.github.ones1kk.core.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.core.api.lang.object.impl.ObjectsImpl;

public class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL extends CharSequence> extends
        AbstractObjectAssert<SELF, CharSequence> {

    protected AbstractCharSequenceAssert(Class<?> self, Object actual, ObjectsImpl objects) {
        super(self, actual, objects);
    }

    public SELF isEmpty() {
        return self;
    }

    public SELF isNotEmpty() {
        return self;
    }

    public SELF isBlank() {
        return self;
    }

    public SELF isNotBlank() {
        return self;
    }

    public SELF isEqualToIgnoreCase(CharSequence expected) {
        return self;
    }

}
