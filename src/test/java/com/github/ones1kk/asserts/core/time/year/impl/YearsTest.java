package com.github.ones1kk.asserts.core.time.year.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Year;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class YearsTest {

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
        Years years = new Years(asAssert);

        // when
        // my birth year
        Year actual1 = Year.of(1995);
        // leap year
        Year actual2 = Year.of(1996);

        // then
        assertThrows(Exception.class, () -> years.assertIsLeapYear(actual1));
        assertThrows(Exception.class, () -> years.assertIsNotLeapYear(actual2));

        assertThatNoException().isThrownBy(() -> {
            years.assertIsLeapYear(actual2);
            years.assertIsNotLeapYear(actual1);
        });
    }
}