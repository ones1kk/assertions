package io.github.ones1kk.assertion.core.message;

import io.github.ones1kk.assertion.core.description.Description;

public class ComparableErrorMessages {

    private ComparableErrorMessages() {
    }

    public static String shouldBeLessThan(Object actual, Object expected) {
        return new Description("The given '{}' should be less than '{}'.", actual, expected).toString();
    }

    public static String shouldBeLessThanOrEqualTo(Object actual, Object expected) {
        return new Description("The given '{}' should be less than or equal to '{}'.", actual, expected).toString();
    }

    public static String shouldBeGreaterThan(Object actual, Object expected) {
        return new Description("The given '{}' should be greater than '{}'.", actual, expected).toString();
    }

    public static String shouldBeGreaterThanOrEqualTo(Object actual, Object expected) {
        return new Description("The given '{}' should be greater than or equal to '{}'.", actual, expected).toString();
    }

    public static String shouldBeBetween(Object actual, Object start, Object end) {
        return new Description("The given '{}' should be between '{}' and '{}'.", actual, start, end).toString();
    }
}
