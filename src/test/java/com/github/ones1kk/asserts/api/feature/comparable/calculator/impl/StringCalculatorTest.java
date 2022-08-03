package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<String> calculator = new StringCalculator();

        assertThat(calculator.isGraterThan("2", "1")).isTrue();
        assertThat(calculator.isGraterThan("1", "2")).isFalse();
        assertThat(calculator.isGraterThan("1", "1")).isFalse();

        assertThat(calculator.isLessThan("1", "2")).isTrue();
        assertThat(calculator.isLessThan("2", "1")).isFalse();
        assertThat(calculator.isLessThan("1", "1")).isFalse();

        assertThat(calculator.isLessThanOrEqualTo("1", "2")).isTrue();
        assertThat(calculator.isLessThanOrEqualTo("2", "1")).isFalse();
        assertThat(calculator.isLessThanOrEqualTo("1", "1")).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo("2", "1")).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo("1", "2")).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo("1", "1")).isTrue();

        assertThat(calculator.is("1", "1")).isTrue();
        assertThat(calculator.is("1", "2")).isFalse();

    }

}