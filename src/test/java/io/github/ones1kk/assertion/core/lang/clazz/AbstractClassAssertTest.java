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

import io.github.ones1kk.assertion.core.Asserts;
import io.github.ones1kk.assertion.core.constant.Colors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AbstractClassAssertTest {

    @Nested
    @DisplayName("test isTypeOf()")
    class TestIsTypeOf {

        @Test
        @DisplayName("test isTypeof() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isTypeOf(asserts));
        }

        @Test
        @DisplayName("test isTypeof() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.isTypeOf("abc"));
        }
    }

    @Nested
    @DisplayName("test isNotTypeOf()")
    class TestIsNotTypeOf {

        @Test
        @DisplayName("test isNotTypeOf() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isNotTypeOf("123"));
        }

        @Test
        @DisplayName("test isNotTypeOf() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.isNotTypeOf(asserts));
        }
    }

    @Nested
    @DisplayName("test isSuperclassOf()")
    class TestIsSuperClassOf {

        @Test
        @DisplayName("test isSuperclassOf() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = AbstractClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isSuperclassOf(ClassAssert.class));
        }

        @Test
        @DisplayName("test isSuperclassOf() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.isSuperclassOf(AbstractClassAssert.class));
        }
    }

    @Nested
    @DisplayName("test isSubclassOf()")
    class TestIsSubClassOf {

        @Test
        @DisplayName("test isSubclassOf() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;
            Class<?> expected = AbstractClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isSubclassOf(expected));
        }

        @Test
        @DisplayName("test isSubclassOf() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;
            Class<?> expected = String.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.isSubclassOf(expected));
        }
    }

    @Nested
    @DisplayName("test isPrimitive()")
    class TestIsPrimitive {

        @Test
        @DisplayName("test isPrimitive() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = int.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isPrimitive);
        }

        @Test
        @DisplayName("test isPrimitive() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isPrimitive);
        }
    }

    @Nested
    @DisplayName("test isInterface()")
    class TestIsInterface {

        @Test
        @DisplayName("test isInterface() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = ClassesAssertion.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isInterface);
        }

        @Test
        @DisplayName("test isInterface() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isInterface);
        }
    }

    @Nested
    @DisplayName("test isAnnotation()")
    class TestIsAnnotation {

        @Test
        @DisplayName("test isAnnotation() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = Override.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isAnnotation);
        }

        @Test
        @DisplayName("test isAnnotation() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isAnnotation);
        }
    }

    @Nested
    @DisplayName("test isFinalClass()")
    class TestIsFinalClass {

        @Test
        @DisplayName("test isFinalClass() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = Asserts.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isFinalClass);
        }

        @Test
        @DisplayName("test isFinalClass() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isFinalClass);
        }
    }

    @Nested
    @DisplayName("test isAbstractClass()")
    class TestIsAbstractClass {

        @Test
        @DisplayName("test isAbstractClass() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = AbstractClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isAbstractClass);
        }

        @Test
        @DisplayName("test isAbstractClass() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isAbstractClass);
        }
    }

    @Nested
    @DisplayName("test isAnonymousClass()")
    class TestIsAnonymousClass {

        @Test
        @DisplayName("test isAnonymousClass() success case")
        void testSuccess() throws Exception {
            // given
            AnonymousClass anonymousClass = new AnonymousClass() {
                @Override
                protected void doSomething() {

                }
            };

            Class<?> actual = anonymousClass.getClass();

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isAnonymousClass);
        }

        @Test
        @DisplayName("test isAnonymousClass() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isAnonymousClass);
        }
    }

    @Nested
    @DisplayName("test isEnum()")
    class TestIsEnum {

        @Test
        @DisplayName("test isEnum() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = Colors.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isEnum);
        }

        @Test
        @DisplayName("test isEnum() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isEnum);
        }
    }

    @Nested
    @DisplayName("test isArray()")
    class TestIsArray {

        @Test
        @DisplayName("test isArray() success case")
        void testSuccess() throws Exception {
            // given
            int[] arr = {};
            Class<?> actual = arr.getClass();

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isArray);
        }

        @Test
        @DisplayName("test isArray() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isArray);
        }
    }

    @Nested
    @DisplayName("test isMemberClass()")
    class TestIsMemberClass {

        @Test
        @DisplayName("test isMemberClass() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = MemberClass.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isMemberClass);
        }

        @Test
        @DisplayName("test isMemberClass() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isMemberClass);
        }
    }

    @Nested
    @DisplayName("test isLocalClass()")
    class TestIsLocalClass {

        @Test
        @DisplayName("test isLocalClass() success case")
        void testSuccess() throws Exception {
            // given
            class LocalClass {

            }

            Class<?> actual = LocalClass.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isLocalClass);
        }

        @Test
        @DisplayName("test isLocalClass() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(asserts::isLocalClass);
        }
    }

    @Nested
    @DisplayName("test isAssignableFrom()")
    class TestIsAssignableFrom {

        @Test
        @DisplayName("test isAssignableFrom() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = AbstractClassAssert.class;
            Class<?> expected = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isAssignableFrom(expected));
        }

        @Test
        @DisplayName("test isAssignableFrom() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;
            Class<?> expected = String.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.isAssignableFrom(expected));
        }
    }

    @Nested
    @DisplayName("test isNotAssignableFrom()")
    class TestIsNotAssignableFrom {

        @Test
        @DisplayName("test isNotAssignableFrom() success case")
        void testSuccess() throws Exception {
            // given
            Class<?> actual = ClassAssert.class;
            Class<?> expected = AbstractClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isNotAssignableFrom(expected));
        }

        @Test
        @DisplayName("test isNotAssignableFrom() fail case")
        void testFail() throws Exception {
            // given
            Class<?> actual = AbstractClassAssert.class;
            Class<?> expected = ClassAssert.class;

            // when
            AbstractClassAssert asserts = new ClassAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.isNotAssignableFrom(expected));
        }
    }


    private static class MemberClass {

    }

    private abstract static class AnonymousClass {

        protected abstract void doSomething();

    }


}