package com.github.ones1kk.asserts.core.time.temporal.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TemporalAccessorsTest {

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
        TemporalAccessors<LocalTime> temporals = new TemporalAccessors<>(asAssert);

        // when
        LocalTime actual1 = LocalTime.of(11, 11, 11);

        // then
        assertThrows(Exception.class, () -> temporals.assertIsEqualTo(actual1, LocalTime.of(12, 12, 12)));
        assertThrows(Exception.class, () -> temporals.assertIsNotEqualTo(actual1, actual1));

        assertThrows(Exception.class, () -> temporals.assertIsBefore(actual1, actual1));
        assertThrows(Exception.class, () -> temporals.assertIsBefore(actual1, LocalTime.of(10, 10, 10)));
        assertThrows(Exception.class, () -> temporals.assertIsBeforeOrEqualTo(actual1, LocalTime.of(10, 10, 10)));

        assertThrows(Exception.class, () -> temporals.assertIsAfter(actual1, actual1));
        assertThrows(Exception.class, () -> temporals.assertIsAfter(actual1, LocalTime.of(12, 12, 12)));
        assertThrows(Exception.class, () -> temporals.assertIsAfterOrEqualTo(actual1, LocalTime.of(12, 12, 10)));


        temporals.assertIsEqualTo(actual1, LocalTime.of(11, 11, 11));
        temporals.assertIsNotEqualTo(actual1, LocalTime.of(12, 11, 11));

        temporals.assertIsBefore(actual1, LocalTime.of(12, 11, 11));
        temporals.assertIsBeforeOrEqualTo(actual1, actual1);
        temporals.assertIsBeforeOrEqualTo(actual1, LocalTime.of(12, 11, 11));

        temporals.assertIsAfter(actual1, LocalTime.of(10, 10, 10));
        temporals.assertIsAfterOrEqualTo(actual1, actual1);
        temporals.assertIsAfterOrEqualTo(actual1, LocalTime.of(10, 10, 10));
    }

}