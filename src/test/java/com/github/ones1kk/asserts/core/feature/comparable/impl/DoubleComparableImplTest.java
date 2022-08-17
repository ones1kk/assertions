package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleComparableImplTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Double> comparable = new DoubleComparableImpl();

        assertThat(comparable.isGraterThan((double) 2, (double) 1)).isTrue();
        assertThat(comparable.isGraterThan((double) 1, (double) 2)).isFalse();
        assertThat(comparable.isGraterThan((double) 1, (double) 1)).isFalse();

        assertThat(comparable.isLessThan((double) 1, (double) 2)).isTrue();
        assertThat(comparable.isLessThan((double) 2, (double) 1)).isFalse();
        assertThat(comparable.isLessThan((double) 1, (double) 1)).isFalse();

        assertThat(comparable.isLessThanOrEqualTo((double) 1, (double) 2)).isTrue();
        assertThat(comparable.isLessThanOrEqualTo((double) 2, (double) 1)).isFalse();
        assertThat(comparable.isLessThanOrEqualTo((double) 1, (double) 1)).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo((double) 2, (double) 1)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo((double) 1, (double) 2)).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo((double) 1, (double) 1)).isTrue();

        assertThat(comparable.is((double) 1, (double) 1)).isTrue();
        assertThat(comparable.is((double) 1, (double) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Double> comparable = new DoubleComparableImpl();

        assertThat(comparable.isGraterThan(Double.valueOf("2"), Double.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThan(Double.valueOf("1"), Double.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThan(Double.valueOf("1"), Double.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThan(Double.valueOf("1"), Double.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThan(Double.valueOf("2"), Double.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThan(Double.valueOf("1"), Double.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThanOrEqualTo(Double.valueOf("1"), Double.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThanOrEqualTo(Double.valueOf("2"), Double.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThanOrEqualTo(Double.valueOf("1"), Double.valueOf("1"))).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo(Double.valueOf("2"), Double.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(Double.valueOf("1"), Double.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo(Double.valueOf("1"), Double.valueOf("1"))).isTrue();

        assertThat(comparable.is(Double.valueOf("1"), Double.valueOf("1"))).isTrue();
        assertThat(comparable.is(Double.valueOf("1"), Double.valueOf("2"))).isFalse();

    }

}