package com.github.ones1kk.asserts.core.lang.bolean.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.bolean.BooleansInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

public class Booleans extends Objects<Boolean> implements BooleansInterface<Boolean> {

    public Booleans(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    @SuppressWarnings("all")
    public void assertIsFalse(Boolean actual) {
        if (actual) {
            handler.setDescription(handler.from(actual, "{} is true"));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("all")
    public void assertIsTrue(Boolean actual) {
        if (!actual) {
            handler.setDescription(handler.from(actual, "{} is false"));
            throw handler.getException();
        }
    }
}
