package io.github.ones1kk.assertion.core.feature.compare;

public interface Comparable<SELF, ACTUAL> {

    SELF isLessThan(ACTUAL expected);

    SELF isLessThanOrEqualTo(ACTUAL expected);

    SELF isGreaterThan(ACTUAL expected);

    SELF isGreaterThanOrEqualTo(ACTUAL expected);

    SELF isBetween(ACTUAL start, ACTUAL end);

}
