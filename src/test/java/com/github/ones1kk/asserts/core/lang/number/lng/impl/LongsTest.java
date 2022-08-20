package com.github.ones1kk.asserts.core.lang.number.lng.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.number.lng.impl.Longs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LongsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Test methods")
    public void test1() throws Exception {
        // given
        Longs longs = new Longs(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> longs.assertIsOdd(2L));
        assertThrows(Exception.class, () -> longs.assertIsOdd(0L));
        assertThrows(Exception.class, () -> longs.assertIsNotOdd(1L));

        assertThrows(Exception.class, () -> longs.assertIsEven(1L));
        assertThrows(Exception.class, () -> longs.assertIsEven(0L));
        assertThrows(Exception.class, () -> longs.assertIsNotEven(2L));

        assertThrows(Exception.class, () -> longs.assertIsPositive(-1L));
        assertThrows(Exception.class, () -> longs.assertIsPositive(0L));
        assertThrows(Exception.class, () -> longs.assertIsNotPositive(1L));

        assertThrows(Exception.class, () -> longs.assertIsNegative(1L));
        assertThrows(Exception.class, () -> longs.assertIsNegative(0L));
        assertThrows(Exception.class, () -> longs.assertIsNotNegative(-1L));

        assertThrows(Exception.class, () -> longs.assertIsZero(1L));
        assertThrows(Exception.class, () -> longs.assertIsNotZero(0L));

        // actual > expected
        assertThrows(Exception.class, () -> longs.assertIsLessThan(5L, 3L));
        // actual == expected
        assertThrows(Exception.class, () -> longs.assertIsLessThan(5L, 5L));
        // actual > expected
        assertThrows(Exception.class, () -> longs.assertIsLessThan(3L, 2L));

        // actual > expected
        assertThrows(Exception.class, () -> longs.assertIsLessThanOrEqualTo(3L, 2L));

        // actual < expected
        assertThrows(Exception.class, () -> longs.assertIsGreaterThan(3L, 5L));
        // actual == expected
        assertThrows(Exception.class, () -> longs.assertIsGreaterThan(5L, 5L));
        // actual < expected
        assertThrows(Exception.class, () -> longs.assertIsGreaterThan(1L, 3L));

        // actual < expected
        assertThrows(Exception.class, () -> longs.assertIsGreaterThanOrEqualTo(2L, 3L));

        // actual < start
        assertThrows(Exception.class,
                () -> longs.assertIsBetween(1L, 2L, 3L));
        // actual > end
        assertThrows(Exception.class,
                () -> longs.assertIsBetween(3L, 1L, 2L));


        longs.assertIsOdd(1L);

        longs.assertIsNotOdd(0L);
        longs.assertIsNotOdd(2L);

        longs.assertIsEven(2L);

        longs.assertIsNotEven(1L);
        longs.assertIsNotEven(0L);

        longs.assertIsPositive(1L);

        longs.assertIsNotPositive(0L);
        longs.assertIsNotPositive(-1L);

        longs.assertIsNegative(-1L);

        longs.assertIsNotNegative(1L);
        longs.assertIsNotNegative(0L);

        longs.assertIsZero(0L);

        longs.assertIsNotZero(1L);
        longs.assertIsNotZero(-1L);

        longs.assertIsLessThan(4L, 7L);
        longs.assertIsLessThanOrEqualTo(4L, 7L);
        longs.assertIsLessThanOrEqualTo(4L, 4L);

        longs.assertIsGreaterThan(7L, 4L);
        longs.assertIsGreaterThanOrEqualTo(7L, 4L);
        longs.assertIsGreaterThanOrEqualTo(4L, 4L);

        // start < actual < end
        longs.assertIsBetween(2L, 1L, 3L);

    }

}