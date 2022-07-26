package com.github.ones1kk.asserts.api.feature.iterable;

import java.util.function.Predicate;

public interface Iterable<ACTUAL, EXPECTED> {

    void assertIsEmpty(ACTUAL actual);

    void assertIsNotEmpty(ACTUAL actual);

    void assertIsNullOrEmpty(ACTUAL actual);

    void assertContains(ACTUAL actual, EXPECTED expected);

    void assertDoesNotContain(ACTUAL actual, EXPECTED expected);

    void assertContainsAll(ACTUAL actual, EXPECTED... expected);

    void assertContainsAny(ACTUAL actual, EXPECTED... expected);

    void assertContainsNull(ACTUAL actual);

    void assertDoesNotContainNull(ACTUAL actual);

    void assertAllMatch(ACTUAL actual, Predicate<EXPECTED> expected);

    void assertNoneMatch(ACTUAL actual, Predicate<EXPECTED> expected);

}
