package com.github.ones1kk.asserts.core.feature.iterable;

import java.util.function.Predicate;

public interface IterableAssert<SELF, ELEMENT> {

    SELF isEmpty();

    SELF isNotEmpty();

    SELF isNullOrEmpty();

    SELF contains(ELEMENT expected);

    SELF doesNotContain(ELEMENT expected);

    @SuppressWarnings("all")
    SELF containsAll(ELEMENT... expected);

    @SuppressWarnings("all")
    SELF containsAny(ELEMENT... expected);

    SELF containsNull();

    SELF doesNotContainNull();

    SELF allMatch(Predicate<ELEMENT> expected);

    SELF noneMatch(Predicate<ELEMENT> expected);
}
