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

package io.github.ones1kk.assertion.core.net;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class AbstractUrlAssertTest {

    private static final String GOOGLE = "https://www.google.com";

    @Nested
    @DisplayName("test hasHost()")
    class TestHasHost {

        @Test
        @DisplayName("test hasHost() success case")
        void testSuccess() throws Exception {
            // given
            URL actual = new URL(GOOGLE);

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasHost("www.google.com"));
        }

        @Test
        @DisplayName("test hasHost() success case")
        void testFail() throws Exception {
            // given
            URL actual = new URL(GOOGLE);

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.hasHost("www.github.com"));
        }
    }

    @Nested
    @DisplayName("test hasPort()")
    class TestHasPort {

        @Test
        @DisplayName("test hasPort() success case")
        void testSuccess() throws Exception {
            // given
            URL actual = new URL(GOOGLE);

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasPort(443));
        }

        @Test
        @DisplayName("test hasPort() success case")
        void testFail() throws Exception {
            // given
            URL actual = new URL(GOOGLE);

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.hasPort(8080));
        }
    }

    @Nested
    @DisplayName("test hasPath()")
    class TestHasPath {

        @Test
        @DisplayName("test hasPath() success case")
        void testSuccess() throws Exception {
            // given
            URL actual = new URL(GOOGLE + "/search?q=aaa");

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasPath("/search"));
        }

        @Test
        @DisplayName("test hasPath() success case")
        void testFail() throws Exception {
            // given
            URL actual = new URL(GOOGLE);

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatThrownBy(() -> asserts.hasPath("/search"));
        }
    }

    @Nested
    @DisplayName("test doesNotHavePath()")
    class TestDoesNotHavePath {

        @Test
        @DisplayName("test doesNotHavePath() success case")
        void testSuccess() throws Exception {
            // given
            URL actual = new URL(GOOGLE);

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::doesNotHavePath);
        }

        @Test
        @DisplayName("test doesNotHavePath() success case")
        void testFail() throws Exception {
            // given
            URL actual = new URL(GOOGLE + "/search/q=aaa");

            // when
            AbstractUrlAssert asserts = new UrlAssert(actual);

            // then
            assertThatThrownBy(asserts::doesNotHavePath);
        }
    }

}