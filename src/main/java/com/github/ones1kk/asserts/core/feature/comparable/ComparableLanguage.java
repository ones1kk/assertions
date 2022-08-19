package com.github.ones1kk.asserts.core.feature.comparable;

public interface ComparableLanguage<ELEMENT extends java.lang.Comparable<ELEMENT>> {

    boolean isLessThan(ELEMENT actual, ELEMENT expected);

    boolean isLessThanOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isGraterThan(ELEMENT actual, ELEMENT expected);

    boolean isGraterThanOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean is(ELEMENT actual, ELEMENT expected);

}
