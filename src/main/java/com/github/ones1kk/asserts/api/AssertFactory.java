package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

public final class AssertFactory {

    public Objects createAssert(Object value, String asDescription) {
        return new Objects(asDescription);
    }
}
