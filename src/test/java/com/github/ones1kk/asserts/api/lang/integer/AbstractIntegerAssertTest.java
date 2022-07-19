package com.github.ones1kk.asserts.api.lang.integer;

import com.github.ones1kk.asserts.api.exception.AssertException;
import com.github.ones1kk.asserts.api.feature.Offset;
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
        assertThrows(AssertException.class, () -> assert3.isCloseTo(5, Offset.offset(2)));
        assertThrows(AssertException.class, () -> assert3.isNotCloseTo(5, Offset.offset(6)));

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
        assert1.isCloseTo(actual2, Offset.offset(3));
        assert1.isNotCloseTo(5, Offset.offset(1));
    }

}


