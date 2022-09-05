package com.github.ones1kk.asserts.core.clazz.enumtype;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractEnumAssert<SELF extends AbstractEnumAssert<SELF, ACTUAL>, ACTUAL extends Enum<ACTUAL>> extends AbstractObjectAssert<SELF, ACTUAL> implements EnumAssertInterface<SELF> {

    private final EnumsInterface<ACTUAL> enums;

    public AbstractEnumAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.enums = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isFrom(String expected) {
        this.enums.assertIsFrom(actual, expected);
        return self;
    }
}
