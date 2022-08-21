package com.github.ones1kk.asserts.core.array.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.array.ArraysInterface;
import com.github.ones1kk.asserts.core.feature.iterable.containable.ArrayContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.impl.ArrayContainableImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import org.apache.commons.lang3.ArrayUtils;

import java.util.function.Predicate;

public class Arrays<ACTUAL> extends Objects<ACTUAL> implements ArraysInterface<ACTUAL> {

    private final ArrayContainable<ACTUAL> containable = new ArrayContainableImpl<>();

    public Arrays(AsAssert<?> asAssert) {
        super(asAssert);
    }


    @Override
    public void assertIsEmpty(ACTUAL[] actual) {
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from("The actual is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(ACTUAL[] actual) {
        if (ArrayUtils.isEmpty(actual)) {
            handler.setDescription(handler.from("The actual is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL[] actual) {
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from("The actual is not null or not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(ACTUAL[] actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual does not contain of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(ACTUAL[] actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual is contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAll(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAny(ACTUAL[] actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(ACTUAL[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from("The actual does not contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(ACTUAL[] actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from("The actual is contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.setDescription(handler.from("The actual is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(ACTUAL[] actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.setDescription(handler.from("The actual is matched with all of expected"));
                throw handler.getException();
            }
        }
    }
}
