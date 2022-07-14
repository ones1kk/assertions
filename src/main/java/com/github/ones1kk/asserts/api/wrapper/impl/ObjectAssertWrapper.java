package com.github.ones1kk.asserts.api.wrapper.impl;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.description.impl.Description;
import com.github.ones1kk.asserts.api.feature.print.Printer;
import com.github.ones1kk.asserts.api.feature.print.impl.DefaultPrinter;
import com.github.ones1kk.asserts.api.lang.model.ObjectAssert;
import com.github.ones1kk.asserts.api.wrapper.AssertWrapper;

import javax.annotation.Nullable;
import java.util.function.Supplier;

@Deprecated
public class ObjectAssertWrapper implements AssertWrapper<ObjectAssert> {

    protected final Describable describable = new Description();

    protected final Printer printer = new DefaultPrinter();


    @Override
    public ObjectAssert as(Supplier<String> description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return null;
    }

    @Override
    public ObjectAssert as(String description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return null;
    }
}
