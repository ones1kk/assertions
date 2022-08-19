package com.github.ones1kk.asserts.core.wrapper.impl;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.description.impl.Description;
import com.github.ones1kk.asserts.core.feature.print.Printer;
import com.github.ones1kk.asserts.core.feature.print.impl.DefaultPrinter;
import com.github.ones1kk.asserts.core.lang.model.CharSequenceAssert;
import com.github.ones1kk.asserts.core.wrapper.AssertWrapper;

import java.util.function.Supplier;

@Deprecated
public class CharSequenceAssertWrapper implements AssertWrapper<CharSequenceAssert> {

    protected final Describable describable = new Description();

    protected final Printer printer = new DefaultPrinter();


    @Override
    public CharSequenceAssert as(Supplier<String> description, Object... args) {
        String asDescription = describable.as(description, args);
        return null;
    }

    @Override
    public CharSequenceAssert as(String description, Object... args) {
        String asDescription = describable.as(description, args);
        return null;
    }
}
