package com.github.ones1kk.asserts.core.feature.comparable.collection;

import java.util.Collection;

public interface CollectionComparableCalculator<ELEMENT> {

    boolean isGraterThan(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected);

    boolean isLessThan(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected);

    boolean isLessThanOrEqualTo(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected);

    boolean isGraterThanOrEqualTo(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected);

    boolean is(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected);
}
