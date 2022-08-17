package com.github.ones1kk.asserts.core.feature.iterable.collection;

import java.util.Map;
import java.util.function.Predicate;

public interface MapIterable<ELEMENT extends Map<K, V>, K, V> {

    void assertIsEmpty(ELEMENT actual);

    void assertIsNotEmpty(ELEMENT actual);

    void assertIsNullOrEmpty(ELEMENT actual);

    void assertContainsKey(ELEMENT actual, K expected);

    void assertContainsAllKey(ELEMENT actual, Map<? extends K, ?> expected);

    void assertContainsValue(ELEMENT actual, V expected);

    void assertContainsAllValue(ELEMENT actual, Map<?, ? extends V> expected);

    void assertHasSizeOf(ELEMENT actual, int expected);

    void assertHasSameSizeOf(ELEMENT actual, Map<?, ?> expected);

    void assertDoesNotHaveSameSizeOf(ELEMENT actual, Map<?, ?> expected);
}
