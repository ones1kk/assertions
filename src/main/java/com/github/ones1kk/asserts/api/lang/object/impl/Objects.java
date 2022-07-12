package com.github.ones1kk.asserts.api.lang.object.impl;

import com.github.ones1kk.asserts.api.lang.object.AbstractObjects;

public class Objects extends AbstractObjects {

    public Objects(String asDescription) {
        super(asDescription);
    }

    @Override
    public void assertIsNull(Object actual) {
        if (actual != null) {
            description = describable.print(actual, null,
                    String.format("%s is not null", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsNotNull(Object actual) {
        if (actual == null) {
            description = describable.print(actual, null,
                    String.format("%s is null", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsSameAs(Object actual, Object expected) {
        if (actual != expected) {
            description = describable.print(actual, null,
                    String.format("%s is not same as %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotSameAs(Object actual, Object expected) {
        if (actual == expected) {
            description = describable.print(actual, null,
                    String.format("%s is same as %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsEqualTo(Object actual, Object expected) {
        if (!actual.equals(expected)) {
            description = describable.print(actual, null,
                    String.format("%s is not equal to %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotEqualTo(Object actual, Object expected) {
        if (actual.equals(expected)) {
            description = describable.print(actual, null,
                    String.format("%s is equal to %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsAssignableFrom(Object actual, Class<?> expected) {
        if (!actual.getClass().isAssignableFrom(expected)) {
            description = describable.print(actual, null,
                    String.format("%s is not assignable from %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotAssignableFrom(Object actual, Class<?> expected) {
        if (actual.getClass().isAssignableFrom(expected)) {
            description = describable.print(actual, null,
                    String.format("%s is assignable from %s", actual, expected));
            throw getException();
        }
    }

}
