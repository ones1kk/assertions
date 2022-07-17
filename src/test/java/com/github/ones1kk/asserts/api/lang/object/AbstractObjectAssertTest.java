package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractObjectAssertTest {

    @Test
    @DisplayName("Object methods test")
    public void test1() throws Exception {
        // given
        Object actual = new Object();
        AbstractObjectAssert<?, Object> asset1 = new AbstractObjectAssert<>(Object.class, actual);
        AbstractObjectAssert<?, Object> assert2 = new AbstractObjectAssert<>(Object.class, null);

        //then
        assert2.isNull();
        assertThrows(AssertException.class, asset1::isNull);

        asset1.isNotNull();
        assertThrows(AssertException.class, assert2::isNotNull);

        asset1.isSameAs(actual);
        assertThrows(AssertException.class, () -> asset1.isSameAs(asset1));

        asset1.isNotSameAs(asset1);
        assertThrows(AssertException.class, () -> asset1.isNotSameAs(actual));

        asset1.isEqualTo(actual);
        assertThrows(AssertException.class, () -> asset1.isEqualTo(asset1));

        asset1.isNotEqualTo(asset1);
        assertThrows(AssertException.class, () -> asset1.isNotEqualTo(actual));

        // Caution : Object can't test about assignableFrom method

    }

}