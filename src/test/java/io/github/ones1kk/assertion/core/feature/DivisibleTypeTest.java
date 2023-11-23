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


package io.github.ones1kk.assertion.core.feature;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class DivisibleTypeTest {

    @Test
    @DisplayName("test positive value")
    public void testPositiveValue() throws Exception {
        DivisibleType intType = DivisibleType.of(1);

        assertThat(intType.isZero()).isFalse();
        assertThat(intType.isNotZero()).isTrue();
        assertThat(intType.isEven()).isFalse();
        assertThat(intType.isOdd()).isTrue();

        DivisibleType doubleType = DivisibleType.of(1.15);
        assertThat(doubleType.isZero()).isFalse();
        assertThat(doubleType.isNotZero()).isTrue();
        assertThat(doubleType.isEven()).isFalse();
        assertThat(doubleType.isOdd()).isTrue();
    }

    @Test
    @DisplayName("test negative value")
    public void testNegativeValue() throws Exception {
        DivisibleType intType = DivisibleType.of(-1);

        assertThat(intType.isZero()).isFalse();
        assertThat(intType.isNotZero()).isTrue();
        assertThat(intType.isEven()).isFalse();
        assertThat(intType.isOdd()).isTrue();

        DivisibleType doubleType = DivisibleType.of(-1.15);
        assertThat(doubleType.isZero()).isFalse();
        assertThat(doubleType.isNotZero()).isTrue();
        assertThat(doubleType.isEven()).isFalse();
        assertThat(doubleType.isOdd()).isTrue();

        DivisibleType doubleUnit2 = DivisibleType.of(-2.00);
        assertThat(doubleUnit2.isZero()).isFalse();
        assertThat(doubleUnit2.isNotZero()).isTrue();
        assertThat(doubleUnit2.isEven()).isTrue();
        assertThat(doubleUnit2.isOdd()).isFalse();
    }
}