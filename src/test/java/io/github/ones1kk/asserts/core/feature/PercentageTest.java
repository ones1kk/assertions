package io.github.ones1kk.asserts.core.feature;

import io.github.ones1kk.asserts.core.exception.AssertException;
import io.github.ones1kk.asserts.core.feature.data.Percentage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PercentageTest {

    @Test
    @DisplayName("Constructor Test")
    public void test1() throws Exception {
        Double actual1 = null;
        Double actual2 = -15.5;
        Double actual3 = 15.5;

        assertThrows(AssertException.class, () -> Percentage.of(actual1));
        assertThrows(AssertException.class, () -> Percentage.of(actual2));

        Percentage.of(actual3);
    }

    @Test
    @DisplayName("Method test")
    public void test2() throws Exception {
        // given
        Integer actual = 80;

        // when
        Percentage<Number> percentage = Percentage.of(10.0);

        // then
        assertThat(percentage.isStartingRange(actual, 72)).isTrue();
        assertThat(percentage.isEndingRange(actual, 88)).isTrue();
        assertThat(percentage.isEndingRange(actual, 55)).isFalse();
        assertThat(percentage.isEndingRange(actual, 123)).isFalse();

        assertThat(percentage.isRange(actual, 123)).isFalse();
        assertThat(percentage.isRange(actual, 55)).isFalse();
        assertThat(percentage.isRange(actual, 72)).isTrue();
        assertThat(percentage.isRange(actual, 88)).isTrue();
    }
}