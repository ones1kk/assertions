package com.github.ones1kk.core.api.description;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public abstract class Description implements Describable {

    @Override
    public String describedAs(Supplier<String> supplier, @Nullable Object... args) {
        return getFormattingDescription(supplier.get(), args);
    }

    @Override
    public String describedAs(String description, @Nullable Object... args) {
        return getFormattingDescription(description, args);
    }

    private String getFormattingDescription(String description, Object[] args) {
        if (description.contains("{}")) {
            if (args == null) {
                throw new IllegalArgumentException("argument is missing");
            }
            return String.format(description.replace("{}", "%s"), args);
        } else {
            return description;
        }

    }
}
