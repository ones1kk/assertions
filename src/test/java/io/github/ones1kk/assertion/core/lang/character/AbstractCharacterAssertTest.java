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

package io.github.ones1kk.assertion.core.lang.character;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;

class AbstractCharacterAssertTest {

    @Nested
    @DisplayName("test isLowerCase()")
    class TestIsLowerCase {

        @Test
        @DisplayName("test isLowerCase() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isLowerCase);
        }

        @Test
        @DisplayName("test isLowerCase() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'A';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isLowerCase)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'A' should be lower case.");
        }
    }

    @Nested
    @DisplayName("test isNotLowerCase()")
    class TestIsNotLowerCase {

        @Test
        @DisplayName("test isNotLowerCase() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'A';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotLowerCase);
        }

        @Test
        @DisplayName("test isNotLowerCase() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotLowerCase)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'a' should not be lower case.");
        }
    }

    @Nested
    @DisplayName("test isUpperCase()")
    class TestIsUpperCase {

        @Test
        @DisplayName("test isUpperCase() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'A';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isUpperCase);
        }

        @Test
        @DisplayName("test isUpperCase() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isUpperCase)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'a' should be upper case.");
        }
    }

    @Nested
    @DisplayName("test isNotUpperCase()")
    class TestIsNotUpperCase {

        @Test
        @DisplayName("test isNotUpperCase() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotUpperCase);
        }

        @Test
        @DisplayName("test isNotUpperCase() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'A';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotUpperCase)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'A' should not be upper case.");
        }
    }

    @Nested
    @DisplayName("test isLetter()")
    class TestIsLetter {

        @Test
        @DisplayName("test isLetter() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isLetter);
        }

        @Test
        @DisplayName("test isLetter() fail case")
        void testFail() throws Exception {
            // given
            Character actual = '5';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isLetter)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given '5' should be letter.");
        }
    }

    @Nested
    @DisplayName("test isNotLetter()")
    class TestIsNotLetter {

        @Test
        @DisplayName("test isNotLetter() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = '5';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotLetter);
        }

        @Test
        @DisplayName("test isNotLetter() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotLetter)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'a' should not be letter.");
        }
    }

    @Nested
    @DisplayName("test isDigit()")
    class TestIsDigit {

        @Test
        @DisplayName("test isDigit() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = '5';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isDigit);
        }

        @Test
        @DisplayName("test isDigit() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isDigit)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'a' should be digit.");
        }
    }

    @Nested
    @DisplayName("test isNotDigit()")
    class TestIsNotDigit {

        @Test
        @DisplayName("test isNotDigit() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotDigit);
        }

        @Test
        @DisplayName("test isNotDigit() fail case")
        void testFail() throws Exception {
            // given
            Character actual = '5';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotDigit)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The give '5' should not be digit.");
        }
    }

    @Nested
    @DisplayName("test isWhitespace()")
    class TestIsWhitespace {

        @Test
        @DisplayName("test isWhitespace() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = ' ';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isWhitespace);
        }

        @Test
        @DisplayName("test isWhitespace() fail case")
        void testFail() throws Exception {
            // given
            Character actual = '5';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isWhitespace)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The give '5' should be whitespace.");
        }
    }

    @Nested
    @DisplayName("test isNotWhitespace()")
    class TestIsNotWhitespace {

        @Test
        @DisplayName("test isNotWhitespace() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotWhitespace);
        }

        @Test
        @DisplayName("test isNotWhitespace() fail case")
        void testFail() throws Exception {
            // given
            Character actual = ' ';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotWhitespace)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The give ' ' should not be whitespace.");
        }
    }

    @Nested
    @DisplayName("test isLessThan()")
    class TestIsLessThan {

        @Test
        @DisplayName("test isLessThan() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'a';
            Character expected = 'b';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLessThan(expected));
        }

        @Test
        @DisplayName("test isLessThan() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'b';
            Character expected = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLessThan(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'b' should be less than 'a'.");
        }
    }

    @Nested
    @DisplayName("test isLessThanOrEqualTo()")
    class TestIsLessThanOrEqualTo {

        @Test
        @DisplayName("test isLessThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'a';
            Character expected = 'b';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLessThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isLessThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'b';
            Character expected = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLessThanOrEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'b' should be less than or equal to 'a'.");
        }
    }

    @Nested
    @DisplayName("test isGreaterThan()")
    class TestisGreaterThan {

        @Test
        @DisplayName("test isGreaterThan() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'b';
            Character expected = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isGreaterThan(expected));
        }

        @Test
        @DisplayName("test isGreaterThan() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'a';
            Character expected = 'b';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isGreaterThan(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'a' should be greater than 'b'.");
        }
    }

    @Nested
    @DisplayName("test isGreaterThanOrEqualTo()")
    class TestisGreaterThanOrEqualTo {

        @Test
        @DisplayName("test isGreaterThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'b';
            Character expected = 'a';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isGreaterThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isGreaterThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'a';
            Character expected = 'b';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isGreaterThanOrEqualTo(expected))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'a' should be greater than or equal to 'b'.");
        }
    }

    @Nested
    @DisplayName("test isBetween()")
    class TestisBetween {

        @Test
        @DisplayName("test isBetween() success case")
        void testSuccess() throws Exception {
            // given
            Character actual = 'b';
            Character start = 'a';
            Character end = 'c';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isBetween(start, end));
        }

        @Test
        @DisplayName("test isBetween() fail case")
        void testFail() throws Exception {
            // given
            Character actual = 'g';
            Character start = 'a';
            Character end = 'c';

            // when
            AbstractCharacterAssert asserts = new CharacterAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isBetween(start, end))
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'g' should be between 'a' and 'c'.");
        }
    }

}