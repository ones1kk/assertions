package com.github.ones1kk.asserts.core.clazz;

import com.github.ones1kk.asserts.core.Asserts;
import com.github.ones1kk.asserts.core.lang.model.IntegerAssert;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.lang.reflect.Field;

public class AbstractClassAssert<SELF extends AbstractClassAssert<SELF>> extends AbstractObjectAssert<SELF, Class<?>> implements ClassAssertInterface<SELF> {

    private final ClassesInterface<Class<?>> classes;

    public AbstractClassAssert(Class<?> self, Class<?> actual) {
        super(self, actual);
        this.classes = assertFactory.createAssert(actual, this);
    }


    @Override
    public SELF isTypeOf(Object expected) {
        classes.assertIsTypeOf(actual, expected);
        return self;
    }

    @Override
    public SELF isNotTypeOf(Object expected) {
        classes.assertIsNotTypeOf(actual, expected);
        return self;
    }

    @Override
    public SELF isSuperclassOf(Class<?> expected) {
        classes.assertIsSubclassOf(actual, expected);
        return self;
    }

    @Override
    public SELF isSubclassOf(Class<?> expected) {
        classes.assertIsSubclassOf(actual, expected);
        return self;
    }

    @Override
    public SELF isPrimitive() {
        classes.assertIsPrimitive(actual);
        return self;
    }

    @Override
    public SELF isInterface() {
        classes.assertIsInterface(actual);
        return self;
    }

    @Override
    public SELF isAnnotation() {
        classes.assertIsAnnotation(actual);
        return self;
    }

    @Override
    public SELF isFinalClass() {
        classes.assertIsFinalClass(actual);
        return self;
    }

    @Override
    public SELF isAbstractClass() {
        classes.assertIsAbstractClass(actual);
        return self;
    }

    @Override
    public SELF isAnonymousClass() {
        classes.assertIsAnonymousClass(actual);
        return self;
    }

    @Override
    public SELF isEnum() {
        classes.assertIsEnum(actual);
        return self;
    }

    @Override
    public SELF isArray() {
        classes.assertIsArray(actual);
        return self;
    }

    @Override
    public SELF isMemberClass() {
        classes.assertIsMemberClass(actual);
        return self;
    }

    @Override
    public SELF isLocalClass() {
        classes.assertIsLocalClass(actual);
        return self;
    }

    @Override
    public SELF containsField(Field expected) {
        classes.assertContainsField(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContainField(Field expected) {
        classes.assertDoesNotContainField(actual, expected);
        return self;
    }

    @Override
    public SELF containsAllFields(Field... expected) {
        classes.assertContainsAllFields(actual, expected);
        return self;
    }

    @Override
    public SELF containsAnyFields(Field... expected) {
        classes.assertContainsAnyFields(actual, expected);
        return self;
    }


    @Override
    public IntegerAssert asFieldsLength() {
        return new IntegerAssert(actual.getFields().length);
    }
}
