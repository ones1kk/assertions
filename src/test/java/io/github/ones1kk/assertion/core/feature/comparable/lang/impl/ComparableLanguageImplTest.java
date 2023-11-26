package io.github.ones1kk.assertion.core.feature.comparable.lang.impl;

import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguageImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComparableLanguageImplTest {

    @Test
    @DisplayName("test double type")
    void testDoubleType() throws Exception {
        Double actual = 1.45;
        ComparableLanguage<Double> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2.45)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0.45)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2.45)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1.45)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0.45)).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, 0.45)).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, 4.45)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 4.45)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 1.45)).isTrue(); // true
    }

    @Test
    @DisplayName("test long type")
    void testLongType() throws Exception {
        Long actual = 1L;
        ComparableLanguage<Long> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2L)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0L)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2L)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1L)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0L)).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, 0L)).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, 4L)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 4L)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 1L)).isTrue(); // true
    }

    @Test
    @DisplayName("test integer type")
    void testIntegerType() throws Exception {
        Integer actual = 1;
        ComparableLanguage<Integer> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0)).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, 0)).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, 4)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 4)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 1)).isTrue(); // true
    }

    @Test
    @DisplayName("test float type")
    void testFloatType() throws Exception {
        Float actual = 1F;
        ComparableLanguage<Float> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2F)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0F)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2F)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1F)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0F)).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, 0F)).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, 4F)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 4F)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, 1F)).isTrue(); // true
    }

    @Test
    @DisplayName("test short type")
    void testShortType() throws Exception {
        Short actual = 1;
        ComparableLanguage<Short> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, (short) 2)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, (short) 0)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, (short) 2)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (short) 1)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (short) 0)).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, (short) 0)).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, (short) 4)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, (short) 4)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, (short) 1)).isTrue(); // true
    }

    @Test
    @DisplayName("test byte type")
    void testByteType() throws Exception {
        Byte actual = 1;
        ComparableLanguage<Byte> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, (byte) 2)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, (byte) 0)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, (byte) 2)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (byte) 1)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (byte) 0)).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, (byte) 0)).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, (byte) 4)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, (byte) 4)).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, (byte) 1)).isTrue(); // true
    }

    @Test
    @DisplayName("test string type")
    void testStringType() throws Exception {
        String actual = "1";
        ComparableLanguage<String> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, "2")).isTrue(); // true
        assertThat(comparable.isLessThan(actual, "0")).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, "2")).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, "1")).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, "0")).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, "0")).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, "4")).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, "4")).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, "1")).isTrue(); // true
    }

    @Test
    @DisplayName("test character type")
    void testCharacterType() throws Exception {
        Character actual = '1';
        ComparableLanguage<Character> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, '2')).isTrue(); // true
        assertThat(comparable.isLessThan(actual, '0')).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, '2')).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, '1')).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, '0')).isFalse(); // false

        assertThat(comparable.isGreaterThan(actual, '0')).isTrue(); // true
        assertThat(comparable.isGreaterThan(actual, '4')).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, '4')).isFalse(); // false
        assertThat(comparable.isGreaterThanOrEqualTo(actual, '1')).isTrue(); // true
    }

}