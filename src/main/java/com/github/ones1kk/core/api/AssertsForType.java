package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.object.AsObject;

public class AssertsForType {

    public static AsObject that(Object actual) {
        return new AsObject(AsObject.class, actual);
    }

}
