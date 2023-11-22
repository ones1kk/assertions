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

package io.github.ones1kk.assertion.core.description;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class DescriptionTest {

    @Nested
    @DisplayName("create Description")
    class Test01 {

        @Test
        @DisplayName("create description")
        void testCreateDescription() {
            // given
            String message = "hello i am ones1k";

            // when
            Description description = new Description(message);

            // then
            assertThat(description).isNotNull();
        }

        @Test
        @DisplayName("create description with braces")
        void testCreateDescriptionWithBraces() {
            // given
            String message = "hello i am {}";
            String argument = "ones1k";

            // when
            Description description = new Description(message, argument);

            // then
            assertThat(description).isNotNull();
        }

        @ParameterizedTest
        @ValueSource(strings = {"he@llo %s i#s t]es-t", "he@llo %%s i!s te@#{(st", "hello i am {}"})
        @DisplayName("can not create invalid format")
        void testCreateInvalidDescription(String value) {
            assertThatThrownBy(() -> new Description(value))
                    .isInstanceOf(AssertException.class);
        }

    }

}