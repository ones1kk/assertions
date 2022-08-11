package com.github.ones1kk.asserts.core.collection.list;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.List;
import java.util.function.Predicate;

public class AbstractListAssert<SELF extends AbstractListAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, List<? extends ACTUAL>> implements ListAssertInterface<SELF, ACTUAL> {

    private final ListsInterface<ACTUAL> lists;

    public AbstractListAssert(Class<?> self, List<? extends ACTUAL> actual) {
        super(self, actual);
        this.lists = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isEmpty() {
        lists.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        lists.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        lists.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(ACTUAL expected) {
        lists.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(ACTUAL expected) {
        lists.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(ACTUAL... expected) {
        lists.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(ACTUAL... expected) {
        lists.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        lists.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        lists.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        lists.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        lists.assertNoneMatch(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThan(List<? extends ACTUAL> expected) {
        lists.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(List<? extends ACTUAL> expected) {
        lists.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(List<? extends ACTUAL> expected) {
        lists.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(List<? extends ACTUAL> expected) {
        lists.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(List<? extends ACTUAL> start, List<? extends ACTUAL> end) {
        lists.assertIsBetween(actual, start, end);
        return self;
    }
}
