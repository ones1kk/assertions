package com.github.ones1kk.asserts.api.lang.object.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjects;

public class Objects<ACTUAL> extends AbstractObjects<Object> {

    public Objects(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsNull(Object actual) {
        if (actual != null) {
            handler.setDescription(handler.from(actual, "{} is not null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNull(Object actual) {
        if (actual == null) {
            handler.setDescription(handler.from("actual is null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSameAs(Object actual, Object expected) {
        if (actual != expected) {
            handler.setDescription(handler.from(actual, expected, "{} is not same as {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotSameAs(Object actual, Object expected) {
        if (actual == expected) {
            handler.setDescription(handler.from(actual, expected, "{} is same as {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEqualTo(Object actual, Object expected) {
        if (!actual.equals(expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEqualTo(Object actual, Object expected) {
        if (actual.equals(expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAssignableFrom(Object actual, Class<?> expected) {
        if (!actual.getClass().isAssignableFrom(expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not assignable from {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotAssignableFrom(Object actual, Class<?> expected) {
        if (actual.getClass().isAssignableFrom(expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is assignable from {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsInstanceOf(Object actual, Class<?> expected) {
        if (!expected.isInstance(actual)) {
            handler.setDescription(handler.from(actual, expected, "{} is not instance of {}"));
            throw handler.getException();
        }
    }

}
