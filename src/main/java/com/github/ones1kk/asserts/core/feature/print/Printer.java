package com.github.ones1kk.asserts.core.feature.print;

public interface Printer {

    String writeOutput(Object actual, Object expected, String description);

    String writeOutput(Object actual, String description);

    String writeOutput(String description);

}
