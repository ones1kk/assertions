package com.github.ones1kk.asserts.core.feature;

import com.github.ones1kk.asserts.core.feature.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OffsetTest {

    @Test
    @DisplayName("Create test")
    public void test1() throws Exception {
        // given
        int value = 3;

        // when
        Offset<Integer> offset = Offset.offset(value);

        // then
        assertThat(offset)
                .isNotNull()
                .isInstanceOf(Offset.class);
    }

    @Test
    @DisplayName("Offset method test")
    public void test2() throws Exception {
        // given
        int actual = 5;
        int expected1 = 4;
        int expected2 = 2;
        int value = 1;

        // when
        Offset<Integer> offset = Offset.offset(value);

        // then
        assertThat((int) offset.getBefore(actual)).isEqualTo(4);
        assertThat((int) offset.getAfter(actual)).isEqualTo(6);
        assertThat(offset.isOffset(actual, expected1)).isTrue();
        assertThat(offset.isOffset(actual, expected2)).isFalse();
    }
}