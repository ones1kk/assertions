package com.github.ones1kk.asserts.core.feature.print.impl;

import com.github.ones1kk.asserts.core.feature.print.Printer;
import com.github.ones1kk.asserts.core.feature.print.constant.Colors;

import static com.github.ones1kk.asserts.core.feature.print.constant.Colors.*;

public class SimplePrinter implements Printer {

    @Override
    public String writeOutput(Object actual, Object expected, String description) {
        return String.format("%s%s is expected as %s, but it is not", RED.getValue(), actual, expected);
    }

    @Override
    public String writeOutput(Object actual, String description) {
        return String.format("%s%s(actual : %s)",RED.getValue(), description, actual);
    }

    @Override
    public String writeOutput(String description) {
        return String.format("%s%s", RED.getValue(), description);
    }
}
