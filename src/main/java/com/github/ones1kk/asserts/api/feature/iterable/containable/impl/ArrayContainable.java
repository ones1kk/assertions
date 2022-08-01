package com.github.ones1kk.asserts.api.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.api.feature.iterable.containable.Containable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayContainable<ACTUAL, EXPECTED> implements Containable<ACTUAL, EXPECTED> {

    @Override
    public boolean contains(ACTUAL actual, EXPECTED expected) {
        return Arrays.asList(actual).contains(expected);
    }

    @Override
    public boolean doesNotContain(ACTUAL actual, EXPECTED expected) {
        return !(Arrays.asList(actual).contains(expected));
    }

    @Override
    public boolean containsAll(ACTUAL actual, EXPECTED... expected) {
        List<ACTUAL> actuals = Arrays.asList(actual);
        for (EXPECTED value : expected) {
            if (!actuals.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNotAll(ACTUAL actual, EXPECTED... expected) {
        return !(new HashSet<>(Arrays.asList(actual))
                .containsAll(List.of(expected)));
    }

    @Override
    public boolean containsAny(ACTUAL actual, EXPECTED... expected) {
        for (EXPECTED value : expected) {
            if (Arrays.asList(actual).contains(value)) return true;
        }
        return false;
    }

    @Override
    public boolean doseNotContainAny(ACTUAL actual, EXPECTED... expected) {
        List<ACTUAL> actuals = Arrays.asList(actual);
        for (EXPECTED value : expected) {
            if (actuals.contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsNull(ACTUAL actual) {
        return Arrays.asList(actual).contains(null);
    }

    @Override
    public boolean doesNotContainNull(ACTUAL actual) {
        return !(Arrays.asList(actual).contains(null));
    }

}
