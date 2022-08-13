package com.github.ones1kk.asserts.core.collection.list.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.collection.list.ListCalculator;
import com.github.ones1kk.asserts.core.collection.list.ListsInterface;
import com.github.ones1kk.asserts.core.feature.iterable.containable.ListContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.impl.ListContainableImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.List;
import java.util.function.Predicate;

public class Lists<ACTUAL> extends Objects<ACTUAL> implements ListsInterface<ACTUAL> {

    private final ListContainable<ACTUAL> containable = new ListContainableImpl<>();

    private final ListCalculator<ACTUAL> calculator = new ListCalculator<>();

    public Lists(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(List<? extends ACTUAL> actual) {
        if (!actual.isEmpty()) {
            handler.setDescription(handler.from("actual is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(List<? extends ACTUAL> actual) {
        if (actual.isEmpty()) {
            handler.setDescription(handler.from("actual is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(List<? extends ACTUAL> actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.setDescription(handler.from("actual is not null or not empty"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContains(List<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(expected, "actual doesn't contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(List<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(expected, "actual contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAll(List<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from("actual doesn't contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAny(List<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from("actual doesn't contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(List<? extends ACTUAL> actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from("actual doesn't contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(List<? extends ACTUAL> actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from("actual contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(List<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.setDescription(handler.from("actual is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(List<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.setDescription(handler.from("actual is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsLessThan(List<? extends ACTUAL> actual, List<? extends ACTUAL> expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(List<? extends ACTUAL> actual, List<? extends ACTUAL> expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(List<? extends ACTUAL> actual, List<? extends ACTUAL> expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(List<? extends ACTUAL> actual, List<? extends ACTUAL> expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(List<? extends ACTUAL> actual, List<? extends ACTUAL> start, List<? extends ACTUAL> end) {
        if (calculator.isLessThan(actual, start) || calculator.isGraterThan(actual, end)) {
            String description = handler.getDescribable().as("size of actual is not between {} and {}", start.size(), end.size());
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}