package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerComparableImplTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Integer> comparable = new IntegerComparableImpl();

        assertThat(comparable.isGraterThan((int) 2, (int) 1)).isTrue();
        assertThat(comparable.isGraterThan((int) 1, (int) 2)).isFalse();
        assertThat(comparable.isGraterThan((int) 1, (int) 1)).isFalse();

        assertThat(comparable.isLessThan((int) 1, (int) 2)).isTrue();
        assertThat(comparable.isLessThan((int) 2, (int) 1)).isFalse();
        assertThat(comparable.isLessThan((int) 1, (int) 1)).isFalse();

        assertThat(comparable.isLessThanOrEqualTo((int) 1, (int) 2)).isTrue();
        assertThat(comparable.isLessThanOrEqualTo((int) 2, (int) 1)).isFalse();
        assertThat(comparable.isLessThanOrEqualTo((int) 1, (int) 1)).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo((int) 2, (int) 1)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo((int) 1, (int) 2)).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo((int) 1, (int) 1)).isTrue();

        assertThat(comparable.is((int) 1, (int) 1)).isTrue();
        assertThat(comparable.is((int) 1, (int) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Integer> comparable = new IntegerComparableImpl();

        assertThat(comparable.isGraterThan(Integer.valueOf("2"), Integer.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThan(Integer.valueOf("1"), Integer.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThan(Integer.valueOf("1"), Integer.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThan(Integer.valueOf("1"), Integer.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThan(Integer.valueOf("2"), Integer.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThan(Integer.valueOf("1"), Integer.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThanOrEqualTo(Integer.valueOf("2"), Integer.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("1"))).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo(Integer.valueOf("2"), Integer.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo(Integer.valueOf("1"), Integer.valueOf("1"))).isTrue();

        assertThat(comparable.is(Integer.valueOf("1"), Integer.valueOf("1"))).isTrue();
        assertThat(comparable.is(Integer.valueOf("1"), Integer.valueOf("2"))).isFalse();

    }


}