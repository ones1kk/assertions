package com.github.ones1kk.asserts.core.file;

import java.io.File;

public interface FileAssertInterface<SELF> {

    SELF exists();

    SELF isFile();

    SELF isNotFile();

    SELF isDirectory();

    SELF isNotDirectory();

    SELF isHidden();

    SELF isNotHidden();

    SELF canRead();

    SELF canNotRead();

    SELF canWrite();

    SELF canNotWrite();

    SELF canExecute();

    SELF canNotExecute();

    SELF hasExtension(String extension);

    SELF doesNotHaveExtension(String extension);

    SELF isSmallerThan(File expected);

    SELF isSmallerThanOrEqualTo(File expected);

    SELF isLargerThan(File expected);

    SELF isLargerThanOrEqualTo(File expected);

    SELF isBetween(File start, File end);

}
