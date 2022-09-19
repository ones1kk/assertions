package com.github.ones1kk.asserts.core.lang.bolean;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractBooleanAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given

        Boolean actual1 = true;
        Boolean actual2 = null;
        Boolean actual3 = false;

        // when
        AbstractBooleanAssert<?, Boolean> assert1 = new AbstractBooleanAssert<>(AbstractBooleanAssert.class, actual1);
        AbstractBooleanAssert<?, Boolean> assert2 = new AbstractBooleanAssert<>(AbstractBooleanAssert.class, actual2);
        AbstractBooleanAssert<?, Boolean> assert3 = new AbstractBooleanAssert<>(AbstractBooleanAssert.class, actual3);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractBooleanAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(Boolean.class));
        assertThrows(AssertException.class, assert1::isFalse);
        assertThrows(AssertException.class, assert3::isTrue);

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(Boolean.class);
            assert1.isNotAssignableFrom(AbstractBooleanAssert.class);
            assert1.isTrue();
            assert3.isFalse();
        });
    }

}