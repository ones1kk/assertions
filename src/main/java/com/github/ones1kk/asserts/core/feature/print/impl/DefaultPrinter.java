package com.github.ones1kk.asserts.core.feature.print.impl;

import com.github.ones1kk.asserts.core.feature.print.Printer;

import static com.github.ones1kk.asserts.core.feature.print.constant.Colors.RED;
import static com.github.ones1kk.asserts.core.feature.print.constant.Colors.WHITE;

public class DefaultPrinter implements Printer {

    @Override
    public String writeOutput(Object actual, Object expected, String description) {
        return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s",
                WHITE.getValue(), RED.getValue() + expected, WHITE.getValue(), RED.getValue() + actual, WHITE.getValue(), RED.getValue() + description);
    }

    @Override
    public String writeOutput(Object actual, String description) {
        return String.format("%n%sActual      : %s%n%sDescription : %s", WHITE.getValue(), RED.getValue() + actual,
                WHITE.getValue(), RED.getValue() + description);
    }

    @Override
    public String writeOutput(String description) {
        return String.format("%n%sDescription : %s", WHITE.getValue(), RED.getValue() + description);
    }
}
