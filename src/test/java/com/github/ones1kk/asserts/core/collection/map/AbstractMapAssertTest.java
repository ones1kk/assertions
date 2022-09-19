package com.github.ones1kk.asserts.core.collection.map;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.emptyMap;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractMapAssertTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        Map<String, String> actual1 = new HashMap<>();
        Map<String, String> actual2 = new HashMap<>();
        Map<String, String> actual3 = emptyMap();
        Map<String, String> actual4 = null;

        actual1.put("1", "1");
        actual1.put("2", "2");
        actual1.put("3", "3");

        actual2.put("a", "a");
        actual2.put("b", "b");

        Map<String, String> expected1 = new HashMap<>();
        expected1.put("1", "a");
        expected1.put("2", "b");

        Map<String, String> expected2 = new HashMap<>();
        expected2.put("1", "a");
        expected2.put("2", "b");
        expected2.put("3", "b");

        // when
        AbstractMapAssert<?, Map<String, String>, String, String> assert1 = new AbstractMapAssert<>(AbstractMapAssert.class, actual1);
        AbstractMapAssert<?, Map<String, String>, String, String> assert2 = new AbstractMapAssert<>(AbstractMapAssert.class, actual2);
        AbstractMapAssert<?, Map<String, String>, String, String> assert3 = new AbstractMapAssert<>(AbstractMapAssert.class, actual3);
        AbstractMapAssert<?, Map<String, String>, String, String> assert4 = new AbstractMapAssert<>(AbstractMapAssert.class, actual4);

        // then
        assertThrows(AssertException.class, assert1::isEmpty);
        assertThrows(AssertException.class, assert3::isNotEmpty);
        assertThrows(AssertException.class, assert1::isNullOrEmpty);

        assertThrows(AssertException.class, () -> assert1.containsKey("a"));
        assertThrows(AssertException.class, () -> assert1.containsAllKey(actual2));

        assertThrows(AssertException.class, () -> assert1.containsValue("a"));
        assertThrows(AssertException.class, () -> assert1.containsAllValue(actual2));

        assertThrows(AssertException.class, () -> assert1.hasSizeOf(2));
        assertThrows(AssertException.class, () -> assert1.hasSameSizeOf(new HashMap<>()));
        assertThrows(AssertException.class, () -> assert1.doesNotHaveSameSizeOf(actual1));

        assertThrows(AssertException.class, () -> assert1.isSmallerThan(actual2));
        assertThrows(AssertException.class, () -> assert1.isSmallerThan(actual1));

        assertThrows(AssertException.class, () -> assert1.isSmallerThanOrEqualTo(actual2));

        assertThrows(AssertException.class, () -> assert2.isLargerThan(actual1));
        assertThrows(AssertException.class, () -> assert2.isLargerThan(actual2));

        assertThrows(AssertException.class, () -> assert2.isLargerThanOrEqualTo(actual1));

        assertThrows(AssertException.class, () -> assert2.isBetweenSizeOf(actual2, actual3));

        assertThatNoException().isThrownBy(() -> {
            assert3.isEmpty();
            assert1.isNotEmpty();

            // empty
            assert3.isNullOrEmpty();
            // null
            assert4.isNullOrEmpty();

            assert1.containsKey("1");
            assert1.containsAllKey(expected1);

            assert2.containsValue("a");
            assert2.containsAllValue(expected1);

            assert1.hasSizeOf(3);
            assert1.hasSameSizeOf(expected2);

            assert1.doesNotHaveSameSizeOf(actual3);

            assert2.isSmallerThan(actual1);
            assert2.isSmallerThanOrEqualTo(actual2);
            assert2.isSmallerThanOrEqualTo(actual1);

            assert1.isLargerThan(actual2);
            assert1.isLargerThanOrEqualTo(expected1);
            assert1.isLargerThanOrEqualTo(actual1);

            assert2.isBetweenSizeOf(new HashMap<>(), actual1);
        });
    }

}