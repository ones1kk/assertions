package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.AbstractObjectAssert;
import com.github.ones1kk.core.api.lang.model.ObjectAssert;

public class AssertsForType {

    public static AbstractObjectAssert<?, Object> that(Object actual) {
        return new ObjectAssert(ObjectAssert.class, actual);
    }
}
