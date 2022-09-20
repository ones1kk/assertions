package io.github.ones1kk.asserts.core.feature.comparable.impl;

import io.github.ones1kk.asserts.core.feature.comparable.temporal.accessor.ComparableTemporalAccessor;
import io.github.ones1kk.asserts.core.feature.comparable.temporal.accessor.impl.ComparableTemporalAccessorImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.assertj.core.api.Assertions.assertThat;

class ComparableTemporalAccessorImplTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        ComparableTemporalAccessor<Year> comparable = new ComparableTemporalAccessorImpl<>();

        // when
        Year actual1 = Year.of(1995);
        Year actual2 = Year.of(1996);
        Year actual3 = Year.of(1994);

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