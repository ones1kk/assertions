package com.github.ones1kk.asserts.core.lang.object;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        assert2.isNull();
        assertThrows(AssertException.class, assert1::isNull);

        assert1.isNotNull();
        assertThrows(AssertException.class, assert2::isNotNull);

        assert1.isSameAs(actual);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));

        assert1.isNotSameAs(assert1);
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual));

        assert1.isEqualTo(actual);
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));

        assert1.isNotEqualTo(assert1);
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual));

        assert1.isAssignableFrom(Object.class);
        assert1.isAssignableFrom(String.class);

        assert1.isInstanceOf(Object.class);
        assertThrows(AssertException.class, () -> assert2.isInstanceOf(Object.class));

        // Caution : Object can't test about notAssignableFrom method

    }

}