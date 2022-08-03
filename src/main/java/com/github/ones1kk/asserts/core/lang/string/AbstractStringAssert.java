package com.github.ones1kk.asserts.core.lang.string;

import com.github.ones1kk.asserts.core.lang.charsequence.AbstractCharSequenceAssert;

public class AbstractStringAssert<SELF extends AbstractStringAssert<SELF>> extends AbstractCharSequenceAssert<SELF, String> implements StringAssertInterface<SELF, String> {

    private final StringsInterface<String> strings;

    public AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
        this.strings = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isLessThan(String expected) {
        strings.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(String expected) {
        strings.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(String expected) {
        strings.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(String expected) {
        strings.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(String start, String end) {
        strings.assertIsBetween(actual, start, end);
        return self;
    }
}
