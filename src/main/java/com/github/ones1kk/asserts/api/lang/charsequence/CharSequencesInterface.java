package com.github.ones1kk.asserts.api.lang.charsequence;

public interface CharSequencesInterface<ACTUAL> {

    void assertIsEmpty(ACTUAL actual);

    void assertIsNotEmpty(ACTUAL actual);

    void assertIsBlank(ACTUAL actual);

    void assertIsNotBlank(ACTUAL actual);

    void assertIsEqualToIgnoreCase(ACTUAL actual, ACTUAL expected);

}
