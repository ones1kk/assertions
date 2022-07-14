package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

public class ObjectAssert extends AbstractObjectAssert<ObjectAssert, Object> {

    public ObjectAssert(Object actual) {
        super(ObjectAssert.class, actual);
    }
}
