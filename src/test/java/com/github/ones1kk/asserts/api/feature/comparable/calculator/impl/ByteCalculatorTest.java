package com.github.ones1kk.asserts.api.feature.comparable.calculator.impl;

import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ByteCalculatorTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Byte> calculator = new ByteCalculator();

        assertThat(calculator.isGraterThan((byte) 2, (byte) 1)).isTrue();
        assertThat(calculator.isGraterThan((byte) 1, (byte) 2)).isFalse();
        assertThat(calculator.isGraterThan((byte) 1, (byte) 1)).isFalse();

        assertThat(calculator.isLessThan((byte) 1, (byte) 2)).isTrue();
        assertThat(calculator.isLessThan((byte) 2, (byte) 1)).isFalse();
        assertThat(calculator.isLessThan((byte) 1, (byte) 1)).isFalse();

        assertThat(calculator.isLessThanOrEqualTo((byte) 1, (byte) 2)).isTrue();
        assertThat(calculator.isLessThanOrEqualTo((byte) 2, (byte) 1)).isFalse();
        assertThat(calculator.isLessThanOrEqualTo((byte) 1, (byte) 1)).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo((byte) 2, (byte) 1)).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo((byte) 1, (byte) 2)).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo((byte) 1, (byte) 1)).isTrue();

        assertThat(calculator.is((byte) 1, (byte) 1)).isTrue();
        assertThat(calculator.is((byte) 1, (byte) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Byte> calculator = new ByteCalculator();

        assertThat(calculator.isGraterThan(Byte.valueOf("2"), Byte.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThan(Byte.valueOf("1"), Byte.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThan(Byte.valueOf("1"), Byte.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThan(Byte.valueOf("1"), Byte.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThan(Byte.valueOf("2"), Byte.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThan(Byte.valueOf("1"), Byte.valueOf("1"))).isFalse();

        assertThat(calculator.isLessThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("2"))).isTrue();
        assertThat(calculator.isLessThanOrEqualTo(Byte.valueOf("2"), Byte.valueOf("1"))).isFalse();
        assertThat(calculator.isLessThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("1"))).isTrue();

        assertThat(calculator.isGraterThanOrEqualTo(Byte.valueOf("2"), Byte.valueOf("1"))).isTrue();
        assertThat(calculator.isGraterThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("2"))).isFalse();
        assertThat(calculator.isGraterThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("1"))).isTrue();

        assertThat(calculator.is(Byte.valueOf("1"), Byte.valueOf("1"))).isTrue();
        assertThat(calculator.is(Byte.valueOf("1"), Byte.valueOf("2"))).isFalse();

    }

}