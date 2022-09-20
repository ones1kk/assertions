package io.github.ones1kk.asserts.core.time.year;

import io.github.ones1kk.asserts.core.exception.AssertException;
import io.github.ones1kk.asserts.core.time.model.YearAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractYearAssertTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        // my birth year
        Year actual1 = Year.of(1995);
        // leap year
        Year actual2 = Year.of(1996);

        // when
        AbstractYearAssert<?, Year> assert1 = new YearAssert(actual1);
        AbstractYearAssert<?, Year> assert2 = new YearAssert(actual2);

        // then
        assertThrows(AssertException.class, assert1::isLeapYear);
        assertThrows(AssertException.class, assert2::isNotLeapYear);
        assertThrows(AssertException.class, () -> assert1.isEqualTo(actual2));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isBefore(actual1));
        assertThrows(AssertException.class, () -> assert1.isBefore(Year.of(1994)));
        assertThrows(AssertException.class, () -> assert1.isBeforeOrEqualTo(Year.of(1994)));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual1));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual2));
        assertThrows(AssertException.class, () -> assert1.isAfterOrEqualTo(actual2));

        assertThatNoException().isThrownBy(() -> {
            assert2.isLeapYear();
            assert1.isNotLeapYear();

            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(Year.of(1994));
            assert1.isBefore(actual2);
            assert1.isBeforeOrEqualTo(actual2);
            assert1.isBeforeOrEqualTo(actual1);
            assert1.isAfter(Year.of(1994));
            assert1.isAfterOrEqualTo(actual1);
            assert1.isAfterOrEqualTo(Year.of(1994));
        });
    }
}