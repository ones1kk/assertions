package com.github.ones1kk.asserts.core.collection.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListCalculatorTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        ListCalculator<String> calculator = new ListCalculator<>();

        List<String> actual1 = Collections.singletonList("a");

        List<String> actual2 = Arrays.asList("a", "b");

        assertThat(calculator.isGraterThan(actual2, actual1)).isTrue();
        assertThat(calculator.isGraterThan(actual1, actual2)).isFalse();
        assertThat(calculator.isGraterThan(actual1, actual1)).isFalse();

        assertThat(calculator.isLessThan(actual1, actual2)).isTrue();
        assertThat(calculator.isLessThan(actual2, actual1)).isFalse();
        assertThat(calculator.isLessThan(actual1, actual1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(actual1, actual2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(actual2, actual1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(actual1, actual1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo(actual2, actual1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(actual1, actual2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo(actual1, actual1)).isTrue();

        assertThat(calculator.is(actual1, actual1)).isTrue();
        assertThat(calculator.is(actual1, actual2)).isFalse();

    }

}