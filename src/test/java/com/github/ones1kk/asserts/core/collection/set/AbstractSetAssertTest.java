package com.github.ones1kk.asserts.core.collection.set;

import com.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.*;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractSetAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        Set<String> actual1 = unmodifiableSet(new HashSet<>(asList("1", "2", "3")));
        Set<String> actual2 = null;

        // when
        AbstractSetAssert<?, String> assert1 = new AbstractSetAssert<>(AbstractSetAssert.class, actual1);
        AbstractSetAssert<?, String> assert2 = new AbstractSetAssert<>(AbstractSetAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractSetAssert.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isNotAssignableFrom(AbstractSetAssert.class);
        });
    }

    @Test
    @DisplayName("Set method test")
    public void test2() throws Exception {
        // given
        Set<String> actual1 = Collections.checkedSet(new HashSet<>(asList("1", "2", "3")), String.class);
        Set<String> actual2 = null;
        Set<String> actual3 = emptySet();
        Set<String> actual4 = unmodifiableSet(new HashSet<>(asList("1", null, "2")));

        // when
        AbstractSetAssert<?, String> assert1 = new AbstractSetAssert<>(AbstractSetAssert.class, actual1);
        AbstractSetAssert<?, String> assert2 = new AbstractSetAssert<>(AbstractSetAssert.class, actual2);
        AbstractSetAssert<?, String> assert3 = new AbstractSetAssert<>(AbstractSetAssert.class, actual3);
        AbstractSetAssert<?, String> assert4 = new AbstractSetAssert<>(AbstractSetAssert.class, actual4);

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

        assertThrows(AssertException.class, () -> assert1.isSmallerThan(unmodifiableSet(new HashSet<>(asList("1", "2")))));
        assertThrows(AssertException.class, () -> assert1.isSmallerThan(unmodifiableSet(new HashSet<>(asList("1", "2", "3")))));

        assertThrows(AssertException.class, () -> assert1.isSmallerThanOrEqualTo(unmodifiableSet(new HashSet<>(asList("1", "2")))));

        assertThrows(AssertException.class, () -> assert1.isLargerThan(unmodifiableSet(new HashSet<>(asList("1", "2", "3", "4")))));
        assertThrows(AssertException.class, () -> assert1.isLargerThan(unmodifiableSet(new HashSet<>(asList("1", "2", "3")))));

        assertThrows(AssertException.class, () -> assert1.isLargerThanOrEqualTo(unmodifiableSet(new HashSet<>(asList("1", "2", "3", "4")))));

        assertThrows(AssertException.class, () -> assert1.isBetweenSizeOf(unmodifiableSet(new HashSet<>(asList("1", "2", "3", "4"))), unmodifiableSet(new HashSet<>(asList("1", "2", "3", "4", "5")))));

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

            assert1.isSmallerThan(unmodifiableSet(new HashSet<>(asList("1", "2", "3", "4"))));

            assert1.isSmallerThanOrEqualTo(unmodifiableSet(new HashSet<>(asList("1", "2", "3", "4"))));
            assert1.isSmallerThanOrEqualTo(unmodifiableSet(new HashSet<>(asList("1", "2", "3"))));

            assert1.isLargerThan(singleton("1"));

            assert1.isLargerThanOrEqualTo(singleton("1"));
            assert1.isLargerThanOrEqualTo(actual1);

            assert1.isBetweenSizeOf(singleton("1"), unmodifiableSet(new HashSet<>(asList("1", "2", "3", "4"))));
        });
    }

}