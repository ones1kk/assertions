package com.github.ones1kk.asserts.core.clazz.enumtype.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.clazz.enumtype.EnumsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Enums<ACTUAL extends Enum<ACTUAL>> extends Objects<ACTUAL> implements EnumsInterface<ACTUAL> {

    public Enums(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsFrom(ACTUAL actual, String expected) {
        Field[] fields = actual.getClass().getFields();
        System.out.println(Arrays.deepToString(fields));
    }
}
