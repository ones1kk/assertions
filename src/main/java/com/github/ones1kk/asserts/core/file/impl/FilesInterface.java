package com.github.ones1kk.asserts.core.file.impl;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;

import java.io.File;

public interface FilesInterface {

    void assertExists(File actual);

    void assertIsFile(File actual);

    void assertIsNotFile(File actual);

    void assertIsDirectory(File actual);

    void assertIsNotDirectory(File actual);

    void assertIsHidden(File actual);

    void assertIsNotHidden(File actual);

    void assertCanRead(File actual);

    void assertCanNotRead(File actual);

    void assertCanWrite(File actual);

    void assertCanNotWrite(File actual);

    void assertCanExecute(File actual);

    void assertCanNotExecute(File actual);

    void assertHasExtension(File actual, String extension);

    void assertDoesNotHaveExtension(File actual, String extension);
}
