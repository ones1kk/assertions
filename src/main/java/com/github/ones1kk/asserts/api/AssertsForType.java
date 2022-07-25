package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.bte.AbstractByteAssert;
import com.github.ones1kk.asserts.api.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.duble.AbstractDoubleAssert;
import com.github.ones1kk.asserts.api.lang.flot.AbstractFloatAssert;
import com.github.ones1kk.asserts.api.lang.integer.AbstractIntegerAssert;
import com.github.ones1kk.asserts.api.lang.lng.AbstractLongAssert;
import com.github.ones1kk.asserts.api.lang.model.*;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.lang.shrt.AbstractShortAssert;
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

    public static AbstractLongAssert<?, Long> that(Long actual) {
        return new LongAssert(actual);
    }

    public static AbstractShortAssert<?, Short> that(Short actual) {
        return new ShortAssert(actual);
    }

    public static AbstractDoubleAssert<?, Double> that(Double actual) {
        return new DoubleAssert(actual);
    }

    public static AbstractFloatAssert<?, Float> that(Float actual) {
        return new FloatAssert(actual);
    }

    public static AbstractByteAssert<?, Byte> that(Byte actual) {
        return new ByteAssert(actual);
    }
}
