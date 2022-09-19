package com.github.ones1kk.asserts.core.lang.bolean.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BooleansTest {

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
        Booleans booleans = new Booleans(asAssert);

        // when
        // then
        assertThrows(Exception.class, () -> booleans.assertIsTrue(false));
        assertThrows(Exception.class, () -> booleans.assertIsFalse(true));

        assertThatNoException().isThrownBy(() -> {
            booleans.assertIsFalse(false);
            booleans.assertIsTrue(true);
        });
    }
}