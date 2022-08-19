package com.github.ones1kk.asserts.core.description;

import java.util.function.Supplier;

public interface Describable {

    String as(Supplier<String> description, Object... args);

    String as(String description, Object... args);

}
