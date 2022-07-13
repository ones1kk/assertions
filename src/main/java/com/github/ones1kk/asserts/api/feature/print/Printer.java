package com.github.ones1kk.asserts.api.feature.print;

public interface Printer {

    String writeOutput(Object actual, Object expected, String description);

    String writeOutput(Object actual, String description);
}
