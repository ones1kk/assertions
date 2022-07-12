package com.github.ones1kk.asserts.api.description.impl;

import com.github.ones1kk.asserts.api.description.Description;

import javax.annotation.Nullable;

import static com.github.ones1kk.core.api.description.constant.Colors.RED;
import static com.github.ones1kk.core.api.description.constant.Colors.WHITE;

public class DefaultTextDescription extends Description {

    @Override
    public String describedFormat(Object actual, @Nullable Object expected, String description) {
        if (expected != null) {
            return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s",
                    WHITE.getValue(), RED.getValue() + expected, WHITE.getValue(), RED.getValue() + actual, WHITE.getValue(), RED.getValue() + description);
        } else {
            return String.format("%n%sActual      : %s%n%sDescription : %s", WHITE.getValue(), RED.getValue() + actual,
                    WHITE.getValue(), RED.getValue() + description);

        }
    }
}
