package com.github.ones1kk.asserts.core.collection.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.collection.CollectionsInterface;
import com.github.ones1kk.asserts.core.feature.comparable.collection.CollectionComparable;
import com.github.ones1kk.asserts.core.feature.comparable.collection.impl.CollectionComparableImpl;
import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.CollectionContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl.CollectionContainableImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.function.Predicate;

public class Collections<ACTUAL> extends Objects<ACTUAL> implements CollectionsInterface<ACTUAL> {

    private final CollectionContainable<ACTUAL> containable = new CollectionContainableImpl<>();

    private final CollectionComparable<ACTUAL> calculator = new CollectionComparableImpl<>();

    public Collections(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(java.util.Collection<? extends ACTUAL> actual) {
        if (!actual.isEmpty()) {
            handler.setDescription(handler.from("The actual is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(java.util.Collection<? extends ACTUAL> actual) {
        if (actual.isEmpty()) {
            handler.setDescription(handler.from("The actual is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNullOrEmpty(java.util.Collection<? extends ACTUAL> actual) {
        if (actual != null) {
            if (!actual.isEmpty()) {
                handler.setDescription(handler.from("The actual is not null or not empty"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertContains(java.util.Collection<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.doesNotContain(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual does not contain of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContain(java.util.Collection<? extends ACTUAL> actual, ACTUAL expected) {
        if (containable.contains(actual, expected)) {
            handler.setDescription(handler.from(expected, "The actual is contains of {}"));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("all")
    public void assertContainsAll(java.util.Collection<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.containsNotAll(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    @SuppressWarnings("all")
    public void assertContainsAny(java.util.Collection<? extends ACTUAL> actual, ACTUAL... expected) {
        if (containable.doseNotContainAny(actual, expected)) {
            handler.setDescription(handler.from("The actual does not contain any of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsNull(java.util.Collection<? extends ACTUAL> actual) {
        if (containable.doesNotContainNull(actual)) {
            handler.setDescription(handler.from("The actual does not contain of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotContainNull(java.util.Collection<? extends ACTUAL> actual) {
        if (containable.containsNull(actual)) {
            handler.setDescription(handler.from("The actual is contains of null"));
            throw handler.getException();
        }
    }

    @Override
    public void assertAllMatch(java.util.Collection<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (!expected.test(value)) {
                handler.setDescription(handler.from("The actual is not all matched"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertNoneMatch(java.util.Collection<? extends ACTUAL> actual, Predicate<ACTUAL> expected) {
        for (ACTUAL value : actual) {
            if (expected.test(value)) {
                handler.setDescription(handler.from("The actual is matched with all of expected"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsLessThan(java.util.Collection<? extends ACTUAL> actual, java.util.Collection<? extends ACTUAL> expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(java.util.Collection<? extends ACTUAL> actual, java.util.Collection<? extends ACTUAL> expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not less than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(java.util.Collection<? extends ACTUAL> actual, java.util.Collection<? extends ACTUAL> expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(java.util.Collection<? extends ACTUAL> actual, java.util.Collection<? extends ACTUAL> expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from("size of actual is not greater than or equal to size of expected"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(java.util.Collection<? extends ACTUAL> actual, java.util.Collection<? extends ACTUAL> start, java.util.Collection<? extends ACTUAL> end) {
        if (calculator.isLessThan(actual, start) || calculator.isGraterThan(actual, end)) {
            String description = handler.getDescribable().as("size of actual is not between {} and {}", start.size(), end.size());
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
