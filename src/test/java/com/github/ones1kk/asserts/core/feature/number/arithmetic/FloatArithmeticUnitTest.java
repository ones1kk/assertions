package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FloatArithmeticUnitTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        FloatArithmeticUnit.ArithmeticUtil util = FloatArithmeticUnit.of(10.4F);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isFalse();
        assertThat(util.isOdd()).isTrue();
    }

    @Test
    @DisplayName("Method test(Integer Type)")
    public void test2() throws Exception {
        // given
        FloatArithmeticUnit.ArithmeticUtil util = FloatArithmeticUnit.of(10F);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isTrue();
        assertThat(util.isOdd()).isFalse();
    }

    @Test
    @DisplayName("Method test(Negative number)")
    public void test3() throws Exception {
        // given
        FloatArithmeticUnit.ArithmeticUtil util = FloatArithmeticUnit.of(-10.4F);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isFalse();
        assertThat(util.isOdd()).isTrue();
    }

}