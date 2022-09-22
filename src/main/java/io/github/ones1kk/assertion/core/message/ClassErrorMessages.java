package io.github.ones1kk.assertion.core.message;

import io.github.ones1kk.assertion.core.description.Describable;
import io.github.ones1kk.assertion.core.description.impl.Description;

public final class ClassErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private ClassErrorMessages() {
    }

    public static String shouldBeTypeOf(Class<?> actual, Object expected) {
        return DESCRIBABLE.as("The given {} should be type of {}.", expected, actual);
    }

    public static String shouldNotBeTypeOf(Class<?> actual, Object expected) {
        return DESCRIBABLE.as("The given {} should not be type of {}.", expected, actual);
    }

    public static String shouldBeSuperClassOf(Class<?> actual, Class<?> expected) {
        return DESCRIBABLE.as("The given {} should be super class of {}.", actual, expected);
    }

    public static String shouldBeSubClassOf(Class<?> actual, Class<?> expected) {
        return DESCRIBABLE.as("The given {} should be sub class of {}.", actual, expected);
    }

    public static String shouldBePrimitive(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be primitive.", actual);
    }

    public static String shouldBeInterface(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be interface.", actual);
    }

    public static String shouldBeAnnotation(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be annotation.", actual);
    }

    public static String shouldBeFinalClass(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be final class.", actual);
    }

    public static String shouldBeAbstractClass(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be abstract class.", actual);
    }

    public static String shouldBeAnonymousClass(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be anonymous class.", actual);
    }

    public static String shouldBeEnum(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be enum.", actual);
    }

    public static String shouldBeArray(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be array.", actual);
    }

    public static String shouldBeMemberClass(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be member class.", actual);
    }

    public static String shouldBeLocalClass(Class<?> actual) {
        return DESCRIBABLE.as("The given {} should be local class.", actual);
    }
}
