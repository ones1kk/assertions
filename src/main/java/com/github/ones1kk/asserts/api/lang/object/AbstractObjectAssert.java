package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.AssertFactory;
import com.github.ones1kk.asserts.api.AssertsInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

public class AbstractObjectAssert<SELF extends AssertsInterface<SELF, Object>, ACTUAL> implements AssertsInterface<SELF, Object> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected final String asDescription;

    protected final AssertFactory assertFactory = new AssertFactory();

    private final ObjectsInterface<Object> objects;

    protected AbstractObjectAssert(Class<?> self, ACTUAL actual, String asDescription) {
        this.self = (SELF) self.cast(this);
        this.actual = actual;
        this.asDescription = asDescription;
        this.objects = assertFactory.createAssert(actual, asDescription);
    }

    @Override
    public SELF isNull() {
        objects.assertIsNull(actual);
        return self;
    }

    @Override
    public SELF isNotNull() {
        return self;
    }

    @Override
    public SELF isSameAs(Object expected) {
        return self;
    }

    @Override
    public SELF isNotSameAs(Object expected) {
        return self;
    }

    @Override
    public SELF isEqualTo(Object expected) {
        return self;
    }

    @Override
    public SELF isNotEqualTo(Object expected) {
        return self;
    }

    @Override
    public SELF isAssignableFrom(Class<?> expected) {
        return self;
    }

    @Override
    public SELF isNotAssignableFrom(Class<?> expected) {
        return self;
    }
}
