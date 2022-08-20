package com.github.ones1kk.asserts.core.description.impl;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.exception.AssertException;
import org.apache.commons.lang3.ArrayUtils;

import java.util.function.Supplier;

public class Description implements Describable {

    private static final String REG_EXR = "Special characters can not be inserted between strings";

    private static final String ARGUMENT_DESCRIPTION = "Argument is missing";

    private static final String ARGUMENTS_EXPRESSION_WITH_BRACE = "Arguments only can be expressed in braces";

    @Override
    public String as(Supplier<String> supplier, Object... args) {
        return getFormattingDescription(supplier.get(), args);
    }

    @Override
    public String as(String description, Object... args) {
        return getFormattingDescription(description, args);
    }

    private String getFormattingDescription(String description, Object[] args) {
        throwIfHavingSpecialChar(description);
        throwIfOnlyArgumentsExist(description, args);

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

    @SuppressWarnings("all")
    private void throwIfOnlyArgumentsExist(String description, Object[] args) {
        if(args.length < 0 && !(description.contains("{}"))) {
            throw new AssertException(ARGUMENTS_EXPRESSION_WITH_BRACE);
        }
    }

}
