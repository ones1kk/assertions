package com.github.ones1kk.asserts.api.lang.shrt;

import com.github.ones1kk.asserts.api.exception.AssertException;
import com.github.ones1kk.asserts.api.feature.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractShortAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Short actual1 = 1;
        Short actual2 = null;

        // when
        AbstractShortAssert<?, Short> assert1 = new AbstractShortAssert<>(AbstractShortAssert.class, actual1);
        AbstractShortAssert<?, Short> assert2 = new AbstractShortAssert<>(AbstractShortAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractShortAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Short.class));

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isAssignableFrom(Short.class);
        assert1.isNotAssignableFrom(AbstractShortAssert.class);
    }

    @Test
    @DisplayName("Short method test")
    public void test2() throws Exception {
        // given
        Short actual1 = 1;
        Short actual2 = -1;
        Short actual3 = 0;
        Short actual4 = 2;

        // when
        AbstractShortAssert<?, Short> assert1 = new AbstractShortAssert<>(AbstractShortAssert.class, actual1);
        AbstractShortAssert<?, Short> assert2 = new AbstractShortAssert<>(AbstractShortAssert.class, actual2);
        AbstractShortAssert<?, Short> assert3 = new AbstractShortAssert<>(AbstractShortAssert.class, actual3);
        AbstractShortAssert<?, Short> assert4 = new AbstractShortAssert<>(AbstractShortAssert.class, actual4);

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
        assertThrows(AssertException.class, () -> assert3.isCloseTo((short) 5, Offset.offset((short) 2)));
        assertThrows(AssertException.class, () -> assert3.isNotCloseTo((short) 5, Offset.offset((short) 6)));

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
        assert1.isCloseTo(actual2, Offset.offset((short) 3));
        assert1.isNotCloseTo((short) 5, Offset.offset((short) 1));

    }

}