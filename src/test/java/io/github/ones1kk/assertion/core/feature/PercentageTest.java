package io.github.ones1kk.assertion.core.feature;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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

class PercentageTest {

    @Test
    @DisplayName("test create")
    @Disabled
    public void testCreate() throws Exception {
        Double actual1 = null;
        Double actual2 = -15.5;
        Double actual3 = 15.5;

        assertThrows(AssertException.class, () -> Percentage.of(actual1));
        assertThrows(AssertException.class, () -> Percentage.of(actual2));

        Percentage.of(actual3);
    }

    @Test
    @DisplayName("test method")
    public void testMethod() throws Exception {
        // given
        Integer actual = 80;

        // when
        Percentage<Number> percentage = Percentage.of(10.0);

        // then
        assertThat(percentage.isStartingRange(actual, 72)).isTrue();
        assertThat(percentage.isEndingRange(actual, 88)).isTrue();
        assertThat(percentage.isEndingRange(actual, 55)).isFalse();
        assertThat(percentage.isEndingRange(actual, 123)).isFalse();

        assertThat(percentage.isRange(actual, 123)).isFalse();
        assertThat(percentage.isRange(actual, 55)).isFalse();
        assertThat(percentage.isRange(actual, 72)).isTrue();
        assertThat(percentage.isRange(actual, 88)).isTrue();
    }

}