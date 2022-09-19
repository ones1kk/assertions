package com.github.ones1kk.asserts.core.time.localdatetime;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.time.model.LocalDateTimeAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractLocalDateTimeAssertTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        LocalDateTime actual1 = LocalDateTime.of(1995, 2, 1, 11, 11, 11);

        // when
        AbstractLocalDateTimeAssert<?, LocalDateTime> assert1 = new LocalDateTimeAssert(actual1);

        // then
        assertThrows(AssertException.class, () -> assert1.isEqualTo(LocalDateTime.of(1995, 2, 1, 11, 12, 12)));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));

        assertThrows(AssertException.class, () -> assert1.isBefore(LocalDateTime.of(1995, 2, 1, 11, 1, 11)));
        assertThrows(AssertException.class, () -> assert1.isBefore(actual1));
        assertThrows(AssertException.class, () -> assert1.isBeforeOrEqualTo(LocalDateTime.of(1995, 2, 1, 11, 1, 11)));

        assertThrows(AssertException.class, () -> assert1.isAfter(LocalDateTime.of(1995, 2, 1, 12, 12, 12)));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual1));
        assertThrows(AssertException.class, () -> assert1.isAfterOrEqualTo(LocalDateTime.of(1995, 2, 1, 11, 30, 30)));

        assertThatNoException().isThrownBy(() -> {
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(LocalDateTime.of(1995, 2, 1, 11, 12, 12));

            assert1.isBefore(LocalDateTime.of(1995, 2, 1, 11, 12, 12));
            assert1.isBeforeOrEqualTo(actual1);
            assert1.isBeforeOrEqualTo(LocalDateTime.of(1995, 2, 1, 11, 12, 12));

            assert1.isAfter(LocalDateTime.of(1995, 2, 1, 11, 1, 11));
            assert1.isAfterOrEqualTo(actual1);
            assert1.isAfterOrEqualTo(LocalDateTime.of(1995, 2, 1, 11, 1, 11));
        });
    }
}