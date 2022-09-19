package com.github.ones1kk.asserts.core.array.number;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractNumberArrayAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Number[] actual1 = {1, 5, 23F, 12436L, 0.567};
        Number[] actual2 = null;

        // when
        AbstractNumberArrayAssert<?, Number[]> assert1 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual1);
        AbstractNumberArrayAssert<?, Number[]> assert2 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractNumberArrayAssert.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isNotAssignableFrom(AbstractNumberArrayAssert.class);
        });

    }

    @Test
    @DisplayName("Number Array method test")
    public void test2() throws Exception {
        // given
        Number[] actual1 = {1, 5, 23F, 12436L, 0.567};
        Number[] actual2 = {};
        Number[] actual3 = null;
        Number[] actual4 = {1, (short) 23, (byte) 123, null};

        // when
        AbstractNumberArrayAssert<?, Number[]> assert1 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual1);
        AbstractNumberArrayAssert<?, Number[]> assert2 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual2);
        AbstractNumberArrayAssert<?, Number[]> assert3 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual3);
        AbstractNumberArrayAssert<?, Number[]> assert4 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual4);

        // then
        assertThrows(AssertException.class, () -> assert1.isMax(12));
        assertThrows(AssertException.class, () -> assert1.isMin(1));
        assertThrows(AssertException.class, () -> assert1.isSum(9817237));
        assertThrows(AssertException.class, assert1::isEmpty);
        assertThrows(AssertException.class, assert2::isNotEmpty);
        assertThrows(AssertException.class, assert1::isNullOrEmpty);

        assertThrows(AssertException.class, () -> assert1.contains(2634));

        assertThrows(AssertException.class, () -> assert1.doesNotContain(23F));

        // Noting
        assertThrows(AssertException.class, () -> assert1.containsAll(99, 88, 77));
        // Only one
        assertThrows(AssertException.class, () -> assert1.containsAll(1, 2, 3));

        assertThrows(AssertException.class, () -> assert1.containsAny(99, 88, 77));

        assertThrows(AssertException.class, assert1::containsNull);
        assertThrows(AssertException.class, assert4::doesNotContainNull);

        assertThrows(AssertException.class, () -> assert1.allMatch(Objects::isNull));
        assertThrows(AssertException.class, () -> assert1.noneMatch(Objects::nonNull));

        assertThatNoException().isThrownBy(() -> {
            assert1.isMax(12436L);
            assert1.isMin(0.567);
            assert1.isSum(12465.567);
            assert2.isEmpty();
            assert1.isNotEmpty();

            // Null check
            assert3.isNullOrEmpty();
            // Empty check
            assert2.isNullOrEmpty();

            assert1.contains(12436L);
            assert1.doesNotContain(999);
            // When array is empty
            assert2.doesNotContain(23F);

            assert1.containsAll(1, 23F, 5);

            assert1.containsAny(999, 888, 0.567);

            assert4.containsNull();
            assert1.doesNotContainNull();

            assert1.allMatch(Objects::nonNull);
            assert1.noneMatch(Objects::isNull);
        });
    }

    @Test
    @DisplayName("Comparable method test")
    public void test3() throws Exception {
        // given
        Number[] actual1 = {1, 5, 23F, 12436L, 0.567};
        Number[] actual2 = {};
        Number[] actual4 = {1, (short) 23, (byte) 123, null};

        // when
        AbstractNumberArrayAssert<?, Number[]> assert1 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual1);
        AbstractNumberArrayAssert<?, Number[]> assert2 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual2);
        AbstractNumberArrayAssert<?, Number[]> assert3 = new AbstractNumberArrayAssert<>(AbstractNumberArrayAssert.class, actual4);

        // then
        assertThrows(AssertException.class, () -> assert1.isShorterThan(actual4));
        assertThrows(AssertException.class, () -> assert1.isShorterThan(actual1));
        assertThrows(AssertException.class, () -> assert1.isShorterThanOrEqualTo(actual4));

        assertThrows(AssertException.class, () -> assert3.isLongerThan(actual4));
        assertThrows(AssertException.class, () -> assert3.isLongerThan(actual1));
        assertThrows(AssertException.class, () -> assert3.isLongerThanOrEqualTo(actual1));

        assertThrows(AssertException.class, () -> assert2.isBetweenLengthOf(actual4, actual1));

        assertThatNoException().isThrownBy(() -> {
            assert3.isShorterThan(actual1);
            assert3.isShorterThanOrEqualTo(actual1);
            assert3.isShorterThanOrEqualTo(actual4);

            assert1.isLongerThan(actual4);
            assert1.isLongerThanOrEqualTo(actual1);
            assert1.isLongerThanOrEqualTo(actual4);

            assert3.isBetweenLengthOf(actual2, actual1);
        });
    }
}