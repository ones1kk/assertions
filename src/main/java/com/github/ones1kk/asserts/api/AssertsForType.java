package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.integer.AbstractIntegerAssert;
import com.github.ones1kk.asserts.api.lang.model.*;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.lang.string.AbstractStringAssert;

public class AssertsForType {

    public static AbstractObjectAssert<?, Object> that(Object actual) {
        return new ObjectAssert(actual);
    }

    public static AbstractCharSequenceAssert<?, CharSequence> that(CharSequence actual) {
        return new CharSequenceAssert(actual);
    }

    public static AbstractStringAssert<?> that(String actual) {
        return new StringAssert(actual);
    }

    public static AbstractCharacterAssert<?, Character> that(Character actual) {
        return new CharacterAssert(actual);
    }

    public static AbstractIntegerAssert<?, Integer> that(Integer actual) {
        return new IntegerAssert(actual);
    }
}
