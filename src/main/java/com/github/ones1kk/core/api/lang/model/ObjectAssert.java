package com.github.ones1kk.core.api.lang.model;

import com.github.ones1kk.core.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.core.api.lang.object.impl.ObjectsImpl;

public class ObjectAssert extends AbstractObjectAssert<ObjectAssert, Object> {

    public ObjectAssert(Class<?> self, Object actual, ObjectsImpl objects) {
        super(self, actual, objects);
    }
}
