package com.github.ones1kk.asserts.core.lang.number.bte.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BytesTest {

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
        Bytes bytes = new Bytes(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> bytes.assertIsOdd((byte) 2));
        assertThrows(Exception.class, () -> bytes.assertIsOdd((byte) 0));
        assertThrows(Exception.class, () -> bytes.assertIsNotOdd((byte) 1));

        assertThrows(Exception.class, () -> bytes.assertIsEven((byte) 1));
        assertThrows(Exception.class, () -> bytes.assertIsNotEven((byte) 2));
        assertThrows(Exception.class, () -> bytes.assertIsNotEven((byte) 0));

        assertThrows(Exception.class, () -> bytes.assertIsPositive((byte) -1));
        assertThrows(Exception.class, () -> bytes.assertIsPositive((byte) 0));
        assertThrows(Exception.class, () -> bytes.assertIsNotPositive((byte) 1));

        assertThrows(Exception.class, () -> bytes.assertIsNegative((byte) 1));
        assertThrows(Exception.class, () -> bytes.assertIsNegative((byte) 0));
        assertThrows(Exception.class, () -> bytes.assertIsNotNegative((byte) -1));

        assertThrows(Exception.class, () -> bytes.assertIsZero((byte) 1));
        assertThrows(Exception.class, () -> bytes.assertIsNotZero((byte) 0));

        // actual > expected
        assertThrows(Exception.class, () -> bytes.assertIsLessThan((byte) 5, (byte) 3));
        // actual == expected
        assertThrows(Exception.class, () -> bytes.assertIsLessThan((byte) 5, (byte) 5));
        // actual > expected
        assertThrows(Exception.class, () -> bytes.assertIsLessThan((byte) 3, (byte) 2));

        // actual > expected
        assertThrows(Exception.class, () -> bytes.assertIsLessThanOrEqualTo((byte) 3, (byte) 2));

        // actual < expected
        assertThrows(Exception.class, () -> bytes.assertIsGreaterThan((byte) 3, (byte) 5));
        // actual == expected
        assertThrows(Exception.class, () -> bytes.assertIsGreaterThan((byte) 5, (byte) 5));
        // actual < expected
        assertThrows(Exception.class, () -> bytes.assertIsGreaterThan((byte) 1, (byte) 3));

        // actual < expected
        assertThrows(Exception.class, () -> bytes.assertIsGreaterThanOrEqualTo((byte) 2, (byte) 3));

        // actual < start
        assertThrows(Exception.class,
                () -> bytes.assertIsBetween((byte) 1, (byte) 2, (byte) 3));
        // actual > end
        assertThrows(Exception.class,
                () -> bytes.assertIsBetween((byte) 3, (byte) 1, (byte) 2));

        assertThrows(Exception.class, () -> bytes.assertIsCloseTo((byte) 10, (byte) 6, Offset.offset((byte) 3)));
        assertThrows(Exception.class, () -> bytes.assertIsNotCloseTo((byte) 10, (byte) 6, Offset.offset((byte) 8)));

        assertThrows(Exception.class, () -> bytes.assertIsCloseTo((byte) 10, (byte) 9, Percentage.of(1.0)));
        assertThrows(Exception.class, () -> bytes.assertIsNotCloseTo((byte) 10, (byte) 9, Percentage.of(20.0)));

        bytes.assertIsOdd((byte) 1);

        bytes.assertIsNotOdd((byte) 0);
        bytes.assertIsNotOdd((byte) 2);

        bytes.assertIsEven((byte) 2);
        bytes.assertIsEven((byte) 0);

        bytes.assertIsNotEven((byte) 1);

        bytes.assertIsPositive((byte) 1);

        bytes.assertIsNotPositive((byte) 0);
        bytes.assertIsNotPositive((byte) -1);

        bytes.assertIsNegative((byte) -1);

        bytes.assertIsNotNegative((byte) 1);
        bytes.assertIsNotNegative((byte) 0);

        bytes.assertIsZero((byte) 0);

        bytes.assertIsNotZero((byte) 1);
        bytes.assertIsNotZero((byte) -1);

        bytes.assertIsLessThan((byte) 4, (byte) 7);
        bytes.assertIsLessThanOrEqualTo((byte) 4, (byte) 7);
        bytes.assertIsLessThanOrEqualTo((byte) 4, (byte) 4);

        bytes.assertIsGreaterThan((byte) 7, (byte) 4);
        bytes.assertIsGreaterThanOrEqualTo((byte) 7, (byte) 4);
        bytes.assertIsGreaterThanOrEqualTo((byte) 4, (byte) 4);

        // start < actual < end
        bytes.assertIsBetween((byte) 2, (byte) 1, (byte) 3);

        bytes.assertIsCloseTo((byte) 10, (byte) 8, Offset.offset((byte) 2));
        bytes.assertIsNotCloseTo((byte) 10, (byte) 7, Offset.offset((byte) 1));

        bytes.assertIsCloseTo((byte) 10, (byte) 9, Percentage.of(15.0));
        bytes.assertIsNotCloseTo((byte) 10, (byte) 9, Percentage.of(5.0));
    }
}