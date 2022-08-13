package com.github.ones1kk.asserts.core.feature.iterable.containable.collection;

import java.util.Collection;

public interface CollectionContainable<ELEMENT> {

    boolean contains(Collection<? extends ELEMENT> actual, ELEMENT expected);

    boolean doesNotContain(Collection<? extends ELEMENT> actual, ELEMENT expected);

    boolean containsAll(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    boolean containsNotAll(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    boolean containsAny(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    boolean doseNotContainAny(Collection<? extends ELEMENT> actual, ELEMENT... expected);

    boolean containsNull(Collection<? extends ELEMENT> actual);

    boolean doesNotContainNull(Collection<? extends ELEMENT> actual);
}
