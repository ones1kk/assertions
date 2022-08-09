package com.github.ones1kk.asserts.core.file.model;

import com.github.ones1kk.asserts.core.file.AbstractFileAssert;

import java.io.File;

public class FileAssert extends AbstractFileAssert<FileAssert> {

    public FileAssert(File file) {
        super(FileAssert.class, file);
    }
}
