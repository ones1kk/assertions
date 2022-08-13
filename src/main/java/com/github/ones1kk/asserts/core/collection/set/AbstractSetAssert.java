package com.github.ones1kk.asserts.core.collection.set;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.Set;
import java.util.function.Predicate;

public class AbstractSetAssert<SELF extends AbstractSetAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Set<? extends ACTUAL>> implements SetAssertInterface<SELF, ACTUAL> {

    private final SetsInterfaces<ACTUAL> sets;

    public AbstractSetAssert(Class<?> self, Set<? extends ACTUAL> actual) {
        super(self, actual);
        this.sets = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isEmpty() {
        sets.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        sets.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        sets.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(ACTUAL expected) {
        sets.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(ACTUAL expected) {
        sets.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(ACTUAL... expected) {
        sets.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(ACTUAL... expected) {
        sets.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        sets.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        sets.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        sets.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        sets.assertNoneMatch(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThan(Set<? extends ACTUAL> expected) {
        sets.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Set<? extends ACTUAL> expected) {
        sets.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Set<? extends ACTUAL> expected) {
        sets.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Set<? extends ACTUAL> expected) {
        sets.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Set<? extends ACTUAL> start, Set<? extends ACTUAL> end) {
        sets.assertIsBetween(actual, start, end);
        return self;
    }
}
