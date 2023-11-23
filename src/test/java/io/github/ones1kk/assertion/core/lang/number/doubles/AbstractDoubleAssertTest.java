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

package io.github.ones1kk.assertion.core.lang.number.doubles;

import io.github.ones1kk.assertion.core.exception.AssertException;
import io.github.ones1kk.assertion.core.feature.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;


class AbstractDoubleAssertTest {

    @Nested
    @DisplayName("test isInfinite()")
    class TestIsInfinite {

        @Test
        @DisplayName("test isInfinite() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 3 / 0.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isInfinite);
        }

        @Test
        @DisplayName("test isInfinite() fail case")
        void testFail() throws Exception {
            // given
            Double actual = -2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isInfinite)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '-2.0' should be infinity.");
        }
    }

    @Nested
    @DisplayName("test isFinite()")
    class TestIsFinite {

        @Test
        @DisplayName("test isFinite() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isFinite);
        }

        @Test
        @DisplayName("test isFinite() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 3 / 0.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isFinite)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'Infinity' should be finite.");
        }
    }

    @Nested
    @DisplayName("test isNaN()")
    class TestIsNaN {

        @Test
        @DisplayName("test isNaN() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 5 % 0.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNaN);
        }

    }

    @Nested
    @DisplayName("test isPositive()")
    class TestIsPositive {

        @Test
        @DisplayName("test isPositive() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isPositive);
        }

        @Test
        @DisplayName("test isPositive() fail case")
        void testFail() throws Exception {
            // given
            Double actual = -2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isPositive)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '-2.0' should be positive.");
        }
    }

    @Nested
    @DisplayName("test isNotPositive()")
    class TestIsNotPositive {

        @Test
        @DisplayName("test isNotPositive() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = -1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotPositive);
        }

        @Test
        @DisplayName("test isNotPositive() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotPositive)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '2.0' should not be positive.");
        }
    }

    @Nested
    @DisplayName("test isNegative()")
    class TestIsNegative {

        @Test
        @DisplayName("test isNegative() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = -1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNegative);
        }

        @Test
        @DisplayName("test isNegative() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNegative)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '2.0' should be negative.");
        }
    }

    @Nested
    @DisplayName("test isNotNegative()")
    class TestIsNotNegative {

        @Test
        @DisplayName("test isNotNegative() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotNegative);
        }

        @Test
        @DisplayName("test isNotNegative() fail case")
        void testFail() throws Exception {
            // given
            Double actual = -2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotNegative)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '-2.0' should not be negative.");
        }
    }

    @Nested
    @DisplayName("test isZero()")
    class TestIsZero {

        @Test
        @DisplayName("test isZero() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 0.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isZero);
        }

        @Test
        @DisplayName("test isZero() fail case")
        void testFail() throws Exception {
            // given
            Double actual = -2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isZero)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '-2.0' should be zero.");
        }
    }

    @Nested
    @DisplayName("test isNotZero()")
    class TestIsNotZero {

        @Test
        @DisplayName("test isNotZero() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotZero);
        }

        @Test
        @DisplayName("test isNotZero() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 0.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotZero)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '0.0' should not be zero.");
        }
    }

    @Nested
    @DisplayName("test isCloseTo()")
    class TestIsCloseTo {

        @Test
        @DisplayName("test isCloseTo() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 1.0;
            Double expected = 2.0;
            Double offset = 2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isCloseTo(expected, Offset.offset(offset)));
        }

        @Test
        @DisplayName("test isCloseTo() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 1.0;
            Double expected = 10.0;
            Double offset = 5.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isCloseTo(expected, Offset.offset(offset)))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1.0' should be close to '-4.0' ~ '6.0'.");
        }
    }

    @Nested
    @DisplayName("test isLessThan()")
    class TestIsLessThan {

        @Test
        @DisplayName("test isLessThan() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 1.0;
            Double expected = 2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLessThan(expected));
        }

        @Test
        @DisplayName("test isLessThan() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 10.0;
            Double expected = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLessThan(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '10.0' should be less than '1.0'.");
        }
    }

    @Nested
    @DisplayName("test isLessThanOrEqualTo()")
    class TestIsLessThanOrEqualTo {

        @Test
        @DisplayName("test isCloseTo() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 1.0;
            Double expected = 2.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLessThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isLessThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 10.0;
            Double expected = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLessThanOrEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '10.0' should be less than or equal to '1.0'.");
        }
    }

    @Nested
    @DisplayName("test isGreaterThan()")
    class TestIsGreaterThan {

        @Test
        @DisplayName("test isGreaterThan() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 2.0;
            Double expected = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isGreaterThan(expected));
        }

        @Test
        @DisplayName("test isGreaterThan() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 1.0;
            Double expected = 10.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);
            // then
            assertThatException().isThrownBy(() -> asserts.isGreaterThan(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1.0' should be greater than '10.0'.");
        }
    }

    @Nested
    @DisplayName("test isGreaterThanOrEqualTo()")
    class TestIsGreaterThanOrEqualTo {

        @Test
        @DisplayName("test isGreaterThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Double actual = 2.0;
            Double expected = 1.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isGreaterThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isGreaterThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Double actual = 1.0;
            Double expected = 10.0;

            // when
            AbstractDoubleAssert asserts = new DoubleAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isGreaterThanOrEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '1.0' should be greater than or equal to '10.0'.");
        }
    }

}