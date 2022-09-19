package com.github.ones1kk.asserts.core.lang.number.duble;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractDoubleAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Double actual1 = 1.0;
        Double actual2 = null;

        // when
        AbstractDoubleAssert<?, Double> assert1 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual1);
        AbstractDoubleAssert<?, Double> assert2 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractDoubleAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Double.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(Double.class);
            assert1.isNotAssignableFrom(AbstractDoubleAssert.class);
        });
    }

    @Test
    @DisplayName("Double method test")
    public void test2() throws Exception {
        // given
        Double actual1 = 1.0;
        Double actual2 = -1.0;
        Double actual3 = 0.0;
        Double actual4 = 3 / 0.0;
        Double actual5 = 5 % 0.0;
        Double actual6 = 100.0;

        // when
        AbstractDoubleAssert<?, Double> assert1 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual1);
        AbstractDoubleAssert<?, Double> assert2 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual2);
        AbstractDoubleAssert<?, Double> assert3 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual3);
        AbstractDoubleAssert<?, Double> assert4 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual4);
        AbstractDoubleAssert<?, Double> assert5 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual5);
        AbstractDoubleAssert<?, Double> assert6 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual6);

        // then
        assertThrows(AssertException.class, assert4::isFinite);
        assertThrows(AssertException.class, assert2::isInfinity);
        assertThrows(AssertException.class, assert2::isNaN);
        assertThrows(AssertException.class, assert2::isPositive);
        assertThrows(AssertException.class, assert1::isNotPositive);
        assertThrows(AssertException.class, assert1::isNegative);
        assertThrows(AssertException.class, assert2::isNotNegative);
        assertThrows(AssertException.class, assert2::isZero);
        assertThrows(AssertException.class, assert3::isNotZero);

        assertThrows(AssertException.class, () -> assert6.isCloseTo(60.0, Offset.offset((30.0))));
        assertThrows(AssertException.class, () -> assert6.isNotCloseTo(60.0, Offset.offset((80.0))));

        assertThrows(AssertException.class, () -> assert3.isCloseTo((double) 5, (double) 2));
        assertThrows(AssertException.class, () -> assert1.isNotCloseTo((double) 1, (double) 100));

        assertThatNoException().isThrownBy(() -> {
            assert1.isFinite();
            assert4.isInfinity();
            assert5.isNaN();
            assert1.isPositive();
            assert2.isNotPositive();
            assert2.isNegative();
            assert1.isNotNegative();
            assert3.isZero();
            assert1.isNotZero();

            assert6.isCloseTo(80.0, Offset.offset(20.0));
            assert6.isNotCloseTo(70.0, Offset.offset(10.0));

            assert1.isCloseTo(actual1, 50.4);
            assert1.isNotCloseTo(5.8, 1.2);
        });
    }

    @Test
    @DisplayName("Comparable Test")
    public void test3() throws Exception {
        // given
        Double actual1 = 1.0;
        Double actual2 = 2.1;
        Double actual3 = 3.2;

        Double expected1 = 1.0;
        Double expected2 = 2.1;
        Double expected3 = 3.2;

        // when
        AbstractDoubleAssert<?, Double> assert1 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual1);
        AbstractDoubleAssert<?, Double> assert2 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual2);
        AbstractDoubleAssert<?, Double> assert3 = new AbstractDoubleAssert<>(AbstractDoubleAssert.class, actual3);

        // then
        // actual > expected
        assertThrows(AssertException.class,
                () -> assert2.isLessThan(expected1));
        // actual == expected
        assertThrows(AssertException.class,
                () -> assert2.isLessThan(expected2));

        // actual < expected
        assertThrows(AssertException.class,
                () -> assert1.isGreaterThan(expected2));
        // actual == expected
        assertThrows(AssertException.class,
                () -> assert1.isGreaterThan(expected1));

        // actual > expected
        assertThrows(AssertException.class,
                () -> assert2.isLessThanOrEqualTo(expected1));

        // actual < expected
        assertThrows(AssertException.class,
                () -> assert2.isGreaterThanOrEqualTo(expected3));

        // actual < start
        assertThrows(AssertException.class,
                () -> assert1.isBetween(expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
                () -> assert3.isBetween(expected1, expected2));

        assertThatNoException().isThrownBy(() -> {
            // actual < expected
            assert1.isLessThan(expected2);

            // actual > expected
            assert2.isGreaterThan(expected1);

            // actual == expected
            assert1.isLessThanOrEqualTo(expected1);
            // actual < expected
            assert1.isLessThanOrEqualTo(expected2);

            // actual == expected
            assert3.isGreaterThanOrEqualTo(expected3);
            // actual >= expected
            assert3.isGreaterThanOrEqualTo(expected2);

            // start < actual < end
            assert2.isBetween(expected1, expected3);
        });
    }
}