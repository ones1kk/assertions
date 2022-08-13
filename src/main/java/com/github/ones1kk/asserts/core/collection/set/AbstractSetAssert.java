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
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        return self;
    }

    @Override
    public SELF contains(ACTUAL expected) {
        return self;
    }

    @Override
    public SELF doesNotContain(ACTUAL expected) {
        return self;
    }

    @Override
    public SELF containsAll(ACTUAL... expected) {
        return self;
    }

    @Override
    public SELF containsAny(ACTUAL... expected) {
        return self;
    }

    @Override
    public SELF containsNull() {
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        return self;
    }

    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        return self;
    }

    @Override
    public SELF isLessThan(Set<? extends ACTUAL> expected) {
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Set<? extends ACTUAL> expected) {
        return self;
    }

    @Override
    public SELF isGreaterThan(Set<? extends ACTUAL> expected) {
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Set<? extends ACTUAL> expected) {
        return self;
    }

    @Override
    public SELF isBetween(Set<? extends ACTUAL> start, Set<? extends ACTUAL> end) {
        return self;
    }
}
