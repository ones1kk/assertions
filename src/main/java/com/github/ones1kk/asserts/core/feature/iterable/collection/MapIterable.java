package com.github.ones1kk.asserts.core.feature.iterable.collection;

import java.util.Map;
import java.util.function.Predicate;

public interface MapIterable<ELEMENT extends Map<K, V>, K, V> {

    void assertIsEmpty(ELEMENT actual);

    void assertIsNotEmpty(ELEMENT actual);

    void assertIsNullOrEmpty(ELEMENT actual);

    void assertContains(ELEMENT actual, ELEMENT expected);

    void assertDoesNotContain(ELEMENT actual, ELEMENT expected);

    void assertContainsAll(ELEMENT actual, ELEMENT... expected);

    void assertContainsAny(ELEMENT actual, ELEMENT... expected);

    void assertContainsNull(ELEMENT actual);

    void assertDoesNotContainNull(ELEMENT actual);

    void assertAllMatch(ELEMENT actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(ELEMENT actual, Predicate<ELEMENT> expected);
}
