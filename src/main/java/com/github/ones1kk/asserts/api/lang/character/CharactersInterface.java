package com.github.ones1kk.asserts.api.lang.character;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;

public interface CharactersInterface<TYPE> extends Comparable<TYPE> {

    void assertIsLowerCase(TYPE actual);

    void assertIsNotLowerCase(TYPE actual);

    void assertIsUpperCase(TYPE actual);

    void assertIsNotUpperCase(TYPE actual);

    void assertIsLetter(TYPE actual);

    void assertIsNotLetter(TYPE actual);

    void assertIsDigit(TYPE actual);

    void assertIsNotDigit(TYPE actual);

    void assertIsWhitespace(TYPE actual);

    void assertIsNotWhitespace(TYPE actual);

}
