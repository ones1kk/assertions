package com.github.ones1kk.asserts.api.lang.charsequence;

public interface CharSequencesInterface<TYPE> {

    void assertIsEmpty(TYPE actual);

    void assertIsNotEmpty(TYPE actual);

    void assertIsBlank(TYPE actual);

    void assertIsNotBlank(TYPE actual);

    void assertIsEqualToIgnoreCase(TYPE actual, TYPE expected);

}
