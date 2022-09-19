package com.github.ones1kk.asserts.core.time.localdate.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LocalDatesTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        LocalDates<LocalDate> localDateTimes = new LocalDates<>(asAssert);

        // when
        LocalDate actual1 = LocalDate.of(1995, 2, 1);

        // then
        assertThrows(Exception.class, () -> localDateTimes.assertIsEqualTo(actual1, LocalDate.of(1995, 1, 1)));
        assertThrows(Exception.class, () -> localDateTimes.assertIsNotEqualTo(actual1, actual1));

        assertThrows(Exception.class, () -> localDateTimes.assertIsBefore(actual1, actual1));
        assertThrows(Exception.class, () -> localDateTimes.assertIsBefore(actual1, LocalDate.of(1995, 1, 1)));
        assertThrows(Exception.class, () -> localDateTimes.assertIsBeforeOrEqualTo(actual1, LocalDate.of(1995, 1, 1)));

        assertThrows(Exception.class, () -> localDateTimes.assertIsAfter(actual1, actual1));
        assertThrows(Exception.class, () -> localDateTimes.assertIsAfter(actual1, LocalDate.of(1995, 3, 1)));
        assertThrows(Exception.class, () -> localDateTimes.assertIsAfterOrEqualTo(actual1, LocalDate.of(1995, 3, 1)));

        assertThatNoException().isThrownBy(() -> {
            localDateTimes.assertIsEqualTo(actual1, LocalDate.of(1995, 2, 1));
            localDateTimes.assertIsNotEqualTo(actual1, LocalDate.of(1995, 1, 1));

            localDateTimes.assertIsBefore(actual1, LocalDate.of(1995, 3, 1));
            localDateTimes.assertIsBeforeOrEqualTo(actual1, actual1);
            localDateTimes.assertIsBeforeOrEqualTo(actual1, LocalDate.of(1995, 3, 1));

            localDateTimes.assertIsAfter(actual1, LocalDate.of(1995, 1, 1));
            localDateTimes.assertIsAfterOrEqualTo(actual1, actual1);
            localDateTimes.assertIsAfterOrEqualTo(actual1, LocalDate.of(1995, 1, 1));
        });
    }

}