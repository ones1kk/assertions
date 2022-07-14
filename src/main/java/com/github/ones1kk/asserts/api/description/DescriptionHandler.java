package com.github.ones1kk.asserts.api.description;

import com.github.ones1kk.asserts.api.description.impl.Description;
import com.github.ones1kk.asserts.api.exception.AssertException;
import com.github.ones1kk.asserts.api.feature.print.Printer;
import com.github.ones1kk.asserts.api.feature.print.impl.DefaultPrinter;
import org.apache.commons.lang3.StringUtils;

public class DescriptionHandler {

    private final Printer printer = new DefaultPrinter();

    private final Describable describable = new Description();

    private String description;

    private String asDescription;

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

    public Printer getPrinter() {
        return printer;
    }

    public Describable getDescribable() {
        return describable;
    }
}
