package io.github.ones1kk.assertion.core.lang.object;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractObjectAssertTest {

    @Test
    @DisplayName("Object methods test")
    public void test1() throws Exception {
        // given
        Object actual = new Object();
        AbstractObjectAssert<?, Object> assert1 = new AbstractObjectAssert<>(AbstractObjectAssert.class, actual);
        AbstractObjectAssert<?, Object> assert2 = new AbstractObjectAssert<>(AbstractObjectAssert.class, null);

        //then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual));
        assertThrows(AssertException.class, () -> assert2.isInstanceOf(Object.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(Object.class);
            assert1.isAssignableFrom(String.class);
            assert1.isInstanceOf(Object.class);
        });
    }
}