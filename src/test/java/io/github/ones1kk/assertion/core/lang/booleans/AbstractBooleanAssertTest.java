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

package io.github.ones1kk.assertion.core.lang.booleans;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;

class AbstractBooleanAssertTest {

    @Nested
    @DisplayName("test isFalse()")
    class TestisFalse {

        @Test
        @DisplayName("test isFalse() success case")
        void testSuccess() throws Exception {
            // given
            Boolean actual = false;

            // when
            AbstractBooleanAssert asserts = new BooleanAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isFalse);
        }

        @Test
        @DisplayName("test isFalse() fail case")
        void testFail() throws Exception {
            // given
            Boolean actual = true;

            // when
            AbstractBooleanAssert asserts = new BooleanAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isFalse)
                    .isInstanceOf(AssertException.class)
                    .withMessage("The given 'actual' should be false.");
        }


        @Nested
        @DisplayName("test isTrue()")
        class TestisTrue {

            @Test
            @DisplayName("test isTrue() success case")
            void testSuccess() throws Exception {
                // given
                Boolean actual = true;

                // when
                AbstractBooleanAssert asserts = new BooleanAssert(actual);

                // then
                assertThatNoException().isThrownBy(asserts::isTrue);
            }

            @Test
            @DisplayName("test isTrue() fail case")
            void testFail() throws Exception {
                // given
                Boolean actual = false;

                // when
                AbstractBooleanAssert asserts = new BooleanAssert(actual);

                // then
                assertThatException().isThrownBy(asserts::isTrue)
                        .isInstanceOf(AssertException.class)
                        .withMessage("The given 'actual' should be true.");
            }
        }
    }
}