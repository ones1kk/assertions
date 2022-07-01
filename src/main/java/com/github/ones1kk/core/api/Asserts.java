package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.AbstractObjectAssert;

public class Asserts {

    private Asserts() {
    }

    public static AbstractObjectAssert<?, Object> that(Object actual) {
        return AssertsForType.that(actual);
    }

}
