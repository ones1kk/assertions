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

package io.github.ones1kk.assertion.core.description.formatter.impl;

import io.github.ones1kk.assertion.core.description.Description;
import io.github.ones1kk.assertion.core.description.formatter.Formattable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleTextFormatterTest {

    @Test
    @DisplayName("test how it prints")
    void testPrintWithAllArgument() throws Exception {
        // given
        String message = "test is equal to test";
        String actual = "test";
        String expected = "test";

        Formattable simpleTextFormatter = new SimpleTextFormatter();

        Description description = new Description(message);

        // when
        String result1 = simpleTextFormatter.format(message, actual, expected);
        String result2 = simpleTextFormatter.format(description, actual, expected);

        // then
        assertThat(result1).isNotNull().isEqualTo(result2);
        assertThat(result2).isNotNull().isEqualTo(result1);

        System.out.println(result1);
        System.out.println(result2);
    }

    @Test
    @DisplayName("test how it prints")
    void testPrintWithActual() throws Exception {
        // given
        String message = "test is equal to test";
        String actual = "actual";

        Formattable simpleTextFormatter = new SimpleTextFormatter();

        Description description = new Description(message);

        // when
        String result1 = simpleTextFormatter.format(message, actual);
        String result2 = simpleTextFormatter.format(description, actual);

        // then
        assertThat(result1).isNotNull().isEqualTo(result2);
        assertThat(result2).isNotNull().isEqualTo(result1);

        System.out.println(result1);
        System.out.println(result2);
    }

    @Test
    @DisplayName("test how it prints")
    void testPrint() throws Exception {
        // given
        String message = "test is equal to test";

        Formattable simpleTextFormatter = new SimpleTextFormatter();

        Description description = new Description(message);

        // when
        String result1 = simpleTextFormatter.format(message);
        String result2 = simpleTextFormatter.format(description);

        // then
        assertThat(result1).isNotNull().isEqualTo(result2);
        assertThat(result2).isNotNull().isEqualTo(result1);

        System.out.println(result1);
        System.out.println(result2);
    }

}