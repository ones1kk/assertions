package com.github.ones1kk.asserts.core.lang.object;

public interface ObjectsInterface<ACTUAL> {

    void assertIsNull(ACTUAL actual);

    void assertIsNotNull(ACTUAL actual);

    void assertIsSameAs(ACTUAL actual, ACTUAL expected);

    void assertIsNotSameAs(ACTUAL actual, ACTUAL expected);

    void assertIsEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsNotEqualTo(ACTUAL actual, ACTUAL expected);

    void assertIsAssignableFrom(ACTUAL actual, Class<?> expected);

    void assertIsNotAssignableFrom(ACTUAL actual, Class<?> expected);

    void assertIsInstanceOf(ACTUAL actual, Class<?> expected);

}
