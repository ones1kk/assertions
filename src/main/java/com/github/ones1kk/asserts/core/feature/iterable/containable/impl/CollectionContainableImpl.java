package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.CollectionContainable;

import java.util.Collection;

public class CollectionContainableImpl<ELEMENT> implements CollectionContainable<ELEMENT> {

    @Override
    public boolean contains(Collection<? extends ELEMENT> actual, ELEMENT expected) {
        return actual.contains(expected);
    }

    @Override
    public boolean doesNotContain(Collection<? extends ELEMENT> actual, ELEMENT expected) {
        return !(contains(actual, expected));
    }

    @Override
    public boolean containsAll(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (!actual.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNotAll(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        return !(containsAll(actual, expected));
    }

    @Override
    public boolean containsAny(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (actual.contains(value)) return true;
        }
        return false;
    }

    @Override
    public boolean doseNotContainAny(Collection<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (actual.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNull(Collection<? extends ELEMENT> actual) {
        return actual.contains(null);
    }

    @Override
    public boolean doesNotContainNull(Collection<? extends ELEMENT> actual) {
        return !(containsNull(actual));
    }
}
