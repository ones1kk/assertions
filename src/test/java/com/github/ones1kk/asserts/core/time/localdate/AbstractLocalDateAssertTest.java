package com.github.ones1kk.asserts.core.time.localdate;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.time.model.LocalDateAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractLocalDateAssertTest {

    @Test
    @DisplayName("Method test")
    public void tes1() throws Exception {
        // given
        LocalDate actual1 = LocalDate.of(1995, 2, 1);

        // when
        AbstractLocalDateAssert<?, LocalDate> assert1 = new LocalDateAssert(actual1);

        // then
        assertThrows(AssertException.class, () -> assert1.isEqualTo(LocalDate.of(1995, 1, 1)));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));

        assertThrows(AssertException.class, () -> assert1.isBefore(LocalDate.of(1995, 1, 1)));
        assertThrows(AssertException.class, () -> assert1.isBefore(actual1));
        assertThrows(AssertException.class, () -> assert1.isBeforeOrEqualTo(LocalDate.of(1995, 1, 1)));

        assertThrows(AssertException.class, () -> assert1.isAfter(LocalDate.of(1995, 3, 1)));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual1));
        assertThrows(AssertException.class, () -> assert1.isAfterOrEqualTo(LocalDate.of(1995, 3, 1)));

        assertThatNoException().isThrownBy(() -> {
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(LocalDate.of(1995, 1, 1));

            assert1.isBefore(LocalDate.of(1995, 3, 1));
            assert1.isBeforeOrEqualTo(actual1);
            assert1.isBeforeOrEqualTo(LocalDate.of(1995, 3, 1));

            assert1.isAfter(LocalDate.of(1995, 1, 1));
            assert1.isAfterOrEqualTo(actual1);
            assert1.isAfterOrEqualTo(LocalDate.of(1995, 1, 1));
        });
    }
}