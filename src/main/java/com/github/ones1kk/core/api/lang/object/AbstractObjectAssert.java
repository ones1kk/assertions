package com.github.ones1kk.core.api.lang.object;

import com.github.ones1kk.core.api.AbstractAssert;

public class AbstractObjectAssert<SELF extends AbstractAssert<SELF, Object>, ACTUAL> extends AbstractAssert<SELF, Object> {

    protected AbstractObjects objects;

    protected AbstractObjectAssert(Class<?> self, Object actual, AbstractObjects objects) {
        super(self, actual);
        this.objects = objects;
    }

    @Override
    public SELF isNull() {
        objects.assertIsNull(actual);
        return self;
    }

    @Override
    public SELF isNotNull() {
        objects.assertIsNotNull(actual);
        return self;
    }

    @Override
    public SELF isSameAs(Object expected) {
        return null;
    }

    @Override
    public SELF isNotSameAs(Object expected) {
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
