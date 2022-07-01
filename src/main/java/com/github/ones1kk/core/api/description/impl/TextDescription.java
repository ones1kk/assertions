package com.github.ones1kk.core.api.description.impl;

import com.github.ones1kk.core.api.description.Description;
import com.github.ones1kk.core.api.description.constant.Colors;

import javax.annotation.Nullable;

import static com.github.ones1kk.core.api.description.constant.Colors.*;

public class TextDescription extends Description {

    public String setDefaultText(Object actual, @Nullable Object expected, String description) {
        if (expected != null) {
            return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s",
                    WHITE.getValue(), RED.getValue() + expected, WHITE.getValue(), RED.getValue() + actual, WHITE.getValue(), RED.getValue() + description);
        } else {
            return String.format("%n%sActual      : %s%n%sDescription : %s", WHITE.getValue(), RED.getValue() + actual,
                    WHITE.getValue(), RED.getValue() + description);

        }
    }
}
