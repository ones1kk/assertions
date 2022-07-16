package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.AbstractAssert;
import com.github.ones1kk.asserts.api.AssertFactory;

public class AbstractObjectAssert<SELF, ACTUAL> extends AbstractAssert<SELF, Object> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected final AssertFactory assertFactory = new AssertFactory();

    protected final AbstractObjects<Object> objects;

    public AbstractObjectAssert(Class<?> self, ACTUAL actual) {
        super(self);
        this.self = (SELF) self;
        this.actual = actual;
        this.objects = assertFactory.createAssert(actual, this);
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
