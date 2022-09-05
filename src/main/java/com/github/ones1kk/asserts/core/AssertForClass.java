package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.clazz.AbstractClassAssert;
import com.github.ones1kk.asserts.core.clazz.enumtype.AbstractEnumAssert;
import com.github.ones1kk.asserts.core.clazz.model.ClassAssert;
import com.github.ones1kk.asserts.core.clazz.model.EnumAssert;

public final class AssertForClass {

    public static AbstractClassAssert<?> that(Class<?> actual) {
        return new ClassAssert(actual);
    }

    public static <ACTUAL extends Enum<ACTUAL>> AbstractEnumAssert<?, ACTUAL> that(ACTUAL actual) {
        return new EnumAssert<>(actual);
    }
}
