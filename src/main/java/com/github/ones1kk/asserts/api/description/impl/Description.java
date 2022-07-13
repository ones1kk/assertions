package com.github.ones1kk.asserts.api.description.impl;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.exception.AssertException;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class Description implements Describable {

    @Override
    public String as(Supplier<String> supplier, @Nullable Object... args) {
        return getFormattingDescription(supplier.get(), args);
    }

    @Override
    public String as(String description, @Nullable Object... args) {
        return getFormattingDescription(description, args);
    }

    private String getFormattingDescription(String description, Object[] args) {
        if (description.contains("{}")) {
            throwIfNull(args);
            return String.format(description.replace("{}", "%s"), args);
        }
        return description;
    }

    private void throwIfNull(Object[] args) {
        if (ArrayUtils.isEmpty(args) || args == null) {
            throw new AssertException("arguments are missing");
        }
    }

}
