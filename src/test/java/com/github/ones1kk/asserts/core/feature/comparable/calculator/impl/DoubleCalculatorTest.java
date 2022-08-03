package com.github.ones1kk.asserts.core.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.core.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Double> calculator = new DoubleCalculator();

        assertThat(calculator.isGraterThan((double) 2, (double) 1)).isTrue();
        assertThat(calculator.isGraterThan((double) 1, (double) 2)).isFalse();
        assertThat(calculator.isGraterThan((double) 1, (double) 1)).isFalse();

        assertThat(calculator.isLessThan((double) 1, (double) 2)).isTrue();
        assertThat(calculator.isLessThan((double) 2, (double) 1)).isFalse();
        assertThat(calculator.isLessThan((double) 1, (double) 1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo((double) 1, (double) 2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo((double) 2, (double) 1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo((double) 1, (double) 1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo((double) 2, (double) 1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo((double) 1, (double) 2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo((double) 1, (double) 1)).isTrue();

        assertThat(calculator.is((double) 1, (double) 1)).isTrue();
        assertThat(calculator.is((double) 1, (double) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Double> calculator = new DoubleCalculator();

        assertThat(calculator.isGraterThan(Double.valueOf("2"), Double.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThan(Double.valueOf("1"), Double.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThan(Double.valueOf("1"), Double.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThan(Double.valueOf("1"), Double.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThan(Double.valueOf("2"), Double.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThan(Double.valueOf("1"), Double.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(Double.valueOf("1"), Double.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(Double.valueOf("2"), Double.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(Double.valueOf("1"), Double.valueOf("1"))).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo(Double.valueOf("2"), Double.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(Double.valueOf("1"), Double.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo(Double.valueOf("1"), Double.valueOf("1"))).isTrue();

        assertThat(calculator.is(Double.valueOf("1"), Double.valueOf("1"))).isTrue();
        assertThat(calculator.is(Double.valueOf("1"), Double.valueOf("2"))).isFalse();

    }

}