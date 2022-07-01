package com.github.ones1kk.core.api.lang.impl;

public interface Objects<TYPE> {

    void assertIsNull(TYPE actual);

    void assertIsNotNull(TYPE actual);

    void assertIsSameAs(TYPE actual, TYPE expected);

    void assertIsEqualTo(TYPE actual, TYPE expected);

    void assertIsNotEqualTo(TYPE actual, TYPE expected);

    void isAssignableFrom(Class<?> expected);

}
