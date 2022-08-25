package com.github.ones1kk.asserts.core.time.temporal;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.time.model.LocalTimeAssert;
import com.github.ones1kk.asserts.core.time.temporal.accessor.AbstractTemporalAccessorAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractTemporalAccessorAssertTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        LocalTime actual1 = LocalTime.of(11, 11, 11);

        // when
        AbstractTemporalAccessorAssert<?, LocalTime> assert1 = new LocalTimeAssert(actual1);

        // then
        assertThrows(AssertException.class, () -> assert1.isEqualTo(LocalTime.of(11, 12, 12)));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));

        assertThrows(AssertException.class, () -> assert1.isBefore(LocalTime.of(11, 1, 11)));
        assertThrows(AssertException.class, () -> assert1.isBefore(actual1));
        assertThrows(AssertException.class, () -> assert1.isBeforeOrEqualTo(LocalTime.of(11, 1, 11)));

        assertThrows(AssertException.class, () -> assert1.isAfter(LocalTime.NOON));
        assertThrows(AssertException.class, () -> assert1.isAfter(actual1));
        assertThrows(AssertException.class, () -> assert1.isAfterOrEqualTo(LocalTime.of(11, 30, 30)));
    }
}