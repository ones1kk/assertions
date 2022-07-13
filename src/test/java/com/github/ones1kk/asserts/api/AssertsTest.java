package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.wrapper.impl.CharSequenceAssertWrapper;
import com.github.ones1kk.asserts.api.wrapper.impl.ObjectAssertWrapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class AssertsTest {

    @Test
    @DisplayName("See return type")
    void test1() throws Exception {
        assertThat(Asserts.that(new Object())).isInstanceOf(ObjectAssertWrapper.class);
        assertThat(Asserts.that("")).isInstanceOf(CharSequenceAssertWrapper.class);
    }

}