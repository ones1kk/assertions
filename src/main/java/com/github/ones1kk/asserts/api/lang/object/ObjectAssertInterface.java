package com.github.ones1kk.asserts.api.lang.object;

public interface ObjectAssertInterface<SELF, ACTUAL> {

    SELF isNull();

    SELF isNotNull();

    SELF isSameAs(ACTUAL expected);

    SELF isNotSameAs(ACTUAL expected);

    SELF isEqualTo(ACTUAL expected);

    SELF isNotEqualTo(ACTUAL expected);

    SELF isAssignableFrom(Class<?> expected);

    SELF isNotAssignableFrom(Class<?> expected);

    SELF isInstanceOf(Class<?> expected);
}
