package com.github.ones1kk.asserts.core.array.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArraysTest {

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
        Arrays<CharSequence> arrays1 = new Arrays<>(asAssert);
        Arrays<String> arrays2 = new Arrays<>(asAssert);
        Arrays<Character> arrays3 = new Arrays<>(asAssert);

        // when
        CharSequence[] actual1 = {"1", "2"};
        String[] actual2 = {"1", "2"};
        Character[] actual3 = {'1', '2'};

        // then
        assertThrows(Exception.class, () -> arrays1.assertIsEmpty(actual1));
        assertThrows(Exception.class, () -> arrays2.assertIsEmpty(actual2));
        assertThrows(Exception.class, () -> arrays3.assertIsEmpty(actual3));

        assertThrows(Exception.class, () -> arrays1.assertIsNotEmpty(new CharSequence[]{}));
        assertThrows(Exception.class, () -> arrays2.assertIsNotEmpty(new String[]{}));
        assertThrows(Exception.class, () -> arrays3.assertIsNotEmpty(new Character[]{}));

        assertThrows(Exception.class, () -> arrays1.assertIsNullOrEmpty(actual1));
        assertThrows(Exception.class, () -> arrays2.assertIsNullOrEmpty(actual2));
        assertThrows(Exception.class, () -> arrays3.assertIsNullOrEmpty(actual3));

        assertThrows(Exception.class, () -> arrays1.assertContains(actual1, "123"));
        assertThrows(Exception.class, () -> arrays2.assertContains(actual2, "123"));
        assertThrows(Exception.class, () -> arrays3.assertContains(actual3, '6'));


        assertThrows(Exception.class, () -> arrays1.assertDoesNotContain(actual1, "1"));
        assertThrows(Exception.class, () -> arrays2.assertDoesNotContain(actual2, "2"));
        assertThrows(Exception.class, () -> arrays3.assertDoesNotContain(actual3, '2'));

        assertThrows(Exception.class, () -> arrays1.assertContainsAll(actual1, "1", "9"));
        assertThrows(Exception.class, () -> arrays2.assertContainsAll(actual2, "12"));
        assertThrows(Exception.class, () -> arrays3.assertContainsAll(actual3, '6', '2'));

        assertThrows(Exception.class, () -> arrays1.assertContainsAny(actual1, "24", "12"));
        assertThrows(Exception.class, () -> arrays2.assertContainsAny(actual2, "22", "12"));
        assertThrows(Exception.class, () -> arrays3.assertContainsAny(actual3, '6', '8'));

        assertThrows(Exception.class, () -> arrays1.assertContainsNull(actual1));
        assertThrows(Exception.class, () -> arrays2.assertContainsNull(actual2));
        assertThrows(Exception.class, () -> arrays3.assertContainsNull(actual3));

        assertThrows(Exception.class, () -> arrays1.assertDoesNotContainNull(new CharSequence[]{"A", "1", null, "123"}));
        assertThrows(Exception.class, () -> arrays2.assertDoesNotContainNull(new String[]{"A", "1", null, "123"}));
        assertThrows(Exception.class, () -> arrays3.assertDoesNotContainNull(new Character[]{null, '1', 'a'}));

        assertThrows(Exception.class, () -> arrays1.assertAllMatch(actual1, Objects::isNull));
        assertThrows(Exception.class, () -> arrays2.assertAllMatch(actual2, Objects::isNull));
        assertThrows(Exception.class, () -> arrays3.assertAllMatch(actual3, Objects::isNull));

        assertThrows(Exception.class, () -> arrays1.assertNoneMatch(actual1, Objects::nonNull));
        assertThrows(Exception.class, () -> arrays2.assertNoneMatch(actual2, Objects::nonNull));
        assertThrows(Exception.class, () -> arrays3.assertNoneMatch(actual3, Objects::nonNull));

        assertThatNoException().isThrownBy(() -> {
            arrays1.assertIsEmpty(new CharSequence[]{});
            arrays2.assertIsEmpty(new String[]{});
            arrays3.assertIsEmpty(new Character[]{});

            arrays1.assertIsNotEmpty(actual1);
            arrays2.assertIsNotEmpty(actual2);
            arrays3.assertIsNotEmpty(actual3);

            // Null check
            arrays1.assertIsNullOrEmpty(null);
            arrays2.assertIsNullOrEmpty(null);
            arrays3.assertIsNullOrEmpty(null);
            // Empty check
            arrays1.assertIsNullOrEmpty(new CharSequence[]{});
            arrays2.assertIsNullOrEmpty(new String[]{});
            arrays3.assertIsNullOrEmpty(new Character[]{});

            arrays1.assertContains(actual1, "1");
            arrays2.assertContains(actual2, "2");
            arrays3.assertContains(actual3, '2');

            arrays1.assertDoesNotContain(actual1, "7");
            arrays2.assertDoesNotContain(actual2, "100");
            arrays3.assertDoesNotContain(actual3, 'a');

            arrays1.assertContainsAll(actual1, "1", "2");
            arrays2.assertContainsAll(actual2, "1", "2");
            arrays3.assertContainsAll(actual3, '1', '2');

            // One
            arrays1.assertContainsAny(actual1, "100", "2", "ABC");
            arrays2.assertContainsAny(actual2, "999", "2312", "1");
            arrays3.assertContainsAny(actual3, '6', '2', '9');
            // Every
            arrays1.assertContainsAny(actual1, "1", "2");
            arrays2.assertContainsAny(actual2, "1", "2");
            arrays3.assertContainsAny(actual3, '1', '2');

            arrays1.assertContainsNull(new CharSequence[]{"A", "1", null, "123"});
            arrays2.assertContainsNull(new String[]{"A", "1", null, "123"});
            arrays3.assertContainsNull(new Character[]{null, '1', 'a'});


            arrays1.assertDoesNotContainNull(actual1);
            arrays2.assertDoesNotContainNull(actual2);
            arrays3.assertDoesNotContainNull(actual3);

            arrays1.assertAllMatch(actual1, Objects::nonNull);
            arrays2.assertAllMatch(actual2, Objects::nonNull);
            arrays3.assertAllMatch(actual3, Objects::nonNull);

            arrays1.assertNoneMatch(actual1, Objects::isNull);
            arrays2.assertNoneMatch(actual2, Objects::isNull);
            arrays3.assertNoneMatch(actual3, Objects::isNull);
        });

    }

}