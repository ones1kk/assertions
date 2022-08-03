package com.github.ones1kk.asserts.core.feature.comparable.calculator;

public interface ComparableCalculatorInterface<ACTUAL extends java.lang.Comparable<ACTUAL>> {

    boolean isGraterThan(ACTUAL actual, ACTUAL expected);

    boolean isLessThan(ACTUAL actual, ACTUAL expected);

    boolean isLessThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    boolean isGraterThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    boolean is(ACTUAL actual, ACTUAL expected);

}
