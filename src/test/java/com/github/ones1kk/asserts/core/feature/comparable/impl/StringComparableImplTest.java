package com.github.ones1kk.asserts.core.feature.comparable.impl;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringComparableImplTest {

    @Test
    @DisplayName("Primitive type test")
    public void test1() throws Exception {
        ComparableCalculatorInterface<String> comparable = new StringComparableImpl();

        assertThat(comparable.isGraterThan("2", "1")).isTrue();
        assertThat(comparable.isGraterThan("1", "2")).isFalse();
        assertThat(comparable.isGraterThan("1", "1")).isFalse();

        assertThat(comparable.isLessThan("1", "2")).isTrue();
        assertThat(comparable.isLessThan("2", "1")).isFalse();
        assertThat(comparable.isLessThan("1", "1")).isFalse();

        assertThat(comparable.isLessThanOrEqualTo("1", "2")).isTrue();
        assertThat(comparable.isLessThanOrEqualTo("2", "1")).isFalse();
        assertThat(comparable.isLessThanOrEqualTo("1", "1")).isTrue();

        assertThat(comparable.isGraterThanOrEqualTo("2", "1")).isTrue();
        assertThat(comparable.isGraterThanOrEqualTo("1", "2")).isFalse();
        assertThat(comparable.isGraterThanOrEqualTo("1", "1")).isTrue();

        assertThat(comparable.is("1", "1")).isTrue();
        assertThat(comparable.is("1", "2")).isFalse();

    }

}