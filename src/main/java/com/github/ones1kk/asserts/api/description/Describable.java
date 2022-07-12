package com.github.ones1kk.asserts.api.description;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public interface Describable {

    String as(Supplier<String> description, @Nullable Object... args);

    String as(String description, @Nullable Object... args);

}