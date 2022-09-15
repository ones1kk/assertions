/*
 * Copyright (c) 2022. Wonsik Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.ones1kk.asserts.core.file.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.file.FileSizeComparable;
import com.github.ones1kk.asserts.core.file.FilesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

/**
 * <strong> The Files class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public class Files extends Objects<File> implements FilesInterface {

    private final FileSizeComparable comparable = new FileSizeComparable();

    public Files(AsAssert<?> asAssert) {
        super(asAssert);
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
            handler.setDescription(handler.from(actual, "{} cannot read"));
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
            handler.setDescription(handler.from(actual, "{} cannot write"));
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
            handler.setDescription(handler.from(actual, "{} cannot Execute"));
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
    public void assertIsSmallerThan(File actual, File expected) {
        if (comparable.isLargerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not less than {} size of "));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThanOrEqualTo(File actual, File expected) {
        if (comparable.isLargerThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not less than or equal to size of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThan(File actual, File expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not greater than size of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThanOrEqualTo(File actual, File expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "size of {} is not greater than or equal to size of {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenSizeOf(File actual, File start, File end) {
        if (comparable.isSmallerThan(actual, start)
                || comparable.isLargerThan(actual, end)) {
            String description = handler.from("size of {} is not between size of {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }
}
