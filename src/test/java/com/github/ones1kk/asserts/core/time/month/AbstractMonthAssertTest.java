package com.github.ones1kk.asserts.core.time.month;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.time.model.MonthAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractMonthAssertTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        Month actual1 = Month.FEBRUARY;

        // when
        AbstractMonthAssert<?, Month> assert1 = new MonthAssert(actual1);

        // then
        assertThrows(AssertException.class, () -> assert1.isEqualTo(Month.JANUARY));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isBefore(actual1));
        assertThrows(AssertException.class, () -> assert1.isBefore(Month.JANUARY));
        assertThrows(AssertException.class, () -> assert1.isBeforeOrEqualTo(Month.JANUARY));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual1));
        assertThrows(AssertException.class, () -> assert1.isAfter(Month.MARCH));
        assertThrows(AssertException.class, () -> assert1.isAfterOrEqualTo(Month.MARCH));

        Assertions.assertThatNoException().isThrownBy(() -> {
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(Month.MARCH);
            assert1.isBefore(Month.MARCH);
            assert1.isBeforeOrEqualTo(Month.MARCH);
            assert1.isBeforeOrEqualTo(actual1);
            assert1.isAfter(Month.JANUARY);
            assert1.isAfterOrEqualTo(actual1);
            assert1.isAfterOrEqualTo(Month.JANUARY);
        });
    }
}