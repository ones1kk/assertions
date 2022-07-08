package com.github.ones1kk.core.api.description;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public interface Describable {

    String describedAs(Supplier<String> description, @Nullable Object... args);

    String describedAs(String description, @Nullable Object... args);

    String describedDefault(Object actual, @Nullable Object expected, String description);
}
