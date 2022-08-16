package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.array.AbstractArrayAssert;
import com.github.ones1kk.asserts.core.array.number.AbstractNumberArrayAssert;
import com.github.ones1kk.asserts.core.collection.AbstractCollectionAssert;
import com.github.ones1kk.asserts.core.collection.list.AbstractListAssert;
import com.github.ones1kk.asserts.core.collection.map.AbstractMapAssert;
import com.github.ones1kk.asserts.core.collection.map.impl.Maps;
import com.github.ones1kk.asserts.core.collection.set.AbstractSetAssert;
import com.github.ones1kk.asserts.core.file.AbstractFileAssert;
import com.github.ones1kk.asserts.core.lang.bolean.AbstractBooleanAssert;
import com.github.ones1kk.asserts.core.lang.bte.AbstractByteAssert;
import com.github.ones1kk.asserts.core.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.core.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.core.lang.duble.AbstractDoubleAssert;
import com.github.ones1kk.asserts.core.lang.flot.AbstractFloatAssert;
import com.github.ones1kk.asserts.core.lang.integer.AbstractIntegerAssert;
import com.github.ones1kk.asserts.core.lang.lng.AbstractLongAssert;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.lang.shrt.AbstractShortAssert;
import com.github.ones1kk.asserts.core.lang.string.AbstractStringAssert;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public static AbstractBooleanAssert<?, Boolean> that(Boolean actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, Object> that(Object[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractNumberArrayAssert<?, Number[]> that(Number[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, CharSequence> that(CharSequence[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, String> that(String[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractArrayAssert<?, Character> that(Character[] actual) {
        return AssertsForType.that(actual);
    }

    public static AbstractFileAssert<?> that(File actual) {
        return AssertsForType.that(actual);
    }

    public static <ELEMENT> AbstractCollectionAssert<?, ELEMENT> that(Collection<ELEMENT> actual) {
        return AssertsForType.that(actual);
    }

    public static <ELEMENT> AbstractListAssert<?, ELEMENT> that(List<ELEMENT> actual) {
        return AssertsForType.that(actual);
    }

    public static <ELEMENT> AbstractSetAssert<?, ELEMENT> that(Set<ELEMENT> actual) {
        return AssertsForType.that(actual);
    }

}
