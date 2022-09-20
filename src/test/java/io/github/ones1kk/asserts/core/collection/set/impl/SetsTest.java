package io.github.ones1kk.asserts.core.collection.set.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Objects;

import static java.util.Arrays.asList;
import static java.util.Collections.*;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SetsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        Sets<String> sets = new Sets<>(asAssert);

        assertThrows(Exception.class, () -> sets.assertIsEmpty(singleton("")));
        assertThrows(Exception.class, () -> sets.assertIsNotEmpty(emptySet()));

        assertThrows(Exception.class, () -> sets.assertIsEmpty(singleton("")));
        assertThrows(Exception.class, () -> sets.assertIsNotEmpty(emptySet()));

        assertThrows(Exception.class, () -> sets.assertContains(unmodifiableSet(new HashSet<>(asList("a", "b"))), "c"));
        assertThrows(Exception.class, () -> sets.assertDoesNotContain(unmodifiableSet(new HashSet<>(asList("a", "b"))), "a"));
        assertThrows(Exception.class, () -> sets.assertContainsAll(unmodifiableSet(new HashSet<>(asList("a", "b"))), "z", "x"));

        assertThrows(Exception.class, () -> sets.assertContainsAny(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), "1", "2", "z"));
        assertThrows(Exception.class, () -> sets.assertContainsNull(unmodifiableSet(new HashSet<>(asList("a", "b", "c")))));
        assertThrows(Exception.class, () -> sets.assertDoesNotContainNull(unmodifiableSet(new HashSet<>(asList("a", "b", "c", null)))));

        assertThrows(Exception.class, () -> sets.assertAllMatch(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), Objects::isNull));
        assertThrows(Exception.class, () -> sets.assertNoneMatch(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), Objects::nonNull));

        assertThrows(Exception.class, () -> sets.assertIsSmallerThan(unmodifiableSet(new HashSet<>(asList("a", "b"))), singleton("a")));
        assertThrows(Exception.class, () -> sets.assertIsSmallerThan(unmodifiableSet(new HashSet<>(asList("a", "b"))), unmodifiableSet(new HashSet<>(asList("a", "b")))));

        assertThrows(Exception.class, () -> sets.assertIsSmallerThanOrEqualTo(unmodifiableSet(new HashSet<>(asList("a", "b"))), singleton("a")));


        assertThrows(Exception.class, () -> sets.assertIsLargerThan(singleton("a"), unmodifiableSet(new HashSet<>(asList("a", "b")))));
        assertThrows(Exception.class, () -> sets.assertIsLargerThan(singleton("a"), singleton("a")));

        assertThrows(Exception.class, () -> sets.assertIsLargerThanOrEqualTo(singleton("a"), unmodifiableSet(new HashSet<>(asList("a", "b")))));

        assertThrows(Exception.class, () -> sets.assertIsBetweenSizeOf(unmodifiableSet(new HashSet<>(asList("a", "b"))), unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), unmodifiableSet(new HashSet<>(asList("a", "b", "c", "d")))));

        assertThatNoException().isThrownBy(() -> {
            sets.assertIsEmpty(emptySet());
            sets.assertIsNotEmpty(singleton(""));

            sets.assertIsNullOrEmpty(null);
            sets.assertIsNullOrEmpty(emptySet());

            sets.assertContains(unmodifiableSet(new HashSet<>(asList("a", "b"))), "a");
            sets.assertDoesNotContain(unmodifiableSet(new HashSet<>(asList("a", "b"))), "c");
            sets.assertContainsAll(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), "c", "b");
            sets.assertContainsAny(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), "1", "2", "z", "b");
            sets.assertContainsNull(unmodifiableSet(new HashSet<>(asList("a", "b", "c", null))));
            sets.assertDoesNotContainNull(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))));
            sets.assertAllMatch(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), Objects::nonNull);
            sets.assertNoneMatch(unmodifiableSet(new HashSet<>(asList("a", "b", "c"))), Objects::isNull);

            sets.assertIsSmallerThan(singleton("a"), unmodifiableSet(new HashSet<>(asList("a", "b"))));

            sets.assertIsSmallerThanOrEqualTo(singleton("a"), unmodifiableSet(new HashSet<>(asList("a", "b"))));
            sets.assertIsSmallerThanOrEqualTo(singleton("a"), singleton("a"));

            sets.assertIsLargerThan(unmodifiableSet(new HashSet<>(asList("a", "b"))), singleton("a"));

            sets.assertIsLargerThanOrEqualTo(unmodifiableSet(new HashSet<>(asList("a", "b"))), singleton("a"));
            sets.assertIsLargerThanOrEqualTo(unmodifiableSet(new HashSet<>(asList("a", "b"))), unmodifiableSet(new HashSet<>(asList("a", "b"))));

            sets.assertIsBetweenSizeOf(unmodifiableSet(new HashSet<>(asList("a", "b"))), singleton("a"), unmodifiableSet(new HashSet<>(asList("a", "b", "c"))));
        });
    }
}