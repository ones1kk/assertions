package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.Containable;

import java.util.Arrays;
import java.util.List;

public class ArrayContainable<ELEMENT> implements Containable<ELEMENT> {

    @Override
    public boolean contains(ELEMENT[] actual, ELEMENT expected) {
        return Arrays.asList(actual).contains(expected);
    }

    @Override
    public boolean doesNotContain(ELEMENT[] actual, ELEMENT expected) {
        return !(contains(actual, expected));
    }

    @Override
    public boolean containsAll(ELEMENT[] actual, ELEMENT... expected) {
        List<ELEMENT> actuals = Arrays.asList(actual);
        for (ELEMENT value : expected) {
            if (!actuals.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNotAll(ELEMENT[] actual, ELEMENT... expected) {
        return !(containsAll(actual, expected));
    }

    @Override
    public boolean containsAny(ELEMENT[] actual, ELEMENT... expected) {
        for (ELEMENT value : expected) {
            if (Arrays.asList(actual).contains(value)) return true;
        }
        return false;
    }

    @Override
    public boolean doseNotContainAny(ELEMENT[] actual, ELEMENT... expected) {
        List<ELEMENT> actuals = Arrays.asList(actual);
        for (ELEMENT value : expected) {
            if (actuals.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNull(ELEMENT[] actual) {
        return Arrays.asList(actual).contains(null);
    }

    @Override
    public boolean doesNotContainNull(ELEMENT[] actual) {
        return !(Arrays.asList(actual).contains(null));
    }

}
