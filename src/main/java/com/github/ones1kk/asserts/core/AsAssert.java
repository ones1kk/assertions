package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.description.DescriptionHandler;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class AsAssert<SELF> implements AsAssertInterface<SELF> {

    public final DescriptionHandler handler = new DescriptionHandler();

    private final SELF self;

    public AsAssert(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

    @Override
    public SELF as(Supplier<String> description, @Nullable Object... args) {
        handler.setAsDescription(handler.from(description.get(), args));
        return self;
    }

    @Override
    public SELF as(String description, @Nullable Object... args) {
        handler.setAsDescription(handler.from(description, args));
        return self;
    }

}
