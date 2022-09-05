package com.github.ones1kk.asserts.core.clazz;

import java.lang.reflect.Field;

public interface ClassesInterface<ACTUAL extends Class<?>> {

    void assertIsTypeOf(Class<?> actual, Object expected);

    void assertIsNotTypeOf(Class<?> actual, Object expected);

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

    void assertContainsField(Class<?> actual, Field expected);

    void assertDoesNotContainField(Class<?> actual, Field expected);

    void assertContainsAllFields(Class<?> actual, Field... expected);

    void assertContainsAnyFields(Class<?> actual, Field... expected);
}
