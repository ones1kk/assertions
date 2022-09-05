package com.github.ones1kk.asserts.core.clazz.enumtype;

public interface EnumsInterface<ACTUAL extends Enum<ACTUAL>> {

    void assertIsFrom(ACTUAL actual, String expected);
}
