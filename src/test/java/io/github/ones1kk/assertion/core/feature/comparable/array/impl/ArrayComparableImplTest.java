package io.github.ones1kk.assertion.core.feature.comparable.array.impl;

import io.github.ones1kk.assertion.core.feature.comparable.array.ArrayComparable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayComparableImplTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        ArrayComparable<String> comparable = new ArrayComparableImpl<>();

        // when
        String[] actual = new String[]{"1", "2", "3"};
        String[] expected1 = new String[]{"1", "2", "3"};
        String[] expected2 = new String[]{"1", "2"};
        String[] expected3 = new String[]{"1"};

        // then
        assertThat(comparable.isLongerThan(actual, expected1)).isFalse();
        assertThat(comparable.isLongerThan(actual, expected2)).isTrue();
        assertThat(comparable.isLongerThan(actual, expected3)).isTrue();

        assertThat(comparable.isShorterThan(actual, expected1)).isFalse();
        assertThat(comparable.isShorterThan(actual, expected2)).isFalse();
        assertThat(comparable.isShorterThan(actual, expected3)).isFalse();

        assertThat(comparable.isShorterThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(comparable.isShorterThanOrEqualTo(actual, expected2)).isFalse();
        assertThat(comparable.isShorterThanOrEqualTo(actual, expected3)).isFalse();

        assertThat(comparable.isLongerThanOrEqualTo(actual, expected1)).isTrue();
        assertThat(comparable.isLongerThanOrEqualTo(actual, expected2)).isTrue();
        assertThat(comparable.isLongerThanOrEqualTo(actual, expected3)).isTrue();

        assertThat(comparable.is(actual, expected1)).isTrue();
        assertThat(comparable.is(actual, expected2)).isFalse();
        assertThat(comparable.is(actual, expected3)).isFalse();
    }
}