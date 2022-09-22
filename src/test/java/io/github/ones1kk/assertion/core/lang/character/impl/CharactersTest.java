package io.github.ones1kk.assertion.core.lang.character.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CharactersTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        Characters characters = new Characters(asAssert);

        // when
        Character actual1 = 'a';
        Character actual2 = ' ';

        // then
        assertThrows(Exception.class, () -> characters.assertIsUpperCase(actual1));
        assertThrows(Exception.class, () -> characters.assertIsNotUpperCase('A'));
        assertThrows(Exception.class, () -> characters.assertIsLowerCase('A'));
        assertThrows(Exception.class, () -> characters.assertIsNotLowerCase(actual1));
        assertThrows(Exception.class, () -> characters.assertIsLetter('1'));
        assertThrows(Exception.class, () -> characters.assertIsNotLetter(actual1));
        assertThrows(Exception.class, () -> characters.assertIsDigit(actual2));
        assertThrows(Exception.class, () -> characters.assertIsNotDigit('1'));
        assertThrows(Exception.class, () -> characters.assertIsWhitespace('1'));
        assertThrows(Exception.class, () -> characters.assertIsNotWhitespace(actual2));

        // actual > expected
        assertThrows(Exception.class, () -> characters.assertIsLessThan('5', '3'));
        // actual == expected
        assertThrows(Exception.class, () -> characters.assertIsLessThan('5', '5'));
        // actual > expected
        assertThrows(Exception.class, () -> characters.assertIsLessThan('C', 'B'));

        // actual > expected
        assertThrows(Exception.class, () -> characters.assertIsLessThanOrEqualTo('C', 'B'));

        // actual < expected
        assertThrows(Exception.class, () -> characters.assertIsGreaterThan('3', '5'));
        // actual == expected
        assertThrows(Exception.class, () -> characters.assertIsGreaterThan('5', '5'));
        // actual < expected
        assertThrows(Exception.class, () -> characters.assertIsGreaterThan('B', 'C'));

        // actual < expected
        assertThrows(Exception.class, () -> characters.assertIsGreaterThanOrEqualTo('B', 'C'));

        // actual < start
        assertThrows(Exception.class,
                () -> characters.assertIsBetween('A', 'B', 'C'));
        // actual > end
        assertThrows(Exception.class,
                () -> characters.assertIsBetween('C', 'A', 'B'));

        assertThatNoException().isThrownBy(() -> {
            characters.assertIsUpperCase('A');
            characters.assertIsNotUpperCase(actual1);
            characters.assertIsLowerCase(actual1);
            characters.assertIsNotLowerCase('A');
            characters.assertIsLetter(actual1);
            characters.assertIsNotLetter('1');
            characters.assertIsDigit('1');
            characters.assertIsNotDigit(actual1);
            characters.assertIsWhitespace(actual2);
            characters.assertIsNotWhitespace(actual1);

            characters.assertIsLessThan('4', '7');
            characters.assertIsLessThanOrEqualTo('4', '7');
            characters.assertIsLessThanOrEqualTo('4', '4');

            characters.assertIsGreaterThan('7', '4');
            characters.assertIsGreaterThanOrEqualTo('7', '4');
            characters.assertIsGreaterThanOrEqualTo('4', '4');

            // start < actual < end
            characters.assertIsBetween('B', 'A', 'C');
        });
    }
}