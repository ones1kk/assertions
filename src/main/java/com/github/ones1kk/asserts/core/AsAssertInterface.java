package com.github.ones1kk.asserts.core;

import java.util.function.Supplier;

public interface AsAssertInterface<SELF> {

    SELF as(Supplier<String> description, Object... args);

    SELF as(String description, Object... args);
}
