package com.github.ones1kk.asserts.core.feature.print.impl;

import com.github.ones1kk.asserts.core.feature.print.Printer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimplePrinterTest {

    @Test
    @DisplayName("Check format of output")
    public void test1() throws Exception {
        Printer printer = new SimplePrinter();
        String result1 = printer.writeOutput("test", "test", "test is equal to test");
        String result2 = printer.writeOutput("printer test");
        String result3 = printer.writeOutput("test", "test");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}