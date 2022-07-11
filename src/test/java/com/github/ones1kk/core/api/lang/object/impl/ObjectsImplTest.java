package com.github.ones1kk.core.api.lang.object.impl;

import com.github.ones1kk.core.api.Asserts;
import com.github.ones1kk.core.api.description.Describable;
import com.github.ones1kk.core.api.description.impl.DefaultTextDescription;
import com.github.ones1kk.core.api.lang.object.AsObject;
import com.github.ones1kk.core.api.lang.object.Objects;
import com.github.ones1kk.core.exception.AssertException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ObjectsImplTest {

    Describable describable;

    @BeforeEach
    void init() {
        describable = new DefaultTextDescription();
    }

    @Test
    public void test1() throws Exception {
        // given
        Object actual1 = new Object();

        // when
        Objects<Object> objects = new ObjectsImpl(describable);

        //then
        assertThrows(AssertException.class, () -> objects.assertIsNull(actual1));
        assertThrows(AssertException.class, () -> objects.assertIsNull(actual1));
        assertThrows(AssertException.class, () -> objects.assertIsNotNull(null));
        assertThrows(AssertException.class, () -> objects.assertIsNotNull(null));
    }

    @Test
    @DisplayName("Print asDescription")
    public void test2() throws Exception {
        // given
        Object actual = new Object();
        AsObject that = Asserts.that(actual);

        // when
        that.as(() -> " this is success test", actual).isNotNull();

        //then
        assertThrows(AssertException.class, () -> that.as(() -> " never can be null").isNull());

    }

    @Test
    @DisplayName("Description concurrency test")
    public void test3() throws Exception {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    String message = Assertions.assertThrows(AssertException.class,
                            () -> Asserts.that("1st").as("1st").isNull()).getMessage();

                    System.out.println(message);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    String message = Assertions.assertThrows(AssertException.class,
                            () -> Asserts.that("2nd").as("2nd").isNull()).getMessage();

                    System.out.println(message);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        String message = Assertions.assertThrows(AssertException.class,
                () -> Asserts.that("3rd").as("3rd").isNull()).getMessage();
        System.out.println(message);
        t1.join();
        t2.join();

    }

    @Test
    @DisplayName("Methods test")
    public void test4() throws Exception {
        Objects<Object> objects = new ObjectsImpl(describable);

        objects.assertIsSameAs("A", "A");
        assertThrows(AssertException.class, () -> objects.assertIsSameAs(new String("A"), new String("A")));

        objects.assertIsNotSameAs("A", new String("A"));
        assertThrows(AssertException.class, () ->  objects.assertIsNotSameAs("A", "A"));

        objects.assertIsEqualTo(new String("A"), new String("A"));
        assertThrows(AssertException.class, () ->objects.assertIsEqualTo("A", "B"));

        objects.assertIsNotEqualTo("A", "B");
        assertThrows(AssertException.class, () ->objects.assertIsNotEqualTo("A", "A"));

        objects.assertIsAssignableFrom("A", String.class);
        assertThrows(AssertException.class, () -> objects.assertIsAssignableFrom("A", Integer.class));

        objects.assertIsNotAssignableFrom("A", Integer.class);
        assertThrows(AssertException.class, () -> objects.assertIsNotAssignableFrom("A", String.class));
    }

}