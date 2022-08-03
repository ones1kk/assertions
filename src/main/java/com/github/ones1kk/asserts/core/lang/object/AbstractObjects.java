package com.github.ones1kk.asserts.core.lang.object;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.description.DescriptionHandler;

public abstract class AbstractObjects<ACTUAL> implements ObjectsInterface<Object> {

    protected final AsAssert<?> asAssert;

    protected final DescriptionHandler handler;

    protected AbstractObjects(AsAssert<?> asAssert) {
        this.asAssert = asAssert;
        this.handler = asAssert.handler;
    }

}
