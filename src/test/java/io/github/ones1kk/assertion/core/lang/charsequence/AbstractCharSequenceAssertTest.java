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

package io.github.ones1kk.assertion.core.lang.charsequence;


import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;

class AbstractCharSequenceAssertTest {

    @Nested
    @DisplayName("test isEmpty()")
    class TestIsEmpty {

        @Test
        @DisplayName("test isEmpty() success case")
        void testSuccess() throws Exception {
            // given
            CharSequence actual = "";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isEmpty);
        }

        @Test
        @DisplayName("test isEmpty() fail case")
        void testFail() throws Exception {
            // given
            CharSequence actual = "15";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isEmpty)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should be empty.");
        }
    }

    @Nested
    @DisplayName("test isNotEmpty()")
    class TestIsNotEmpty {

        @Test
        @DisplayName("test isEmpty() success case")
        void testSuccess() throws Exception {
            // given
            CharSequence actual = "15";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotEmpty);
        }

        @Test
        @DisplayName("test isNotEmpty() fail case")
        void testFail() throws Exception {
            // given
            CharSequence actual = "";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotEmpty)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '' should not be empty.");
        }

    }

    @Nested
    @DisplayName("test isBlank()")
    class TestIsBlank {

        @Test
        @DisplayName("test isEmpty() success case")
        void testSuccess() throws Exception {
            // given
            CharSequence actual = " ";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isBlank);
        }

        @Test
        @DisplayName("test isBlank() fail case")
        void testFail() throws Exception {
            // given
            CharSequence actual = "15";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isBlank)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '15' should be blank.");
        }
    }

    @Nested
    @DisplayName("test isNotBlank()")
    class TestIsNotBlank {

        @Test
        @DisplayName("test isEmpty() success case")
        void testSuccess() throws Exception {
            // given
            CharSequence actual = "15";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotBlank);
        }

        @Test
        @DisplayName("test isNotBlank() fail case")
        void testFail() throws Exception {
            // given
            CharSequence actual = " ";

            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotBlank)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given ' ' should not be blank.");
        }
    }

    @Nested
    @DisplayName("test isEqualToIgnoreCase()")
    class TestIsEqualToIgnoreCase {

        @ParameterizedTest
        @CsvSource(value = {"test|TEST", "test|test"}, delimiter = '|')
        @DisplayName("test isEmpty() success case")
        void testSuccess(String actual, String expected) throws Exception {
            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isEqualToIgnoreCase(expected));
        }

        @ParameterizedTest
        @CsvSource(value = {"test|TSET", "test|tset"}, delimiter = '|')
        @DisplayName("test isEqualToIgnoreCase() fail case")
        void testFail(String actual, String expected) throws Exception {
            // when
            AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> asserts = new CharSequenceAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isEqualToIgnoreCase(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '" + actual + "' should be equal to '" + expected + "', case insensitively.");
        }
    }
}