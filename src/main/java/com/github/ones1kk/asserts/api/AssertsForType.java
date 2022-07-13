package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.wrapper.impl.CharSequenceAssertWrapper;
import com.github.ones1kk.asserts.api.wrapper.impl.ObjectAssertWrapper;

public class AssertsForType {

    public static ObjectAssertWrapper that(Object actual) {
        return new ObjectAssertWrapper(actual);
    }

    public static CharSequenceAssertWrapper that(CharSequence actual) {
        return new CharSequenceAssertWrapper(actual);
    }
}
