package io.github.ones1kk.assertion.core.lang.number.bte;

import io.github.ones1kk.assertion.core.exception.AssertException;
import io.github.ones1kk.assertion.core.feature.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractByteAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Byte actual1 = 1;
        Byte actual2 = null;

        // when
        AbstractByteAssert<?, Byte> assert1 = new AbstractByteAssert<>(AbstractByteAssert.class, actual1);
        AbstractByteAssert<?, Byte> assert2 = new AbstractByteAssert<>(AbstractByteAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractByteAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Byte.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(Byte.class);
            assert1.isNotAssignableFrom(AbstractByteAssert.class);
        });
    }

    @Test
    @DisplayName("Byte method test")
    public void test2() throws Exception {
        // given
        Byte actual1 = 1;
        Byte actual2 = -1;
        Byte actual3 = 0;
        Byte actual4 = 2;
        Byte actual5 = 100;

        // when
        AbstractByteAssert<?, Byte> assert1 = new AbstractByteAssert<>(AbstractByteAssert.class, actual1);
        AbstractByteAssert<?, Byte> assert2 = new AbstractByteAssert<>(AbstractByteAssert.class, actual2);
        AbstractByteAssert<?, Byte> assert3 = new AbstractByteAssert<>(AbstractByteAssert.class, actual3);
        AbstractByteAssert<?, Byte> assert4 = new AbstractByteAssert<>(AbstractByteAssert.class, actual4);
        AbstractByteAssert<?, Byte> assert5 = new AbstractByteAssert<>(AbstractByteAssert.class, actual5);

        // then
        assertThrows(AssertException.class, assert4::isOdd);
        assertThrows(AssertException.class, assert1::isNotOdd);
        assertThrows(AssertException.class, assert2::isEven);
        assertThrows(AssertException.class, assert4::isNotEven);
        assertThrows(AssertException.class, assert2::isPositive);
        assertThrows(AssertException.class, assert1::isNotPositive);
        assertThrows(AssertException.class, assert1::isNegative);
        assertThrows(AssertException.class, assert2::isNotNegative);
        assertThrows(AssertException.class, assert2::isZero);
        assertThrows(AssertException.class, assert3::isNotZero);

        assertThrows(AssertException.class, () -> assert5.isCloseTo((byte) 60, Offset.offset((byte) 30)));
        assertThrows(AssertException.class, () -> assert5.isNotCloseTo((byte) 90, Offset.offset((byte) 20)));

        assertThrows(AssertException.class, () -> assert5.isCloseTo((byte) 5, 2.0));
        assertThrows(AssertException.class, () -> assert5.isNotCloseTo((byte) 95, 10.0));


        assertThatNoException().isThrownBy(() -> {
            assert1.isOdd();
            assert4.isNotOdd();
            assert4.isEven();
            assert1.isNotEven();
            assert1.isPositive();
            assert2.isNotPositive();
            assert2.isNegative();
            assert1.isNotNegative();
            assert3.isZero();
            assert1.isNotZero();

            assert5.isCloseTo((byte) 80, Offset.offset((byte) 20));
            assert5.isNotCloseTo((byte) 70, Offset.offset((byte) 10));

            assert1.isCloseTo((byte) 1, 3.0);
            assert1.isNotCloseTo((byte) 5, 1.0);
        });
    }

    @Test
    @DisplayName("Comparable Test")
    public void test3() throws Exception {
        // given
        Byte actual1 = 1;
        Byte actual2 = 2;
        Byte actual3 = 3;

        Byte expected1 = 1;
        Byte expected2 = 2;
        Byte expected3 = 3;

        // when
        AbstractByteAssert<?, Byte> assert1 = new AbstractByteAssert<>(AbstractByteAssert.class, actual1);
        AbstractByteAssert<?, Byte> assert2 = new AbstractByteAssert<>(AbstractByteAssert.class, actual2);
        AbstractByteAssert<?, Byte> assert3 = new AbstractByteAssert<>(AbstractByteAssert.class, actual3);

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