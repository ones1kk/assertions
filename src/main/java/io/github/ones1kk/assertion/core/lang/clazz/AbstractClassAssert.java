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

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractByteAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the class type and verify assertion.</p>
 */
public abstract class AbstractClassAssert extends AbstractObjectAssert<AbstractClassAssert, Class<?>> implements ClassAssertion<AbstractClassAssert> {

    private final ClassesAssertion classes;

    public AbstractClassAssert(Class<?> self, Class<?> actual) {
        super(self, actual);
        this.classes = new Classes();
    }

    /**
     * verify actual is type of expected.
     *
     * @param expected expected
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isTypeOf(Object expected) {
        classes.assertTypeOf(info, actual, expected);
        return this;
    }

    /**
     * verify actual is not type of expected.
     *
     * @param expected expected
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isNotTypeOf(Object expected) {
        classes.assertNotTypeOf(info, actual, expected);
        return this;
    }

    /**
     * verify actual is supper class of expected.
     *
     * @param expected expected
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isSuperclassOf(Class<?> expected) {
        classes.assertSuperclassOf(info, actual, expected);
        return this;
    }

    /**
     * verify actual is subclass of expected.
     *
     * @param expected expected
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isSubclassOf(Class<?> expected) {
        classes.assertSubclassOf(info, actual, expected);
        return this;
    }

    /**
     * verify actual is primitive type.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isPrimitive() {
        classes.assertPrimitive(info, actual);
        return this;
    }

    /**
     * verify actual is interface.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isInterface() {
        classes.assertInterface(info, actual);
        return this;
    }

    /**
     * verify actual is annotation.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isAnnotation() {
        classes.assertAnnotation(info, actual);
        return this;
    }

    /**
     * verify actual is final class.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isFinalClass() {
        classes.assertFinalClass(info, actual);
        return this;
    }

    /**
     * verify actual is abstract class.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isAbstractClass() {
        classes.assertAbstractClass(info, actual);
        return this;
    }

    /**
     * verify actual is anonymous class.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isAnonymousClass() {
        classes.assertAnonymousClass(info, actual);
        return this;
    }

    /**
     * verify actual is enum.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isEnum() {
        classes.assertEnum(info, actual);
        return this;
    }

    /**
     * verify actual is array.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isArray() {
        classes.assertArray(info, actual);
        return this;
    }

    /**
     * verify actual is member class.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isMemberClass() {
        classes.assertMemberClass(info, actual);
        return this;
    }

    /**
     * verify actual is local class.
     *
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isLocalClass() {
        classes.assertLocalClass(info, actual);
        return this;
    }

    /**
     * verify actual is assignable from expected.
     *
     * @param expected expected
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isAssignableFrom(Class<?> expected) {
        classes.assertAssignableFrom(info, actual, expected);
        return this;
    }

    /**
     * verify actual is not assignable from expected.
     *
     * @param expected expected
     * @return {@link AbstractClassAssert}
     */
    @Override
    public AbstractClassAssert isNotAssignableFrom(Class<?> expected) {
        classes.assertNotAssignableFrom(info, actual, expected);
        return this;
    }
}
