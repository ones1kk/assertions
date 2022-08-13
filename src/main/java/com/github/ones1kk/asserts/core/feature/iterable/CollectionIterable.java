package com.github.ones1kk.asserts.core.feature.iterable;

import java.util.Collection;
import java.util.function.Predicate;

public interface CollectionIterable<ELEMENT> {

    void assertIsEmpty(Collection<? extends ELEMENT> actual);

    void assertIsNotEmpty(Collection<? extends ELEMENT> actual);

    void assertIsNullOrEmpty(Collection<? extends ELEMENT> actual);

    void assertContains(Collection<? extends ELEMENT> actual, ELEMENT expected);

    void assertDoesNotContain(Collection<? extends ELEMENT> actual, ELEMENT expected);

    void assertContainsAll(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsAny(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsNull(Collection<? extends ELEMENT> actual);

    void assertDoesNotContainNull(Collection<? extends ELEMENT> actual);

    void assertAllMatch(Collection<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(Collection<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

}