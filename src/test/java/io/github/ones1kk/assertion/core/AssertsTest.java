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

package io.github.ones1kk.assertion.core;

import io.github.ones1kk.assertion.core.lang.charsequence.AbstractCharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.CharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.ObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssertsTest {

    @Nested
    @DisplayName("create Asserts")
    class Test01 {

        @Test
        @DisplayName("assert actual of object type")
        void testCreateObjectAsserts() {
            // given
            Object actual = new Object();

            // when
            ObjectAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractObjectAssert.class);
        }

        @Test
        @DisplayName("assert actual of charSequence type")
        void testCreateCharSequenceAsserts() {
            // given
            CharSequence actual = "actual";

            // when
            CharSequenceAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractCharSequenceAssert.class);
        }

    }


}