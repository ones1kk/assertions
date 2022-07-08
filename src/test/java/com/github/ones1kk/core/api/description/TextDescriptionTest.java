package com.github.ones1kk.core.api.description;

import com.github.ones1kk.core.api.description.impl.TextDescription;
import org.junit.jupiter.api.Test;

class TextDescriptionTest {

    @Test
    public void test1() throws Exception {
        // given
        TextDescription describable = new TextDescription();
        Object actual = new Object();
        Object expected = new Object();

        // when
        String text = describable.setDefaultText(actual, expected, "is can not be null");

        //then
        // It's working well in the format that I want
        System.out.println("text = " + text);
    }

}