package com.github.ones1kk.asserts.core.lang.charsequence;

public interface CharSequenceAssertInterface<SELF, ACTUAL> {

    SELF isEmpty();

    SELF isNotEmpty();

    SELF isBlank();

    SELF isNotBlank();

    SELF isEqualToIgnoreCase(ACTUAL actual);

}
