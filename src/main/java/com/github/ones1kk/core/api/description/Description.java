package com.github.ones1kk.core.api.description;

import com.github.ones1kk.core.exception.AssertException;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public abstract class Description implements Describable {

    @Override
    public String described(Supplier<String> supplier, @Nullable Object... args) {
        return getFormattingDescription(supplier.get(), args);
    }

    @Override
    public String described(String description, @Nullable Object... args) {
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
        if (args == null) {
            throw new AssertException("arguments are missing");
        }
    }

}
