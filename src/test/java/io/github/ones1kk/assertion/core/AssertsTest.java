package io.github.ones1kk.assertion.core;

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.ObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AssertsTest {


    @Nested
    @DisplayName("create Asserts")
    class Test01 {

        @Test
        @DisplayName("assert actual of object type")
        void testCreateObjectAsserts() {
            // given
            Object actual = new Object();

            // when
            ObjectAssert result = Asserts.that(actual);

            // then
            assertThat(result).isNotNull()
                    .isInstanceOf(AbstractObjectAssert.class);
        }

    }


}