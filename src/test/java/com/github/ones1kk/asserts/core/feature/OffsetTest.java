package com.github.ones1kk.asserts.core.feature;

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
        assertThat(offset.getValue()).isEqualTo(3)
                .isNotNull()
                .isInstanceOf(Integer.class);

        assertThat(offset)
                .isInstanceOf(Offset.class)
                .isNotNull();
    }

    @Test
    @DisplayName("Offset method test")
    public void test2() throws Exception {
        // given
        int value = 2;

        // when
        Offset<Integer> offset = Offset.offset(value);

        // then
        assertThat(offset.getValue()).isEqualTo(2);
        assertThat((int) offset.getBefore(1)).isEqualTo(-1);
        assertThat((int) offset.getAfter(1)).isEqualTo(3);
    }

}