package io.github.ones1kk.assertion.core.collection.map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;

class AbstractMapAssertTest {

    @Nested
    @DisplayName("test isEmpty()")
    class TestisEmpty {

        @Test
        @DisplayName("test isEmpty() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Collections.emptyMap();

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isEmpty);
        }

        @Test
        @DisplayName("test isEmpty() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::isEmpty);
        }

    }

    @Nested
    @DisplayName("test isNotEmpty()")
    class TestisNotEmpty {

        @Test
        @DisplayName("test isNotEmpty() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotEmpty);
        }

        @Test
        @DisplayName("test isNotEmpty() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Collections.emptyMap();

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotEmpty);
        }

    }

    @Nested
    @DisplayName("test isNullOrEmpty()")
    class TestisNullOrEmpty {

        @Test
        @DisplayName("test isNullOrEmpty() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Collections.emptyMap();

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNullOrEmpty);
        }

        @Test
        @DisplayName("test isNullOrEmpty() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::isNullOrEmpty);
        }

    }

    @Nested
    @DisplayName("test containsKey()")
    class TestContainsKey {

        @Test
        @DisplayName("test containsKey() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsKey(1));
        }

        @Test
        @DisplayName("test containsKey() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsKey(4));
        }

    }

    @Nested
    @DisplayName("test containsAllKey()")
    class TestDoesNotContains {

        @Test
        @DisplayName("test containsAllKey() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsAllKey(expected));
        }

        @Test
        @DisplayName("test containsAllKey() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 4, 4);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsAllKey(expected));
        }

    }

    @Nested
    @DisplayName("test containsValue()")
    class TestContainsValue {

        @Test
        @DisplayName("test containsValue() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsValue(1));
        }

        @Test
        @DisplayName("test containsValue() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsValue(4));
        }

    }

    @Nested
    @DisplayName("test containsAllValue()")
    class TestContainsAllValue {

        @Test
        @DisplayName("test containsAllValue() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsAllValue(expected));
        }

        @Test
        @DisplayName("test containsAllValue() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3 ,4 ,4);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsAllValue(expected));
        }

    }

    @Nested
    @DisplayName("test hasSize()")
    class TestContainsAny {

        @Test
        @DisplayName("test hasSize() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasSize(3));
        }

        @Test
        @DisplayName("test hasSize() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.hasSize(4));
        }

    }

    @Nested
    @DisplayName("test hasSize()")
    class TestHasSize {

        @Test
        @DisplayName("test hasSize() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasSize(3));
        }

        @Test
        @DisplayName("test hasSize() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.hasSize(1));
        }

    }

    @Nested
    @DisplayName("test isSmallerThan()")
    class TestisSmallerThan {

        @Test
        @DisplayName("test isSmallerThan() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3, 4, 4);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isSmallerThan(expected));
        }

        @Test
        @DisplayName("test isSmallerThan() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3, 4, 4);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isSmallerThan(expected));
        }

    }

    @Nested
    @DisplayName("test isSmallerThanOrEqualTo()")
    class TestisSmallerThanOrEqualTo {

        @Test
        @DisplayName("test isSmallerThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3, 4, 4);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isSmallerThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isSmallerThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3, 4, 4);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isSmallerThanOrEqualTo(expected));
        }

    }

    @Nested
    @DisplayName("test isLargerThan()")
    class TestisLargerThan {

        @Test
        @DisplayName("test isLargerThan() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3, 4, 4);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLargerThan(expected));
        }

        @Test
        @DisplayName("test isLargerThan() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3, 4, 4);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLargerThan(expected));
        }

    }

    @Nested
    @DisplayName("test isLargerThanOrEqualTo()")
    class TestisLargerThanOrEqualTo {

        @Test
        @DisplayName("test isLargerThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3, 4, 4);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLargerThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isLargerThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1);
            Map<Object, Object> expected = Map.of(1, 1, 2, 2, 3, 3);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLargerThanOrEqualTo(expected));
        }

    }

    @Nested
    @DisplayName("test isBetweenSizeOf()")
    class TestisBetweenSizeOf {

        @Test
        @DisplayName("test isBetweenSizeOf() success case")
        void testSuccess() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1, 2, 2, 3, 3, 4, 4);
            Map<Object, Object> start = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> end = Map.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isBetweenSizeOf(start, end));
        }

        @Test
        @DisplayName("test isBetweenSizeOf() fail case")
        void testFail() throws Exception {
            // given
            Map<Object, Object> actual = Map.of(1, 1);
            Map<Object, Object> start = Map.of(1, 1, 2, 2, 3, 3);
            Map<Object, Object> end = Map.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

            // when
            AbstractMapAssert<Map<Object, Object>, Object, Object> asserts = new MapAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isBetweenSizeOf(start, end));
        }

    }

}