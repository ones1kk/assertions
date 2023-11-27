package io.github.ones1kk.assertion.core.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AbstractArrayAssertTest {

    @Nested
    @DisplayName("test isEmpty()")
    class TestIsEmpty {

        @Test
        @DisplayName("test isEmpty() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isEmpty);
        }

        @Test
        @DisplayName("test isEmpty() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::isEmpty);
        }

    }

    @Nested
    @DisplayName("test isNotEmpty()")
    class TestIsNotEmpty {

        @Test
        @DisplayName("test isNotEmpty() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotEmpty);
        }

        @Test
        @DisplayName("test isNotEmpty() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotEmpty);
        }

    }

    @Nested
    @DisplayName("test isNullOrEmpty()")
    class TestIsNullOrEmpty {

        @Test
        @DisplayName("test isNullOrEmpty() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNullOrEmpty);
        }

        @Test
        @DisplayName("test isNullOrEmpty() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

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
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.contains("1"));
        }

        @Test
        @DisplayName("test contains() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.contains("4"));
        }

    }

    @Nested
    @DisplayName("test doesNotContain()")
    class TestDoesNotContain {

        @Test
        @DisplayName("test doesNotContain() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.doesNotContain("4"));
        }

        @Test
        @DisplayName("test doesNotContain() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.doesNotContain("3"));
        }

    }

    @Nested
    @DisplayName("test containsAll()")
    class TestContainAll {

        @Test
        @DisplayName("test containsAll() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsAll("1", "2"));
        }

        @Test
        @DisplayName("test containsAll() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsAll("3", "4"));
        }

    }

    @Nested
    @DisplayName("test containsAny()")
    class TestContainAny {

        @Test
        @DisplayName("test containsAny() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.containsAny("1", "5", "6"));
        }

        @Test
        @DisplayName("test containsAny() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.containsAny("4", "5"));
        }

    }

    @Nested
    @DisplayName("test containsNull()")
    class TestContainNull {

        @Test
        @DisplayName("test containsNull() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3", null};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::containsNull);
        }

        @Test
        @DisplayName("test containsNull() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(asserts::containsNull);
        }

    }

    @Nested
    @DisplayName("test doesNotContainNull()")
    class TestDoesNotContainNull {

        @Test
        @DisplayName("test doesNotContainNull() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(asserts::doesNotContainNull);
        }

        @Test
        @DisplayName("test doesNotContainNull() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3", null};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

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
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.allMatch(element -> !element.isEmpty()));
        }

        @Test
        @DisplayName("test allMatch() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3", null};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.allMatch(element -> !element.isEmpty()));
        }

    }

    @Nested
    @DisplayName("test noneMatch()")
    class TestNoneMatch {

        @Test
        @DisplayName("test noneMatch() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.noneMatch(element -> element.length() > 2));
        }

        @Test
        @DisplayName("test noneMatch() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3", null};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.noneMatch(element -> !element.isEmpty()));
        }

    }

    @Nested
    @DisplayName("test hasSize()")
    class TestHasSize {

        @Test
        @DisplayName("test hasSize() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.hasSize(3));
        }

        @Test
        @DisplayName("test hasSize() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3", null};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.hasSize(1));
        }

    }

    @Nested
    @DisplayName("test isShorterThan()")
    class TestIsShorterThan {

        @Test
        @DisplayName("test isShorterThan() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};
            String[] expected = {"1", "2", "3", "4"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isShorterThan(expected));
        }

        @Test
        @DisplayName("test isShorterThan() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3", null};
            String[] expected = {"1", "2"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isShorterThan(expected));
        }

    }

    @Nested
    @DisplayName("test isShorterThanOrEqualTo()")
    class TestIsShorterThanOrEqualTo {

        @Test
        @DisplayName("test isShorterThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3"};
            String[] expected = {"1", "2", "3", "4"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isShorterThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isShorterThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2", "3", null};
            String[] expected = {"1", "2"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isShorterThanOrEqualTo(expected));
        }

    }

    @Nested
    @DisplayName("test isLongerThan()")
    class TestIsLongerThan {

        @Test
        @DisplayName("test isLongerThan() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3", "4"};
            String[] expected = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLongerThan(expected));
        }

        @Test
        @DisplayName("test isLongerThan() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2"};
            String[] expected = {"1", "2", "3", null};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLongerThan(expected));
        }

    }

    @Nested
    @DisplayName("test isLongerThanOrEqualTo()")
    class TestIsLongerThanOrEqualTo {

        @Test
        @DisplayName("test isLongerThanOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3", "4"};
            String[] expected = {"1", "2", "3"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isLongerThanOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isLongerThanOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2"};
            String[] expected = {"1", "2", "3", null};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isLongerThanOrEqualTo(expected));
        }

    }

    @Nested
    @DisplayName("test isBetweenLengthOf()")
    class TestIsBetweenLengthOf {

        @Test
        @DisplayName("test isBetweenLengthOf() success case")
        void testSuccess() throws Exception {
            // given
            String[] actual = {"1", "2", "3", "4"};
            String[] start = {"1", "2"};
            String[] end = {"1", "2", "3", "4"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isBetweenLengthOf(start, end));
        }

        @Test
        @DisplayName("test isBetweenLengthOf() fail case")
        void testFail() throws Exception {
            // given
            String[] actual = {"1", "2"};
            String[] start = {"1", "2", "3"};
            String[] end = {"1", "2"};

            // when
            AbstractArrayAssert<String> asserts = new ArrayAssert<>(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isBetweenLengthOf(start, end));
        }

    }

}