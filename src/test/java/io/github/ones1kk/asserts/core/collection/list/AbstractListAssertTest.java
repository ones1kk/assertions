package io.github.ones1kk.asserts.core.collection.list;

import io.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractListAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        List<String> actual1 = asList("1", "2", "3");
        List<String> actual2 = null;

        // when
        AbstractListAssert<?, String> assert1 = new AbstractListAssert<>(AbstractListAssert.class, actual1);
        AbstractListAssert<?, String> assert2 = new AbstractListAssert<>(AbstractListAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractListAssert.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isNotAssignableFrom(AbstractListAssert.class);
        });
    }

    @Test
    @DisplayName("List method test")
    public void test2() throws Exception {
        // given
        List<String> actual1 = asList("1", "2", "3");
        List<String> actual2 = null;
        List<String> actual3 = emptyList();
        List<String> actual4 = asList("1", null, "2");

        // when
        AbstractListAssert<?, String> assert1 = new AbstractListAssert<>(AbstractListAssert.class, actual1);
        AbstractListAssert<?, String> assert2 = new AbstractListAssert<>(AbstractListAssert.class, actual2);
        AbstractListAssert<?, String> assert3 = new AbstractListAssert<>(AbstractListAssert.class, actual3);
        AbstractListAssert<?, String> assert4 = new AbstractListAssert<>(AbstractListAssert.class, actual4);

        // then
        assertThrows(AssertException.class, assert1::isEmpty);
        assertThrows(AssertException.class, assert3::isNotEmpty);
        assertThrows(AssertException.class, assert1::isNullOrEmpty);
        assertThrows(AssertException.class, () -> assert1.contains("4"));
        assertThrows(AssertException.class, () -> assert1.doesNotContain("1"));

        assertThrows(AssertException.class, () -> assert1.containsAll("4", "5"));
        assertThrows(AssertException.class, () -> assert1.containsAll("1", "2", "4"));

        assertThrows(AssertException.class, () -> assert1.containsAny("4", "5", "6"));
        assertThrows(AssertException.class, assert1::containsNull);
        assertThrows(AssertException.class, assert4::doesNotContainNull);
        assertThrows(AssertException.class, () -> assert1.allMatch(Objects::isNull));
        assertThrows(AssertException.class, () -> assert1.noneMatch(Objects::nonNull));

        assertThrows(AssertException.class, () -> assert1.isSmallerThan(asList("1", "2")));
        assertThrows(AssertException.class, () -> assert1.isSmallerThan(asList("1", "2", "3")));

        assertThrows(AssertException.class, () -> assert1.isSmallerThanOrEqualTo(asList("1", "2")));

        assertThrows(AssertException.class, () -> assert1.isLargerThan(asList("1", "2", "3", "4")));
        assertThrows(AssertException.class, () -> assert1.isLargerThan(asList("1", "2", "3")));

        assertThrows(AssertException.class, () -> assert1.isLargerThanOrEqualTo(asList("1", "2", "3", "4")));

        assertThrows(AssertException.class, () -> assert1.isBetweenSizeOf(asList("1", "2", "3", "4"), asList("1", "2", "3", "4", "5")));

        assertThatNoException().isThrownBy(() -> {
            assert3.isEmpty();
            assert1.isNotEmpty();
            assert2.isNullOrEmpty();
            assert3.isNullOrEmpty();
            assert1.contains("2");
            assert1.doesNotContain("4");
            assert1.containsAll("1", "2");
            assert1.containsAny("3", "4", "5");
            assert4.containsNull();
            assert1.doesNotContainNull();
            assert1.allMatch(Objects::nonNull);
            assert1.noneMatch(Objects::isNull);

            assert1.isSmallerThan(asList("1", "2", "3", "4"));

            assert1.isSmallerThanOrEqualTo(asList("1", "2", "3", "4"));
            assert1.isSmallerThanOrEqualTo(asList("1", "2", "3"));

            assert1.isLargerThan(singletonList("1"));

            assert1.isLargerThanOrEqualTo(singletonList("1"));
            assert1.isLargerThanOrEqualTo(actual1);

            assert1.isBetweenSizeOf(singletonList("1"), asList("1", "2", "3", "4"));
        });
    }
}