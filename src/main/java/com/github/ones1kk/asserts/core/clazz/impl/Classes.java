package com.github.ones1kk.asserts.core.clazz.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.Asserts;
import com.github.ones1kk.asserts.core.clazz.ClassesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Classes<ACTUAL extends Class<?>> extends Objects<ACTUAL> implements ClassesInterface<ACTUAL> {

    public Classes(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsTypeOf(Class<?> actual, Object expected) {
        if(!actual.isInstance(expected)) {
            handler.setDescription(handler.from("The {} is not type of {}", actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotTypeOf(Class<?> actual, Object expected) {
        if(actual.isInstance(expected)) {
            handler.setDescription(handler.from("The {} is type of {}", actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSuperclassOf(Class<?> actual, Class<?> expected) {
        if(actual != expected.getSuperclass()) {
            handler.setDescription(handler.from("The {} is not supper class of {}", actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSubclassOf(Class<?> actual, Class<?> expected) {
        if(actual.getSuperclass() != expected) {
            handler.setDescription(handler.from("The {} is not sub class of {}", actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPrimitive(Class<?> actual) {
        if(!actual.isPrimitive()) {
            handler.setDescription(handler.from("The {} is not primitive", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsInterface(Class<?> actual) {
        if(!actual.isInterface()) {
            handler.setDescription(handler.from("The {} is not interface", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAnnotation(Class<?> actual) {
        if(!actual.isAnnotation()) {
            handler.setDescription(handler.from("The {} is not annotation", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFinalClass(Class<?> actual) {
        if(!Modifier.isFinal(actual.getModifiers())) {
            handler.setDescription(handler.from("The {} is not final class", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAbstractClass(Class<?> actual) {
        if(!Modifier.isAbstract(actual.getModifiers())) {
            handler.setDescription(handler.from("The {} is not abstract class", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAnonymousClass(Class<?> actual) {
        if(!actual.isAnonymousClass()) {
            handler.setDescription(handler.from("The {} is not anonymous class", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEnum(Class<?> actual) {
        if(!actual.isEnum()) {
            handler.setDescription(handler.from("The {} is not enum", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsArray(Class<?> actual) {
        if(!actual.isArray()) {
            handler.setDescription(handler.from("The {} is not array", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsMemberClass(Class<?> actual) {
        if(!actual.isMemberClass()) {
            handler.setDescription(handler.from("The {} is not member class", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLocalClass(Class<?> actual) {
        if(!actual.isLocalClass()) {
            handler.setDescription(handler.from("The {} is not local class", actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertContainsField(Class<?> actual, Field expected) {
        Asserts.that(actual.getFields()).contains(expected);
    }

    @Override
    public void assertDoesNotContainField(Class<?> actual, Field expected) {
        Asserts.that(actual.getFields()).doesNotContain(expected);
    }

    @Override
    public void assertContainsAllFields(Class<?> actual, Field... expected) {
        Asserts.that(actual.getFields()).containsAll(expected);
    }

    @Override
    public void assertContainsAnyFields(Class<?> actual, Field... expected) {
        Asserts.that(actual.getFields()).containsAny(expected);
    }

}
