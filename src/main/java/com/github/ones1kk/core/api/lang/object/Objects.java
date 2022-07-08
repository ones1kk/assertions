package com.github.ones1kk.core.api.lang.object;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public interface Objects<TYPE> {

    void assertIsNull(TYPE actual);

    void assertIsNotNull(TYPE actual);

    void assertIsSameAs(TYPE actual, TYPE expected);

    void assertIsEqualTo(TYPE actual, TYPE expected);

    void assertIsNotEqualTo(TYPE actual, TYPE expected);

    void assertIsAssignableFrom(Class<?> expected);

    String describedAs(Supplier<String> description, @Nullable Object... args);

    String describedAs(String description, @Nullable Object... args);

}
