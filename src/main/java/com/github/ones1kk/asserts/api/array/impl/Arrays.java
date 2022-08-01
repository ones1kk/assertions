package com.github.ones1kk.asserts.api.array.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.array.ArraysInterface;
import com.github.ones1kk.asserts.api.feature.iterable.containable.Containable;
import com.github.ones1kk.asserts.api.feature.iterable.containable.impl.ArrayContainable;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

import java.util.function.Predicate;

public class Arrays<ACTUAL, EXPECTED> extends Objects<ACTUAL> implements ArraysInterface<ACTUAL, EXPECTED> {

    private final Containable<ACTUAL, EXPECTED> containable = new ArrayContainable<>();

    public Arrays(AsAssert<?> asAssert) {
        super(asAssert);
    }


    @Override
    public void assertIsEmpty(ACTUAL actual) {
        if(((Object[]) actual).length != 0) {
            handler.setDescription(handler.from(toString((Object[]) actual), "{} is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(ACTUAL actual) {
        if(((Object[]) actual).length == 0) {
            handler.setDescription(handler.from(toString((Object[]) actual), "{} is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL actual) {
        if(((Object[]) actual).length != 0) {
            handler.setDescription(handler.from(toString((Object[]) actual), "{} is not null or not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(ACTUAL actual, EXPECTED expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(toString((Object[]) actual), expected, "{} doesn't contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(ACTUAL actual, EXPECTED expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(toString((Object[]) actual), expected, "{} contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAll(ACTUAL actual, EXPECTED... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from(toString((Object[]) actual), toString(expected), "{} doesn't contain any of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAny(ACTUAL actual, EXPECTED... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from(toString((Object[]) actual), toString(expected), "{} doesn't contain any of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(ACTUAL actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from(toString((Object[]) actual), "{} doesn't contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(ACTUAL actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from(toString((Object[]) actual), "{} contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(ACTUAL actual, Predicate<EXPECTED> expected) {
        for (Object value : (Object[]) actual) {
            if (!expected.test((EXPECTED) value)) {
                handler.setDescription(handler.from(toString((Object[]) actual), "{} is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(ACTUAL actual, Predicate<EXPECTED> expected) {
        for (Object value : (Object[]) actual) {
            if (expected.test((EXPECTED) value)) {
                handler.setDescription(handler.from(toString((Object[]) actual), "{} is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    private String toString(Object[] actual) {
        return java.util.Arrays.deepToString(actual);
    }
}
