/*
 * Copyright (c) 2022. Wonsik Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.ones1kk.asserts.core.clazz;

import io.github.ones1kk.asserts.core.lang.model.IntegerAssert;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

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
        classes.assertIsSuperclassOf(actual, expected);
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
    public IntegerAssert asFieldsLength() {
        return new IntegerAssert(actual.getFields().length);
    }
}
