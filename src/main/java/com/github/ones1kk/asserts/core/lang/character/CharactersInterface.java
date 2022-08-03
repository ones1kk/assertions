package com.github.ones1kk.asserts.core.lang.character;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;

public interface CharactersInterface<ACTUAL> extends Comparable<ACTUAL> {

    void assertIsLowerCase(ACTUAL actual);

    void assertIsNotLowerCase(ACTUAL actual);

    void assertIsUpperCase(ACTUAL actual);

    void assertIsNotUpperCase(ACTUAL actual);

    void assertIsLetter(ACTUAL actual);

    void assertIsNotLetter(ACTUAL actual);

    void assertIsDigit(ACTUAL actual);

    void assertIsNotDigit(ACTUAL actual);

    void assertIsWhitespace(ACTUAL actual);

    void assertIsNotWhitespace(ACTUAL actual);

}
