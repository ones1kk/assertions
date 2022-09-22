package io.github.ones1kk.assertion.core.lang.number.integer.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.data.Offset;
import io.github.ones1kk.assertion.core.feature.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegersTest {

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
        Integers integers = new Integers(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> integers.assertIsOdd(2));
        assertThrows(Exception.class, () -> integers.assertIsOdd(0));
        assertThrows(Exception.class, () -> integers.assertIsNotOdd(1));

        assertThrows(Exception.class, () -> integers.assertIsEven(1));

        assertThrows(Exception.class, () -> integers.assertIsNotEven(2));
        assertThrows(Exception.class, () -> integers.assertIsNotEven(0));

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

        assertThrows(Exception.class, () -> integers.assertIsCloseTo(10, 6, Offset.offset(3)));
        assertThrows(Exception.class, () -> integers.assertIsNotCloseTo(10, 6, Offset.offset(8)));

        assertThrows(Exception.class, () -> integers.assertIsCloseTo(10, 9, Percentage.of(1.0)));
        assertThrows(Exception.class, () -> integers.assertIsNotCloseTo(10, 9, Percentage.of(20.0)));

        assertThatNoException().isThrownBy(() -> {
            integers.assertIsOdd(1);

            integers.assertIsNotOdd(0);
            integers.assertIsNotOdd(2);

            integers.assertIsEven(2);
            integers.assertIsEven(0);

            integers.assertIsNotEven(1);

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

            integers.assertIsCloseTo(10, 8, Offset.offset(2));
            integers.assertIsNotCloseTo(10, 7, Offset.offset(1));

            integers.assertIsCloseTo(10, 9, Percentage.of(15.0));
            integers.assertIsNotCloseTo(10, 9, Percentage.of(5.0));
        });
    }
}