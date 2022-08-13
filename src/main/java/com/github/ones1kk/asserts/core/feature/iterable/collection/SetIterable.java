package com.github.ones1kk.asserts.core.feature.iterable.collection;

import java.util.Set;
import java.util.function.Predicate;

public interface SetIterable<ELEMENT> {

    void assertIsEmpty(Set<? extends ELEMENT> actual);

    void assertIsNotEmpty(Set<? extends ELEMENT> actual);

    void assertIsNullOrEmpty(Set<? extends ELEMENT> actual);

    void assertContains(Set<? extends ELEMENT> actual, ELEMENT expected);

    void assertDoesNotContain(Set<? extends ELEMENT> actual, ELEMENT expected);

    void assertContainsAll(Set<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsAny(Set<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsNull(Set<? extends ELEMENT> actual);

    void assertDoesNotContainNull(Set<? extends ELEMENT> actual);

    void assertAllMatch(Set<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(Set<? extends ELEMENT> actual, Predicate<ELEMENT> expected);
}
