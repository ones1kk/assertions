package com.github.ones1kk.asserts.api.feature.iterable.containable;

public interface Containable<ELEMENT> {

    boolean contains(ELEMENT[] actual, ELEMENT expected);

    boolean doesNotContain(ELEMENT[] actual, ELEMENT expected);

    boolean containsAll(ELEMENT[] actual, ELEMENT... expected);

    boolean containsNotAll(ELEMENT[] actual, ELEMENT... expected);

    boolean containsAny(ELEMENT[] actual, ELEMENT... expected);

    boolean doseNotContainAny(ELEMENT[] actual, ELEMENT... expected);

    boolean containsNull(ELEMENT[] actual);

    boolean doesNotContainNull(ELEMENT[] actual);

}
