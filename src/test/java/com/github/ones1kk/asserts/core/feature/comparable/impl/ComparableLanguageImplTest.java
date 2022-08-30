package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.lang.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComparableLanguageImplTest {

    @Test
    @DisplayName("Method test(Double)")
    void test1() throws Exception {
        Double actual = 1.45;
        ComparableLanguage<Double> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2.45)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0.45)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2.45)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1.45)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0.45)).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, 0.45)).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, 4.45)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 4.45)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 1.45)).isTrue(); // true
    }

    @Test
    @DisplayName("Method test(Long)")
    void test2() throws Exception {
        Long actual = 1L;
        ComparableLanguage<Long> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2L)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0L)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2L)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1L)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0L)).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, 0L)).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, 4L)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 4L)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 1L)).isTrue(); // true
    }

    @Test
    @DisplayName("Method test(Integer)")
    void test3() throws Exception {
        Integer actual = 1;
        ComparableLanguage<Integer> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0)).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, 0)).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, 4)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 4)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 1)).isTrue(); // true
    }

    @Test
    @DisplayName("Method test(Float)")
    void test4() throws Exception {
        Float actual = 1F;
        ComparableLanguage<Float> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, 2F)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, 0F)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, 2F)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 1F)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, 0F)).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, 0F)).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, 4F)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 4F)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, 1F)).isTrue(); // true
    }

    @Test
    @DisplayName("Method test(Short)")
    void test5() throws Exception {
        Short actual = 1;
        ComparableLanguage<Short> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, (short) 2)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, (short) 0)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, (short) 2)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (short) 1)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (short) 0)).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, (short) 0)).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, (short) 4)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, (short) 4)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, (short) 1)).isTrue(); // true
    }

    @Test
    @DisplayName("Method test(Byte)")
    void test6() throws Exception {
        Byte actual = 1;
        ComparableLanguage<Byte> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, (byte) 2)).isTrue(); // true
        assertThat(comparable.isLessThan(actual, (byte) 0)).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, (byte) 2)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (byte) 1)).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, (byte) 0)).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, (byte) 0)).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, (byte) 4)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, (byte) 4)).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, (byte) 1)).isTrue(); // true
    }

    @Test
    @DisplayName("Method test(String)")
    void test7() throws Exception {
        String actual = "1";
        ComparableLanguage<String> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, "2")).isTrue(); // true
        assertThat(comparable.isLessThan(actual, "0")).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, "2")).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, "1")).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, "0")).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, "0")).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, "4")).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, "4")).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, "1")).isTrue(); // true
    }

    @Test
    @DisplayName("Method test(Character)")
    void test8() throws Exception {
        Character actual = '1';
        ComparableLanguage<Character> comparable = new ComparableLanguageImpl<>();
        assertThat(comparable.isLessThan(actual, '2')).isTrue(); // true
        assertThat(comparable.isLessThan(actual, '0')).isFalse(); // false

        assertThat(comparable.isLessThanOrEqualTo(actual, '2')).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, '1')).isTrue(); // true
        assertThat(comparable.isLessThanOrEqualTo(actual, '0')).isFalse(); // false

        assertThat(comparable.isGraterThan(actual, '0')).isTrue(); // true
        assertThat(comparable.isGraterThan(actual, '4')).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, '4')).isFalse(); // false
        assertThat(comparable.isGraterThanOrEqualTo(actual, '1')).isTrue(); // true
    }

}