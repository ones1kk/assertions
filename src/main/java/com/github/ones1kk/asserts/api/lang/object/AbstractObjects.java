package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.AsAssert;

public abstract class AbstractObjects<ACTUAL> implements ObjectsInterface<Object> {

    protected final AsAssert<?> asAssert;

    protected AbstractObjects(ACTUAL actual, AsAssert<?> asAssert) {
        this.asAssert = asAssert;
    }

}
