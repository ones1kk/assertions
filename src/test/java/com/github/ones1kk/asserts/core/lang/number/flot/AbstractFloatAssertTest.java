package com.github.ones1kk.asserts.core.lang.number.flot;

import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractFloatAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Float actual1 = 1.0F;
        Float actual2 = null;

        // when
        AbstractFloatAssert<?, Float> assert1 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual1);
        AbstractFloatAssert<?, Float> assert2 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractFloatAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Float.class));

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isAssignableFrom(Float.class);
        assert1.isNotAssignableFrom(AbstractFloatAssert.class);
    }

    @Test
    @DisplayName("Float method test")
    public void test2() throws Exception {
        // given
        Float actual1 = 1.0F;
        Float actual2 = -1.0F;
        Float actual3 = 0.0F;
        Float actual4 = (float) (3 / 0.0);
        Float actual5 = (float) (5 % 0.0);
        Float actual6 = 100F;

        // when
        AbstractFloatAssert<?, Float> assert1 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual1);
        AbstractFloatAssert<?, Float> assert2 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual2);
        AbstractFloatAssert<?, Float> assert3 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual3);
        AbstractFloatAssert<?, Float> assert4 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual4);
        AbstractFloatAssert<?, Float> assert5 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual5);
        AbstractFloatAssert<?, Float> assert6 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual6);

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

        assertThrows(AssertException.class, () -> assert6.isCloseTo(60.0F, Offset.offset((30.0F))));
        assertThrows(AssertException.class, () -> assert6.isNotCloseTo(60.0F, Offset.offset((50F))));

        assertThrows(AssertException.class, () -> assert3.isCloseTo(5F, 2.0));
        assertThrows(AssertException.class, () -> assert1.isNotCloseTo(1F, 80.0));

        assert1.isFinite();
        assert4.isInfinity();
        assert5.isNaN();
        assert1.isPositive();
        assert2.isNotPositive();
        assert2.isNegative();
        assert1.isNotNegative();
        assert3.isZero();
        assert1.isNotZero();

        assert6.isCloseTo(80F, Offset.offset(20F));
        assert6.isNotCloseTo(70.0F, Offset.offset(10.0F));

        assert1.isCloseTo(actual1, 100.0);
        assert1.isNotCloseTo(5.8F, 1.2);
    }

    @Test
    @DisplayName("Comparable Test")
    public void test3() throws Exception {
        // given
        Float actual1 = 1.0F;
        Float actual2 = 2.1F;
        Float actual3 = 3.2F;

        Float expected1 = 1.0F;
        Float expected2 = 2.1F;
        Float expected3 = 3.2F;

        // when
        AbstractFloatAssert<?, Float> assert1 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual1);
        AbstractFloatAssert<?, Float> assert2 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual2);
        AbstractFloatAssert<?, Float> assert3 = new AbstractFloatAssert<>(AbstractFloatAssert.class, actual3);

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