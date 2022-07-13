package com.github.ones1kk.asserts.api.wrapper.impl;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.description.impl.Description;
import com.github.ones1kk.asserts.api.feature.print.Printer;
import com.github.ones1kk.asserts.api.feature.print.impl.DefaultPrinter;
import com.github.ones1kk.asserts.api.lang.model.ObjectAssert;
import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.api.wrapper.AssertWrapper;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ObjectAssertWrapper extends AbstractObjectAssert<ObjectAssert, Object> implements AssertWrapper<ObjectAssert> {

    protected final Describable describable = new Description();

    protected final Printer printer = new DefaultPrinter();

    public ObjectAssertWrapper(Object actual, String asDescription) {
        super(ObjectAssertWrapper.class, actual, asDescription);
    }

    @Override
    public ObjectAssert as(Supplier<String> description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return new ObjectAssert(actual, printer.writeOutput(actual, asDescription));
    }

    @Override
    public ObjectAssert as(String description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return new ObjectAssert(actual, printer.writeOutput(actual, asDescription));
    }
}
