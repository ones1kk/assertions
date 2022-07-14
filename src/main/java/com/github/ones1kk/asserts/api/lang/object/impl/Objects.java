package com.github.ones1kk.asserts.api.lang.object.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjects;

public class Objects<ACTUAL> extends AbstractObjects<Object> {

    public Objects(ACTUAL actual, AsAssert<?> asAssert) {
        super(actual, asAssert);
    }

    @Override
    public void assertIsNull(Object actual) {
        if (actual != null) {
            asAssert.setDescription(actual,"{} is not null");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsNotNull(Object actual) {
        if (actual == null) {
            asAssert.setDescription(actual,"{} is null");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsSameAs(Object actual, Object expected) {
        if (actual != expected) {
            asAssert.setDescription(actual, expected, "{} is not same as {}");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsNotSameAs(Object actual, Object expected) {
        if (actual == expected) {
            asAssert.setDescription(actual, expected, "{} is same as {}");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsEqualTo(Object actual, Object expected) {
        if (!actual.equals(expected)) {
            asAssert.setDescription(actual, expected, "{} is not equal to {}");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsNotEqualTo(Object actual, Object expected) {
        if (actual.equals(expected)) {
            asAssert.setDescription(actual, expected, "{} is equal to {}");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsAssignableFrom(Object actual, Class<?> expected) {
        if (!actual.getClass().isAssignableFrom(expected)) {
            asAssert.setDescription(actual, expected, "{} is not assignable from {}");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsNotAssignableFrom(Object actual, Class<?> expected) {
        if (actual.getClass().isAssignableFrom(expected)) {
            asAssert.setDescription(actual, expected, "{} is assignable from {}");
            throw asAssert.getException();
        }
    }

}
