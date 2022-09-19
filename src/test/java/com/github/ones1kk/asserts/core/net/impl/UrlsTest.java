package com.github.ones1kk.asserts.core.net.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UrlsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method Test")
    public void test1() throws Exception {
        // given
        Urls urls = new Urls(asAssert);

        // when
        URL actual1 = new URL("https://www.google.com");

        // then
        assertThrows(Exception.class, () -> urls.assertHasPort(actual1, 8080));
        assertThrows(Exception.class, () -> urls.assertHasPath(actual1, "?page=11"));
        assertThrows(Exception.class, () -> urls.assertDoesNotHaveHost(actual1));
        assertThrows(Exception.class, () -> urls.assertDoesNotHaveHost(actual1));


        assertThatNoException().isThrownBy(() -> {
            urls.assertHasHost(actual1, "www.google.com");
            urls.assertHasPort(actual1, 443);
            urls.assertDoesNotHavePath(actual1);
        });

    }
}