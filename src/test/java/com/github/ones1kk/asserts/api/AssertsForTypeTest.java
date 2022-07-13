package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.wrapper.impl.CharSequenceAssertWrapper;
import com.github.ones1kk.asserts.api.wrapper.impl.ObjectAssertWrapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssertsForTypeTest {

    @Test
    void test1() {
        assertThat(AssertsForType.that(new Object())).isInstanceOf(ObjectAssertWrapper.class);
        assertThat(AssertsForType.that("")).isInstanceOf(CharSequenceAssertWrapper.class);
    }

}