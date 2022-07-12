package com.github.ones1kk.asserts.api.description;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public interface Describable {

    String described(Supplier<String> description, @Nullable Object... args);

    String described(String description, @Nullable Object... args);

    String describedFormat(Object actual, @Nullable Object expected, String description);
}
