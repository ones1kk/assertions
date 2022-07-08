package com.github.ones1kk.core.api.lang.string;

import com.github.ones1kk.core.api.lang.object.AbstractObjectAssert;

public class AbstractStringAssert<SELF extends AbstractObjectAssert<SELF, String>, ACTUAL> extends AbstractObjectAssert<SELF, String> {

    protected AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
    }

}
