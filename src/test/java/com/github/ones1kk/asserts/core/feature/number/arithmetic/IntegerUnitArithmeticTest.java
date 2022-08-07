package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerUnitArithmeticTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        IntegerUnitArithmetic.ArithmeticUtil util = IntegerUnitArithmetic.of(10);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isTrue();
        assertThat(util.isOdd()).isFalse();
    }

    @Test
    @DisplayName("Method test(Negative number)")
    public void test2() throws Exception {
        // given
        IntegerUnitArithmetic.ArithmeticUtil util = IntegerUnitArithmetic.of(-10);

        // when
        // then
        assertThat(util.isZero()).isFalse();
        assertThat(util.isNotZero()).isTrue();
        assertThat(util.isEven()).isTrue();
        assertThat(util.isOdd()).isFalse();
    }

}