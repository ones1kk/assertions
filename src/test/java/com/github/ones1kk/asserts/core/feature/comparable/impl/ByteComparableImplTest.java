package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ByteComparableImplTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Byte> comparable = new ByteComparableImpl();

        assertThat(comparable.isGraterThan((byte) 2, (byte) 1)).isTrue();
        assertThat(comparable.isGraterThan((byte) 1, (byte) 2)).isFalse();
        assertThat(comparable.isGraterThan((byte) 1, (byte) 1)).isFalse();

        assertThat(comparable.isLessThan((byte) 1, (byte) 2)).isTrue();
        assertThat(comparable.isLessThan((byte) 2, (byte) 1)).isFalse();
        assertThat(comparable.isLessThan((byte) 1, (byte) 1)).isFalse();

        assertThat(comparable.isLessThanOrEqualTo((byte) 1, (byte) 2)).isTrue();
        assertThat(comparable.isLessThanOrEqualTo((byte) 2, (byte) 1)).isFalse();
        assertThat(comparable.isLessThanOrEqualTo((byte) 1, (byte) 1)).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo((byte) 2, (byte) 1)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo((byte) 1, (byte) 2)).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo((byte) 1, (byte) 1)).isTrue();

        assertThat(comparable.is((byte) 1, (byte) 1)).isTrue();
        assertThat(comparable.is((byte) 1, (byte) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Byte> comparable = new ByteComparableImpl();

        assertThat(comparable.isGraterThan(Byte.valueOf("2"), Byte.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThan(Byte.valueOf("1"), Byte.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThan(Byte.valueOf("1"), Byte.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThan(Byte.valueOf("1"), Byte.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThan(Byte.valueOf("2"), Byte.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThan(Byte.valueOf("1"), Byte.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThanOrEqualTo(Byte.valueOf("2"), Byte.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("1"))).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo(Byte.valueOf("2"), Byte.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo(Byte.valueOf("1"), Byte.valueOf("1"))).isTrue();

        assertThat(comparable.is(Byte.valueOf("1"), Byte.valueOf("1"))).isTrue();
        assertThat(comparable.is(Byte.valueOf("1"), Byte.valueOf("2"))).isFalse();

    }

}