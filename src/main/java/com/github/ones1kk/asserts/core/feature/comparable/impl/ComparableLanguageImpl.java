package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableLanguage;

public class ComparableLanguageImpl<ELEMENT extends Comparable<ELEMENT>> implements ComparableLanguage<ELEMENT> {

    @Override
    public boolean isLessThan(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGraterThan(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isGraterThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(ELEMENT actual, ELEMENT expected) {
        return actual.equals(expected);
    }
}
