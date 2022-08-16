package com.github.ones1kk.asserts.core.collection.map.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.collection.map.MapsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.util.Map;
import java.util.function.Predicate;

public class Maps<ACTUAL extends Map<K, V>, K, V> extends Objects<ACTUAL> implements MapsInterface<ACTUAL, K, V> {

    public Maps(AsAssert<?> asAssert) {
        super(asAssert);
    }


    @Override
    public void assertIsLessThan(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsLessThanOrEqualTo(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsGreaterThan(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsGreaterThanOrEqualTo(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsBetween(ACTUAL actual, ACTUAL start, ACTUAL end) {

    }

    @Override
    public void assertIsEmpty(ACTUAL actual) {

    }

    @Override
    public void assertIsNotEmpty(ACTUAL actual) {

    }

    @Override
    public void assertIsNullOrEmpty(ACTUAL actual) {

    }

    @Override
    public void assertContains(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertDoesNotContain(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertContainsAll(ACTUAL actual, ACTUAL... expected) {

    }

    @Override
    public void assertContainsAny(ACTUAL actual, ACTUAL... expected) {

    }

    @Override
    public void assertContainsNull(ACTUAL actual) {

    }

    @Override
    public void assertDoesNotContainNull(ACTUAL actual) {

    }

    @Override
    public void assertAllMatch(ACTUAL actual, Predicate<ACTUAL> expected) {

    }

    @Override
    public void assertNoneMatch(ACTUAL actual, Predicate<ACTUAL> expected) {

    }
}
