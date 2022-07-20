package com.github.ones1kk.asserts.api.lang.object;

public interface ObjectsInterface<TYPE> {

    void assertIsNull(TYPE actual);

    void assertIsNotNull(TYPE actual);

    void assertIsSameAs(TYPE actual, TYPE expected);

    void assertIsNotSameAs(TYPE actual, TYPE expected);

    void assertIsEqualTo(TYPE actual, TYPE expected);

    void assertIsNotEqualTo(TYPE actual, TYPE expected);

    void assertIsAssignableFrom(TYPE actual, Class<?> expected);

    void assertIsNotAssignableFrom(TYPE actual, Class<?> expected);

    void assertIsInstanceOf(TYPE actual, Class<?> expected);

}
