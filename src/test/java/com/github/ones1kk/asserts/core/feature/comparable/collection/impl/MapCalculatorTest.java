package com.github.ones1kk.asserts.core.feature.comparable.collection.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

class MapCalculatorTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        MapCalculator<Map<String, Object>, String, Object> calculator = new MapCalculator<>();

        Map<String, Object> actual = new HashMap<>();
        Map<String, Object> expected1 = new HashMap<>();
        Map<String, Object> expected2 = new HashMap<>();
        Map<String, Object> expected3 = new HashMap<>();

        // when
        actual.put("1", "1");
        actual.put("2", "2");
        actual.put("3", "3");

        expected1.put("1", "1");
        expected1.put("2", "2");
        expected1.put("3", "3");

        expected2.put("a", "a");
        expected2.put("b", "b");

        expected3.put("b", "b");

        // then
        assertThat(calculator.isGraterThan(actual, expected1)).isFalse();
        assertThat(calculator.isGraterThan(actual, expected2)).isTrue();
        assertThat(calculator.isGraterThan(actual, expected3)).isTrue();

        assertThat(calculator.isLessThan(actual, expected1)).isFalse();
        assertThat(calculator.isLessThan(actual, expected2)).isFalse();
        assertThat(calculator.isLessThan(actual, expected3)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(actual, expected2)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(actual, expected3)).isFalse();

        assertThat(calculator.isGraterThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(actual, expected2)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(actual, expected3)).isTrue();

        assertThat(calculator.hasSameSizeOf(actual, expected1)).isTrue();
        assertThat(calculator.hasSameSizeOf(actual, expected2)).isFalse();
        assertThat(calculator.hasSameSizeOf(actual, expected3)).isFalse();

        assertThat(calculator.doesNotHaveSameSizeOf(actual, expected1)).isFalse();
        assertThat(calculator.doesNotHaveSameSizeOf(actual, expected2)).isTrue();
        assertThat(calculator.doesNotHaveSameSizeOf(actual, expected3)).isTrue();
    }

}