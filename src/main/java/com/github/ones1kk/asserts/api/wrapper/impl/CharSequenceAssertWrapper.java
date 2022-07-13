package com.github.ones1kk.asserts.api.wrapper.impl;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.description.impl.Description;
import com.github.ones1kk.asserts.api.feature.print.Printer;
import com.github.ones1kk.asserts.api.feature.print.impl.DefaultPrinter;
import com.github.ones1kk.asserts.api.lang.charsequence.AbstractCharSequenceAssert;
import com.github.ones1kk.asserts.api.lang.model.CharSequenceAssert;
import com.github.ones1kk.asserts.api.wrapper.AssertWrapper;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class CharSequenceAssertWrapper extends AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> implements AssertWrapper<CharSequenceAssert> {

    protected final Describable describable = new Description();

    protected final Printer printer = new DefaultPrinter();

    public CharSequenceAssertWrapper(CharSequence actual, String asDescription) {
        super(CharSequenceAssertWrapper.class, actual, asDescription);
    }

    @Override
    public CharSequenceAssert as(Supplier<String> description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return new CharSequenceAssert(actual, printer.writeOutput(actual, asDescription));
    }

    @Override
    public CharSequenceAssert as(String description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return new CharSequenceAssert(actual, printer.writeOutput(actual, asDescription));
    }
}
