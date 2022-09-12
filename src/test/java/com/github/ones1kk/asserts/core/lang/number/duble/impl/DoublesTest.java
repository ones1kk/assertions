package com.github.ones1kk.asserts.core.lang.number.duble.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DoublesTest {

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
        Doubles doubles = new Doubles(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> doubles.assertIsInfinity(1.05));
        assertThrows(Exception.class, () -> doubles.assertIsFinite((3 / 0.0)));
        assertThrows(Exception.class, () -> doubles.assertIsNaN(-1.05));
        assertThrows(Exception.class, () -> doubles.assertIsPositive(-1.05));
        assertThrows(Exception.class, () -> doubles.assertIsPositive(0.0));
        assertThrows(Exception.class, () -> doubles.assertIsNotPositive(1.5));

        assertThrows(Exception.class, () -> doubles.assertIsNegative(1.12));
        assertThrows(Exception.class, () -> doubles.assertIsNegative(0.23));
        assertThrows(Exception.class, () -> doubles.assertIsNotNegative(-1.52));

        assertThrows(Exception.class, () -> doubles.assertIsZero(1.0));
        assertThrows(Exception.class, () -> doubles.assertIsNotZero(0.0));

        // actual > expected
        assertThrows(Exception.class, () -> doubles.assertIsLessThan(5.0, 3.0));
        // actual == expected
        assertThrows(Exception.class, () -> doubles.assertIsLessThan(5.0, 5.0));
        // actual > expected
        assertThrows(Exception.class, () -> doubles.assertIsLessThan(3.0, 2.0));

        // actual > expected
        assertThrows(Exception.class, () -> doubles.assertIsLessThanOrEqualTo(3.0, 2.0));

        // actual < expected
        assertThrows(Exception.class, () -> doubles.assertIsGreaterThan(3.0, 5.0));
        // actual == expected
        assertThrows(Exception.class, () -> doubles.assertIsGreaterThan(5.0, 5.0));
        // actual < expected
        assertThrows(Exception.class, () -> doubles.assertIsGreaterThan(1.0, 3.0));

        // actual < expected
        assertThrows(Exception.class, () -> doubles.assertIsGreaterThanOrEqualTo(2.0, 3.0));

        // actual < start
        assertThrows(Exception.class,
                () -> doubles.assertIsBetween(1.0, 2.0, 3.0));
        // actual > end
        assertThrows(Exception.class,
                () -> doubles.assertIsBetween(3.0, 1.0, 2.0));

        assertThrows(Exception.class, () -> doubles.assertIsCloseTo(10.0, 6.0, Offset.offset(3.0)));
        assertThrows(Exception.class, () -> doubles.assertIsNotCloseTo(10.0, 6.0, Offset.offset(8.0)));

        assertThrows(Exception.class, () -> doubles.assertIsCloseTo(10.0, 9.0, Percentage.of(1.0)));
        assertThrows(Exception.class, () -> doubles.assertIsNotCloseTo(10.0, 9.0, Percentage.of(20.0)));

        doubles.assertIsInfinity((3 / 0.0));
        doubles.assertIsFinite(1.0);
        doubles.assertIsNaN((5 % 0.0));
        doubles.assertIsPositive(1.0);

        doubles.assertIsNotPositive(0.0);
        doubles.assertIsNotPositive(-1.0);

        doubles.assertIsNegative(-1.0);

        doubles.assertIsNotNegative(1.0);
        doubles.assertIsNotNegative(0.0);

        doubles.assertIsZero(0.0);

        doubles.assertIsNotZero(1.0);
        doubles.assertIsNotZero(-1.0);

        doubles.assertIsLessThan(4.0, 7.0);
        doubles.assertIsLessThanOrEqualTo(4.0, 7.0);
        doubles.assertIsLessThanOrEqualTo(4.0, 4.0);

        doubles.assertIsGreaterThan(7.0, 4.0);
        doubles.assertIsGreaterThanOrEqualTo(7.0, 4.0);
        doubles.assertIsGreaterThanOrEqualTo(4.0, 4.0);

        // start < actual < end
        doubles.assertIsBetween(2.0, 1.0, 3.0);

        doubles.assertIsCloseTo(10.0, 8.0, Offset.offset(2.0));
        doubles.assertIsNotCloseTo(10.0, 7.0, Offset.offset(1.0));

        doubles.assertIsCloseTo(10.0, 9.0, Percentage.of(15.0));
        doubles.assertIsNotCloseTo(10.0, 9.0, Percentage.of(5.0));

    }

}