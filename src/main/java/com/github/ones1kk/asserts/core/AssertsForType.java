package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.array.AbstractArrayAssert;
import com.github.ones1kk.asserts.core.array.model.ArrayAssert;
import com.github.ones1kk.asserts.core.array.model.NumberArrayAssert;
import com.github.ones1kk.asserts.core.array.number.AbstractNumberArrayAssert;
import com.github.ones1kk.asserts.core.collection.AbstractCollectionAssert;
import com.github.ones1kk.asserts.core.collection.list.AbstractListAssert;
import com.github.ones1kk.asserts.core.collection.model.CollectionAssert;
import com.github.ones1kk.asserts.core.collection.model.ListAssert;
import com.github.ones1kk.asserts.core.file.AbstractFileAssert;
import com.github.ones1kk.asserts.core.file.model.FileAssert;
import com.github.ones1kk.asserts.core.lang.bolean.AbstractBooleanAssert;
import com.github.ones1kk.asserts.core.lang.bte.AbstractByteAssert;
import com.github.ones1kk.asserts.core.lang.character.AbstractCharacterAssert;
import com.github.ones1kk.asserts.core.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.core.lang.duble.AbstractDoubleAssert;
import com.github.ones1kk.asserts.core.lang.flot.AbstractFloatAssert;
import com.github.ones1kk.asserts.core.lang.integer.AbstractIntegerAssert;
import com.github.ones1kk.asserts.core.lang.lng.AbstractLongAssert;
import com.github.ones1kk.asserts.core.lang.model.*;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.lang.shrt.AbstractShortAssert;
import com.github.ones1kk.asserts.core.lang.string.AbstractStringAssert;

import java.io.File;
import java.util.Collection;
import java.util.List;

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

    public static AbstractBooleanAssert<?, Boolean> that(Boolean actual) {
        return new BooleanAssert(actual);
    }

    public static AbstractArrayAssert<?, Object> that(Object[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static AbstractNumberArrayAssert<?, Number[]> that(Number[] actual) {
        return new NumberArrayAssert(actual);
    }

    public static AbstractArrayAssert<?, CharSequence> that(CharSequence[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static AbstractArrayAssert<?, String> that(String[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static AbstractArrayAssert<?, Character> that(Character[] actual) {
        return new ArrayAssert<>(actual);
    }

    public static AbstractFileAssert<?> that(File actual) {
        return new FileAssert(actual);
    }

    public static <ELEMENT> AbstractCollectionAssert<?, ELEMENT> that(Collection<ELEMENT> actual) {
        return new CollectionAssert<>(actual);
    }

    public static <ELEMENT> AbstractListAssert<?, ELEMENT> that(List<ELEMENT> actual) {
        return new ListAssert<>(actual);
    }

}
