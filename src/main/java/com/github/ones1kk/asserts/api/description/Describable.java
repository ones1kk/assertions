package com.github.ones1kk.asserts.api.description;

import javax.annotation.Nullable;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public interface Describable {

    Pattern pattern = Pattern.compile("[^\\s][!@#%$^&*(),.?\":|<>]/g");

    String as(Supplier<String> description, @Nullable Object... args);

    String as(String description, @Nullable Object... args);

}
