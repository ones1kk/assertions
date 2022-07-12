package com.github.ones1kk.core.api.lang.model;

import com.github.ones1kk.core.api.lang.object.impl.ObjectsImpl;
import com.github.ones1kk.core.api.lang.string.AbstractStringAssert;

public class StringAssert extends AbstractStringAssert<StringAssert, String> {

    protected StringAssert(Class<?> self, String actual, ObjectsImpl objects) {
        super(self, actual, objects);
    }
}
