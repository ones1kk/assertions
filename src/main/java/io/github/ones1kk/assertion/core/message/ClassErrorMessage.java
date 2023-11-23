package io.github.ones1kk.assertion.core.message;

import io.github.ones1kk.assertion.core.description.Description;

public final class ClassErrorMessage {

    private ClassErrorMessage() {
    }

    public static String shouldBeTypeOf(Class<?> actual, Object expected) {
        return new Description("The given '{}' should be type of '{}'.", expected, actual).toString();
    }

    public static String shouldNotBeTypeOf(Class<?> actual, Object expected) {
        return new Description("The given '{}' should not be type of '{}'.", expected, actual).toString();
    }

    public static String shouldBeSuperClassOf(Class<?> actual, Class<?> expected) {
        return new Description("The given '{}' should be super class of '{}'.", actual, expected).toString();
    }

    public static String shouldBeSubClassOf(Class<?> actual, Class<?> expected) {
        return new Description("The given '{}' should be sub class of '{}'.", actual, expected).toString();
    }

    public static String shouldBePrimitive(Class<?> actual) {
        return new Description("The given '{}' should be primitive.", actual).toString();
    }

    public static String shouldBeInterface(Class<?> actual) {
        return new Description("The given '{}' should be interface.", actual).toString();
    }

    public static String shouldBeAnnotation(Class<?> actual) {
        return new Description("The given '{}' should be annotation.", actual).toString();
    }

    public static String shouldBeFinalClass(Class<?> actual) {
        return new Description("The given '{}' should be final class.", actual).toString();
    }

    public static String shouldBeAbstractClass(Class<?> actual) {
        return new Description("The given '{}' should be abstract class.", actual).toString();
    }

    public static String shouldBeAnonymousClass(Class<?> actual) {
        return new Description("The given '{}' should be anonymous class.", actual).toString();
    }

    public static String shouldBeEnum(Class<?> actual) {
        return new Description("The given '{}' should be enum.", actual).toString();
    }

    public static String shouldBeArray(Class<?> actual) {
        return new Description("The given '{}' should be array.", actual).toString();
    }

    public static String shouldBeMemberClass(Class<?> actual) {
        return new Description("The given '{}' should be member class.", actual).toString();
    }

    public static String shouldBeLocalClass(Class<?> actual) {
        return new Description("The given '{}' should be local class.", actual).toString();
    }

    public static String shouldBeAssignableFrom(Class<?> actual, Class<?> expected) {
        return new Description("The given '{}' should be assignable from '{}'.", actual, expected).toString();
    }

    public static String shouldNotBeAssignableFrom(Class<?> actual, Class<?> expected) {
        return new Description("The given '{}' should not be assignable from '{}'.", actual, expected).toString();
    }
}
