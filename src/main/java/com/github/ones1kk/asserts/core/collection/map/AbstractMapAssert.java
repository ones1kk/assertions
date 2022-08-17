package com.github.ones1kk.asserts.core.collection.map;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.Map;
import java.util.function.Predicate;

public class AbstractMapAssert<SELF extends AbstractMapAssert<SELF, ACTUAL, K, V>, ACTUAL extends Map<K, V>, K, V> extends AbstractObjectAssert<SELF, ACTUAL> implements MapAssertInterface<SELF, ACTUAL, K, V> {

    private final MapsInterface<ACTUAL, K, V> maps;

    public AbstractMapAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.maps = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isEmpty() {
        maps.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        maps.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        maps.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(ACTUAL expected) {
        maps.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(ACTUAL expected) {
        maps.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(ACTUAL... expected) {
        maps.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(ACTUAL... expected) {
        maps.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        maps.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        maps.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        maps.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        maps.assertNoneMatch(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThan(ACTUAL expected) {
        maps.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(ACTUAL expected) {
        maps.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(ACTUAL expected) {
        maps.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(ACTUAL expected) {
        maps.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(ACTUAL start, ACTUAL end) {
        maps.assertIsBetween(actual, start, end);
        return self;
    }
}
