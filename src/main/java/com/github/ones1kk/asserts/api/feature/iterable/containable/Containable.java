package com.github.ones1kk.asserts.api.feature.iterable.containable;

public interface Containable<ACTUAL, EXPECTED> {

    boolean contains(ACTUAL actual, EXPECTED expected);

    boolean doesNotContain(ACTUAL actual, EXPECTED expected);

    boolean containsAll(ACTUAL actual, EXPECTED... expected);

    boolean containsAny(ACTUAL actual, EXPECTED... expected);

    boolean containsNull(ACTUAL actual);

    boolean doesNotContainNull(ACTUAL actual);

    boolean doseNotContainAny(ACTUAL actual, EXPECTED... expected);

    boolean isMax(ACTUAL actual, EXPECTED expected);

    boolean isMin(ACTUAL actual, EXPECTED expected);

    boolean isSum(ACTUAL actual, EXPECTED expected);

}
