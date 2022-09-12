package com.github.ones1kk.asserts.core.lang.number.integer;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractIntegerAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Integer actual1 = 1;
        Integer actual2 = null;

        // when
        AbstractIntegerAssert<?, Integer> assert1 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual1);
        AbstractIntegerAssert<?, Integer> assert2 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractIntegerAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Integer.class));

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isAssignableFrom(Integer.class);
        assert1.isNotAssignableFrom(AbstractIntegerAssert.class);
    }

    @Test
    @DisplayName("Integer method test")
    public void test2() throws Exception {
        // given
        Integer actual1 = 1;
        Integer actual2 = -1;
        Integer actual3 = 0;
        Integer actual4 = 2;

        // when
        AbstractIntegerAssert<?, Integer> assert1 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual1);
        AbstractIntegerAssert<?, Integer> assert2 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual2);
        AbstractIntegerAssert<?, Integer> assert3 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual3);
        AbstractIntegerAssert<?, Integer> assert4 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual4);

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

        assertThrows(AssertException.class, () -> assert4.isCloseTo(60, Offset.offset(30)));
        assertThrows(AssertException.class, () -> assert4.isNotCloseTo(60, Offset.offset(80)));

        assertThrows(AssertException.class, () -> assert4.isCloseTo(5, 2.0));
        assertThrows(AssertException.class, () -> assert4.isNotCloseTo(95, 10.0));

        assertThrows(AssertException.class, () -> assert3.isCloseTo(5, 2.0));
        assertThrows(AssertException.class, () -> assert4.isNotCloseTo(2, 50.0));

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
        assert4.isCloseTo(2, 100.0);
        assert1.isNotCloseTo(5, 1.0);

        assert4.isCloseTo(8, Offset.offset(2));
        assert4.isNotCloseTo(70, Offset.offset(10));

        assert1.isCloseTo(1, 3.0);
        assert1.isNotCloseTo(5, 1.0);
    }

    @Test
    @DisplayName("Comparable Test")
    public void test3() throws Exception {
        // given
        Integer actual1 = 1;
        Integer actual2 = 2;
        Integer actual3 = 3;

        Integer expected1 = 1;
        Integer expected2 = 2;
        Integer expected3 = 3;

        // when
        AbstractIntegerAssert<?, Integer> assert1 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual1);
        AbstractIntegerAssert<?, Integer> assert2 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual2);
        AbstractIntegerAssert<?, Integer> assert3 = new AbstractIntegerAssert<>(AbstractIntegerAssert.class, actual3);

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
    }

}


