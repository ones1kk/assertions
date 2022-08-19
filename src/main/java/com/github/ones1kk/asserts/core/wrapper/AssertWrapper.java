package com.github.ones1kk.asserts.core.wrapper;

import java.util.function.Supplier;

@Deprecated
public interface AssertWrapper<SELF> {

    SELF as(Supplier<String> description, Object... args);

    SELF as(String description, Object... args);
}
