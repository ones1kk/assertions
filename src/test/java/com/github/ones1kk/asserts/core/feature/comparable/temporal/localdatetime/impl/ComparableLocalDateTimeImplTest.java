package com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.impl;

import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.ComparableLocalDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class ComparableLocalDateTimeImplTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        ComparableLocalDateTime<LocalDateTime> comparable = new ComparableLocalDateTimeImpl<>();

        // when
        LocalDateTime actual1 = LocalDateTime.of(1995, 2, 1, 11, 11, 11);
        LocalDateTime actual2 = LocalDateTime.of(1996, 2, 1, 11, 11, 11);
        LocalDateTime actual3 = LocalDateTime.of(1994, 2, 1, 11, 11, 11);

        // then
        assertThat(comparable.isBefore(actual1, actual2)).isTrue();
        assertThat(comparable.isBeforeOrEqualTo(actual1, actual1)).isTrue();
        assertThat(comparable.isBeforeOrEqualTo(actual1, actual2)).isTrue();

        assertThat(comparable.isAfter(actual1, actual3)).isTrue();
        assertThat(comparable.isAfterOrEqualTo(actual1, actual1)).isTrue();
        assertThat(comparable.isAfterOrEqualTo(actual1, actual3)).isTrue();

        assertThat(comparable.isBefore(actual2, actual1)).isFalse();
        assertThat(comparable.isBeforeOrEqualTo(actual1, actual3)).isFalse();

        assertThat(comparable.isAfter(actual1, actual2)).isFalse();
        assertThat(comparable.isAfterOrEqualTo(actual1, actual2)).isFalse();
    }

}