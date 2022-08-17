package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShortComparableImplTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Short> comparable = new ShortComparableImpl();

        assertThat(comparable.isGraterThan((short) 2, (short) 1)).isTrue();
        assertThat(comparable.isGraterThan((short) 1, (short) 2)).isFalse();
        assertThat(comparable.isGraterThan((short) 1, (short) 1)).isFalse();

        assertThat(comparable.isLessThan((short) 1, (short) 2)).isTrue();
        assertThat(comparable.isLessThan((short) 2, (short) 1)).isFalse();
        assertThat(comparable.isLessThan((short) 1, (short) 1)).isFalse();

        assertThat(comparable.isLessThanOrEqualTo((short) 1, (short) 2)).isTrue();
        assertThat(comparable.isLessThanOrEqualTo((short) 2, (short) 1)).isFalse();
        assertThat(comparable.isLessThanOrEqualTo((short) 1, (short) 1)).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo((short) 2, (short) 1)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo((short) 1, (short) 2)).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo((short) 1, (short) 1)).isTrue();

        assertThat(comparable.is((short) 1, (short) 1)).isTrue();
        assertThat(comparable.is((short) 1, (short) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Short> comparable = new ShortComparableImpl();

        assertThat(comparable.isGraterThan(Short.valueOf("2"), Short.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThan(Short.valueOf("1"), Short.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThan(Short.valueOf("1"), Short.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThan(Short.valueOf("1"), Short.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThan(Short.valueOf("2"), Short.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThan(Short.valueOf("1"), Short.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThanOrEqualTo(Short.valueOf("1"), Short.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThanOrEqualTo(Short.valueOf("2"), Short.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThanOrEqualTo(Short.valueOf("1"), Short.valueOf("1"))).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo(Short.valueOf("2"), Short.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(Short.valueOf("1"), Short.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo(Short.valueOf("1"), Short.valueOf("1"))).isTrue();

        assertThat(comparable.is(Short.valueOf("1"), Short.valueOf("1"))).isTrue();
        assertThat(comparable.is(Short.valueOf("1"), Short.valueOf("2"))).isFalse();

    }

}