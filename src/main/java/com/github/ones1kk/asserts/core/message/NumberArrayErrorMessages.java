package com.github.ones1kk.asserts.core.message;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.description.impl.Description;

public final class NumberArrayErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private NumberArrayErrorMessages() {}

    public static String shouldBeMax(Number[] actual, Number expected) {
        return DESCRIBABLE.as("The given {} should be max of {}", expected, actual);
    }

    public static String shouldBeMin(Number[] actual, Number expected) {
        return DESCRIBABLE.as("The given {} should be min of {}", expected, actual);
    }

    public static String shouldBeSum(Number[] actual, Number expected) {
        return DESCRIBABLE.as("The given {} should be sum of {}", expected, actual);
    }
}
