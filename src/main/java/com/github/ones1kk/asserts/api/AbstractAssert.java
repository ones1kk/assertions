package com.github.ones1kk.asserts.api;

public abstract class AbstractAssert<SELF extends AssertsInterface<SELF, ACTUAL>, ACTUAL> implements AssertsInterface<SELF, ACTUAL> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected AbstractAssert(Class<?> self, ACTUAL actual) {
        this.self = (SELF) self.cast(this);
        this.actual = actual;
    }


}
