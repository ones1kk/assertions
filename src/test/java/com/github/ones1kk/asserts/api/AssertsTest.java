package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.lang.string.AbstractStringAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssertsTest {

    @Test
    @DisplayName("Return type")
    public void test1() throws Exception {
        // given
        AbstractObjectAssert<?, Object> actual1 = Asserts.that(new Object());
        AbstractCharSequenceAssert<?, CharSequence> actual2 = Asserts.that((CharSequence) "actual2");
        AbstractStringAssert<?> actual3 = Asserts.that("actual3");

        //then
        assertThat(actual1).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual2).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual3).isInstanceOf(AbstractObjectAssert.class);
    }

}