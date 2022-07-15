package com.github.ones1kk.asserts.api.lang.string;

import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;

public class AbstractStringAssert<SELF extends AbstractStringAssert<SELF, ACTUAL>, ACTUAL extends String> extends AbstractCharSequenceAssert<SELF, String> implements StringAssertInterface<SELF, String> {

    private final StringsInterface<String> strings;

    public AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
        this.strings = assertFactory.createAssert(actual, this);
    }


    @Override
    public SELF isLessThan(String actual, String expected) {
        strings.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(String actual, String expected) {
        strings.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(String actual, String expected) {
        strings.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(String actual, String expected) {
        strings.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(String actual, String start, String end) {
        strings.assertIsBetween(actual, start, end);
        return self;
    }
}
