package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.description.DescriptionHandler;

import java.util.function.Supplier;

public class AsAssert<SELF> implements AsAssertInterface<SELF> {

    public final DescriptionHandler handler = new DescriptionHandler();

    private final SELF self;

    @SuppressWarnings("all")
    public AsAssert(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

    @Override
    public SELF as(Supplier<String> description, Object... args) {
        handler.setAsDescription(handler.from(description.get(), args));
        return self;
    }

    @Override
    public SELF as(String description, Object... args) {
        handler.setAsDescription(handler.from(description, args));
        return self;
    }

}
