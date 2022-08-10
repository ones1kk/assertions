package com.github.ones1kk.asserts.core.feature.iterable.containable;

import java.util.List;

public interface ListContainable<ELEMENT> {

    boolean contains(List<? extends ELEMENT> actual, ELEMENT expected);

    boolean doesNotContain(List<? extends ELEMENT> actual, ELEMENT expected);

    boolean containsAll(List<? extends ELEMENT> actual, ELEMENT... expected);

    boolean containsNotAll(List<? extends ELEMENT> actual, ELEMENT... expected);

    boolean containsAny(List<? extends ELEMENT> actual, ELEMENT... expected);

    boolean doseNotContainAny(List<? extends ELEMENT> actual, ELEMENT... expected);

    boolean containsNull(List<? extends ELEMENT> actual);

    boolean doesNotContainNull(List<? extends ELEMENT> actual);
}
