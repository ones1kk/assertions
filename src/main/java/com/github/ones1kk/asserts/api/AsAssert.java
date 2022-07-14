package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.description.impl.Description;
import com.github.ones1kk.asserts.api.exception.AssertException;
import com.github.ones1kk.asserts.api.feature.print.Printer;
import com.github.ones1kk.asserts.api.feature.print.impl.DefaultPrinter;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class AsAssert<SELF> implements AsAssertInterface<SELF> {

    private final Describable describable = new Description();

    private final Printer printer = new DefaultPrinter();

    private final SELF self;

    private String description;

    private String asDescription;

    protected AsAssert(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

    @Override
    public SELF as(Supplier<String> description, @Nullable Object... args) {
        this.asDescription = printer.writeOutput(describable.as(description, args));
        return self;
    }

    @Override
    public SELF as(String description, @Nullable Object... args) {
        this.asDescription = printer.writeOutput(describable.as(description, args));
        return self;
    }

    public void setDescription(Object actual, Object expected, String description) {
        this.description = printer.writeOutput(actual, expected, describable.as(description, actual, expected));

    }

    public void setDescription(Object actual, String description) {
        this.description = printer.writeOutput(actual, describable.as(description, actual));
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

}
