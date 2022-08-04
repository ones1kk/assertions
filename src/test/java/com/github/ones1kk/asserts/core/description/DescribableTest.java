package com.github.ones1kk.asserts.core.description;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.assertj.core.api.Assertions.assertThat;

class DescribableTest {

    private static final String EXCEPTION_CASE_1 = "hello %%s is test";
    private static final String EXCEPTION_CASE_2 = "hello %s is test";
    private static final String EXCEPTION_CASE_3 = "he@llo %%s i!s te@#{(st";

    @Test
    @DisplayName("Regular expression test")
    public void test1() throws Exception {
        Matcher matcher1 = Describable.pattern.matcher(EXCEPTION_CASE_1);
        Matcher matcher2 = Describable.pattern.matcher(EXCEPTION_CASE_2);
        Matcher matcher3 = Describable.pattern.matcher(EXCEPTION_CASE_3);

        while (matcher1.find()) {
            assertThat(matcher1.group()).isNotEmpty();
        }

        while (matcher2.find()) {
            assertThat(matcher2.group()).isEmpty();
        }

        while (matcher3.find()) {
            assertThat(matcher3.group()).isNotEmpty();
        }

    }

}