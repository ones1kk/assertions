package com.github.ones1kk.asserts.api.lang.charsequence.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.lang.charsequence.CharSequencesInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;
import org.apache.commons.lang3.StringUtils;

public class CharSequences extends Objects<CharSequence> implements CharSequencesInterface<CharSequence> {

    public CharSequences(CharSequence actual, AsAssert<?> asAssert) {
        super(actual, asAssert);
    }

    @Override
    public void assertIsEmpty(CharSequence actual) {
        if (!StringUtils.isEmpty(actual)) {
            asAssert.setDescription(actual, "{} is not empty");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(CharSequence actual) {
        if (StringUtils.isEmpty(actual)) {
            asAssert.setDescription(actual, "{} is empty");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsBlank(CharSequence actual) {
        if (StringUtils.isNotBlank(actual)) {
            asAssert.setDescription(actual, "{} is not blank");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsNotBlank(CharSequence actual) {
        if (StringUtils.isBlank(actual)) {
            asAssert.setDescription(actual, "{} is blank");
            throw asAssert.getException();
        }
    }

    @Override
    public void assertIsEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        if (!StringUtils.equalsIgnoreCase(actual, expected)) {
            asAssert.setDescription(actual, expected, "{} is not equal as ignore case with {}");
            throw asAssert.getException();
        }
    }
}
