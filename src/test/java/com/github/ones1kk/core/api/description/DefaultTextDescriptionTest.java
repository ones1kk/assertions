package com.github.ones1kk.core.api.description;

import com.github.ones1kk.core.api.description.impl.DefaultTextDescription;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DefaultTextDescriptionTest {

    @Test
    @DisplayName("Format of default text")
    public void test1() throws Exception {
        // given
        DefaultTextDescription describable = new DefaultTextDescription();
        Object actual = new Object();
        Object expected = new Object();

        // when
        String text = describable.describedFormat(actual, expected, "is can not be null");

        //then
        // It's working well in the format that I want
        System.out.println(text);
    }

}