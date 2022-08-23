package com.github.ones1kk.asserts.core.feature.comparable.file;

import java.io.File;

public class FileSizeComparable {

    public boolean isLargerThan(File actual, File expected) {
        return actual.length() > expected.length();
    }


    public boolean isSmallerThan(File actual, File expected) {
        return actual.length() < expected.length();
    }


    public boolean isSmallerThanOrEqualTo(File actual, File expected) {
        return actual.length() <= expected.length();
    }


    public boolean isLargerThanOrEqualTo(File actual, File expected) {
        return actual.length() >= expected.length();
    }


    public boolean is(File actual, File expected) {
        return actual.equals(expected);
    }
}
