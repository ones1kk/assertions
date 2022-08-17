package com.github.ones1kk.asserts.core.feature.comparable;

public abstract class AbstractComparableCalculator<ACTUAL extends java.lang.Comparable<ACTUAL>> implements ComparableCalculatorInterface<ACTUAL> {

    protected boolean isPrimitive(ACTUAL actual, ACTUAL expected) {
        return actual.getClass().isPrimitive() ||
                expected.getClass().isPrimitive();
    }

}
