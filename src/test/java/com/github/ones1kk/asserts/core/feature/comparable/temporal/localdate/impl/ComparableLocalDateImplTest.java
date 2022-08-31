package com.github.ones1kk.asserts.core.feature.comparable.temporal.localdate.impl;

import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdate.ComparableLocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComparableLocalDateImplTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        ComparableLocalDate<LocalDate> comparable = new ComparableLocalDateImpl<>();

        // when
        LocalDate actual1 = LocalDate.of(1995, 2, 1);
        LocalDate actual2 = LocalDate.of(1996, 2, 1);
        LocalDate actual3 = LocalDate.of(1994, 2, 1);

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