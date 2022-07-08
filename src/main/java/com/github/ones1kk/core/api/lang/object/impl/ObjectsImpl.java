package com.github.ones1kk.core.api.lang.object.impl;

import com.github.ones1kk.core.api.description.Describable;
import com.github.ones1kk.core.api.lang.object.AbstractObjects;

public class ObjectsImpl extends AbstractObjects {

    private final Describable describable;

    public ObjectsImpl(Describable describable, String asDescription) {
        super(describable, asDescription);
        this.describable = describable;
    }

    @Override
    public void assertIsNull(Object actual) {
        defaultDescription = describable.describedDefault(actual, null, "");
        if (actual == null) throw getException();
    }

    @Override
    public void assertIsNotNull(Object actual) {

    }

    @Override
    public void assertIsSameAs(Object actual, Object expected) {

    }

    @Override
    public void assertIsEqualTo(Object actual, Object expected) {

    }

    @Override
    public void assertIsNotEqualTo(Object actual, Object expected) {

    }

    @Override
    public void assertIsAssignableFrom(Class<?> expected) {

    }
}
