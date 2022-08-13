package com.github.ones1kk.asserts.core.feature.comparable.calculator.collection.impl;

import com.github.ones1kk.asserts.core.feature.comparable.calculator.collection.CollectionComparableCalculator;

import java.util.Collection;

public class CollectionCalculator<ELEMENT> implements CollectionComparableCalculator<ELEMENT> {

    @Override
    public boolean isGraterThan(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected) {
        return actual.size() > expected.size();
    }

    @Override
    public boolean isLessThan(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected) {
        return actual.size() < expected.size();
    }

    @Override
    public boolean isLessThanOrEqualTo(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected) {
        return actual.size() <= expected.size();
    }

    @Override
    public boolean isGraterThanOrEqualTo(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected) {
        return actual.size() >= expected.size();
    }

    @Override
    public boolean is(Collection<? extends ELEMENT> actual, Collection<? extends ELEMENT> expected) {
        return actual.size() == expected.size();
    }
}
