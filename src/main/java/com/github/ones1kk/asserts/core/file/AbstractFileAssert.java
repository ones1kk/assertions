package com.github.ones1kk.asserts.core.file;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.AssertFactory;
import com.github.ones1kk.asserts.core.file.impl.FilesInterface;

import java.io.File;

public class AbstractFileAssert<SELF extends AbstractFileAssert<SELF>> extends AsAssert<SELF> implements FileAssertInterface<SELF> {

    private final SELF self;

    private final File actual;

    protected final AssertFactory assertFactory = new AssertFactory();

    private final FilesInterface files;

    public AbstractFileAssert(Class<?> self, File actual) {
        super(self);
        this.self = (SELF) self.cast(this);
        this.actual = actual;
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
    public SELF isLessThan(File expected) {
        files.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(File expected) {
        files.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(File expected) {
        files.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(File expected) {
        files.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(File start, File end) {
        files.assertIsBetween(actual, start, end);
        return self;
    }
}
