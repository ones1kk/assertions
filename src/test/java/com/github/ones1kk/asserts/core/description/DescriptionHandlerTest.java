package com.github.ones1kk.asserts.core.description;

import org.junit.jupiter.api.Test;

import static com.github.ones1kk.asserts.core.message.ComparableErrorMessages.shouldBeGreaterThan;
import static com.github.ones1kk.asserts.core.message.IterableErrorMessages.shouldNotBeNullOrEmpty;
import static com.github.ones1kk.asserts.core.message.LengthComparableErrorMessages.shouldBeBetween;

class DescriptionHandlerTest {

    private final DescriptionHandler handler = new DescriptionHandler();

    @Test
    void test1() throws Exception {
        String actual = "1";
        String expected = "2";

        String result1 = handler.from(actual, shouldBeGreaterThan(actual, expected));
        String result2 = handler.from(actual, shouldNotBeNullOrEmpty(actual));
        String result3 = handler.from(actual, expected, shouldBeGreaterThan(actual, expected));
        String result4 = handler.from(shouldBeBetween(actual, 3, 4));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}