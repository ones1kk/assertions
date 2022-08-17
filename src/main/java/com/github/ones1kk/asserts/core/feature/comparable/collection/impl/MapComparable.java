package com.github.ones1kk.asserts.core.feature.comparable.collection.impl;

import java.util.Map;

public class MapComparable<ELEMENT extends Map<K, V>, K, V> {

    public boolean isGraterThan(ELEMENT actual, ELEMENT expected) {
        return actual.size() > expected.size();
    }

    public boolean isLessThan(ELEMENT actual, ELEMENT expected) {
        return actual.size() < expected.size();
    }

    public boolean isLessThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.size() <= expected.size();
    }

    public boolean isGraterThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.size() >= expected.size();
    }

    public boolean hasSameSizeOf(ELEMENT actual, Map<?, ?> expected) {
        return actual.size() == expected.size();
    }

    public boolean doesNotHaveSameSizeOf(ELEMENT actual, Map<?, ?> expected) {
        return actual.size() != expected.size();
    }
}
