package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl.MapContainable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapContainableTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        MapContainable<Map<String, Object>, String, Object> containable = new MapContainable<>();

        Map<String, Object> actual = new HashMap<>();
        Map<String, Object> expected1 = new HashMap<>();
        Map<String, Object> expected2 = new HashMap<>();

        // when
        actual.put("1", "1");
        actual.put("2", "2");
        actual.put("3", "3");

        expected1.put("1", "1");
        expected1.put("2", "2");
        expected1.put("3", "3");

        expected2.put("a", "a");
        expected2.put("b", "b");
        expected2.put("c", "c");

        // then
        assertThat(containable.containsAllKey(actual, expected1)).isTrue();
        assertThat(containable.containsAllKey(actual, expected2)).isFalse();
        assertThat(containable.doesNotContainAllKey(actual, expected1)).isFalse();
        assertThat(containable.doesNotContainAllKey(actual, expected2)).isTrue();

        assertThat(containable.containsAllValue(actual, expected1)).isTrue();
        assertThat(containable.containsAllValue(actual, expected2)).isFalse();
        assertThat(containable.doesNotContainAllValue(actual, expected1)).isFalse();
        assertThat(containable.doesNotContainAllValue(actual, expected2)).isTrue();
    }
}