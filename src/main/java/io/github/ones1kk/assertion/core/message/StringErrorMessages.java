package io.github.ones1kk.assertion.core.message;

import io.github.ones1kk.assertion.core.description.Describable;
import io.github.ones1kk.assertion.core.description.impl.Description;

public final class StringErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private StringErrorMessages() {
    }

    public static String shouldMatches(String actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be matched {}", actual, expected);
    }
}
