package io.github.ones1kk.assertion.core.message;


import io.github.ones1kk.assertion.core.description.Description;
import org.apache.commons.lang3.ArrayUtils;

public final class NumberArrayErrorMessage {

    private NumberArrayErrorMessage() {
    }

    public static String shouldBeMax(Number[] actual, Number expected) {
        return new Description("The given '{}' should be max of '{}'", expected, ArrayUtils.toString(actual)).toString();
    }

    public static String shouldBeMin(Number[] actual, Number expected) {
        return new Description("The given '{}' should be min of '{}'", expected, ArrayUtils.toString(actual)).toString();
    }

    public static String shouldBeSum(Number[] actual, Number expected) {
        return new Description("The given '{}' should be sum of '{}'", expected, ArrayUtils.toString(actual)).toString();
    }
}
