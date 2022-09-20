package io.github.ones1kk.asserts.core.feature.number.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumerableUnitTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        NumerableUnit integerUnit = NumerableUnit.of(1);

        assertThat(integerUnit.isZero()).isFalse();
        assertThat(integerUnit.isNotZero()).isTrue();
        assertThat(integerUnit.isEven()).isFalse();
        assertThat(integerUnit.isOdd()).isTrue();

        NumerableUnit doubleUnit = NumerableUnit.of(1.15);
        assertThat(doubleUnit.isZero()).isFalse();
        assertThat(doubleUnit.isNotZero()).isTrue();
        assertThat(doubleUnit.isEven()).isFalse();
        assertThat(doubleUnit.isOdd()).isTrue();
    }

    @Test
    @DisplayName("Method test(Negative number)")
    public void test2() throws Exception {
        NumerableUnit integerUnit = NumerableUnit.of(-1);

        assertThat(integerUnit.isZero()).isFalse();
        assertThat(integerUnit.isNotZero()).isTrue();
        assertThat(integerUnit.isEven()).isFalse();
        assertThat(integerUnit.isOdd()).isTrue();

        NumerableUnit doubleUnit = NumerableUnit.of(-1.15);
        assertThat(doubleUnit.isZero()).isFalse();
        assertThat(doubleUnit.isNotZero()).isTrue();
        assertThat(doubleUnit.isEven()).isFalse();
        assertThat(doubleUnit.isOdd()).isTrue();

        NumerableUnit doubleUnit2 = NumerableUnit.of(-2.00);
        assertThat(doubleUnit2.isZero()).isFalse();
        assertThat(doubleUnit2.isNotZero()).isTrue();
        assertThat(doubleUnit2.isEven()).isTrue();
        assertThat(doubleUnit2.isOdd()).isFalse();
    }
}