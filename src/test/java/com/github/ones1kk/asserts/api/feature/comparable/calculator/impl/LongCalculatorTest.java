package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Long> calculator = new LongCalculator();

        assertThat(calculator.isGraterThan((long) 2, (long) 1)).isTrue();
        assertThat(calculator.isGraterThan((long) 1, (long) 2)).isFalse();
        assertThat(calculator.isGraterThan((long) 1, (long) 1)).isFalse();

        assertThat(calculator.isLessThan((long) 1, (long) 2)).isTrue();
        assertThat(calculator.isLessThan((long) 2, (long) 1)).isFalse();
        assertThat(calculator.isLessThan((long) 1, (long) 1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo((long) 1, (long) 2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo((long) 2, (long) 1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo((long) 1, (long) 1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo((long) 2, (long) 1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo((long) 1, (long) 2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo((long) 1, (long) 1)).isTrue();

        assertThat(calculator.is((long) 1, (long) 1)).isTrue();
        assertThat(calculator.is((long) 1, (long) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Long> calculator = new LongCalculator();

        assertThat(calculator.isGraterThan(Long.valueOf("2"), Long.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThan(Long.valueOf("1"), Long.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThan(Long.valueOf("1"), Long.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThan(Long.valueOf("1"), Long.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThan(Long.valueOf("2"), Long.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThan(Long.valueOf("1"), Long.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(Long.valueOf("1"), Long.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(Long.valueOf("2"), Long.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(Long.valueOf("1"), Long.valueOf("1"))).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo(Long.valueOf("2"), Long.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(Long.valueOf("1"), Long.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo(Long.valueOf("1"), Long.valueOf("1"))).isTrue();

        assertThat(calculator.is(Long.valueOf("1"), Long.valueOf("1"))).isTrue();
        assertThat(calculator.is(Long.valueOf("1"), Long.valueOf("2"))).isFalse();

    }

}