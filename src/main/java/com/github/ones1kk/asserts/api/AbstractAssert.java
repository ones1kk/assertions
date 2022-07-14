package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.object.ObjectAssertInterface;

public abstract class AbstractAssert<SELF, ACTUAL> extends AsAssert<SELF> implements ObjectAssertInterface<SELF, ACTUAL> {

    protected AbstractAssert(Class<?> self) {
        super(self);
    }

}
