package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.model.ObjectAssert;
import com.github.ones1kk.asserts.api.lang.object.ObjectAssertWrapper;

public class AssertsForType {

    private final static String INIT = "";

    public static ObjectAssertWrapper that(Object actual) {
        return new ObjectAssertWrapper(ObjectAssertWrapper.class, actual, INIT);
    }
}
