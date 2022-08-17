package com.github.ones1kk.asserts.core.feature.comparable.collection.impl;

import com.github.ones1kk.asserts.core.feature.comparable.collection.CollectionComparable;

public class CollectionComparableImpl<ELEMENT> implements CollectionComparable<ELEMENT> {

    @Override
    public boolean isGraterThan(java.util.Collection<? extends ELEMENT> actual, java.util.Collection<? extends ELEMENT> expected) {
        return actual.size() > expected.size();
    }

    @Override
    public boolean isLessThan(java.util.Collection<? extends ELEMENT> actual, java.util.Collection<? extends ELEMENT> expected) {
        return actual.size() < expected.size();
    }

    @Override
    public boolean isLessThanOrEqualTo(java.util.Collection<? extends ELEMENT> actual, java.util.Collection<? extends ELEMENT> expected) {
        return actual.size() <= expected.size();
    }

    @Override
    public boolean isGraterThanOrEqualTo(java.util.Collection<? extends ELEMENT> actual, java.util.Collection<? extends ELEMENT> expected) {
        return actual.size() >= expected.size();
    }

    @Override
    public boolean is(java.util.Collection<? extends ELEMENT> actual, java.util.Collection<? extends ELEMENT> expected) {
        return actual.size() == expected.size();
    }
}
