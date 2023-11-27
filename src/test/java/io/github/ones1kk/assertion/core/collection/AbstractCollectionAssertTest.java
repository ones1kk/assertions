package io.github.ones1kk.assertion.core.collection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class AbstractCollectionAssertTest {

    @Nested
    @DisplayName("test isEmpty()")
    class TestisEmpty {

        @Test
        @DisplayName("test isEmpty() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Collections.emptyList();

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isEmpty);
        }

        @Test
        @DisplayName("test isEmpty() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

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
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotEmpty);
        }

        @Test
        @DisplayName("test isNotEmpty() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Collections.emptyList();

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

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
            List<Integer> actual = Collections.emptyList();

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNullOrEmpty);
        }

        @Test
        @DisplayName("test isNullOrEmpty() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::isNullOrEmpty);
        }

    }

    @Nested
    @DisplayName("test contains()")
    class TestContains {

        @Test
        @DisplayName("test contains() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.contains(1));
        }

        @Test
        @DisplayName("test contains() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.contains(4));
        }

    }

    @Nested
    @DisplayName("test doesNotContain()")
    class TestDoesNotContains {

        @Test
        @DisplayName("test doesNotContain() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.doesNotContain(4));
        }

        @Test
        @DisplayName("test doesNotContain() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.doesNotContain(2));
        }

    }

    @Nested
    @DisplayName("test containsAll()")
    class TestContainsAll {

        @Test
        @DisplayName("test containsAll() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsAll(1, 2));
        }

        @Test
        @DisplayName("test containsAll() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsAll(4));
        }

    }

    @Nested
    @DisplayName("test containsAny()")
    class TestContainsAny {

        @Test
        @DisplayName("test containsAny() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsAny(1, 2, 5));
        }

        @Test
        @DisplayName("test containsAny() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsAny(4, 5));
        }

    }

    @Nested
    @DisplayName("test containsNull()")
    class TestContainsNull {

        @Test
        @DisplayName("test containsNull() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, null);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::containsNull);
        }

        @Test
        @DisplayName("test containsNull() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::containsNull);
        }

    }

    @Nested
    @DisplayName("test doesNotContainNull()")
    class TestDoesNotContainsNull {

        @Test
        @DisplayName("test doesNotContainNull() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::doesNotContainNull);
        }

        @Test
        @DisplayName("test doesNotContainNull() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, null);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::doesNotContainNull);
        }

    }

    @Nested
    @DisplayName("test allMatch()")
    class TestAllMatch {

        @Test
        @DisplayName("test allMatch() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.allMatch(element -> element > 0));
        }

        @Test
        @DisplayName("test allMatch() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, null);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.allMatch(element -> element > 0));
        }

    }

    @Nested
    @DisplayName("test noneMatch()")
    class TestNoneMatch {

        @Test
        @DisplayName("test noneMatch() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.noneMatch(element -> element > 100));
        }

        @Test
        @DisplayName("test noneMatch() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, null);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.noneMatch(element -> element > 0));
        }

    }

    @Nested
    @DisplayName("test hasSize()")
    class TestHasSize {

        @Test
        @DisplayName("test hasSize() success case")
        void testSuccess() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasSize(3));
        }

        @Test
        @DisplayName("test hasSize() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, null);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

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
            List<Integer> actual = Arrays.asList(1, 2, 3);
            List<Integer> expected = Arrays.asList(1, 2, 3, 4);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isSmallerThan(expected));
        }

        @Test
        @DisplayName("test isSmallerThan() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, null);
            List<Integer> expected = Arrays.asList(1, 2);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

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
            List<Integer> actual = Arrays.asList(1, 2, 3);
            List<Integer> expected = Arrays.asList(1, 2, 3, 4);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isSmallerThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isSmallerThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, null);
            List<Integer> expected = Arrays.asList(1, 2);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

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
            List<Integer> actual = Arrays.asList(1, 2, 3, 4);
            List<Integer> expected = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLargerThan(expected));
        }

        @Test
        @DisplayName("test isLargerThan() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2);
            List<Integer> expected = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

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
            List<Integer> actual = Arrays.asList(1, 2, 3, 4);
            List<Integer> expected = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLargerThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isLargerThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2);
            List<Integer> expected = Arrays.asList(1, 2, 3);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

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
            List<Integer> actual = Arrays.asList(1, 2, 3, 4);
            List<Integer> start = Arrays.asList(1, 2, 3);
            List<Integer> end = Arrays.asList(1, 2, 3, 4, 5);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isBetweenSizeOf(start, end));
        }

        @Test
        @DisplayName("test isBetweenSizeOf() fail case")
        void testFail() throws Exception {
            // given
            List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5, 6);
            List<Integer> start = Arrays.asList(1, 2, 3);
            List<Integer> end = Arrays.asList(1, 2, 3, 4, 5);

            // when
            CollectionAssert<Integer> asserts = new CollectionAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isBetweenSizeOf(start, end));
        }

    }

}