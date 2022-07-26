package com.github.ones1kk.asserts.api.lang.bolean;

import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

public class AbstractBooleanAssert<SELF extends AbstractBooleanAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Boolean> implements BooleanAssertInterface<SELF> {

    private final BooleansInterface<Boolean> booleans;

    public AbstractBooleanAssert(Class<?> self, Boolean actual) {
        super(self, actual);
        this.booleans = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isFalse() {
        booleans.assertIsFalse(actual);
        return self;
    }

    @Override
    public SELF isTrue() {
        booleans.assertIsTrue(actual);
        return self;
    }
}
