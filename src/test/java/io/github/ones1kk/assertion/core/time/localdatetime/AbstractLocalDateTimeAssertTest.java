package io.github.ones1kk.assertion.core.time.localdatetime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.*;

class AbstractLocalDateTimeTimeAssertTest {

    @Nested
    @DisplayName("test isBefore()")
    class TestIsBefore {

        @Test
        @DisplayName("test isBefore() success case")
        void testSuccess() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(1995, 2, 1, 1, 1, 1, 1);
            LocalDateTime expected = LocalDateTime.now();

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isBefore(expected));
        }

        @Test
        @DisplayName("test isBefore() fail case")
        void testFail() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.now();
            LocalDateTime expected = LocalDateTime.of(1995, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isBefore(expected));
        }

    }

    @Nested
    @DisplayName("test isBeforeOrEqualTo()")
    class TestIsBeforeOrEqualTo {

        @Test
        @DisplayName("test isBeforeOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(1995, 2, 1, 1, 1);
            LocalDateTime expected = LocalDateTime.now();

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isBeforeOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isBeforeOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.now();
            LocalDateTime expected = LocalDateTime.of(1995, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isBeforeOrEqualTo(expected));
        }

    }

    @Nested
    @DisplayName("test isAfter()")
    class TestIsAfter {

        @Test
        @DisplayName("test isAfter() success case")
        void testSuccess() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.now();
            LocalDateTime expected = LocalDateTime.of(1995, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isAfter(expected));
        }

        @Test
        @DisplayName("test isAfter() fail case")
        void testFail() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(1995, 2, 1, 1, 1);
            LocalDateTime expected = LocalDateTime.now();

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isAfter(expected));
        }

    }

    @Nested
    @DisplayName("test isAfterOrEqualTo()")
    class TestIsAfterOrEqualTo {

        @Test
        @DisplayName("test isAfterOrEqualTo() success case")
        void testSuccess() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.now();
            LocalDateTime expected = LocalDateTime.of(1995, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatNoException().isThrownBy(() -> asserts.isAfterOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isAfterOrEqualTo() fail case")
        void testFail() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(1995, 2, 1, 1, 1);
            LocalDateTime expected = LocalDateTime.now();

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatException().isThrownBy(() -> asserts.isAfterOrEqualTo(expected));
        }

    }


    @Nested
    @DisplayName("test isLeapYear()")
    class TestIsLeapYear {

        @Test
        @DisplayName("test isLeapYear() success case")
        void testSuccess() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(2024, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isLeapYear);
        }

        @Test
        @DisplayName("test isLeapYear() fail case")
        void testFail() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(1995, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isLeapYear);
        }

    }

    @Nested
    @DisplayName("test isNotLeapYear()")
    class TestIsNotLeapYear {

        @Test
        @DisplayName("test isNotLeapYear() success case")
        void testSuccess() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(1995, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatNoException().isThrownBy(asserts::isNotLeapYear);
        }

        @Test
        @DisplayName("test isNotLeapYear() fail case")
        void testFail() throws Exception {
            // given
            LocalDateTime actual = LocalDateTime.of(2024, 2, 1, 1, 1);

            // when
            AbstractLocalDateTimeAssert asserts = new LocalDateTimeAssert(actual);

            // then
            assertThatException().isThrownBy(asserts::isNotLeapYear);
        }

    }

}