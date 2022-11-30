package io.github.ones1kk.assertion.core.lang.string.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
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


        assertThatNoException().isThrownBy(() -> {
            strings.assertIsBlank(actual2);
            strings.assertIsNotBlank(actual1);
            strings.assertIsEmpty("");
            strings.assertIsNotEmpty(actual1);
            strings.assertIsEqualToIgnoreCase(actual1, "ACTUAL");
            strings.assertIsEqualToIgnoreCase(actual1, "actual");
        });
    }
}