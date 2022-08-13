package com.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.ListContainable;

import java.util.List;

public class ListContainableImpl<ELEMENT> implements ListContainable<ELEMENT> {

    @Override
    public boolean contains(List<? extends ELEMENT> actual, ELEMENT expected) {
        return actual.contains(expected);
    }

    @Override
    public boolean doesNotContain(List<? extends ELEMENT> actual, ELEMENT expected) {
        return !(contains(actual, expected));
    }

    @Override
    public boolean containsAll(List<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (!actual.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNotAll(List<? extends ELEMENT> actual, ELEMENT... expected) {
        return !(containsAll(actual, expected));
    }

    @Override
    public boolean containsAny(List<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (actual.contains(value)) return true;
        }
        return false;
    }

    @Override
    public boolean doseNotContainAny(List<? extends ELEMENT> actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (actual.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNull(List<? extends ELEMENT> actual) {
        return actual.contains(null);
    }

    @Override
    public boolean doesNotContainNull(List<? extends ELEMENT> actual) {
        return !(containsNull(actual));
    }
}
