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
package io.github.ones1kk.assertion.core.lang.clazz;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.ClassErrorMessage;

import java.lang.reflect.Modifier;

public class Classes extends Objects<Class<?>> implements ClassesAssertion {

    /**
     * assert actual is type of expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertTypeOf(AssertionsInfo info, Class<?> actual, Object expected) {
        if (!actual.isInstance(expected)) {
            throw failures.failure(info, ClassErrorMessage.shouldBeTypeOf(actual, expected));
        }
    }

    /**
     * assert actual is not type of expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertNotTypeOf(AssertionsInfo info, Class<?> actual, Object expected) {
        if (actual.isInstance(expected)) {
            throw failures.failure(info, ClassErrorMessage.shouldNotBeTypeOf(actual, expected));
        }
    }

    /**
     * assert actual is supper class of expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertSuperclassOf(AssertionsInfo info, Class<?> actual, Class<?> expected) {
        if (actual != expected.getSuperclass()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeSuperClassOf(actual, expected));
        }
    }

    /**
     * assert actual is subclass of expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertSubclassOf(AssertionsInfo info, Class<?> actual, Class<?> expected) {
        if (actual.getSuperclass() != expected) {
            throw failures.failure(info, ClassErrorMessage.shouldBeSubClassOf(actual, expected));
        }
    }

    /**
     * assert actual is primitive type.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertPrimitive(AssertionsInfo info, Class<?> actual) {
        if (!actual.isPrimitive()) {
            throw failures.failure(info, ClassErrorMessage.shouldBePrimitive(actual));
        }
    }

    /**
     * assert actual is interface.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertInterface(AssertionsInfo info, Class<?> actual) {
        if (!actual.isInterface()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeInterface(actual));
        }
    }

    /**
     * assert actual is annotation.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertAnnotation(AssertionsInfo info, Class<?> actual) {
        if (!actual.isAnnotation()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeAnnotation(actual));
        }
    }

    /**
     * assert actual is final class.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertFinalClass(AssertionsInfo info, Class<?> actual) {
        if (!Modifier.isFinal(actual.getModifiers())) {
            throw failures.failure(info, ClassErrorMessage.shouldBeFinalClass(actual));
        }
    }

    /**
     * assert actual is abstract class.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertAbstractClass(AssertionsInfo info, Class<?> actual) {
        if (!Modifier.isAbstract(actual.getModifiers())) {
            throw failures.failure(info, ClassErrorMessage.shouldBeAbstractClass(actual));
        }
    }

    /**
     * assert actual is anonymous class.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertAnonymousClass(AssertionsInfo info, Class<?> actual) {
        if (!actual.isAnonymousClass()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeAnonymousClass(actual));
        }
    }

    /**
     * assert actual is enum.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertEnum(AssertionsInfo info, Class<?> actual) {
        if (!actual.isEnum()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeEnum(actual));
        }
    }

    /**
     * assert actual is array.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertArray(AssertionsInfo info, Class<?> actual) {
        if (!actual.isArray()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeArray(actual));
        }
    }

    /**
     * assert actual is member class.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertMemberClass(AssertionsInfo info, Class<?> actual) {
        if (!actual.isMemberClass()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeMemberClass(actual));
        }
    }

    /**
     * assert actual is local class.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertLocalClass(AssertionsInfo info, Class<?> actual) {
        if (!actual.isLocalClass()) {
            throw failures.failure(info, ClassErrorMessage.shouldBeLocalClass(actual));
        }
    }

    /**
     * assert actual is assignable from expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertAssignableFrom(AssertionsInfo info, Class<?> actual, Class<?> expected) {
        if (!actual.isAssignableFrom(expected)) {
            throw failures.failure(info, ClassErrorMessage.shouldBeAssignableFrom(actual, expected));
        }
    }

    /**
     * assert actual is not assignable from expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertNotAssignableFrom(AssertionsInfo info, Class<?> actual, Class<?> expected) {
        if (actual.isAssignableFrom(expected)) {
            throw failures.failure(info, ClassErrorMessage.shouldNotBeAssignableFrom(actual, expected));
        }
    }
}
