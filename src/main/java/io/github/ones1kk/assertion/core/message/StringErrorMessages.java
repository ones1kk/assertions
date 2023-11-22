package io.github.ones1kk.assertion.core.message;


import io.github.ones1kk.assertion.core.description.Description;

public final class StringErrorMessages {

    private StringErrorMessages() {
    }

    public static String shouldHasText(CharSequence actual) {
        return new Description("The given '{}' should has text.", actual).toString();
    }

    public static String shouldHasNotText(CharSequence actual) {
        return new Description("The given '{}' should not has text.", actual).toString();
    }

    public static String shouldHasLength(CharSequence actual) {
        return new Description("The given '{}' should be length of '{}'.", actual, actual.length()).toString();
    }

    public static String shouldHasSameLength(CharSequence actual, CharSequence expected) {
        return new Description("The given '{}' should has same length of '{}'.", actual, expected).toString();
    }

    public static String shouldMatches(String actual, Object expected) {
        return new Description("The given '{}' should be matched '{}'", actual, expected).toString();
    }
}
