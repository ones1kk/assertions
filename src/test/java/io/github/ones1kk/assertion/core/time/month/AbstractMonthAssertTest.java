package io.github.ones1kk.assertion.core.time.month;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class AbstractMonthAssertTest {

    @Nested
    @DisplayName("test isBefore()")
    class TestIsBefore {

        @Test
        @DisplayName("test isBefore success case")
        void testSuccess() throws Exception {
            // given
            Month actual = Month.of(1);
            Month expected = Month.of(2);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatNoException().isThrownBy(() -> asserts.isBefore(expected));
        }

        @Test
        @DisplayName("test isBefore fail case")
        void testFail() throws Exception {
            // given
            Month actual = Month.of(2);
            Month expected = Month.of(1);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatException().isThrownBy(() -> asserts.isBefore(expected));
        }
    }

    @Nested
    @DisplayName("test isBeforeOrEqualTo()")
    class TestIsBeforeOrEqualTo {

        @Test
        @DisplayName("test isBeforeOrEqualTo success case")
        void testSuccess() throws Exception {
            // given
            Month actual = Month.of(1);
            Month expected = Month.of(2);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatNoException().isThrownBy(() -> asserts.isBeforeOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isBeforeOrEqualTo fail case")
        void testFail() throws Exception {
            // given
            Month actual = Month.of(2);
            Month expected = Month.of(1);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatException().isThrownBy(() -> asserts.isBeforeOrEqualTo(expected));
        }
    }

    @Nested
    @DisplayName("test isAfter()")
    class TestIsAfter {

        @Test
        @DisplayName("test isAfter success case")
        void testSuccess() throws Exception {
            // given
            Month actual = Month.of(2);
            Month expected = Month.of(1);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatNoException().isThrownBy(() -> asserts.isAfter(expected));
        }

        @Test
        @DisplayName("test isAfter fail case")
        void testFail() throws Exception {
            // given
            Month actual = Month.of(1);
            Month expected = Month.of(2);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatException().isThrownBy(() -> asserts.isAfter(expected));
        }
    }

    @Nested
    @DisplayName("test isAfterOrEqualTo()")
    class TestIsAfterOrEqualTo {

        @Test
        @DisplayName("test isAfterOrEqualTo success case")
        void testSuccess() throws Exception {
            // given
            Month actual = Month.of(2);
            Month expected = Month.of(1);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatNoException().isThrownBy(() -> asserts.isAfterOrEqualTo(expected));
        }

        @Test
        @DisplayName("test isAfterOrEqualTo fail case")
        void testFail() throws Exception {
            // given
            Month actual = Month.of(1);
            Month expected = Month.of(2);


            // when
            AbstractMonthAssert asserts  = new MonthAssert(actual);

            // then
            Assertions.assertThatException().isThrownBy(() -> asserts.isAfterOrEqualTo(expected));
        }
    }

}