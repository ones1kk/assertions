package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.core.api.lang.object.AsObject;
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
        AsObject asserts = Asserts.that(actual);

        //then
        assertThat(asserts).isInstanceOf(AbstractObjectAssert.class);
        assertThat(asserts).isInstanceOf(AsObject.class);

    }

    @Test
    @DisplayName("Version of added as() method")
    public void test2() throws Exception {
        // given
        Object actual = new Object();

        // when
        Asserts.that(actual).as("").isNull();

        //then
    }

}