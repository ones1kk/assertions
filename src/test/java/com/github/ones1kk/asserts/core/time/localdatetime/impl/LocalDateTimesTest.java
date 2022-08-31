package com.github.ones1kk.asserts.core.time.localdatetime.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LocalDateTimesTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        LocalDateTimes<LocalDateTime> localDateTimes = new LocalDateTimes<>(asAssert);

        // when
        LocalDateTime actual1 = LocalDateTime.of(1995, 2, 1, 11, 11, 11);

        // then
        assertThrows(Exception.class, () -> localDateTimes.assertIsEqualTo(actual1, LocalDateTime.of(1995, 2, 1, 12, 11, 11)));
        assertThrows(Exception.class, () -> localDateTimes.assertIsNotEqualTo(actual1, actual1));

        assertThrows(Exception.class, () -> localDateTimes.assertIsBefore(actual1, actual1));
        assertThrows(Exception.class, () -> localDateTimes.assertIsBefore(actual1, LocalDateTime.of(1995, 2, 1, 10, 12, 12)));
        assertThrows(Exception.class, () -> localDateTimes.assertIsBeforeOrEqualTo(actual1, LocalDateTime.of(1995, 2, 1, 10, 12, 12)));

        assertThrows(Exception.class, () -> localDateTimes.assertIsAfter(actual1, actual1));
        assertThrows(Exception.class, () -> localDateTimes.assertIsAfter(actual1, LocalDateTime.of(1995, 2, 1, 12, 10, 10)));
        assertThrows(Exception.class, () -> localDateTimes.assertIsAfterOrEqualTo(actual1, LocalDateTime.of(1995, 2, 1, 12, 10, 10)));

        localDateTimes.assertIsEqualTo(actual1, LocalDateTime.of(1995, 2, 1, 11, 11, 11));
        localDateTimes.assertIsNotEqualTo(actual1, LocalDateTime.of(1995, 2, 1, 12, 11, 11));

        localDateTimes.assertIsBefore(actual1, LocalDateTime.of(1995, 2, 1, 12, 10, 10));
        localDateTimes.assertIsBeforeOrEqualTo(actual1, actual1);
        localDateTimes.assertIsBeforeOrEqualTo(actual1, LocalDateTime.of(1995, 2, 1, 12, 10, 10));

        localDateTimes.assertIsAfter(actual1, LocalDateTime.of(1995, 2, 1, 10, 12, 12));
        localDateTimes.assertIsAfterOrEqualTo(actual1, actual1);
        localDateTimes.assertIsAfterOrEqualTo(actual1, LocalDateTime.of(1995, 2, 1, 10, 12, 12));
    }

}