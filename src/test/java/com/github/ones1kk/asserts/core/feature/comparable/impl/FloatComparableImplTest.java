package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FloatComparableImplTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<Float> comparable = new FloatComparableImpl();

        assertThat(comparable.isGraterThan((float) 2, (float) 1)).isTrue();
        assertThat(comparable.isGraterThan((float) 1, (float) 2)).isFalse();
        assertThat(comparable.isGraterThan((float) 1, (float) 1)).isFalse();

        assertThat(comparable.isLessThan((float) 1, (float) 2)).isTrue();
        assertThat(comparable.isLessThan((float) 2, (float) 1)).isFalse();
        assertThat(comparable.isLessThan((float) 1, (float) 1)).isFalse();

        assertThat(comparable.isLessThanOrEqualTo((float) 1, (float) 2)).isTrue();
        assertThat(comparable.isLessThanOrEqualTo((float) 2, (float) 1)).isFalse();
        assertThat(comparable.isLessThanOrEqualTo((float) 1, (float) 1)).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo((float) 2, (float) 1)).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo((float) 1, (float) 2)).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo((float) 1, (float) 1)).isTrue();

        assertThat(comparable.is((float) 1, (float) 1)).isTrue();
        assertThat(comparable.is((float) 1, (float) 2)).isFalse();

    }

    @Test
    @DisplayName("Wrapper type test")
    public void test2() throws Exception {
        ComparableCalculatorInterface<Float> comparable = new FloatComparableImpl();

        assertThat(comparable.isGraterThan(Float.valueOf("2"), Float.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThan(Float.valueOf("1"), Float.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThan(Float.valueOf("1"), Float.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThan(Float.valueOf("1"), Float.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThan(Float.valueOf("2"), Float.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThan(Float.valueOf("1"), Float.valueOf("1"))).isFalse();

        assertThat(comparable.isLessThanOrEqualTo(Float.valueOf("1"), Float.valueOf("2"))).isTrue();
        assertThat(comparable.isLessThanOrEqualTo(Float.valueOf("2"), Float.valueOf("1"))).isFalse();
        assertThat(comparable.isLessThanOrEqualTo(Float.valueOf("1"), Float.valueOf("1"))).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo(Float.valueOf("2"), Float.valueOf("1"))).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo(Float.valueOf("1"), Float.valueOf("2"))).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo(Float.valueOf("1"), Float.valueOf("1"))).isTrue();

        assertThat(comparable.is(Float.valueOf("1"), Float.valueOf("1"))).isTrue();
        assertThat(comparable.is(Float.valueOf("1"), Float.valueOf("2"))).isFalse();

    }

}