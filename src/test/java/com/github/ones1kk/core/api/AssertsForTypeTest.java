package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.AbstractObjectAssert;
import com.github.ones1kk.core.api.lang.model.ObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssertsForTypeTest {

    @Test
    @DisplayName("When using AssertsForType by Object type, return it's instance well?")
    public void test1() throws Exception {
        // given
        Object actual = new Object();

        // when
        AbstractObjectAssert<?, Object> that = AssertsForType.that(actual);

        //then
        assertThat(that).isInstanceOf(ObjectAssert.class);
        assertThat(that).isInstanceOf(AbstractObjectAssert.class);
    }

}