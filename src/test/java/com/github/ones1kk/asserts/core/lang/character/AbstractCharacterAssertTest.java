package com.github.ones1kk.asserts.core.lang.character;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractCharacterAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        char actual1 = 'A';

        // when
        AbstractCharacterAssert<?, Character> assert1 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual1);
        AbstractCharacterAssert<?, Character> assert2 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, null);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractCharacterAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Character.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(Character.class);
            assert1.isNotAssignableFrom(AbstractCharacterAssert.class);
        });
    }

    @Test
    @DisplayName("Characters test")
    public void test2() throws Exception {
        // given
        char actual1 = 'a';
        Character actual2 = null;
        char actual3 = ' ';
        char actual4 = '1';
        char actual5 = 'G';

        // when
        AbstractCharacterAssert<?, Character> assert1 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual1);
        AbstractCharacterAssert<?, Character> assert2 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual2);
        AbstractCharacterAssert<?, Character> assert3 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual3);
        AbstractCharacterAssert<?, Character> assert4 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual4);
        AbstractCharacterAssert<?, Character> assert5 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual5);

        // then
        assertThrows(AssertException.class, assert1::isUpperCase);
        assertThrows(AssertException.class, assert5::isNotUpperCase);
        assertThrows(AssertException.class, assert5::isLowerCase);
        assertThrows(AssertException.class, assert1::isNotLowerCase);
        assertThrows(AssertException.class, assert4::isLetter);
        assertThrows(AssertException.class, assert5::isNotLetter);
        assertThrows(AssertException.class, assert3::isDigit);
        assertThrows(AssertException.class, assert4::isNotDigit);
        assertThrows(AssertException.class, assert1::isWhitespace);
        assertThrows(AssertException.class, assert3::isNotWhitespace);

        assertThatNoException().isThrownBy(() -> {
            assert5.isUpperCase();
            assert1.isNotUpperCase();
            assert1.isLowerCase();
            assert5.isNotLowerCase();
            assert1.isLetter();
            assert4.isNotLetter();
            assert4.isDigit();
            assert5.isNotDigit();
            assert3.isWhitespace();
            assert1.isNotWhitespace();
        });
    }

    @Test
    @DisplayName("Comparable Test")
    public void test3() throws Exception {
        // given
        Character actual1 = '1';
        Character actual2 = '2';
        Character actual3 = '3';

        Character expected1 = '1';
        Character expected2 = '2';
        Character expected3 = '3';

        // when
        AbstractCharacterAssert<?, Character> assert1 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual1);
        AbstractCharacterAssert<?, Character> assert2 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual2);
        AbstractCharacterAssert<?, Character> assert3 = new AbstractCharacterAssert<>(AbstractCharacterAssert.class, actual3);

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