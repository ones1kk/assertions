package com.github.ones1kk.asserts.core.description;

import com.github.ones1kk.asserts.core.description.impl.Description;
import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.feature.print.Printer;
import com.github.ones1kk.asserts.core.feature.print.impl.DefaultPrinter;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;

public final class DescriptionHandler {

    private final Printer printer = new DefaultPrinter();

    private final Describable describable = new Description();

    private String description;

    private String asDescription;

    public String from(String description, @Nullable Object... args) {
        return printer.writeOutput(describable.as(description, args));
    }

    public String from(Object actual, String description) {
        return printer.writeOutput(actual, describable.as(description, actual));
    }

    public String from(Object actual, Object expected, String description) {
        return printer.writeOutput(actual, expected, describable.as(description, actual, expected));
    }

    public AssertException getException() {
        if (isEmptyAsDescription()) {
            return new AssertException(description);
        }
        return new AssertException(asDescription);
    }

    private boolean isEmptyAsDescription() {
        return StringUtils.isEmpty(asDescription);
    }

    public void setAsDescription(String asDescription) {
        this.asDescription = asDescription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Describable getDescribable() {
        return describable;
    }
}
