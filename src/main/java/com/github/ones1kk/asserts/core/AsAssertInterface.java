package com.github.ones1kk.asserts.core;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public interface AsAssertInterface<SELF> {

    SELF as(Supplier<String> description, @Nullable Object... args);

    SELF as(String description, @Nullable Object... args);
}
