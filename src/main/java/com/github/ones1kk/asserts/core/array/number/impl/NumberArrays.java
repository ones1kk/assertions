package com.github.ones1kk.asserts.core.array.number.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.array.number.NumberArraysInterface;
import com.github.ones1kk.asserts.core.feature.iterable.containable.impl.NumberArrayContainable;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.function.Predicate;

public class NumberArrays extends Objects<Number[]> implements NumberArraysInterface<Number> {

    private final NumberArrayContainable containable = new NumberArrayContainable();

    public NumberArrays(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsMax(Number[] actual, Number expected) {
        if (!containable.isMax(actual, expected)) {
            handler.setDescription(handler.from(toString(actual), expected, "Max of {} is not {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsMin(Number[] actual, Number expected) {
        if (!containable.isMin(actual, expected)) {
            handler.setDescription(handler.from(toString(actual), expected, "Minimum of {} is not {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSum(Number[] actual, Number expected) {
        if (!containable.isSum(actual, expected)) {
            handler.setDescription(handler.from(toString(actual), expected, "Sum of {} is not {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEmpty(Number[] actual) {
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from(toString(actual), "{} is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Number[] actual) {
        if (ArrayUtils.isEmpty(actual)) {
            handler.setDescription(handler.from(toString(actual), "{} is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Number[] actual) {
        if (ArrayUtils.isNotEmpty(actual)) {
            handler.setDescription(handler.from(toString(actual), "{} is not null or not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContains(Number[] actual, Number expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(toString(actual), expected, "{} doesn't contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Number[] actual, Number expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(toString(actual), expected, "{} contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAll(Number[] actual, Number... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from(toString(actual), toString(expected), "{} doesn't contain any of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAny(Number[] actual, Number... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from(toString(actual), toString(expected), "{} doesn't contain any of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Number[] actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from(toString(actual), "{} doesn't contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Number[] actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from(toString(actual), "{} contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Number[] actual, Predicate<Number> expected) {
        for (Number number : actual) {
            if (!expected.test(number)) {
                handler.setDescription(handler.from(toString(actual), "{} is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Number[] actual, Predicate<Number> expected) {
        for (Number number : actual) {
            if (expected.test(number)) {
                handler.setDescription(handler.from(toString(actual), "{} is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    private String toString(Number[] actual) {
        return Arrays.deepToString(actual);
    }
}
