package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.wrapper.impl.CharSequenceAssertWrapper;
import com.github.ones1kk.asserts.api.wrapper.impl.ObjectAssertWrapper;

public class Asserts {

    private Asserts() {
    }

    public static ObjectAssertWrapper that(Object actual) {
        return AssertsForType.that(actual);
    }

    public static CharSequenceAssertWrapper that(CharSequence actual) {
        return AssertsForType.that(actual);
    }


}
