package com.github.ones1kk.asserts.core.file.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.description.DescriptionHandler;
import com.github.ones1kk.asserts.core.file.FileSizeComparable;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class Files implements FilesInterface {

    private final DescriptionHandler handler;

    private final FileSizeComparable comparable = new FileSizeComparable();

    public Files(AsAssert<?> asAssert) {
        this.handler = asAssert.handler;
    }

    @Override
    public void assertExists(File actual) {
        if (!actual.exists()) {
            handler.setDescription(handler.from(actual, "{} does not exist"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFile(File actual) {
        if (!actual.isFile()) {
            handler.setDescription(handler.from(actual, "{} is not file"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotFile(File actual) {
        if (actual.isFile()) {
            handler.setDescription(handler.from(actual, "{} is file"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsDirectory(File actual) {
        if (!actual.isDirectory()) {
            handler.setDescription(handler.from(actual, "{} is not directory"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotDirectory(File actual) {
        if (actual.isDirectory()) {
            handler.setDescription(handler.from(actual, "{} is directory"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsHidden(File actual) {
        if (!actual.isHidden()) {
            handler.setDescription(handler.from(actual, "{} is not hidden"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotHidden(File actual) {
        if (actual.isHidden()) {
            handler.setDescription(handler.from(actual, "{} is hidden"));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanRead(File actual) {
        if (!actual.canRead()) {
            handler.setDescription(handler.from(actual, "{} can not read"));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanNotRead(File actual) {
        if (actual.canRead()) {
            handler.setDescription(handler.from(actual, "{} can read"));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanWrite(File actual) {
        if (!actual.canWrite()) {
            handler.setDescription(handler.from(actual, "{} can not write"));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanNotWrite(File actual) {
        if (actual.canWrite()) {
            handler.setDescription(handler.from(actual, "{} can write"));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanExecute(File actual) {
        if (!actual.canExecute()) {
            handler.setDescription(handler.from(actual, "{} can not Execute"));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanNotExecute(File actual) {
        if (actual.canExecute()) {
            handler.setDescription(handler.from(actual, "{} can Execute"));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasExtension(File actual, String extension) {
        if (!FilenameUtils.getExtension(actual.getName()).equals(extension)) {
            handler.setDescription(handler.from(actual, extension, "{} does not have {} as extension"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHaveExtension(File actual, String extension) {
        if (FilenameUtils.getExtension(actual.getName()).equals(extension)) {
            handler.setDescription(handler.from(actual, extension, "{} has {} as extension"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(File actual, File expected) {
        if (comparable.isLargerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not less than {} size of "));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(File actual, File expected) {
        if (comparable.isLargerThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not less than or equal to size of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(File actual, File expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not greater than size of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(File actual, File expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not greater than or equal to size of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(File actual, File start, File end) {
        if (comparable.isSmallerThan(actual, start)
                || comparable.isLargerThan(actual, end)) {
            String description = handler.from("size of {} is not between size of {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
