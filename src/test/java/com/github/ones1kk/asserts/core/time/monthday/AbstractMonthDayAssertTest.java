package com.github.ones1kk.asserts.core.time.monthday;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.time.model.MonthDayAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.MonthDay;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractMonthDayAssertTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        // my b-day
        MonthDay actual1 = MonthDay.of(2, 1);
        MonthDay actual2 = MonthDay.of(1, 31);
        MonthDay actual3 = MonthDay.of(2, 2);

        // when
        AbstractMonthDayAssert<?, MonthDay> assert1 = new MonthDayAssert(actual1);

        // then
        assertThrows(AssertException.class, () -> assert1.isEqualTo(actual2));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isBefore(actual1));
        assertThrows(AssertException.class, () -> assert1.isBefore(actual2));
        assertThrows(AssertException.class, () -> assert1.isBeforeOrEqualTo(actual2));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual1));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual3));
        assertThrows(AssertException.class, () -> assert1.isAfterOrEqualTo(actual3));

        assertThatNoException().isThrownBy(() -> {
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(actual2);
            assert1.isBefore(actual3);
            assert1.isBeforeOrEqualTo(actual3);
            assert1.isBeforeOrEqualTo(actual1);
            assert1.isAfter(actual2);
            assert1.isAfterOrEqualTo(actual1);
            assert1.isAfterOrEqualTo(actual2);
        });
    }
}