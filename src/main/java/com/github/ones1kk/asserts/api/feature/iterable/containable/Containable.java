package com.github.ones1kk.asserts.api.feature.iterable.containable;

public interface Containable<ACTUAL, EXPECTED> {

    boolean contains(ACTUAL actual, EXPECTED expected);

    boolean doesNotContain(ACTUAL actual, EXPECTED expected);

    boolean containsAll(ACTUAL actual, EXPECTED... expected);

    boolean containsNotAll(ACTUAL actual, EXPECTED... expected);

    boolean containsAny(ACTUAL actual, EXPECTED... expected);

    boolean doseNotContainAny(ACTUAL actual, EXPECTED... expected);

    boolean containsNull(ACTUAL actual);

    boolean doesNotContainNull(ACTUAL actual);

}
