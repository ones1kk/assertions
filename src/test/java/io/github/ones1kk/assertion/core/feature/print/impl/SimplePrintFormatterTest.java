package io.github.ones1kk.assertion.core.feature.print.impl;

import io.github.ones1kk.assertion.core.feature.print.PrintFormatter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimplePrintFormatterTest {

    @Test
    @DisplayName("Check format of output")
    public void test1() throws Exception {
        PrintFormatter printFormatter = new SimplePrintFormatter();
        String result1 = printFormatter.writeOutput("test", "test", "test is equal to test");
        String result2 = printFormatter.writeOutput("printer test");
        String result3 = printFormatter.writeOutput("test", "test");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}