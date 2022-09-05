package com.github.ones1kk.asserts.core.clazz;

import java.lang.reflect.Field;

public interface ClassesInterface<ACTUAL extends Class<?>> {

    void assertIsTypeOf(Class<?> actual, Object expected);

    void assertIsNotTypeOf(Class<?> actual, Object expected);

    void assertIsAssignableFrom(Class<?> actual, Class<?> expected);

    void assertIsSuperclassOf(Class<?> actual, Class<?> expected);

    void assertIsSubclassOf(Class<?> actual, Class<?> expected);

    void assertIsPrimitive(Class<?> actual);

    void assertIsInterface(Class<?> actual);

    void assertIsAnnotation(Class<?> actual);

    void assertIsFinalClass(Class<?> actual);

    void assertIsAbstractClass(Class<?> actual);

    void assertIsAnonymousClass(Class<?> actual);

    void assertIsEnum(Class<?> actual);

    void assertIsArray(Class<?> actual);

    void assertIsMemberClass(Class<?> actual);

    void assertIsLocalClass(Class<?> actual);

    void assertContainsFields(Class<?> actual, Field[] expected);
}
