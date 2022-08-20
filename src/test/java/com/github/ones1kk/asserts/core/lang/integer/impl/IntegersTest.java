package com.github.ones1kk.asserts.core.lang.integer.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.number.integer.impl.Integers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegersTest {

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
        Integers integers = new Integers(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> integers.assertIsOdd(2));
        assertThrows(Exception.class, () -> integers.assertIsOdd(0));
        assertThrows(Exception.class, () -> integers.assertIsNotOdd(1));

        assertThrows(Exception.class, () -> integers.assertIsEven(1));
        assertThrows(Exception.class, () -> integers.assertIsEven(0));
        assertThrows(Exception.class, () -> integers.assertIsNotEven(2));

        assertThrows(Exception.class, () -> integers.assertIsPositive(-1));
        assertThrows(Exception.class, () -> integers.assertIsPositive(0));
        assertThrows(Exception.class, () -> integers.assertIsNotPositive(1));

        assertThrows(Exception.class, () -> integers.assertIsNegative(1));
        assertThrows(Exception.class, () -> integers.assertIsNegative(0));
        assertThrows(Exception.class, () -> integers.assertIsNotNegative(-1));

        assertThrows(Exception.class, () -> integers.assertIsZero(1));
        assertThrows(Exception.class, () -> integers.assertIsNotZero(0));

        // actual > expected
        assertThrows(Exception.class, () -> integers.assertIsLessThan(5, 3));
        // actual == expected
        assertThrows(Exception.class, () -> integers.assertIsLessThan(5, 5));
        // actual > expected
        assertThrows(Exception.class, () -> integers.assertIsLessThan(3, 2));

        // actual > expected
        assertThrows(Exception.class, () -> integers.assertIsLessThanOrEqualTo(3, 2));

        // actual < expected
        assertThrows(Exception.class, () -> integers.assertIsGreaterThan(3, 5));
        // actual == expected
        assertThrows(Exception.class, () -> integers.assertIsGreaterThan(5, 5));
        // actual < expected
        assertThrows(Exception.class, () -> integers.assertIsGreaterThan(1, 3));

        // actual < expected
        assertThrows(Exception.class, () -> integers.assertIsGreaterThanOrEqualTo(2, 3));

        // actual < start
        assertThrows(Exception.class,
                () -> integers.assertIsBetween(1, 2, 3));
        // actual > end
        assertThrows(Exception.class,
                () -> integers.assertIsBetween(3, 1, 2));


        integers.assertIsOdd(1);

        integers.assertIsNotOdd(0);
        integers.assertIsNotOdd(2);

        integers.assertIsEven(2);

        integers.assertIsNotEven(1);
        integers.assertIsNotEven(0);

        integers.assertIsPositive(1);

        integers.assertIsNotPositive(0);
        integers.assertIsNotPositive(-1);

        integers.assertIsNegative(-1);

        integers.assertIsNotNegative(1);
        integers.assertIsNotNegative(0);

        integers.assertIsZero(0);

        integers.assertIsNotZero(1);
        integers.assertIsNotZero(-1);

        integers.assertIsLessThan(4, 7);
        integers.assertIsLessThanOrEqualTo(4, 7);
        integers.assertIsLessThanOrEqualTo(4, 4);

        integers.assertIsGreaterThan(7, 4);
        integers.assertIsGreaterThanOrEqualTo(7, 4);
        integers.assertIsGreaterThanOrEqualTo(4, 4);

        // start < actual < end
        integers.assertIsBetween(2, 1, 3);

    }

}