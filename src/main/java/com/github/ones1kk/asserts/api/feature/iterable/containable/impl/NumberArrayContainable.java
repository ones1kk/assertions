package com.github.ones1kk.asserts.api.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.api.feature.iterable.containable.Containable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NumberArrayContainable implements Containable<Number[], Number> {

    @Override
    public boolean contains(Number[] actual, Number expected) {
        return Arrays.asList(actual).contains(expected);
    }

    @Override
    public boolean doesNotContain(Number[] actual, Number expected) {
        return !(Arrays.asList(actual).contains(expected));
    }

    @Override
    public boolean containsAll(Number[] actual, Number... expected) {
        List<Number> numbers = Arrays.asList(actual);
        for (Number number : expected) {
            if (!numbers.contains(number)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsAny(Number[] actual, Number... expected) {
        for (Number number : expected) {
            if (Arrays.asList(actual).contains(number)) return true;
        }
        return false;
    }

    @Override
    public boolean doseNotContainAny(Number[] actual, Number... expected) {
        return !(new HashSet<>(Arrays.asList(actual))
                .containsAll(List.of(expected)));
    }

    @Override
    public boolean containsNull(Number[] actual) {
        return Arrays.asList(actual).contains(null);
    }

    @Override
    public boolean doesNotContainNull(Number[] actual) {
        return !(Arrays.asList(actual).contains(null));
    }

    @Override
    public boolean isMax(Number[] actual, Number expected) {
        double max = actual[0].doubleValue();
        for (Number value : actual) {
            if (value.doubleValue() > max)
                max = value.doubleValue();
        }
        return max == expected.doubleValue();
    }

    @Override
    public boolean isMin(Number[] actual, Number expected) {
        double min = actual[0].doubleValue();
        for (Number value : actual) {
            if (value.doubleValue() < min)
                min = value.doubleValue();
        }
        return min == expected.doubleValue();
    }

    @Override
    public boolean isSum(Number[] actual, Number expected) {
        double sum = 0;
        for (Number value : actual) {
            sum += (double) value;
        }
        return sum == expected.doubleValue();
    }
}
