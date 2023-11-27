package io.github.ones1kk.assertion.core.feature;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OffsetTest {

    @Test
    @DisplayName("test create")
    public void testCreate() throws Exception {
        // given
        int value = 3;

        // when
        Offset<Integer> offset = Offset.offset(value);

        // then
        assertThat(offset)
                .isNotNull()
                .isInstanceOf(Offset.class);
    }

    @Nested
    @DisplayName("test offSet()")
    class TestOffSet {
        @Test
        @DisplayName("test offSet() success case")
        public void testSuccess() throws Exception {
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
        @DisplayName("test offSet() fail case")
        public void testFail() throws Exception {
            // given
            int value1 = -123;
            Integer value2 = null;

            // then
            assertThatThrownBy(() -> Offset.offset(value1));
            assertThatThrownBy(() -> Offset.offset(value2));
        }
    }

}