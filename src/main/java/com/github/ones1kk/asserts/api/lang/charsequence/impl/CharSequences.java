package com.github.ones1kk.asserts.api.lang.charsequence.impl;

import com.github.ones1kk.asserts.api.lang.charsequence.CharSequencesInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;
import org.apache.commons.lang3.StringUtils;

public class CharSequences extends Objects implements CharSequencesInterface<CharSequence> {

    public CharSequences(String asDescription) {
        super(asDescription);
    }

    @Override
    public void assertIsEmpty(CharSequence actual) {
        if (!StringUtils.isEmpty(actual)) {
            description = printer.writeOutput(actual, describable.as("{} is not empty", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsNotEmpty(CharSequence actual) {
        if (StringUtils.isEmpty(actual)) {
            description = printer.writeOutput(actual, describable.as("{} is empty", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsBlank(CharSequence actual) {
        if (StringUtils.isNotBlank(actual)) {
            description = printer.writeOutput(actual, describable.as("{} is not blank", actual));
        }
        throw getException();
    }

    @Override
    public void assertIsNotBlank(CharSequence actual) {
        if (StringUtils.isBlank(actual)) {
            description = printer.writeOutput(actual, describable.as("{} is blank", actual));
        }
        throw getException();
    }

    @Override
    public void assertIsEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        if (StringUtils.equalsIgnoreCase(actual, expected)) {
            description = printer.writeOutput(actual, describable.as("{} is not equal as ignore case", actual));
        }
        throw getException();
    }
}
