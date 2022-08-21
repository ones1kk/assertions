package com.github.ones1kk.asserts.core.file;

import com.github.ones1kk.asserts.core.file.impl.Files;
import com.github.ones1kk.asserts.core.file.impl.FilesInterface;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.io.File;

public class AbstractFileAssert<SELF extends AbstractFileAssert<SELF>> extends AbstractObjectAssert<SELF, File> implements FileAssertInterface<SELF> {

    private final FilesInterface files;

    public AbstractFileAssert(Class<?> self, File actual) {
        super(self, actual);
        this.files = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF exists() {
        files.assertExists(actual);
        return self;
    }

    @Override
    public SELF isFile() {
        files.assertIsFile(actual);
        return self;
    }

    @Override
    public SELF isNotFile() {
        files.assertIsNotFile(actual);
        return self;
    }

    @Override
    public SELF isDirectory() {
        files.assertIsDirectory(actual);
        return self;
    }

    @Override
    public SELF isNotDirectory() {
        files.assertIsNotDirectory(actual);
        return self;
    }

    @Override
    public SELF isHidden() {
        files.assertIsHidden(actual);
        return self;
    }

    @Override
    public SELF isNotHidden() {
        files.assertIsNotHidden(actual);
        return self;
    }

    @Override
    public SELF canRead() {
        files.assertCanRead(actual);
        return self;
    }

    @Override
    public SELF canNotRead() {
        files.assertCanNotRead(actual);
        return self;
    }

    @Override
    public SELF canWrite() {
        files.assertCanWrite(actual);
        return self;
    }

    @Override
    public SELF canNotWrite() {
        files.assertCanNotWrite(actual);
        return self;
    }

    @Override
    public SELF canExecute() {
        files.assertCanExecute(actual);
        return self;
    }

    @Override
    public SELF canNotExecute() {
        files.assertCanNotExecute(actual);
        return self;
    }

    @Override
    public SELF hasExtension(String extension) {
        files.assertHasExtension(actual, extension);
        return self;
    }

    @Override
    public SELF doesNotHaveExtension(String extension) {
        files.assertDoesNotHaveExtension(actual, extension);
        return self;
    }

    @Override
    public SELF isSmallerThan(File expected) {
        files.assertIsSmallerThan(actual, expected);
        return self;
    }

    @Override
    public SELF isSmallerThanOrEqualTo(File expected) {
        files.assertIsSmallerThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isLargerThan(File expected) {
        files.assertIsLargerThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLargerThanOrEqualTo(File expected) {
        files.assertIsLargerThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(File start, File end) {
        files.assertIsBetween(actual, start, end);
        return self;
    }
}
