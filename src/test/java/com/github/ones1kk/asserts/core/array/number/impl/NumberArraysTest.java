package com.github.ones1kk.asserts.core.array.number.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberArraysTest {

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
        NumberArrays numberArrays = new NumberArrays(asAssert);

        // when
        Number[] actual = {1, 2, 3.6, 123L, 2352F};
        // then

        assertThrows(Exception.class, () -> numberArrays.assertIsMax(actual, 23));
        assertThrows(Exception.class, () -> numberArrays.assertIsMin(actual, 888));
        assertThrows(Exception.class, () -> numberArrays.assertIsSum(actual, 1234));
        assertThrows(Exception.class, () -> numberArrays.assertIsEmpty(actual));
        assertThrows(Exception.class, () -> numberArrays.assertIsNotEmpty(new Number[]{}));

        assertThrows(Exception.class, () -> numberArrays.assertIsNullOrEmpty(actual));

        assertThrows(Exception.class, () -> numberArrays.assertContains(actual, 123));
        assertThrows(Exception.class, () -> numberArrays.assertDoesNotContain(actual, 123L));

        assertThrows(Exception.class, () -> numberArrays.assertContainsAll(actual, 1, 2, 4.56));

        assertThrows(Exception.class, () -> numberArrays.assertContainsAny(actual, 9, 8, 7L));

        assertThrows(Exception.class, () -> numberArrays.assertContainsNull(actual));
        assertThrows(Exception.class, () -> numberArrays.assertDoesNotContainNull(new Number[]{1, 56, null}));

        assertThrows(Exception.class, () -> numberArrays.assertAllMatch(actual, Objects::isNull));
        assertThrows(Exception.class, () -> numberArrays.assertNoneMatch(actual, Objects::nonNull));

        numberArrays.assertIsMax(actual, 2352F);
        numberArrays.assertIsMin(actual, 1);
        numberArrays.assertIsSum(actual, 2481.6);
        numberArrays.assertIsEmpty(new Number[]{});
        numberArrays.assertIsNotEmpty(actual);

        // Null check
        numberArrays.assertIsNullOrEmpty(null);
        // Empty check
        numberArrays.assertIsNullOrEmpty(new Number[]{});

        numberArrays.assertContains(actual, 3.6);
        numberArrays.assertDoesNotContain(actual, 5);

        numberArrays.assertContainsAll(actual, 1, 123L, 2352F);

        // One
        numberArrays.assertContainsAny(actual, 0, 3.6, 100);
        // Every
        numberArrays.assertContainsAny(actual, 1, 2, 3.6);

        numberArrays.assertContainsNull(new Number[]{1, 6F, null, (short) 23, (byte) 12});
        numberArrays.assertDoesNotContainNull(actual);

        numberArrays.assertAllMatch(actual, it -> it.doubleValue() > 0);
        numberArrays.assertAllMatch(actual, Objects::nonNull);

        numberArrays.assertNoneMatch(actual, Objects::isNull);
    }

}