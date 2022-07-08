package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.AbstractObjectAssert;
import com.github.ones1kk.core.api.lang.model.ObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssertsTest {

    @Test
    @DisplayName("When actual try to assert, what is return type?")
    public void test1() throws Exception {
        // given
        Object actual = new Object();

        // when
        AbstractObjectAssert<?, Object> asserts = Asserts.that(actual);

        //then
        assertThat(asserts).isInstanceOf(ObjectAssert.class);
        assertThat(asserts).isInstanceOf(AbstractObjectAssert.class);

    }

}