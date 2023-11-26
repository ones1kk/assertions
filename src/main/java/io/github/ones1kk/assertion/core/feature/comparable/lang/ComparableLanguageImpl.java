package io.github.ones1kk.assertion.core.feature.comparable.lang;

public class ComparableLanguageImpl<ACTUAL extends Comparable<ACTUAL>> implements ComparableLanguage<ACTUAL> {

    @Override
    public boolean isLessThan(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGreaterThan(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isGreaterThanOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(ACTUAL actual, ACTUAL expected) {
        return actual.equals(expected);
    }

}
