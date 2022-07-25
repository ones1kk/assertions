package com.github.ones1kk.asserts.api.lang.string;

import com.github.ones1kk.asserts.api.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isAssignableFrom(String.class);
        assert1.isNotAssignableFrom(AbstractStringAssert.class);
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

        assert2.isEmpty();
        assert1.isNotEmpty();
        assert3.isBlank();
        assert1.isNotBlank();
        assert1.isEqualToIgnoreCase("ACTUAL");
    }

    @Test
    @DisplayName("Comparable Test")
    public void test3() throws Exception {
        // given
        String actual1 = "1";
        String actual2 = "2";
        String actual3 = "3";

        String expected1 = "1";
        String expected2 = "2";
        String expected3 = "3";

        // when
        AbstractStringAssert<?> assert1 = new AbstractStringAssert<>(AbstractStringAssert.class, actual1);
        AbstractStringAssert<?> assert2 = new AbstractStringAssert<>(AbstractStringAssert.class, actual2);
        AbstractStringAssert<?> assert3 = new AbstractStringAssert<>(AbstractStringAssert.class, actual3);

        // then
        // actual > expected
        assertThrows(AssertException.class,
                () -> assert2.isLessThan(expected1));
        // actual == expected
        assertThrows(AssertException.class,
                () -> assert2.isLessThan(expected2));

        // actual < expected
        assertThrows(AssertException.class,
                () -> assert1.isGreaterThan(expected2));
        // actual == expected
        assertThrows(AssertException.class,
                () -> assert1.isGreaterThan(expected1));

        // actual > expected
        assertThrows(AssertException.class,
                () -> assert2.isLessThanOrEqualTo(expected1));

        // actual < expected
        assertThrows(AssertException.class,
                () -> assert2.isGreaterThanOrEqualTo(expected3));

        // actual < start
        assertThrows(AssertException.class,
                () -> assert1.isBetween(expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
                () -> assert3.isBetween(expected1, expected2));

        // actual < expected
        assert1.isLessThan(expected2);

        // actual > expected
        assert2.isGreaterThan(expected1);

        // actual == expected
        assert1.isLessThanOrEqualTo(expected1);
        // actual < expected
        assert1.isLessThanOrEqualTo(expected2);

        // actual == expected
        assert3.isGreaterThanOrEqualTo(expected3);
        // actual >= expected
        assert3.isGreaterThanOrEqualTo(expected2);

        // start < actual < end
        assert2.isBetween(expected1, expected3);
    }

}