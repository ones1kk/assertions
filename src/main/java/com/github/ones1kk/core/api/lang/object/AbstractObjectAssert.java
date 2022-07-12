package com.github.ones1kk.core.api.lang.object;

import com.github.ones1kk.core.api.AbstractAssert;
import com.github.ones1kk.core.api.lang.object.impl.ObjectsImpl;

public class AbstractObjectAssert<SELF extends AbstractAssert<SELF, Object>, ACTUAL> extends AbstractAssert<SELF, Object> {

    protected ObjectsImpl objects;

    protected AbstractObjectAssert(Class<?> self, Object actual, ObjectsImpl objects) {
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
        objects.assertIsSameAs(actual, expected);
        return self;
    }

    @Override
    public SELF isNotSameAs(Object expected) {
        objects.assertIsNotSameAs(actual, expected);
        return self;
    }

    @Override
    public SELF isEqualTo(Object expected) {
        objects.assertIsEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isNotEqualTo(Object expected) {
        objects.assertIsNotEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isAssignableFrom(Class<?> expected) {
        objects.assertIsAssignableFrom(actual, expected);
        return self;
    }

    @Override
    public SELF isNotAssignableFrom(Class<?> expected) {
        objects.assertIsNotAssignableFrom(actual, expected);
        return self;
    }
}
