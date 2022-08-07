package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FloatUnitArithmeticTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        FloatUnitArithmetic.ArithmeticUtil util = FloatUnitArithmetic.of(10.4F);

        // when
        // thenD
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isFalse();
        assertThat(util.isOdd()).isTrue();
    }

    @Test
    @DisplayName("Method test(Integer Type)")
    public void test() throws Exception {
        // given
        FloatUnitArithmetic.ArithmeticUtil util = FloatUnitArithmetic.of(10F);

        // when
        // thenD
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isTrue();
        assertThat(util.isOdd()).isFalse();
    }

    @Test
    @DisplayName("Method test(Negative number)")
    public void test3() throws Exception {
        // given
        FloatUnitArithmetic.ArithmeticUtil util = FloatUnitArithmetic.of(-10.4F);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isFalse();
        assertThat(util.isOdd()).isTrue();
    }

}