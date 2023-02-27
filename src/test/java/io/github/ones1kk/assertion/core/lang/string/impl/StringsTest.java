package io.github.ones1kk.assertion.core.lang.string.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringsTest {

    @Mock
    AsAssert<?> asAssert;

    Strings strings;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        strings = new Strings(asAssert);
    }

    @Nested
    @DisplayName("Method test")
    class MethodTest {
        @Test
        @DisplayName("Method test")
        public void test1() throws Exception {
            String actual1 = "actual";
            String actual2 = " ";

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

    @Nested
    @DisplayName("matches() test")
    class MatchesTest {

        @Test
        @DisplayName("matches() String argument success test")
        void matches_string_success() throws Exception {
            String actual = "ones1k95@gmail.com";
            String expected = "^.+?@.{2,}?\\..{2,}$";

            assertThatNoException().isThrownBy(() -> strings.assertMatches(actual, expected));
        }

        @Test
        @DisplayName("matches() String argument success test")
        void matches_string_fail() throws Exception {
            String actual = "ones1k95";
            String expected = "^.+?@.{2,}?\\..{2,}$";

            assertThatThrownBy(() -> strings.assertMatches(actual, expected)).isInstanceOf(Exception.class);
        }

        @Test
        @DisplayName("matches() pattern argument success test")
        void matches_pattern_success() throws Exception {
            String actual = "ones1k95@gmail.com";
            Pattern expected = Pattern.compile("^.+?@.{2,}?\\..{2,}$");

            assertThatNoException().isThrownBy(() -> strings.assertMatches(actual, expected));
        }

        @Test
        @DisplayName("matches() pattern argument success test")
        void matches_pattern_fail() throws Exception {
            String actual = "ones1k95";
            Pattern expected = Pattern.compile("^.+?@.{2,}?\\..{2,}$");

            assertThatThrownBy(() -> strings.assertMatches(actual, expected)).isInstanceOf(Exception.class);
        }

    }

    @Nested
    @DisplayName("assertHasText() test")
    class HasTextTest {
        @Test
        @DisplayName("assertHasText() success test")
        void assertHasText_success() throws Exception {
            String actual = "actual";

            assertThatNoException().isThrownBy(() -> strings.assertHasText(actual));
        }

        @ParameterizedTest
        @ValueSource(strings = {"", " "})
        @DisplayName("assertHasText() fail test")
        void assertHasText_fail(String actual) throws Exception {
            assertThatThrownBy(() -> strings.assertHasText(actual)).isInstanceOf(Exception.class);
        }
    }

    @Nested
    @DisplayName("hasLength() test")
    class HasLengthTest {

        @ParameterizedTest
        @ValueSource(strings = {"actual", "expected", "assertions"})
        @DisplayName("assertHasLength() success test")
        void assertHasLength_success(String value) throws Exception {
            assertThatNoException().isThrownBy(() -> strings.assertHasLength(value, value.length()));
        }

        @ParameterizedTest
        @ValueSource(strings = {"actual", "expected", "assertions"})
        @DisplayName("assertHasLength() fail test")
        void assertHasLength_fail(String value) throws Exception {
            assertThatThrownBy(() -> strings.assertHasLength(value, 1)).isInstanceOf(Exception.class);
        }

    }

}