package com.github.ones1kk.asserts.api.lang.bolean.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.lang.bolean.BooleansInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

public class Booleans extends Objects<Boolean> implements BooleansInterface<Boolean> {

    public Booleans(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsFalse(Boolean actual) {
        if (actual) {
            handler.setDescription(handler.from(actual, "{} is true"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsTrue(Boolean actual) {
        if (!actual) {
            handler.setDescription(handler.from(actual, "{} is false"));
            throw handler.getException();
        }
    }
}
