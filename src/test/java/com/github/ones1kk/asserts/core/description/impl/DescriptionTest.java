package com.github.ones1kk.asserts.core.description.impl;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DescriptionTest {

    @Test
    @DisplayName("Description is working well?")
    public void test1() throws Exception {
        // given
        Describable describable = new Description();

        // when
        String description1 = describable.as("Description test");
        String description2 = describable.as("Description {}", "test");

        //then
        assertThat(description1).isEqualTo("Description test");
        assertThat(description2).isEqualTo("Description test");
        assertThrows(AssertException.class, () -> describable.as("Description {}"));
        assertThrows(AssertException.class, () -> describable.as("Description", "test"));
        assertThrows(AssertException.class, () -> describable.as("Description", "test"));
    }

    @Test
    @DisplayName("Description validation")
    public void test2() throws Exception {
        // given
        Describable describable = new Description();

        // when
        String case1 = "hello {} is test";
        String case2 = "he@llo %s i#s t]es-t";
        String case3 = "he@llo %%s i!s te@#{(st";

        // then
        assertThat(describable.as(case1, "this"))
                .isEqualTo("hello this is test")
                .isNotEmpty();

        assertThrows(AssertException.class, () -> describable.as(case2, "this"));
        assertThrows(AssertException.class, () -> describable.as(case3, "this"));
    }

    @Test
    @DisplayName("%s Character test")
    public void test3() throws Exception {
        // given
        Describable describable = new Description();

        // when
        String description = "description is {}, %s";
        String description2 = "description is {}";

        // then
        assertThrows(AssertException.class, () -> describable.as(description, "describable"));
    }
}