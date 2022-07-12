package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.object.ObjectAssertWrapper;

public class Asserts {

    private Asserts() {
    }

    public static ObjectAssertWrapper that(Object actual) {
        return AssertsForType.that(actual);
    }


}
