package io.github.ones1kk.assertion.core.lang.string;

import io.github.ones1kk.assertion.core.exception.AssertException;
import io.github.ones1kk.assertion.core.lang.number.integer.AbstractIntegerAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractStringAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        String actual1 = "actual";
        String actual2 = null;

        // when
        AbstractStringAssert<?> assert1 = new AbstractStringAssert<>(AbstractStringAssert.class, actual1);
        AbstractStringAssert<?> assert2 = new AbstractStringAssert<>(AbstractStringAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractStringAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(String.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(String.class);
            assert1.isNotAssignableFrom(AbstractStringAssert.class);
        });
    }

    @Test
    @DisplayName("String method test")
    public void test2() throws Exception {
        // given
        String actual1 = "actual";
        String actual2 = "";
        String actual3 = " ";

        // when
        AbstractStringAssert<?> assert1 = new AbstractStringAssert<>(AbstractStringAssert.class, actual1);
        AbstractStringAssert<?> assert2 = new AbstractStringAssert<>(AbstractStringAssert.class, actual2);
        AbstractStringAssert<?> assert3 = new AbstractStringAssert<>(AbstractStringAssert.class, actual3);

        // then
        assertThrows(AssertException.class, assert1::isEmpty);
        assertThrows(AssertException.class, assert2::isNotEmpty);
        assertThrows(AssertException.class, assert1::isBlank);
        assertThrows(AssertException.class, assert3::isNotBlank);
        assertThrows(AssertException.class, () -> assert3.isEqualToIgnoreCase(actual1));

        assertThatNoException().isThrownBy(() -> {
            assert2.isEmpty();
            assert1.isNotEmpty();
            assert3.isBlank();
            assert1.isNotBlank();
            assert1.isEqualToIgnoreCase("ACTUAL");
        });
    }

    @Nested
    @DisplayName("matches() test")
    class MatchesTest {

        @Test
        @DisplayName("matches() String argument success test")
        void matches_string_success() throws Exception {
            // given
            String actual = "ones1k95@gmail.com";
            String expected = "^.+?@.{2,}?\\..{2,}$";

            // when
            AbstractStringAssert<?> stringAssert = new AbstractStringAssert<>(AbstractStringAssert.class, actual);

            // then
            assertThatNoException().isThrownBy(() -> stringAssert.matches(expected));
        }

        @Test
        @DisplayName("matches() String argument success test")
        void matches_string_fail() throws Exception {
            // given
            String actual = "ones1k95";
            String expected = "^.+?@.{2,}?\\..{2,}$";

            // when
            AbstractStringAssert<?> stringAssert = new AbstractStringAssert<>(AbstractStringAssert.class, actual);

            // then
            assertThatThrownBy(() -> stringAssert.matches(expected));
        }

        @Test
        @DisplayName("matches() pattern argument success test")
        void matches_pattern_success() throws Exception {
            // given
            String actual = "ones1k95@gmail.com";
            Pattern expected = Pattern.compile("^.+?@.{2,}?\\..{2,}$");

            // when
            AbstractStringAssert<?> stringAssert = new AbstractStringAssert<>(AbstractStringAssert.class, actual);

            // then
            assertThatNoException().isThrownBy(() -> stringAssert.matches(expected));
        }

        @Test
        @DisplayName("matches() pattern argument success test")
        void matches_pattern_fail() throws Exception {
            // given
            String actual = "ones1k95";
            Pattern expected = Pattern.compile("^.+?@.{2,}?\\..{2,}$");

            // when
            AbstractStringAssert<?> stringAssert = new AbstractStringAssert<>(AbstractStringAssert.class, actual);

            // then
            assertThatThrownBy(() -> stringAssert.matches(expected));
        }
    }

    @Nested
    @DisplayName("asLength() test")
    class AsLengthTest {

        @Test
        @DisplayName("asLength test")
        void asLength() throws Exception{
            // given
            String actual = "ones1k95";

            // when
            AbstractStringAssert<?> stringAssert = new AbstractStringAssert<>(AbstractStringAssert.class, actual);

            // then
            assertThat(stringAssert.asLength()).isNotNull()
                    .isInstanceOf(AbstractIntegerAssert.class);
            assertThatNoException().isThrownBy(() -> stringAssert.asLength().isEqualTo(8));
        }
    }

    @Nested
    @DisplayName("hasText() test")
    class HasTextTest {

        @Test
        @DisplayName("hasText() success test")
        void hasText_success() throws Exception {
            // given
            String actual = "actual";

            // when
            AbstractStringAssert<?> stringAssert = new AbstractStringAssert<>(AbstractStringAssert.class, actual);

            // then
            assertThatNoException().isThrownBy(stringAssert::hasText);
        }

        @Test
        @DisplayName("hasText() fail test")
        void hasText_fail() throws Exception {
            // given
            String actual = " ";

            // when
            AbstractStringAssert<?> stringAssert = new AbstractStringAssert<>(AbstractStringAssert.class, actual);

            // then
            assertThatThrownBy(stringAssert::hasText);
        }
    }

}