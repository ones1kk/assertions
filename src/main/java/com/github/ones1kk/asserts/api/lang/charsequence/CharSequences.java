package com.github.ones1kk.asserts.api.lang.charsequence;

public interface CharSequences<TYPE> {

    void assertIsEmpty(TYPE actual);

    void assertIsNotEmpty(TYPE actual);

    void assertIsBlank(TYPE actual);

    void assertNotIsBlank(TYPE actual);

    void assertIsEqualToIgnoreCase(TYPE actual);

}
