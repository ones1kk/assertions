package com.github.ones1kk.asserts.core.lang.lng;

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
        AbstractLongAssert<?, Long> assert1 = new AbstractLongAssert<>(AbstractLongAssert.class, actual1);
        AbstractLongAssert<?, Long> assert2 = new AbstractLongAssert<>(AbstractLongAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractLongAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Long.class));

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isAssignableFrom(Long.class);
        assert1.isNotAssignableFrom(AbstractLongAssert.class);
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
        AbstractLongAssert<?, Long> assert1 = new AbstractLongAssert<>(AbstractLongAssert.class, actual1);
        AbstractLongAssert<?, Long> assert2 = new AbstractLongAssert<>(AbstractLongAssert.class, actual2);
        AbstractLongAssert<?, Long> assert3 = new AbstractLongAssert<>(AbstractLongAssert.class, actual3);
        AbstractLongAssert<?, Long> assert4 = new AbstractLongAssert<>(AbstractLongAssert.class, actual4);

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
        assertThrows(AssertException.class, () -> assert3.isCloseTo(5L, 2L));
        assertThrows(AssertException.class, () -> assert3.isNotCloseTo(5L, 6L));

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
        assert1.isCloseTo(actual2, 3L);
        assert1.isNotCloseTo(5L, 1L);
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
        AbstractLongAssert<?, Long> assert1 = new AbstractLongAssert<>(AbstractLongAssert.class, actual1);
        AbstractLongAssert<?, Long> assert2 = new AbstractLongAssert<>(AbstractLongAssert.class, actual2);
        AbstractLongAssert<?, Long> assert3 = new AbstractLongAssert<>(AbstractLongAssert.class, actual3);

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