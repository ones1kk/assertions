package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FloatCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Float> calculator = new FloatCalculator();

        assertThat(calculator.isGraterThan((float) 2, (float) 1)).isTrue();
        assertThat(calculator.isGraterThan((float) 1, (float) 2)).isFalse();
        assertThat(calculator.isGraterThan((float) 1, (float) 1)).isFalse();

        assertThat(calculator.isLessThan((float) 1, (float) 2)).isTrue();
        assertThat(calculator.isLessThan((float) 2, (float) 1)).isFalse();
        assertThat(calculator.isLessThan((float) 1, (float) 1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo((float) 1, (float) 2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo((float) 2, (float) 1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo((float) 1, (float) 1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo((float) 2, (float) 1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo((float) 1, (float) 2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo((float) 1, (float) 1)).isTrue();

        assertThat(calculator.is((float) 1, (float) 1)).isTrue();
        assertThat(calculator.is((float) 1, (float) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Float> calculator = new FloatCalculator();

        assertThat(calculator.isGraterThan(Float.valueOf("2"), Float.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThan(Float.valueOf("1"), Float.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThan(Float.valueOf("1"), Float.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThan(Float.valueOf("1"), Float.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThan(Float.valueOf("2"), Float.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThan(Float.valueOf("1"), Float.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(Float.valueOf("1"), Float.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(Float.valueOf("2"), Float.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(Float.valueOf("1"), Float.valueOf("1"))).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo(Float.valueOf("2"), Float.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(Float.valueOf("1"), Float.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo(Float.valueOf("1"), Float.valueOf("1"))).isTrue();

        assertThat(calculator.is(Float.valueOf("1"), Float.valueOf("1"))).isTrue();
        assertThat(calculator.is(Float.valueOf("1"), Float.valueOf("2"))).isFalse();

    }

}