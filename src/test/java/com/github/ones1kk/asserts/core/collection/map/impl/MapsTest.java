package com.github.ones1kk.asserts.core.collection.map.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonMap;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MapsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        Map<String, String> actual1 = singletonMap("a", "a");
        Map<String, String> actual2 = emptyMap();
        Map<String, String> actual3 = singletonMap("a", "a");
        Map<String, String> actual4 = new HashMap<>();
        actual4.put("a", "a");
        actual4.put("b", "b");
        actual4.put("c", "c");

        // when
        Maps<Map<String, String>, String, String> maps = new Maps<>(asAssert);

        // then
        assertThrows(Exception.class, () -> maps.assertIsEmpty(actual1));
        assertThrows(Exception.class, () -> maps.assertIsNotEmpty(actual2));
        assertThrows(Exception.class, () -> maps.assertIsNullOrEmpty(actual1));

        assertThrows(Exception.class, () -> maps.assertContainsKey(actual1, "b"));
        assertThrows(Exception.class, () -> maps.assertContainsAllKey(actual1, actual4));

        assertThrows(Exception.class, () -> maps.assertContainsValue(actual1, "b"));
        assertThrows(Exception.class, () -> maps.assertContainsAllValue(actual1, actual4));

        assertThrows(Exception.class, () -> maps.assertIsSmallerThan(actual4, actual1));
        assertThrows(Exception.class, () -> maps.assertIsSmallerThan(actual4, actual4));
        assertThrows(Exception.class, () -> maps.assertIsSmallerThanOrEqualTo(actual4, actual1));

        assertThrows(Exception.class, () -> maps.assertIsLargerThan(actual1, actual4));
        assertThrows(Exception.class, () -> maps.assertIsLargerThan(actual1, actual3));
        assertThrows(Exception.class, () -> maps.assertIsLargerThanOrEqualTo(actual1, actual4));

        assertThrows(Exception.class, () -> maps.assertIsBetweenSizeOf(actual1, actual4, actual3));

        maps.assertIsEmpty(emptyMap());
        maps.assertIsNotEmpty(actual1);

        maps.assertIsNullOrEmpty(null);
        maps.assertIsNullOrEmpty(actual2);

        maps.assertContainsKey(actual1, "a");
        maps.assertContainsAllKey(actual1, actual3);

        maps.assertContainsValue(actual1, "a");
        maps.assertContainsAllValue(actual1, actual3);

        maps.assertHasSizeOf(actual1, 1);
        maps.assertHasSameSizeOf(actual1, actual3);
        maps.assertDoesNotHaveSameSizeOf(actual1, actual2);

        maps.assertIsSmallerThan(actual1, actual4);
        maps.assertIsSmallerThanOrEqualTo(actual1, actual3);
        maps.assertIsSmallerThanOrEqualTo(actual1, actual4);

        maps.assertIsLargerThan(actual4, actual1);
        maps.assertIsLargerThanOrEqualTo(actual4, actual1);
        maps.assertIsLargerThanOrEqualTo(actual4, actual4);

        maps.assertIsBetweenSizeOf(actual1, actual2, actual4);
    }
}