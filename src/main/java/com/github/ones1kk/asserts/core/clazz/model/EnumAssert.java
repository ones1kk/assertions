package com.github.ones1kk.asserts.core.clazz.model;

import com.github.ones1kk.asserts.core.clazz.enumtype.AbstractEnumAssert;

public class EnumAssert<ACTUAL extends Enum<ACTUAL>> extends AbstractEnumAssert<EnumAssert<ACTUAL>, ACTUAL> {

    public EnumAssert(ACTUAL actual) {
        super(EnumAssert.class, actual);
    }
}
