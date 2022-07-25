package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.bte.AbstractByteAssert;
import com.github.ones1kk.asserts.api.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.duble.AbstractDoubleAssert;
import com.github.ones1kk.asserts.api.lang.flot.AbstractFloatAssert;
import com.github.ones1kk.asserts.api.lang.integer.AbstractIntegerAssert;
import com.github.ones1kk.asserts.api.lang.lng.AbstractLongAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.lang.shrt.AbstractShortAssert;
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

    public static AbstractShortAssert<?, Short> that(Short actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractDoubleAssert<?, Double> that(Double actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractFloatAssert<?, Float> that(Float actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractByteAssert<?, Byte> that(Byte actual) {
        return AssertsForType.that(actual);
    }
}
