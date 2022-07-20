package com.github.ones1kk.asserts.api.feature;

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
        Offset<Integer> offset = Offset.offset(3);

        // then
        assertThat(offset.getValue()).isEqualTo(3)
                .isNotNull()
                .isInstanceOf(Integer.class);

        assertThat(offset)
                .isInstanceOf(Offset.class)
                .isNotNull();
    }

}