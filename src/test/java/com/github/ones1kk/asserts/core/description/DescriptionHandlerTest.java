package com.github.ones1kk.asserts.core.description;

import org.junit.jupiter.api.Test;

import static com.github.ones1kk.asserts.core.message.ComparableErrorMessages.shouldBeGreaterThan;
import static com.github.ones1kk.asserts.core.message.IterableErrorMessages.shouldNotBeNullOrEmpty;
import static com.github.ones1kk.asserts.core.message.LengthComparableErrorMessages.shouldBeBetween;
import static org.assertj.core.api.Assertions.assertThatNoException;

class DescriptionHandlerTest {

    private final DescriptionHandler handler = new DescriptionHandler();

    @Test
    void test1() throws Exception {
        String actual = "1";
        String expected = "2";

        assertThatNoException().isThrownBy(() -> {
            handler.receive(actual, expected, shouldBeGreaterThan(actual, expected));
            handler.receive(actual, shouldNotBeNullOrEmpty(actual));
            handler.receive(actual, expected, shouldBeGreaterThan(actual, expected));
            handler.receive(shouldBeBetween(actual, 3, 4));
        });
    }
}