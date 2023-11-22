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

package io.github.ones1kk.assertion.core.info;

import io.github.ones1kk.assertion.core.description.Description;
import io.github.ones1kk.assertion.core.description.formatter.Formattable;
import io.github.ones1kk.assertion.core.description.formatter.impl.DefaultTextFormatter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ErrorMessageInfoTest {

    @Nested
    @DisplayName("error message")
    class Test01 {

        @Test
        @DisplayName("override error message")
        void testOverrideErrorMessage() {
            // given
            String greeting = "hello i am {}";
            Object[] args = {"ones1kk"};

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // and
            Description description = new Description(greeting, args);

            // when
            errorMessageInfo.overrideErrorMessage(description);

            // and
            Description errorMessage = errorMessageInfo.getErrorMessage();

            // then
            assertThat(errorMessage).isNotNull();
        }

        @Test
        @DisplayName("has override error message")
        void testHasOverrideErrorMessage() {
            // given
            String greeting = "hello i am {}";
            Object[] args = {"ones1kk"};

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // and
            Description description = new Description(greeting, args);
            errorMessageInfo.overrideErrorMessage(description);

            // when
            boolean result = errorMessageInfo.hasOverrideErrorMessage();

            // then
            assertThat(result).isTrue();
        }
    }

    @Nested
    @DisplayName("configuration")
    class Test02 {

        @Test
        @DisplayName("configure")
        void testConfigure() {
            // given
            Formattable formatter = new DefaultTextFormatter();

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // when
            errorMessageInfo.configure(formatter);

            // and
            Formattable configuration = errorMessageInfo.getConfiguration();

            // then
            assertThat(configuration).isNotNull()
                    .isEqualTo(formatter);
        }

        @Test
        @DisplayName("has configuration")
        void testHasConfigure() {
            // given
            Formattable formatter = new DefaultTextFormatter();

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // when
            errorMessageInfo.configure(formatter);

            // and
            boolean result = errorMessageInfo.hasConfiguration();

            // then
            assertThat(result).isTrue();
        }
    }

}