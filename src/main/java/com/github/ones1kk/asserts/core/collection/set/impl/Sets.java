package com.github.ones1kk.asserts.core.collection.set.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.collection.set.SetsInterfaces;
import com.github.ones1kk.asserts.core.feature.comparable.collection.CollectionComparableCalculator;
import com.github.ones1kk.asserts.core.feature.comparable.collection.impl.CollectionCalculator;
import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.CollectionContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl.CollectionContainableImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.Set;
import java.util.function.Predicate;

public class Sets<ACTUAL> extends Objects<ACTUAL> implements SetsInterfaces<ACTUAL> {

    private final CollectionContainable<ACTUAL> containable = new CollectionContainableImpl<>();

    private final CollectionComparableCalculator<ACTUAL> calculator = new CollectionCalculator<>();

    public Sets(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(Set<? extends ACTUAL> actual) {
        if (!actual.isEmpty()) {
            handler.setDescription(handler.from("actual is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(Set<? extends ACTUAL> actual) {
        if (actual.isEmpty()) {
            handler.setDescription(handler.from("actual is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(Set<? extends ACTUAL> actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.setDescription(handler.from("actual is not null or not empty"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContains(Set<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(expected, "actual does not contain of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(Set<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(expected, "actual contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAll(Set<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from("actual doesn't contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsAny(Set<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from("actual doesn't contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(Set<? extends ACTUAL> actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from("actual doesn't contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(Set<? extends ACTUAL> actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from("actual contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(Set<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.setDescription(handler.from("actual is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(Set<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.setDescription(handler.from("actual is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsLessThan(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Set<? extends ACTUAL> actual, Set<? extends ACTUAL> start, Set<? extends ACTUAL> end) {
        if (calculator.isLessThan(actual, start) || calculator.isGraterThan(actual, end)) {
            String description = handler.getDescribable().as("size of actual is not between {} and {}", start.size(), end.size());
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
