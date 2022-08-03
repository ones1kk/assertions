package com.github.ones1kk.asserts.core.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.core.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShortCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Short> calculator = new ShortCalculator();

        assertThat(calculator.isGraterThan((short) 2, (short) 1)).isTrue();
        assertThat(calculator.isGraterThan((short) 1, (short) 2)).isFalse();
        assertThat(calculator.isGraterThan((short) 1, (short) 1)).isFalse();

        assertThat(calculator.isLessThan((short) 1, (short) 2)).isTrue();
        assertThat(calculator.isLessThan((short) 2, (short) 1)).isFalse();
        assertThat(calculator.isLessThan((short) 1, (short) 1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo((short) 1, (short) 2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo((short) 2, (short) 1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo((short) 1, (short) 1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo((short) 2, (short) 1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo((short) 1, (short) 2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo((short) 1, (short) 1)).isTrue();

        assertThat(calculator.is((short) 1, (short) 1)).isTrue();
        assertThat(calculator.is((short) 1, (short) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Short> calculator = new ShortCalculator();

        assertThat(calculator.isGraterThan(Short.valueOf("2"), Short.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThan(Short.valueOf("1"), Short.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThan(Short.valueOf("1"), Short.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThan(Short.valueOf("1"), Short.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThan(Short.valueOf("2"), Short.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThan(Short.valueOf("1"), Short.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(Short.valueOf("1"), Short.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(Short.valueOf("2"), Short.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(Short.valueOf("1"), Short.valueOf("1"))).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo(Short.valueOf("2"), Short.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(Short.valueOf("1"), Short.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo(Short.valueOf("1"), Short.valueOf("1"))).isTrue();

        assertThat(calculator.is(Short.valueOf("1"), Short.valueOf("1"))).isTrue();
        assertThat(calculator.is(Short.valueOf("1"), Short.valueOf("2"))).isFalse();

    }

}