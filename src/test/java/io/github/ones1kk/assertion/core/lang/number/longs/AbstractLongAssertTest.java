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

package io.github.ones1kk.assertion.core.lang.number.longs;

import io.github.ones1kk.assertion.core.exception.AssertException;
import io.github.ones1kk.assertion.core.feature.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;

class AbstractLongAssertTest {

    @Nested
    @DisplayName("test isOdd()")
    class TestIsOdd {

        @Test
        @DisplayName("test isOdd() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isOdd);
        }

        @Test
        @DisplayName("test isOdd() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isOdd)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '2' should be odd.");
        }
    }

    @Nested
    @DisplayName("test isNotOdd()")
    class TestIsNotOdd {

        @Test
        @DisplayName("test isNotOdd() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotOdd);
        }

        @Test
        @DisplayName("test isNotOdd() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotOdd)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1' should not be odd.");
        }
    }

    @Nested
    @DisplayName("test isEven()")
    class TestIsEven {

        @Test
        @DisplayName("test isEven() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isEven);
        }

        @Test
        @DisplayName("test isEven() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isEven)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1' should be even.");
        }
    }

    @Nested
    @DisplayName("test isNotEven()")
    class TestIsNotEven {

        @Test
        @DisplayName("test isNotEven() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotEven);
        }

        @Test
        @DisplayName("test isNotEven() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotEven)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '2' should not be even.");
        }
    }

    @Nested
    @DisplayName("test isPositive()")
    class TestIsPositive {

        @Test
        @DisplayName("test isPositive() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isPositive);
        }

        @Test
        @DisplayName("test isPositive() fail case")
        void testFail() throws Exception {
            // given
            Long actual = -2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isPositive)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '-2' should be positive.");
        }
    }

    @Nested
    @DisplayName("test isNotPositive()")
    class TestIsNotPositive {

        @Test
        @DisplayName("test isNotPositive() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = -1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotPositive);
        }

        @Test
        @DisplayName("test isNotPositive() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotPositive)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '2' should not be positive.");
        }
    }

    @Nested
    @DisplayName("test isNegative()")
    class TestIsNegative {

        @Test
        @DisplayName("test isNegative() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = -1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNegative);
        }

        @Test
        @DisplayName("test isNegative() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNegative)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '2' should be negative.");
        }
    }

    @Nested
    @DisplayName("test isNotNegative()")
    class TestIsNotNegative {

        @Test
        @DisplayName("test isNotNegative() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotNegative);
        }

        @Test
        @DisplayName("test isNotNegative() fail case")
        void testFail() throws Exception {
            // given
            Long actual = -2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotNegative)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '-2' should not be negative.");
        }
    }

    @Nested
    @DisplayName("test isZero()")
    class TestIsZero {

        @Test
        @DisplayName("test isZero() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 0L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isZero);
        }

        @Test
        @DisplayName("test isZero() fail case")
        void testFail() throws Exception {
            // given
            Long actual = -2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isZero)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '-2' should be zero.");
        }
    }

    @Nested
    @DisplayName("test isNotZero()")
    class TestIsNotZero {

        @Test
        @DisplayName("test isNotZero() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotZero);
        }

        @Test
        @DisplayName("test isNotZero() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 0L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotZero)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '0' should not be zero.");
        }
    }

    @Nested
    @DisplayName("test isCloseTo()")
    class TestIsCloseTo {

        @Test
        @DisplayName("test isCloseTo() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;
            Long expected = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isCloseTo(expected, Offset.offset(1L)));
        }

        @Test
        @DisplayName("test isCloseTo() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 1L;
            Long expected = 10L;
            Long offset = 5L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);
            // then
            assertThatException().isThrownBy(() -> asserts.isCloseTo(expected, Offset.offset(offset)))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1' should be close to '-4.0' ~ '6.0'.");
        }
    }

    @Nested
    @DisplayName("test isLessThan()")
    class TestIsLessThan {

        @Test
        @DisplayName("test isLessThan() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;
            Long expected = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLessThan(expected));
        }

        @Test
        @DisplayName("test isLessThan() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 10L;
            Long expected = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);
            // then
            assertThatException().isThrownBy(() -> asserts.isLessThan(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '10' should be less than '1'.");
        }
    }

    @Nested
    @DisplayName("test isLessThanOrEqualTo()")
    class TestIsLessThanOrEqualTo {

        @Test
        @DisplayName("test isCloseTo() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 1L;
            Long expected = 2L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLessThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isLessThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 10L;
            Long expected = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);
            // then
            assertThatException().isThrownBy(() -> asserts.isLessThanOrEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '10' should be less than or equal to '1'.");
        }
    }

    @Nested
    @DisplayName("test isGreaterThan()")
    class TestIsGreaterThan {

        @Test
        @DisplayName("test isGreaterThan() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 2L;
            Long expected = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isGreaterThan(expected));
        }

        @Test
        @DisplayName("test isGreaterThan() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 1L;
            Long expected = 10L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);
            // then
            assertThatException().isThrownBy(() -> asserts.isGreaterThan(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1' should be greater than '10'.");
        }
    }

    @Nested
    @DisplayName("test isGreaterThanOrEqualTo()")
    class TestIsGreaterThanOrEqualTo {

        @Test
        @DisplayName("test isGreaterThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Long actual = 2L;
            Long expected = 1L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isGreaterThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isGreaterThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Long actual = 1L;
            Long expected = 10L;

            // when
            AbstractLongAssert asserts = new LongAssert(actual);
            // then
            assertThatException().isThrownBy(() -> asserts.isGreaterThanOrEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1' should be greater than or equal to '10'.");
        }
    }
}