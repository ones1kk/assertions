package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.core.api.lang.model.ObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AbstractAssertTest {

    @Test
    @DisplayName("AbstractObjectAssert Constructor is working well?")
    public void test1() throws Exception {
        // given
        Object actual = new Object();

        // when
        AbstractObjectAssert<?, Object> abstractObjectAssert = new ObjectAssert(ObjectAssert.class, actual);

        //then
        assertThat(abstractObjectAssert.actual).isEqualTo(actual);
        assertThat(abstractObjectAssert.self).isInstanceOf(ObjectAssert.class);

    }

}