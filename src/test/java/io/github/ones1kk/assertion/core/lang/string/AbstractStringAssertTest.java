package io.github.ones1kk.assertion.core.lang.string;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractStringAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        String actual1 = "actual";
        String actual2 = null;

        // when
        AbstractStringAssert<?> assert1 = new AbstractStringAssert<>(AbstractStringAssert.class, actual1);
        AbstractStringAssert<?> assert2 = new AbstractStringAssert<>(AbstractStringAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractStringAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(String.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(String.class);
            assert1.isNotAssignableFrom(AbstractStringAssert.class);
        });
    }

    @Test
    @DisplayName("String method test")
    public void test2() throws Exception {
        // given
        String actual1 = "actual";
        String actual2 = "";
        String actual3 = " ";

        // when
        AbstractStringAssert<?> assert1 = new AbstractStringAssert<>(AbstractStringAssert.class, actual1);
        AbstractStringAssert<?> assert2 = new AbstractStringAssert<>(AbstractStringAssert.class, actual2);
        AbstractStringAssert<?> assert3 = new AbstractStringAssert<>(AbstractStringAssert.class, actual3);

        // then
        assertThrows(AssertException.class, assert1::isEmpty);
        assertThrows(AssertException.class, assert2::isNotEmpty);
        assertThrows(AssertException.class, assert1::isBlank);
        assertThrows(AssertException.class, assert3::isNotBlank);
        assertThrows(AssertException.class, () -> assert3.isEqualToIgnoreCase(actual1));

        assert2.isEmpty();
        assert1.isNotEmpty();
        assert3.isBlank();
        assert1.isNotBlank();
        assert1.isEqualToIgnoreCase("ACTUAL");
    }
}