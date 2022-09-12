package com.github.ones1kk.asserts.core.lang.number.shrt.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ShortsTest {

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
        Shorts shorts = new Shorts(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> shorts.assertIsOdd((short) 2));
        assertThrows(Exception.class, () -> shorts.assertIsOdd((short) 0));
        assertThrows(Exception.class, () -> shorts.assertIsNotOdd((short) 1));

        assertThrows(Exception.class, () -> shorts.assertIsEven((short) 1));
        assertThrows(Exception.class, () -> shorts.assertIsNotEven((short) 2));
        assertThrows(Exception.class, () -> shorts.assertIsNotEven((short) 0));

        assertThrows(Exception.class, () -> shorts.assertIsPositive((short) -1));
        assertThrows(Exception.class, () -> shorts.assertIsPositive((short) 0));
        assertThrows(Exception.class, () -> shorts.assertIsNotPositive((short) 1));

        assertThrows(Exception.class, () -> shorts.assertIsNegative((short) 1));
        assertThrows(Exception.class, () -> shorts.assertIsNegative((short) 0));
        assertThrows(Exception.class, () -> shorts.assertIsNotNegative((short) -1));

        assertThrows(Exception.class, () -> shorts.assertIsZero((short) 1));
        assertThrows(Exception.class, () -> shorts.assertIsNotZero((short) 0));

        // actual > expected
        assertThrows(Exception.class, () -> shorts.assertIsLessThan((short) 5, (short) 3));
        // actual == expected
        assertThrows(Exception.class, () -> shorts.assertIsLessThan((short) 5, (short) 5));
        // actual > expected
        assertThrows(Exception.class, () -> shorts.assertIsLessThan((short) 3, (short) 2));

        // actual > expected
        assertThrows(Exception.class, () -> shorts.assertIsLessThanOrEqualTo((short) 3, (short) 2));

        // actual < expected
        assertThrows(Exception.class, () -> shorts.assertIsGreaterThan((short) 3, (short) 5));
        // actual == expected
        assertThrows(Exception.class, () -> shorts.assertIsGreaterThan((short) 5, (short) 5));
        // actual < expected
        assertThrows(Exception.class, () -> shorts.assertIsGreaterThan((short) 1, (short) 3));

        // actual < expected
        assertThrows(Exception.class, () -> shorts.assertIsGreaterThanOrEqualTo((short) 2, (short) 3));

        // actual < start
        assertThrows(Exception.class,
                () -> shorts.assertIsBetween((short) 1, (short) 2, (short) 3));
        // actual > end
        assertThrows(Exception.class,
                () -> shorts.assertIsBetween((short) 3, (short) 1, (short) 2));

        assertThrows(Exception.class, () -> shorts.assertIsCloseTo((short) 10, (short) 6, Offset.offset((short) 3)));
        assertThrows(Exception.class, () -> shorts.assertIsNotCloseTo((short) 10, (short) 6, Offset.offset((short) 8)));

        assertThrows(Exception.class, () -> shorts.assertIsCloseTo((short) 10, (short) 9, Percentage.of(1.0)));
        assertThrows(Exception.class, () -> shorts.assertIsNotCloseTo((short) 10, (short) 9, Percentage.of(20.0)));

        shorts.assertIsOdd((short) 1);

        shorts.assertIsNotOdd((short) 0);
        shorts.assertIsNotOdd((short) 2);

        shorts.assertIsEven((short) 2);
        shorts.assertIsEven((short) 0);

        shorts.assertIsNotEven((short) 1);

        shorts.assertIsPositive((short) 1);

        shorts.assertIsNotPositive((short) 0);
        shorts.assertIsNotPositive((short) -1);

        shorts.assertIsNegative((short) -1);

        shorts.assertIsNotNegative((short) 1);
        shorts.assertIsNotNegative((short) 0);

        shorts.assertIsZero((short) 0);

        shorts.assertIsNotZero((short) 1);
        shorts.assertIsNotZero((short) -1);

        shorts.assertIsLessThan((short) 4, (short) 7);
        shorts.assertIsLessThanOrEqualTo((short) 4, (short) 7);
        shorts.assertIsLessThanOrEqualTo((short) 4, (short) 4);

        shorts.assertIsGreaterThan((short) 7, (short) 4);
        shorts.assertIsGreaterThanOrEqualTo((short) 7, (short) 4);
        shorts.assertIsGreaterThanOrEqualTo((short) 4, (short) 4);

        // start < actual < end
        shorts.assertIsBetween((short) 2, (short) 1, (short) 3);

        shorts.assertIsCloseTo((short) 10, (short) 8, Offset.offset((short) 2));
        shorts.assertIsNotCloseTo((short) 10, (short) 7, Offset.offset((short) 1));

        shorts.assertIsCloseTo((short) 10, (short) 9, Percentage.of(15.0));
        shorts.assertIsNotCloseTo((short) 10, (short) 9, Percentage.of(5.0));

    }

}