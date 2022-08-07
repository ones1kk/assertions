package com.github.ones1kk.asserts.core.description.impl;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.exception.AssertException;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class Description implements Describable {

    private static final String REG_EXR = "Special characters can not be inserted between strings";

    private static final String ARGUMENT_DESCRIPTION = "Argument is missing";

    @Override
    public String as(Supplier<String> supplier, @Nullable Object... args) {
        return getFormattingDescription(supplier.get(), args);
    }

    @Override
    public String as(String description, @Nullable Object... args) {
        return getFormattingDescription(description, args);
    }

    private String getFormattingDescription(String description, Object[] args) {
        throwIfHavingSpecialChar(description);

        if (description.contains("{}")) {
            throwIfNull(args);
            return String.format(description.replace("{}", "%s"), args);
        }
        return description;
    }

    private void throwIfNull(Object[] args) {
        if (ArrayUtils.isEmpty(args) || args == null) {
            throw new AssertException(ARGUMENT_DESCRIPTION);
        }
    }

    private void throwIfHavingSpecialChar(String formatted) {
        if (formatted.contains("%s")) {
            throw new AssertException(REG_EXR);
        }
    }

}
