package com.github.ones1kk.asserts.core.feature.iterable;

import java.util.List;
import java.util.function.Predicate;

public interface ListIterable<ELEMENT> {

    void assertIsEmpty(List<? extends ELEMENT> actual);

    void assertIsNotEmpty(List<? extends ELEMENT> actual);

    void assertIsNullOrEmpty(List<? extends ELEMENT> actual);

    void assertContains(List<? extends ELEMENT> actual, ELEMENT expected);

    void assertDoesNotContain(List<? extends ELEMENT> actual, ELEMENT expected);

    void assertContainsAll(List<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsAny(List<? extends ELEMENT> actual, ELEMENT... expected);

    void assertContainsNull(List<? extends ELEMENT> actual);

    void assertDoesNotContainNull(List<? extends ELEMENT> actual);

    void assertAllMatch(List<? extends ELEMENT> actual, Predicate<ELEMENT> expected);

    void assertNoneMatch(List<? extends ELEMENT> actual, Predicate<ELEMENT> expected);
    
}
