package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.model.ObjectAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.wrapper.impl.CharSequenceAssertWrapper;
import com.github.ones1kk.asserts.api.wrapper.impl.ObjectAssertWrapper;

public class Asserts {

    private Asserts() {
    }

    public static AbstractObjectAssert<?, Object> that(Object actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractCharSequenceAssert<?, CharSequence> that(CharSequence actual) {
        return AssertsForType.that(actual);
    }


}
