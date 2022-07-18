package com.github.ones1kk.asserts.api.lang.object.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ObjectsTest {

    @Mock
    AsAssert<?> asAssert;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Test of methods, when ACTUAL is Object")
    public void test1() throws Exception {
        // given
        AbstractObjects<Object> objects = new Objects<>(asAssert);

        // when
        Object actual1 = new Object();
        Object actual2 = null;
        Object actual3 = new Object();

        // then
        assertThrows(Exception.class, () -> objects.assertIsNull(actual1));
        assertThrows(Exception.class, () -> objects.assertIsNotNull(actual2));
        assertThrows(Exception.class, () -> objects.assertIsSameAs(actual1, actual3));
        assertThrows(Exception.class, () -> objects.assertIsNotSameAs(actual1, actual1));
        assertThrows(Exception.class, () -> objects.assertIsEqualTo(actual1, actual2));
        assertThrows(Exception.class, () -> objects.assertIsNotEqualTo(actual1, actual1));

        objects.assertIsNull(actual2);
        objects.assertIsNotNull(actual1);
        objects.assertIsSameAs(actual1, actual1);
        objects.assertIsNotSameAs(actual1, actual2);
        objects.assertIsEqualTo(actual1, actual1);
        objects.assertIsNotEqualTo(actual1, actual3);
        objects.assertIsAssignableFrom(actual1, Object.class);
        objects.assertIsAssignableFrom(actual1, String.class);

        // Caution : Object can't test about notAssignableFrom method
    }

}