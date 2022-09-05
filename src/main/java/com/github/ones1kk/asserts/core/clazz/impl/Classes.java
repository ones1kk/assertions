package com.github.ones1kk.asserts.core.clazz.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.clazz.ClassesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.lang.reflect.Field;

public class Classes<ACTUAL extends Class<?>> extends Objects<ACTUAL> implements ClassesInterface<ACTUAL> {

    public Classes(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsTypeOf(Class<?> actual, Object expected) {

    }

    @Override
    public void assertIsNotTypeOf(Class<?> actual, Object expected) {

    }

    @Override
    public void assertIsAssignableFrom(Class<?> actual, Class<?> expected) {

    }

    @Override
    public void assertIsSuperclassOf(Class<?> actual, Class<?> expected) {

    }

    @Override
    public void assertIsSubclassOf(Class<?> actual, Class<?> expected) {

    }

    @Override
    public void assertIsPrimitive(Class<?> actual) {

    }

    @Override
    public void assertIsInterface(Class<?> actual) {

    }

    @Override
    public void assertIsAnnotation(Class<?> actual) {

    }

    @Override
    public void assertIsFinalClass(Class<?> actual) {

    }

    @Override
    public void assertIsAbstractClass(Class<?> actual) {

    }

    @Override
    public void assertIsAnonymousClass(Class<?> actual) {

    }

    @Override
    public void assertIsEnum(Class<?> actual) {

    }

    @Override
    public void assertIsArray(Class<?> actual) {

    }

    @Override
    public void assertIsMemberClass(Class<?> actual) {

    }

    @Override
    public void assertIsLocalClass(Class<?> actual) {

    }

    @Override
    public void assertContainsFields(Class<?> actual, Field[] expected) {

    }
}
