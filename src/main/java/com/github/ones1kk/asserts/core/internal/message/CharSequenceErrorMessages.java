package com.github.ones1kk.asserts.core.internal.message;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.description.impl.Description;

public final class CharSequenceErrorMessages {

    private static final Describable describable = new Description();

    public static String isEmpty(CharSequence actual, String placeholder) {
        return describable.as(placeholder, actual);
    }

    public static String isNotEmpty(CharSequence actual, String placeholder) {
        return describable.as(placeholder, actual);
    }

    public static String isBlank(CharSequence actual) {
        return describable.as("The given {} should be blank.", actual);
    }

    public static String isNotBlank(CharSequence actual) {
        return describable.as("The given {} should not be blank.", actual);
    }

    public static String isEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        return describable.as("The given {} should not be equal to {} ignore case.", actual, expected);
    }


}
