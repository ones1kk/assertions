package com.github.ones1kk.asserts.api.description.impl;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DescriptionTest {

    // TODO : Regex
    @Test
    @DisplayName("Description is working well?")
    public void test1() throws Exception {
        // given
        Describable describable = new Description();

        // when
        String description1 = describable.as("Description test");
        String description2 = describable.as("Description {}", "test");
        String description3 = "Description test %%s";
        String description4 = "Description test %s";
//        Matcher matcher1 = describable.pattern.matcher(description3);
//        Matcher matcher2 = describable.pattern.matcher(description4);

        //then
        assertThat(description1).isEqualTo("Description test");
        assertThat(description2).isEqualTo("Description test");
        assertThrows(AssertException.class, () -> describable.as("Description {}"));
//        assertThat(matcher1.matches()).isFalse();
//        assertThat(matcher2.matches()).isTrue();

    }

}