package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.description.DescriptionHandler;

public abstract class AbstractObjects<ACTUAL> implements ObjectsInterface<Object> {

    protected final AsAssert<?> asAssert;

    protected final DescriptionHandler handler;

    protected AbstractObjects(ACTUAL actual, AsAssert<?> asAssert) {
        this.asAssert = asAssert;
        this.handler = asAssert.handler;
    }

}
