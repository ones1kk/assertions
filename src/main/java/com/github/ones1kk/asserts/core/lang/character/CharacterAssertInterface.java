package com.github.ones1kk.asserts.core.lang.character;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;

public interface CharacterAssertInterface<SELF> extends ComparableAssert<SELF, Character> {

    SELF isLowerCase();

    SELF isNotLowerCase();

    SELF isUpperCase();

    SELF isNotUpperCase();

    SELF isLetter();

    SELF isNotLetter();

    SELF isDigit();

    SELF isNotDigit();

    SELF isWhitespace();

    SELF isNotWhitespace();

}
