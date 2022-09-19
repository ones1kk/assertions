package com.github.ones1kk.asserts.core.array;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractArrayAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        String[] actual1 = {"A", "B", "C"};
        Character[] actual2 = null;
        Character[] actual3 = {'A', 'b', 'C'};
        CharSequence[] actual4 = {"A", "b", "C"};

        // when
        AbstractArrayAssert<?, String> assert1 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual1);
        AbstractArrayAssert<?, Character> assert2 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual2);
        AbstractArrayAssert<?, Character> assert3 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual3);
        AbstractArrayAssert<?, CharSequence> assert4 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual4);

        // then
        assertThrows(AssertException.class, assert1::isNull);

        assertThrows(AssertException.class, assert3::isNull);

        assertThrows(AssertException.class, assert4::isNull);

        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractArrayAssert.class));

        assertThrows(AssertException.class, () -> assert3.isSameAs(assert3));
        assertThrows(AssertException.class, () -> assert3.isNotSameAs(actual3));
        assertThrows(AssertException.class, () -> assert3.isEqualTo(assert3));
        assertThrows(AssertException.class, () -> assert3.isNotEqualTo(actual3));
        assertThrows(AssertException.class, () -> assert3.isAssignableFrom(AbstractArrayAssert.class));

        assertThrows(AssertException.class, () -> assert4.isSameAs(assert4));
        assertThrows(AssertException.class, () -> assert4.isNotSameAs(actual4));
        assertThrows(AssertException.class, () -> assert4.isEqualTo(assert4));
        assertThrows(AssertException.class, () -> assert4.isNotEqualTo(actual4));
        assertThrows(AssertException.class, () -> assert4.isAssignableFrom(AbstractArrayAssert.class));

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isNotAssignableFrom(AbstractArrayAssert.class);

        assert3.isSameAs(actual3);
        assert3.isNotSameAs(assert3);
        assert3.isEqualTo(actual3);
        assert3.isNotEqualTo(assert3);
        assert3.isNotAssignableFrom(AbstractArrayAssert.class);

        assert4.isSameAs(actual4);
        assert4.isNotSameAs(assert4);
        assert4.isEqualTo(actual4);
        assert4.isNotEqualTo(assert4);
        assert4.isNotAssignableFrom(AbstractArrayAssert.class);
    }

    @Test
    @DisplayName("Array method test")
    public void test2() throws Exception {
        // given
        String[] actual1 = {"A", "B", "C"};
        Character[] actual2 = {'A', null, 'n', '2', '1'};
        Character[] actual3 = {'A', 'b', 'C'};
        CharSequence[] actual4 = {"A", "b", "C"};
        CharSequence[] actual5 = {};
        Character[] actual6 = null;
        ;


        // when
        AbstractArrayAssert<?, String> assert1 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual1);
        AbstractArrayAssert<?, Character> assert2 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual2);
        AbstractArrayAssert<?, Character> assert3 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual3);
        AbstractArrayAssert<?, CharSequence> assert4 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual4);
        AbstractArrayAssert<?, CharSequence> assert5 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual5);
        AbstractArrayAssert<?, Character> assert6 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual6);

        // then
        assertThrows(AssertException.class, assert1::isEmpty);
        assertThrows(AssertException.class, assert5::isNotEmpty);
        assertThrows(AssertException.class, assert1::isNullOrEmpty);

        assertThrows(AssertException.class, () -> assert1.contains("Z"));

        assertThrows(AssertException.class, () -> assert1.doesNotContain("A"));

        // Noting
        assertThrows(AssertException.class, () -> assert1.containsAll("Z", "X"));
        // Only one
        assertThrows(AssertException.class, () -> assert1.containsAll("A", "xX", "ZZZ"));

        assertThrows(AssertException.class, () -> assert1.containsAny("Z", "X"));

        assertThrows(AssertException.class, assert1::containsNull);
        assertThrows(AssertException.class, assert2::doesNotContainNull);

        assertThrows(AssertException.class, () -> assert1.allMatch(Objects::isNull));
        assertThrows(AssertException.class, () -> assert1.noneMatch(Objects::nonNull));

        assertThatNoException().isThrownBy(() -> {
            assert5.isEmpty();
            assert1.isNotEmpty();
            assert3.isNotEmpty();
            assert4.isNotEmpty();

            // Null check
            assert6.isNullOrEmpty();
            // Empty check
            assert5.isNullOrEmpty();

            assert1.contains("A");
            assert1.doesNotContain("Z");

            assert3.contains('A');
            assert3.doesNotContain('Z');

            assert4.contains("A");
            assert4.doesNotContain("Z");

            // When array is empty
            assert2.doesNotContain('a');

            assert1.containsAll("A", "B");
            assert3.containsAll('A', 'b');
            assert4.containsAll("A", "b");

            assert1.containsAny("X", "Y", "A");
            assert3.containsAny('X', 'Y', 'A');
            assert4.containsAny("X", "Y", "A");

            assert2.containsNull();
            assert1.doesNotContainNull();
            assert3.doesNotContainNull();
            assert4.doesNotContainNull();

            assert1.allMatch(Objects::nonNull);
            assert3.allMatch(Objects::nonNull);
            assert4.allMatch(Objects::nonNull);

            assert1.noneMatch(Objects::isNull);
            assert3.noneMatch(Objects::isNull);
            assert4.noneMatch(Objects::isNull);
        });
    }

    @Test
    @DisplayName("Comparable method test")
    public void test3() throws Exception {
        // given
        CharSequence[] actual1 = {"A", "B", "C"};
        CharSequence[] actual2 = {"A", null, "n", "2", "1"};
        CharSequence[] actual3 = {"A", "b", "C"};
        CharSequence[] actual4 = {"A", "b", "C", "D"};
        CharSequence[] actual5 = {};

        // when
        AbstractArrayAssert<?, CharSequence> assert1 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual1);
        AbstractArrayAssert<?, CharSequence> assert2 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual2);
        AbstractArrayAssert<?, CharSequence> assert3 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual3);
        AbstractArrayAssert<?, CharSequence> assert4 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual4);
        AbstractArrayAssert<?, CharSequence> assert5 = new AbstractArrayAssert<>(AbstractArrayAssert.class, actual5);

        // then
        assertThrows(AssertException.class, () -> assert4.isShorterThan(actual4));
        assertThrows(AssertException.class, () -> assert4.isShorterThan(actual1));
        assertThrows(AssertException.class, () -> assert4.isShorterThanOrEqualTo(actual1));

        assertThrows(AssertException.class, () -> assert3.isLongerThan(actual4));
        assertThrows(AssertException.class, () -> assert3.isLongerThan(actual1));
        assertThrows(AssertException.class, () -> assert1.isLongerThanOrEqualTo(actual4));

        assertThrows(AssertException.class, () -> assert2.isBetweenLengthOf(actual4, actual1));

        assertThatNoException().isThrownBy(() -> {
            assert5.isShorterThan(actual1);
            assert5.isShorterThanOrEqualTo(actual1);
            assert5.isShorterThanOrEqualTo(actual4);

            assert4.isLongerThan(actual1);
            assert4.isLongerThanOrEqualTo(actual1);
            assert4.isLongerThanOrEqualTo(actual4);

            assert1.isBetweenLengthOf(actual5, actual4);
        });
    }
}