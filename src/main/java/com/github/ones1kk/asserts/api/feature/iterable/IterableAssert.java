package com.github.ones1kk.asserts.api.feature.iterable;

import java.util.function.Predicate;

public interface IterableAssert<SELF, ACTUAL, EXPECTED> {

    SELF isEmpty();

    SELF isNotEmpty();

    SELF isNullOrEmpty();

    SELF contains(EXPECTED expected);

    SELF doesNotContain(EXPECTED expected);

    SELF containsAll(EXPECTED... expected);

    SELF containsAny(EXPECTED... expected);

    SELF containsNull();

    SELF doesNotContainNull();

    SELF allMatch(Predicate<EXPECTED> expected);

    SELF noneMatch(Predicate<EXPECTED> expected);
}
