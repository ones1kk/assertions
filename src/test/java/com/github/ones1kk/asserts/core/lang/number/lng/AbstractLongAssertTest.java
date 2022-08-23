package com.github.ones1kk.asserts.core.lang.number.lng;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractLongAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Long actual1 = 1L;
        Long actual2 = null;

        // when
        AbstractLongAssertAssert<?, Long> assert1 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual1);
        AbstractLongAssertAssert<?, Long> assert2 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractLongAssertAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Long.class));

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isAssignableFrom(Long.class);
        assert1.isNotAssignableFrom(AbstractLongAssertAssert.class);
    }

    @Test
    @DisplayName("Long method test")
    public void test2() throws Exception {
        // given
        Long actual1 = 1L;
        Long actual2 = -1L;
        Long actual3 = 0L;
        Long actual4 = 2L;

        // when
        AbstractLongAssertAssert<?, Long> assert1 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual1);
        AbstractLongAssertAssert<?, Long> assert2 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual2);
        AbstractLongAssertAssert<?, Long> assert3 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual3);
        AbstractLongAssertAssert<?, Long> assert4 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual4);

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
        assertThrows(AssertException.class, () -> assert3.isCloseTo(5L, 2.0));
        assertThrows(AssertException.class, () -> assert4.isNotCloseTo(2L, 6.0));

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
        assert4.isCloseTo(actual4, 100.0);
        assert1.isNotCloseTo(5L, 1.0);
    }

    @Test
    @DisplayName("Comparable Test")
    public void test3() throws Exception {
        // given
        Long actual1 = 1L;
        Long actual2 = 2L;
        Long actual3 = 3L;

        Long expected1 = 1L;
        Long expected2 = 2L;
        Long expected3 = 3L;

        // when
        AbstractLongAssertAssert<?, Long> assert1 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual1);
        AbstractLongAssertAssert<?, Long> assert2 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual2);
        AbstractLongAssertAssert<?, Long> assert3 = new AbstractLongAssertAssert<>(AbstractLongAssertAssert.class, actual3);

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