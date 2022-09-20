package io.github.ones1kk.asserts.core.feature;

import io.github.ones1kk.asserts.core.exception.AssertException;
import io.github.ones1kk.asserts.core.feature.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("Offset method test(failed)")
    public void test3() throws Exception {
        // given
        int value1 = -123;
        Integer value2 = null;

        // when
        // then
        assertThrows(AssertException.class, () -> Offset.offset(value1));
        assertThrows(AssertException.class, () -> Offset.offset(value2));
    }
}