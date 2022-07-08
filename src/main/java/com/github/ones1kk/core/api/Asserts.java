package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.object.AsObject;

public class Asserts {

    private Asserts() {}

    public static AsObject that(Object actual) {
        return AssertsForType.that(actual);
    }


}
