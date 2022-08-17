package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongComparableImplTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Long> comparable = new LongComparableImpl();

        assertThat(comparable.isGraterThan((long) 2, (long) 1)).isTrue();
        assertThat(comparable.isGraterThan((long) 1, (long) 2)).isFalse();
        assertThat(comparable.isGraterThan((long) 1, (long) 1)).isFalse();

        assertThat(comparable.isLessThan((long) 1, (long) 2)).isTrue();
        assertThat(comparable.isLessThan((long) 2, (long) 1)).isFalse();
        assertThat(comparable.isLessThan((long) 1, (long) 1)).isFalse();

        assertThat(comparable.isLessThanOrEqualTo((long) 1, (long) 2)).isTrue();
        assertThat(comparable.isLessThanOrEqualTo((long) 2, (long) 1)).isFalse();
        assertThat(comparable.isLessThanOrEqualTo((long) 1, (long) 1)).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo((long) 2, (long) 1)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo((long) 1, (long) 2)).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo((long) 1, (long) 1)).isTrue();

        assertThat(comparable.is((long) 1, (long) 1)).isTrue();
        assertThat(comparable.is((long) 1, (long) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Long> comparable = new LongComparableImpl();

        assertThat(comparable.isGraterThan(Long.valueOf("2"), Long.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThan(Long.valueOf("1"), Long.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThan(Long.valueOf("1"), Long.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThan(Long.valueOf("1"), Long.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThan(Long.valueOf("2"), Long.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThan(Long.valueOf("1"), Long.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThanOrEqualTo(Long.valueOf("1"), Long.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThanOrEqualTo(Long.valueOf("2"), Long.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThanOrEqualTo(Long.valueOf("1"), Long.valueOf("1"))).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo(Long.valueOf("2"), Long.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(Long.valueOf("1"), Long.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo(Long.valueOf("1"), Long.valueOf("1"))).isTrue();

        assertThat(comparable.is(Long.valueOf("1"), Long.valueOf("1"))).isTrue();
        assertThat(comparable.is(Long.valueOf("1"), Long.valueOf("2"))).isFalse();

    }

}