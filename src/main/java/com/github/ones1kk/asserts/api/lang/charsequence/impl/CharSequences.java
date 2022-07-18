package com.github.ones1kk.asserts.api.lang.charsequence.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.lang.charsequence.CharSequencesInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;
import org.apache.commons.lang3.StringUtils;

public class CharSequences extends Objects<CharSequence> implements CharSequencesInterface<CharSequence> {

    public CharSequences(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(CharSequence actual) {
        if (!StringUtils.isEmpty(actual)) {
            handler.setDescription(handler.from(actual, "{} is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(CharSequence actual) {
        if (StringUtils.isEmpty(actual)) {
            handler.setDescription(handler.from(actual, "{} is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBlank(CharSequence actual) {
        if (StringUtils.isNotBlank(actual)) {
            handler.setDescription(handler.from(actual, "{} is not blank"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotBlank(CharSequence actual) {
        if (StringUtils.isBlank(actual)) {
            handler.setDescription(handler.from(actual, "{} is blank"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        if (!StringUtils.equalsIgnoreCase(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not equal as ignore case with {}"));
            throw handler.getException();
        }
    }
}
