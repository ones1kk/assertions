package com.github.ones1kk.asserts.core.feature.print.impl;

import com.github.ones1kk.asserts.core.feature.print.PrintFormatter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DefaultPrintFormatterTest {

    @Test
    @DisplayName("Check format of output")
    void test1() {
        PrintFormatter printFormatter = new DefaultPrintFormatter();
        String result1 = printFormatter.writeOutput("test", "test", "test is equal to test");
        String result2 = printFormatter.writeOutput("printer test");
        String result3 = printFormatter.writeOutput("test", "test");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}