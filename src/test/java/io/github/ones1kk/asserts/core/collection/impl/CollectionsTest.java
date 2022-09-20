package io.github.ones1kk.asserts.core.collection.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Objects;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CollectionsTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        Collections<String> collections = new Collections<>(asAssert);

        assertThrows(Exception.class, () -> collections.assertIsEmpty(singletonList("")));
        assertThrows(Exception.class, () -> collections.assertIsNotEmpty(emptyList()));

        assertThrows(Exception.class, () -> collections.assertIsEmpty(singletonList("")));
        assertThrows(Exception.class, () -> collections.assertIsNotEmpty(emptyList()));

        assertThrows(Exception.class, () -> collections.assertContains(asList("a", "b"), "c"));
        assertThrows(Exception.class, () -> collections.assertDoesNotContain(asList("a", "b"), "a"));
        assertThrows(Exception.class, () -> collections.assertContainsAll(asList("a", "b"), "z", "x"));

        assertThrows(Exception.class, () -> collections.assertContainsAny(asList("a", "b", "c"), "1", "2", "z"));
        assertThrows(Exception.class, () -> collections.assertContainsNull(asList("a", "b", "c")));
        assertThrows(Exception.class, () -> collections.assertDoesNotContainNull(asList("a", "b", "c", null)));

        assertThrows(Exception.class, () -> collections.assertAllMatch(asList("a", "b", "c"), Objects::isNull));
        assertThrows(Exception.class, () -> collections.assertNoneMatch(asList("a", "b", "c"), Objects::nonNull));

        assertThrows(Exception.class, () -> collections.assertIsSmallerThan(asList("a", "b"), singletonList("a")));
        assertThrows(Exception.class, () -> collections.assertIsSmallerThan(asList("a", "b"), asList("a", "b")));

        assertThrows(Exception.class, () -> collections.assertIsSmallerThanOrEqualTo(asList("a", "b"), singletonList("a")));


        assertThrows(Exception.class, () -> collections.assertIsLargerThan(singletonList("a"), asList("a", "b")));
        assertThrows(Exception.class, () -> collections.assertIsLargerThan(singletonList("a"), singletonList("a")));

        assertThrows(Exception.class, () -> collections.assertIsLargerThanOrEqualTo(singletonList("a"), asList("a", "b")));

        assertThrows(Exception.class, () -> collections.assertIsBetweenSizeOf(asList("a", "b"), asList("a", "b", "c"), asList("a", "b", "c", "d")));

        assertThatNoException().isThrownBy(() -> {
            collections.assertIsEmpty(emptyList());
            collections.assertIsNotEmpty(singletonList(""));

            collections.assertIsNullOrEmpty(null);
            collections.assertIsNullOrEmpty(emptyList());

            collections.assertContains(asList("a", "b"), "a");
            collections.assertDoesNotContain(asList("a", "b"), "c");
            collections.assertContainsAll(asList("a", "b", "c"), "c", "b");
            collections.assertContainsAny(asList("a", "b", "c"), "1", "2", "z", "b");
            collections.assertContainsNull(asList("a", "b", "c", null));
            collections.assertDoesNotContainNull(asList("a", "b", "c"));
            collections.assertAllMatch(asList("a", "b", "c"), Objects::nonNull);
            collections.assertNoneMatch(asList("a", "b", "c"), Objects::isNull);

            collections.assertIsSmallerThan(singletonList("a"), asList("a", "b"));

            collections.assertIsSmallerThanOrEqualTo(singletonList("a"), asList("a", "b"));
            collections.assertIsSmallerThanOrEqualTo(singletonList("a"), singletonList("a"));

            collections.assertIsLargerThan(asList("a", "b"), singletonList("a"));

            collections.assertIsLargerThanOrEqualTo(asList("a", "b"), singletonList("a"));
            collections.assertIsLargerThanOrEqualTo(asList("a", "b"), asList("a", "b"));

            collections.assertIsBetweenSizeOf(asList("a", "b"), singletonList("a"), asList("a", "b", "c"));
        });
    }

}