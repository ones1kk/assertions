package com.github.ones1kk.asserts.core.feature.comparable.collection.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapComparableTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        MapComparable<Map<String, Object>, String, Object> comparable = new MapComparable<>();

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
        assertThat(comparable.isGraterThan(actual, expected1)).isFalse();
        assertThat(comparable.isGraterThan(actual, expected2)).isTrue();
        assertThat(comparable.isGraterThan(actual, expected3)).isTrue();

        assertThat(comparable.isLessThan(actual, expected1)).isFalse();
        assertThat(comparable.isLessThan(actual, expected2)).isFalse();
        assertThat(comparable.isLessThan(actual, expected3)).isFalse();

        assertThat(comparable.isLessThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(comparable.isLessThanOrEqualTo(actual, expected2)).isFalse();
        assertThat(comparable.isLessThanOrEqualTo(actual, expected3)).isFalse();

        assertThat(comparable.isGraterThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(actual, expected2)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(actual, expected3)).isTrue();

        assertThat(comparable.hasSameSizeOf(actual, expected1)).isTrue();
        assertThat(comparable.hasSameSizeOf(actual, expected2)).isFalse();
        assertThat(comparable.hasSameSizeOf(actual, expected3)).isFalse();

        assertThat(comparable.doesNotHaveSameSizeOf(actual, expected1)).isFalse();
        assertThat(comparable.doesNotHaveSameSizeOf(actual, expected2)).isTrue();
        assertThat(comparable.doesNotHaveSameSizeOf(actual, expected3)).isTrue();
    }

}