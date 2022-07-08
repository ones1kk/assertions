package com.github.ones1kk.core.api.lang.object;

import com.github.ones1kk.core.api.AbstractAssert;

public class AbstractObjectAssert<SELF extends AbstractAssert<SELF, Object>, ACTUAL> extends AbstractAssert<SELF, Object> {

    protected AbstractObjectAssert(Class<?> self, Object actual) {
        super(self, actual);
    }

    @Override
    public SELF isNull() {
        return self;
    }

    @Override
    public SELF isNotNull() {
        return null;
    }

    @Override
    public SELF isSameAs(Object expected) {
        return null;
    }

    @Override
    public SELF isEqualTo(Object expected) {
        return null;
    }

    @Override
    public SELF isNotEqualTo(Object expected) {
        return null;
    }

    @Override
    public SELF isAssignableFrom(Class<?> expected) {
        return null;
    }
}
