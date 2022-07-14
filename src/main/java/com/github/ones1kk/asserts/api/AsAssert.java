package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.description.DescriptionHandler;
import com.github.ones1kk.asserts.api.exception.AssertException;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class AsAssert<SELF> implements AsAssertInterface<SELF> {

    private final DescriptionHandler handler = new DescriptionHandler();

    private final SELF self;

    protected AsAssert(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

    @Override
    public SELF as(Supplier<String> description, @Nullable Object... args) {
        handler.setAsDescription(handler.getPrinter().writeOutput(handler.getDescribable().as(description, args)));
        return self;
    }

    @Override
    public SELF as(String description, @Nullable Object... args) {
        handler.setAsDescription(handler.getPrinter().writeOutput(handler.getDescribable().as(description, args)));
        return self;
    }

    public void setDescription(Object actual, Object expected, String description) {
        handler.setDescription(handler.getPrinter().writeOutput(actual, expected, handler.getDescribable().as(description, actual, expected)));
    }

    public void setDescription(Object actual, String description) {
        handler.setDescription(handler.getPrinter().writeOutput(actual, handler.getDescribable().as(description, actual)));
    }

    public AssertException getException() {
        return handler.getException();
    }

}
