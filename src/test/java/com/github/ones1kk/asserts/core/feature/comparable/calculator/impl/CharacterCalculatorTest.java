package com.github.ones1kk.asserts.core.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.core.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Character> calculator = new CharacterCalculator();

        assertThat(calculator.isGraterThan((char) 2, (char) 1)).isTrue();
        assertThat(calculator.isGraterThan((char) 1, (char) 2)).isFalse();
        assertThat(calculator.isGraterThan((char) 1, (char) 1)).isFalse();

        assertThat(calculator.isLessThan((char) 1, (char) 2)).isTrue();
        assertThat(calculator.isLessThan((char) 2, (char) 1)).isFalse();
        assertThat(calculator.isLessThan((char) 1, (char) 1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo((char) 1, (char) 2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo((char) 2, (char) 1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo((char) 1, (char) 1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo((char) 2, (char) 1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo((char) 1, (char) 2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo((char) 1, (char) 1)).isTrue();

        assertThat(calculator.is((char) 1, (char) 1)).isTrue();
        assertThat(calculator.is((char) 1, (char) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Character> calculator = new CharacterCalculator();

        assertThat(calculator.isGraterThan('2', '1')).isTrue();
        assertThat(calculator.isGraterThan('1', '2')).isFalse();
        assertThat(calculator.isGraterThan('1', '1')).isFalse();

        assertThat(calculator.isLessThan('1', '2')).isTrue();
        assertThat(calculator.isLessThan('2', '1')).isFalse();
        assertThat(calculator.isLessThan('1', '1')).isFalse();

        assertThat(calculator.isLessThanOrEqualTo('1', '2')).isTrue();
        assertThat(calculator.isLessThanOrEqualTo('2', '1')).isFalse();
        assertThat(calculator.isLessThanOrEqualTo('1', '1')).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo('2', '1')).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo('1', '2')).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo('1', '1')).isTrue();

        assertThat(calculator.is('1', '1')).isTrue();
        assertThat(calculator.is('1', '2')).isFalse();

    }

}