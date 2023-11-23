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

package io.github.ones1kk.assertion.core.lang.string;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;


class AbstractStringAssertTest {

    @Nested
    @DisplayName("test hasText()")
    class TestHasText {

        @Test
        @DisplayName("test hasText() success case")
        void testSuccess() throws Exception {
            // given
            String actual = "15";

            // when
            AbstractStringAssert asserts = new StringAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::hasText);
        }

        @Test
        @DisplayName("test hasText() fail case")
        void testFail() throws Exception {
            // given
            String actual = " ";

            // when
            AbstractStringAssert asserts = new StringAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::hasText)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given ' ' should has text.");
        }
    }

    @Nested
    @DisplayName("test hasLength()")
    class TestHasLength {

        @Test
        @DisplayName("test hasLength() success case")
        void testSuccess() throws Exception {
            // given
            String actual = "15";

            // when
            AbstractStringAssert asserts = new StringAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasLength(2));
        }

        @Test
        @DisplayName("test hasLength() fail case")
        void testFail() throws Exception {
            // given
            String actual = "15";

            // when
            AbstractStringAssert asserts = new StringAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.hasLength(1))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should be length of '2'.");
        }
    }

    @Nested
    @DisplayName("test hasSameLength()")
    class TestHasSameLength {

        @Test
        @DisplayName("test hasSameLength() success case")
        void testSuccess() throws Exception {
            // given
            String actual = "15";
            String expected = "15";

            // when
            AbstractStringAssert asserts = new StringAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasSameLength(expected));
        }

        @Test
        @DisplayName("test hasSameLength() fail case")
        void testFail() throws Exception {
            // given
            String actual = "15";
            String expected = "151";

            // when
            AbstractStringAssert asserts = new StringAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.hasSameLength(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should has same length of '151'.");
        }
    }

    @Nested
    @DisplayName("test matches()")
    class TestMatches {

        @Nested
        @DisplayName("test by regular expression")
        class TestMatchesByRegex {

            @Test
            @DisplayName("test matches() success case")
            void testSuccess() throws Exception {
                // given
                String actual = "15";
                String expected = "[0-9]{2}";

                // when
                AbstractStringAssert asserts = new StringAssert(actual);

                // then
                assertThatNoException().isThrownBy(() -> asserts.matches(expected));
            }

            @Test
            @DisplayName("test matches() fail case")
            void testFail() throws Exception {
                // given
                String actual = "15";
                String expected = "[a-z]";

                // when
                AbstractStringAssert asserts = new StringAssert(actual);

                // then
                assertThatException().isThrownBy(() -> asserts.matches(expected))
                        .isInstanceOf(AssertException.class)
                        .withMessage("The given '15' should be matched '[a-z]'");
            }
        }

        @Nested
        @DisplayName("test by Pattern")
        class TestMatchesByPattern {

            @Test
            @DisplayName("test matches() success case")
            void testSuccess() throws Exception {
                // given
                String actual = "15";
                Pattern expected = Pattern.compile("[0-9]{2}");

                // when
                AbstractStringAssert asserts = new StringAssert(actual);

                // then
                assertThatNoException().isThrownBy(() -> asserts.matches(expected));
            }

            @Test
            @DisplayName("test matches() fail case")
            void testFail() throws Exception {
                // given
                String actual = "15";
                Pattern expected = Pattern.compile("[a-z]");

                // when
                AbstractStringAssert asserts = new StringAssert(actual);

                // then
                assertThatException().isThrownBy(() -> asserts.matches(expected))
                        .isInstanceOf(AssertException.class)
                        .withMessage("The given '15' should be matched '[a-z]'");
            }
        }
    }

}