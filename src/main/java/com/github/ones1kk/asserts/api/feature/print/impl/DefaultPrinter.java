package com.github.ones1kk.asserts.api.feature.print.impl;

import com.github.ones1kk.asserts.api.feature.print.Printer;

import javax.annotation.Nullable;

import static com.github.ones1kk.asserts.api.feature.print.constant.Colors.RED;
import static com.github.ones1kk.asserts.api.feature.print.constant.Colors.WHITE;

public class DefaultPrinter implements Printer {

    public String print(Object actual, @Nullable Object expected, String description) {
        if (expected != null) {
            return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s",
                    WHITE.getValue(), RED.getValue() + expected, WHITE.getValue(), RED.getValue() + actual, WHITE.getValue(), RED.getValue() + description);
        } else {
            return String.format("%n%sActual      : %s%n%sDescription : %s", WHITE.getValue(), RED.getValue() + actual,
                    WHITE.getValue(), RED.getValue() + description);

        }
    }
}
