package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.lang.string.AbstractStringAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertsForTypeTest {

    @Test
    @DisplayName("Return type")
    public void test1() throws Exception {
        // given
        AbstractObjectAssert<?, Object> actual1 = AssertsForType.that(new Object());
        AbstractCharSequenceAssert<?, CharSequence> actual2 = AssertsForType.that((CharSequence) "actual2");
        AbstractStringAssert<?, String> actual3 = AssertsForType.that("actual3");

        //then
        Assertions.assertThat(actual1).isInstanceOf(AbstractObjectAssert.class);
        Assertions.assertThat(actual2).isInstanceOf(AbstractObjectAssert.class);
        Assertions.assertThat(actual3).isInstanceOf(AbstractObjectAssert.class);

    }

}