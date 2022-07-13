package com.github.ones1kk.asserts.api.description.impl;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.exception.AssertException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

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

    }

}