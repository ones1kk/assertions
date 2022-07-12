package com.github.ones1kk.asserts.api.feature.print;

import javax.annotation.Nullable;

public interface Printer {

    String print(Object actual, @Nullable Object expected, String description);
}
