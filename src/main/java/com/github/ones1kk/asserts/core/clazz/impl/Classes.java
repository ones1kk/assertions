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

package com.github.ones1kk.asserts.core.clazz.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.clazz.ClassesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.message.ClassErrorMessages;

import java.lang.reflect.Modifier;

import static com.github.ones1kk.asserts.core.message.ClassErrorMessages.*;

public final class Classes extends Objects<Class<?>> implements ClassesInterface<Class<?>> {

    public Classes(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsTypeOf(Class<?> actual, Object expected) {
        if (!actual.isInstance(expected)) {
            handler.receive(actual, expected, shouldBeTypeOf(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotTypeOf(Class<?> actual, Object expected) {
        if (actual.isInstance(expected)) {
            handler.receive(actual, expected, shouldNotBeTypeOf(actual ,expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSuperclassOf(Class<?> actual, Class<?> expected) {
        if (actual != expected.getSuperclass()) {
            handler.receive(actual, expected, shouldBeSuperClassOf(actual, expected));
            handler.setDescription(handler.from("The {} is not supper class of {}", actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSubclassOf(Class<?> actual, Class<?> expected) {
        if (actual.getSuperclass() != expected) {
            handler.receive(actual, expected, shouldBeSubClassOf(actual, expected));
            handler.setDescription(handler.from("The {} is not sub class of {}", actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPrimitive(Class<?> actual) {
        if (!actual.isPrimitive()) {
            handler.receive(actual, shouldBePrimitive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsInterface(Class<?> actual) {
        if (!actual.isInterface()) {
            handler.receive(actual, shouldBeInterface(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAnnotation(Class<?> actual) {
        if (!actual.isAnnotation()) {
            handler.receive(actual, shouldBeAnnotation(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFinalClass(Class<?> actual) {
        if (!Modifier.isFinal(actual.getModifiers())) {
            handler.receive(actual, shouldBeFinalClass(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAbstractClass(Class<?> actual) {
        if (!Modifier.isAbstract(actual.getModifiers())) {
            handler.receive(actual, shouldBeAbstractClass(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAnonymousClass(Class<?> actual) {
        if (!actual.isAnonymousClass()) {
            handler.receive(actual, shouldBeAnonymousClass(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEnum(Class<?> actual) {
        if (!actual.isEnum()) {
            handler.receive(actual, shouldBeEnum(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsArray(Class<?> actual) {
        if (!actual.isArray()) {
            handler.receive(actual, shouldBeArray(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsMemberClass(Class<?> actual) {
        if (!actual.isMemberClass()) {
            handler.receive(actual , shouldBeMemberClass(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLocalClass(Class<?> actual) {
        if (!actual.isLocalClass()) {
            handler.receive(actual, shouldBeLocalClass(actual));
            throw handler.getException();
        }
    }
}
