package com.github.ones1kk.asserts.core.clazz;

import com.github.ones1kk.asserts.core.lang.model.IntegerAssert;

import java.lang.reflect.Field;

public interface ClassAssertInterface<SELF> {

    SELF isTypeOf(Object expected);

    SELF isNotTypeOf(Object expected);

    SELF isAssignableFrom(Class<?> expected);

    SELF isSuperclassOf(Class<?> expected);

    SELF isSubclassOf(Class<?> expected);

    SELF isPrimitive();

    SELF isInterface();

    SELF isAnnotation();

    SELF isFinalClass();

    SELF isAbstractClass();

    SELF isAnonymousClass();

    SELF isEnum();

    SELF isArray();

    SELF isMemberClass();

    SELF isLocalClass();

    SELF containsFields(Field[] expected);

    IntegerAssert asFieldsLength();

}
