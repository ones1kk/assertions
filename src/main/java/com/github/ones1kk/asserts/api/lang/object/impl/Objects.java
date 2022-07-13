package com.github.ones1kk.asserts.api.lang.object.impl;

import com.github.ones1kk.asserts.api.lang.object.AbstractObjects;

public class Objects extends AbstractObjects {

    public Objects(String asDescription) {
        super(asDescription);
    }

    @Override
    public void assertIsNull(Object actual) {
        if (actual != null) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is not null", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsNotNull(Object actual) {
        if (actual == null) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is null", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsSameAs(Object actual, Object expected) {
        if (actual != expected) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is not same as {}", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotSameAs(Object actual, Object expected) {
        if (actual == expected) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is same as {}", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsEqualTo(Object actual, Object expected) {
        if (!actual.equals(expected)) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is not equal to {}", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotEqualTo(Object actual, Object expected) {
        if (actual.equals(expected)) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is equal to {}", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsAssignableFrom(Object actual, Class<?> expected) {
        if (!actual.getClass().isAssignableFrom(expected)) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is not assignable from {}", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotAssignableFrom(Object actual, Class<?> expected) {
        if (actual.getClass().isAssignableFrom(expected)) {
            description = printer.writeOutput(actual, null,
                    describable.as("{} is assignable from {}", actual, expected));
            throw getException();
        }
    }

}
