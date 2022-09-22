package io.github.ones1kk.assertion.core.feature.comparable.collection.impl;

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
        assertThat(comparable.isLargerThan(actual, expected1)).isFalse();
        assertThat(comparable.isLargerThan(actual, expected2)).isTrue();
        assertThat(comparable.isLargerThan(actual, expected3)).isTrue();

        assertThat(comparable.isSmallerThan(actual, expected1)).isFalse();
        assertThat(comparable.isSmallerThan(actual, expected2)).isFalse();
        assertThat(comparable.isSmallerThan(actual, expected3)).isFalse();

        assertThat(comparable.isSmallerThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(comparable.isSmallerThanOrEqualTo(actual, expected2)).isFalse();
        assertThat(comparable.isSmallerThanOrEqualTo(actual, expected3)).isFalse();

        assertThat(comparable.isLargerThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(comparable.isLargerThanOrEqualTo(actual, expected2)).isTrue();
        assertThat(comparable.isLargerThanOrEqualTo(actual, expected3)).isTrue();

        assertThat(comparable.hasSameSizeOf(actual, expected1)).isTrue();
        assertThat(comparable.hasSameSizeOf(actual, expected2)).isFalse();
        assertThat(comparable.hasSameSizeOf(actual, expected3)).isFalse();

        assertThat(comparable.doesNotHaveSameSizeOf(actual, expected1)).isFalse();
        assertThat(comparable.doesNotHaveSameSizeOf(actual, expected2)).isTrue();
        assertThat(comparable.doesNotHaveSameSizeOf(actual, expected3)).isTrue();
    }

}