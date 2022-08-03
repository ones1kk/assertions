package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Integer> calculator = new IntegerCalculator();

        assertThat(calculator.isGraterThan((int) 2, (int) 1)).isTrue();
        assertThat(calculator.isGraterThan((int) 1, (int) 2)).isFalse();
        assertThat(calculator.isGraterThan((int) 1, (int) 1)).isFalse();

        assertThat(calculator.isLessThan((int) 1, (int) 2)).isTrue();
        assertThat(calculator.isLessThan((int) 2, (int) 1)).isFalse();
        assertThat(calculator.isLessThan((int) 1, (int) 1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo((int) 1, (int) 2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo((int) 2, (int) 1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo((int) 1, (int) 1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo((int) 2, (int) 1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo((int) 1, (int) 2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo((int) 1, (int) 1)).isTrue();

        assertThat(calculator.is((int) 1, (int) 1)).isTrue();
        assertThat(calculator.is((int) 1, (int) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Integer> calculator = new IntegerCalculator();

        assertThat(calculator.isGraterThan(Integer.valueOf("2"), Integer.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThan(Integer.valueOf("1"), Integer.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThan(Integer.valueOf("1"), Integer.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThan(Integer.valueOf("1"), Integer.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThan(Integer.valueOf("2"), Integer.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThan(Integer.valueOf("1"), Integer.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(Integer.valueOf("2"), Integer.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("1"))).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo(Integer.valueOf("2"), Integer.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("1"))).isTrue();

        assertThat(calculator.is(Integer.valueOf("1"), Integer.valueOf("1"))).isTrue();
        assertThat(calculator.is(Integer.valueOf("1"), Integer.valueOf("2"))).isFalse();

    }


}