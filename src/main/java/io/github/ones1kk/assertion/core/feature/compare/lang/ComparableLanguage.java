package io.github.ones1kk.assertion.core.feature.compare.lang;

public interface ComparableLanguage<ACTUAL extends Comparable<ACTUAL>> {

    boolean isLessThan(ACTUAL actual, ACTUAL expected);

    boolean isLessThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    boolean isGreaterThan(ACTUAL actual, ACTUAL expected);

    boolean isGreaterThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    boolean is(ACTUAL actual, ACTUAL expected);

}
