package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleUnitArithmeticTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        DoubleUnitArithmetic.ArithmeticUtil util = DoubleUnitArithmetic.of(10.4);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isFalse();
        assertThat(util.isOdd()).isTrue();
    }

    @Test
    @DisplayName("Method test(Negative number)")
    public void test2() throws Exception {
        // given
        DoubleUnitArithmetic.ArithmeticUtil util = DoubleUnitArithmetic.of(-10.4);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isFalse();
        assertThat(util.isOdd()).isTrue();
    }
}