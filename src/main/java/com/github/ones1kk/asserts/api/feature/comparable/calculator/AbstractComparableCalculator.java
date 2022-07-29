package com.github.ones1kk.asserts.api.feature.comparable.calculator;

public abstract class AbstractComparableCalculator<ACTUAL extends Comparable<ACTUAL>> implements ComparableCalculatorInterface<ACTUAL> {

    protected boolean isPrimitive(ACTUAL actual, ACTUAL expected) {
        return actual.getClass().isPrimitive() &&
                expected.getClass().isPrimitive();
    }

}
