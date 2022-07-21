package com.github.ones1kk.asserts.api.lang.string.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StringsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Test methods")
    public void test1() throws Exception {
        // given
        Strings strings = new Strings(asAssert);

        // when
        String actual1 = "actual";
        String actual2 = " ";

        // then
        assertThrows(Exception.class, () -> strings.assertIsBlank(actual1));
        assertThrows(Exception.class, () -> strings.assertIsNotBlank(actual2));
        assertThrows(Exception.class, () -> strings.assertIsEmpty(actual1));
        assertThrows(Exception.class, () -> strings.assertIsNotEmpty(""));
        assertThrows(Exception.class, () -> strings.assertIsEqualToIgnoreCase(actual1, "Expected"));

        // actual > expected
        assertThrows(Exception.class, () -> strings.assertIsLessThan("5", "3"));
        // actual == expected
        assertThrows(Exception.class, () -> strings.assertIsLessThan("5", "5"));
        // actual > expected
        assertThrows(Exception.class, () -> strings.assertIsLessThan("C", "B"));

        // actual > expected
        assertThrows(Exception.class, () -> strings.assertIsLessThanOrEqualTo("C", "B"));

        // actual < expected
        assertThrows(Exception.class, () -> strings.assertIsGreaterThan("3", "5"));
        // actual == expected
        assertThrows(Exception.class, () -> strings.assertIsGreaterThan("5", "5"));
        // actual < expected
        assertThrows(Exception.class, () -> strings.assertIsGreaterThan("B", "C"));

        // actual < expected
        assertThrows(Exception.class, () -> strings.assertIsGreaterThanOrEqualTo("B", "C"));

        // actual < start
        assertThrows(Exception.class,
                () -> strings.assertIsBetween("A", "B", "C"));
        // actual > end
        assertThrows(Exception.class,
                () -> strings.assertIsBetween("C", "A", "B"));


        strings.assertIsBlank(actual2);
        strings.assertIsNotBlank(actual1);
        strings.assertIsEmpty("");
        strings.assertIsNotEmpty(actual1);
        strings.assertIsEqualToIgnoreCase(actual1, "ACTUAL");
        strings.assertIsEqualToIgnoreCase(actual1, "actual");

        strings.assertIsLessThan("4", "7");
        strings.assertIsLessThanOrEqualTo("4", "7");
        strings.assertIsLessThanOrEqualTo("4", "4");

        strings.assertIsGreaterThan("7", "4");
        strings.assertIsGreaterThanOrEqualTo("7", "4");
        strings.assertIsGreaterThanOrEqualTo("4", "4");

        // start < actual < end
        strings.assertIsBetween("B", "A", "C");

    }

}