package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.ListContainable;

import java.util.List;

public class ListContainableImpl<ELEMENT> implements ListContainable<ELEMENT> {

    @Override
    public boolean contains(List<? extends ELEMENT> actual, ELEMENT expected) {
        return false;
    }

    @Override
    public boolean doesNotContain(List<? extends ELEMENT> actual, ELEMENT expected) {
        return false;
    }

    @Override
    public boolean containsAll(List<? extends ELEMENT> actual, ELEMENT... expected) {
        return false;
    }

    @Override
    public boolean containsNotAll(List<? extends ELEMENT> actual, ELEMENT... expected) {
        return false;
    }

    @Override
    public boolean containsAny(List<? extends ELEMENT> actual, ELEMENT... expected) {
        return false;
    }

    @Override
    public boolean doseNotContainAny(List<? extends ELEMENT> actual, ELEMENT... expected) {
        return false;
    }

    @Override
    public boolean containsNull(List<? extends ELEMENT> actual) {
        return false;
    }

    @Override
    public boolean doesNotContainNull(List<? extends ELEMENT> actual) {
        return false;
    }
}
