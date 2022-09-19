package com.github.ones1kk.asserts.core.net;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractUrlAssertTest {

    private static final String GOOGLE = "https://www.google.com";

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        URL actual1 = new URL(GOOGLE);

        // when
        AbstractUrlAssert<?> assert1 = new AbstractUrlAssert<>(AbstractUrlAssert.class, actual1);
        AbstractUrlAssert<?> assert2 = new AbstractUrlAssert<>(AbstractUrlAssert.class, null);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractUrlAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(URL.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(URL.class);
            assert1.isNotAssignableFrom(AbstractUrlAssert.class);
        });
    }

    @Test
    @DisplayName("Method test")
    public void test2() throws Exception {
        // given
        URL actual1 = new URL(GOOGLE);

        // when
        AbstractUrlAssert<?> assert1 = new AbstractUrlAssert<>(AbstractUrlAssert.class, actual1);

        // then
        assertThrows(AssertException.class, () -> assert1.hasPort(8080));
        assertThrows(AssertException.class, () -> assert1.hasPath("?page=11"));
        assertThrows(AssertException.class, assert1::doesNotHaveHost);

        assertThat(actual1.getPort()).isEqualTo(-1);
        assertThat(actual1.getPath()).isEmpty();

        assertThatNoException().isThrownBy(() -> {
            assert1.hasHost("www.google.com");
            assert1.hasPort(443);
            assert1.doesNotHavePath();
        });
    }
}