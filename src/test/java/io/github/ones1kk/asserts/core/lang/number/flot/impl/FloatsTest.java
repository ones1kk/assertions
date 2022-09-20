package io.github.ones1kk.asserts.core.lang.number.flot.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.feature.data.Offset;
import io.github.ones1kk.asserts.core.feature.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FloatsTest {

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
        Floats floats = new Floats(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> floats.assertIsInfinity(1.05F));
        assertThrows(Exception.class, () -> floats.assertIsFinite((float) (3 / 0.0)));
        assertThrows(Exception.class, () -> floats.assertIsNaN(-1.05F));
        assertThrows(Exception.class, () -> floats.assertIsPositive(-1.05F));
        assertThrows(Exception.class, () -> floats.assertIsPositive(0.0F));
        assertThrows(Exception.class, () -> floats.assertIsNotPositive(1.5F));

        assertThrows(Exception.class, () -> floats.assertIsNegative(1.12F));
        assertThrows(Exception.class, () -> floats.assertIsNegative(0.23F));
        assertThrows(Exception.class, () -> floats.assertIsNotNegative(-1.52F));

        assertThrows(Exception.class, () -> floats.assertIsZero(1.0F));
        assertThrows(Exception.class, () -> floats.assertIsNotZero(0.0F));

        // actual > expected
        assertThrows(Exception.class, () -> floats.assertIsLessThan(5.0F, 3.0F));
        // actual == expected
        assertThrows(Exception.class, () -> floats.assertIsLessThan(5.0F, 5.0F));
        // actual > expected
        assertThrows(Exception.class, () -> floats.assertIsLessThan(3.0F, 2.0F));

        // actual > expected
        assertThrows(Exception.class, () -> floats.assertIsLessThanOrEqualTo(3.0F, 2.0F));

        // actual < expected
        assertThrows(Exception.class, () -> floats.assertIsGreaterThan(3.0F, 5.0F));
        // actual == expected
        assertThrows(Exception.class, () -> floats.assertIsGreaterThan(5.0F, 5.0F));
        // actual < expected
        assertThrows(Exception.class, () -> floats.assertIsGreaterThan(1.0F, 3.0F));

        // actual < expected
        assertThrows(Exception.class, () -> floats.assertIsGreaterThanOrEqualTo(2.0F, 3.0F));

        // actual < start
        assertThrows(Exception.class,
                () -> floats.assertIsBetween(1.0F, 2.0F, 3.0F));
        // actual > end
        assertThrows(Exception.class,
                () -> floats.assertIsBetween(3.0F, 1.0F, 2.0F));

        assertThrows(Exception.class, () -> floats.assertIsCloseTo(10.0F, 6.0F, Offset.offset(3.0F)));
        assertThrows(Exception.class, () -> floats.assertIsNotCloseTo(10.0F, 6.0F, Offset.offset(8.0F)));

        assertThrows(Exception.class, () -> floats.assertIsCloseTo(10.0F, 9.0F, Percentage.of(1.0)));
        assertThrows(Exception.class, () -> floats.assertIsNotCloseTo(10.0F, 9.0F, Percentage.of(20.0)));

        assertThatNoException().isThrownBy(() -> {
            floats.assertIsInfinity((float) (3 / 0.0));
            floats.assertIsFinite(1.0F);
            floats.assertIsNaN((float) (5 % 0.0));
            floats.assertIsPositive(1.0F);

            floats.assertIsNotPositive(0.0F);
            floats.assertIsNotPositive(-1.0F);

            floats.assertIsNegative(-1.0F);

            floats.assertIsNotNegative(1.0F);
            floats.assertIsNotNegative(0.0F);

            floats.assertIsZero(0.0F);

            floats.assertIsNotZero(1.0F);
            floats.assertIsNotZero(-1.0F);

            floats.assertIsLessThan(4.0F, 7.0F);
            floats.assertIsLessThanOrEqualTo(4.0F, 7.0F);
            floats.assertIsLessThanOrEqualTo(4.0F, 4.0F);

            floats.assertIsGreaterThan(7.0F, 4.0F);
            floats.assertIsGreaterThanOrEqualTo(7.0F, 4.0F);
            floats.assertIsGreaterThanOrEqualTo(4.0F, 4.0F);

            // start < actual < end
            floats.assertIsBetween(2.0F, 1.0F, 3.0F);

            floats.assertIsCloseTo(10.0F, 8.0F, Offset.offset(2.0F));
            floats.assertIsNotCloseTo(10.0F, 7.0F, Offset.offset(1.0F));

            floats.assertIsCloseTo(10.0F, 9.0F, Percentage.of(15.0));
            floats.assertIsNotCloseTo(10.0F, 9.0F, Percentage.of(5.0));
        });
    }
}