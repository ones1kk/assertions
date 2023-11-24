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

package io.github.ones1kk.assertion.core.lang.object;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;


class AbstractObjectAssertTest {

    @Nested
    @DisplayName("test isNull()")
    class TestIsNull {
        @Test
        @DisplayName("test isNull() success case")
        void testSuccess() throws Exception {
            // given
            Object actual = null;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNull);
        }

        @Test
        @DisplayName("test isNull() fail case")
        void testFail() throws Exception {
            // given
            String actual = "actual";

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNull)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'actual' should be null.");
        }
    }

    @Nested
    @DisplayName("test isNotNull()")
    class TestIsNotNull {
        @Test
        @DisplayName("test isNotNull() success case")
        void testSuccess() throws Exception {
            // given
            String actual = "actual";

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotNull);
        }

        @Test
        @DisplayName("test isNotNull() fail case")
        void testFail() throws Exception {
            // given
            Object actual = null;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotNull)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'actual' should not be null.");
        }
    }

    @Nested
    @DisplayName("test isSameAs()")
    class TestIsSameAs {
        @Test
        @DisplayName("test isSameAs() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isSameAs(expected));
        }

        @Test
        @DisplayName("test isSameAs() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 150;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isSameAs(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should be same as '150'.");
        }
    }

    @Nested
    @DisplayName("test isNotSameAs()")
    class TestIsNotSameAs {
        @Test
        @DisplayName("test isNotSameAs() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 150;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isNotSameAs(expected));
        }

        @Test
        @DisplayName("test isNotSameAs() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isNotSameAs(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should not be same as '15'.");
        }
    }

    @Nested
    @DisplayName("test isEqualTo()")
    class TestIsEqualTo {
        @Test
        @DisplayName("test isEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isEqualTo(expected));
        }

        @Test
        @DisplayName("test isEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 150;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should be equal to '150'.");
        }
    }

    @Nested
    @DisplayName("test isNotEqualTo()")
    class TestIsNotEqualTo {
        @Test
        @DisplayName("test isNotEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 150;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isNotEqualTo(expected));
        }

        @Test
        @DisplayName("test isNotEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;
            Integer expected = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isNotEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should not be equal to '15'.");
        }
    }

    @Nested
    @DisplayName("test isInstanceOf()")
    class TestIsInstanceOf {
        @Test
        @DisplayName("test isInstanceOf() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isInstanceOf(Object.class));
        }

        @Test
        @DisplayName("test isInstanceOf() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = null;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isInstanceOf(Object.class))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'null' should be instance of class java.lang.Object.");
        }
    }

    @Nested
    @DisplayName("test isNotInstanceOf()")
    class TestIsNotInstanceOf {
        @Test
        @DisplayName("test isNotInstanceOf() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = null;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isNotInstanceOf(Object.class));
        }

        @Test
        @DisplayName("test isNotInstanceOf() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isNotInstanceOf(Object.class))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should not be instance of 'class java.lang.Object'.");
        }
    }

    @Nested
    @DisplayName("test is()")
    class TestIs {
        @Test
        @DisplayName("test is() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.is(it -> it.equals(15)));
        }

        @Test
        @DisplayName("test is() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.is(Objects::isNull))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should be satisfied of given condition.");
        }
    }

    @Nested
    @DisplayName("test isNot()")
    class TestIsNot {
        @Test
        @DisplayName("test is() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 150;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isNot(it -> it.equals(15)));
        }

        @Test
        @DisplayName("test isNot() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isNot(it -> it.equals(15)))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should not be satisfied of given condition.");
        }
    }

    @Nested
    @DisplayName("test returns()")
    class TestReturns {
        @Test
        @DisplayName("test is() success case")
        void testSuccess() throws Exception {
            // given
            Integer actual = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.returns(15, it -> it));
        }

        @Test
        @DisplayName("test returns() fail case")
        void testFail() throws Exception {
            // given
            Integer actual = 15;

            // when
            AbstractObjectAssert<ObjectAssert, Object> asserts = new ObjectAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.returns(15, Object::toString))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should be returned of given value.");
        }
    }

}