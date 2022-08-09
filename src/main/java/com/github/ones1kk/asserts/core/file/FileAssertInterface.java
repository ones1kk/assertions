package com.github.ones1kk.asserts.core.file;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;

import java.io.File;

public interface FileAssertInterface<SELF> extends ComparableAssert<SELF, File> {

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

}
