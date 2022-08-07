package com.github.ones1kk.asserts.core.description;

import javax.annotation.Nullable;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public interface Describable {

    String as(Supplier<String> description, @Nullable Object... args);

    String as(String description, @Nullable Object... args);

}
