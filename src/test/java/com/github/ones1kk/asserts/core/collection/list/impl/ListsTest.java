package com.github.ones1kk.asserts.core.collection.list.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Objects;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        Lists<Object> lists = new Lists<>(asAssert);

        assertThrows(Exception.class, () -> lists.assertIsEmpty(singletonList("")));
        assertThrows(Exception.class, () -> lists.assertIsNotEmpty(emptyList()));

        assertThrows(Exception.class, () -> lists.assertIsEmpty(singletonList("")));
        assertThrows(Exception.class, () -> lists.assertIsNotEmpty(emptyList()));

        assertThrows(Exception.class, () -> lists.assertContains(asList("a", "b"), "c"));
        assertThrows(Exception.class, () -> lists.assertDoesNotContain(asList("a", "b"), "a"));
        assertThrows(Exception.class, () -> lists.assertContainsAll(asList("a", "b"), "z", "x"));

        assertThrows(Exception.class, () -> lists.assertContainsAny(asList("a", "b", "c"), "1", "2", "z"));
        assertThrows(Exception.class, () -> lists.assertContainsNull(asList("a", "b", "c")));
        assertThrows(Exception.class, () -> lists.assertDoesNotContainNull(asList("a", "b", "c", null)));

        assertThrows(Exception.class, () -> lists.assertAllMatch(asList("a", "b", "c"), Objects::isNull));
        assertThrows(Exception.class, () -> lists.assertNoneMatch(asList("a", "b", "c"), Objects::nonNull));

        assertThrows(Exception.class, () -> lists.assertIsSmallerThan(asList("a", "b"), singletonList("a")));
        assertThrows(Exception.class, () -> lists.assertIsSmallerThan(asList("a", "b"), asList("a", "b")));

        assertThrows(Exception.class, () -> lists.assertIsSmallerThanOrEqualTo(asList("a", "b"), singletonList("a")));


        assertThrows(Exception.class, () -> lists.assertIsLargerThan(singletonList("a"), asList("a", "b")));
        assertThrows(Exception.class, () -> lists.assertIsLargerThan(singletonList("a"), singletonList("a")));

        assertThrows(Exception.class, () -> lists.assertIsLargerThanOrEqualTo(singletonList("a"), asList("a", "b")));

        assertThrows(Exception.class, () -> lists.assertIsBetweenSizeOf(asList("a", "b"), asList("a", "b", "c"), asList("a", "b", "c", "d")));

        assertThatNoException().isThrownBy(() -> {
            lists.assertIsEmpty(emptyList());
            lists.assertIsNotEmpty(singletonList(""));

            lists.assertIsNullOrEmpty(null);
            lists.assertIsNullOrEmpty(emptyList());

            lists.assertContains(asList("a", "b"), "a");
            lists.assertDoesNotContain(asList("a", "b"), "c");
            lists.assertContainsAll(asList("a", "b", "c"), "c", "b");
            lists.assertContainsAny(asList("a", "b", "c"), "1", "2", "z", "b");
            lists.assertContainsNull(asList("a", "b", "c", null));
            lists.assertDoesNotContainNull(asList("a", "b", "c"));
            lists.assertAllMatch(asList("a", "b", "c"), Objects::nonNull);
            lists.assertNoneMatch(asList("a", "b", "c"), Objects::isNull);

            lists.assertIsSmallerThan(singletonList("a"), asList("a", "b"));

            lists.assertIsSmallerThanOrEqualTo(singletonList("a"), asList("a", "b"));
            lists.assertIsSmallerThanOrEqualTo(singletonList("a"), singletonList("a"));

            lists.assertIsLargerThan(asList("a", "b"), singletonList("a"));

            lists.assertIsLargerThanOrEqualTo(asList("a", "b"), singletonList("a"));
            lists.assertIsLargerThanOrEqualTo(asList("a", "b"), asList("a", "b"));

            lists.assertIsBetweenSizeOf(asList("a", "b"), singletonList("a"), asList("a", "b", "c"));
        });
    }
}