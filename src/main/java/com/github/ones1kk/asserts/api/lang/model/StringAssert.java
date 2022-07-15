package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.string.AbstractStringAssert;

public class StringAssert extends AbstractStringAssert<StringAssert, String> {

    public StringAssert(String actual) {
        super(StringAssert.class, actual);
    }
}
