package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.integer.AbstractIntegerAssert;
import com.github.ones1kk.asserts.api.lang.lng.AbstractLongAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.lang.string.AbstractStringAssert;

public class Asserts {

    private Asserts() {
    }

    public static AbstractObjectAssert<?, Object> that(Object actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractCharSequenceAssert<?, CharSequence> that(CharSequence actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractStringAssert<?> that(String actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractCharacterAssert<?, Character> that(Character actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractIntegerAssert<?, Integer> that(Integer actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractLongAssert<?, Long> that(Long actual) {
        return AssertsForType.that(actual);
    }
}
