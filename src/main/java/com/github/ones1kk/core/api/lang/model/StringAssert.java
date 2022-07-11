package com.github.ones1kk.core.api.lang.model;

import com.github.ones1kk.core.api.lang.object.AbstractObjects;
import com.github.ones1kk.core.api.lang.string.AbstractStringAssert;

public class StringAssert extends AbstractStringAssert<StringAssert, String> {

    protected StringAssert(Class<?> self, String actual, AbstractObjects objects) {
        super(self, actual, objects);
    }
}
