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

package io.github.ones1kk.asserts.core.file.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.feature.comparable.file.FileSizeComparable;
import io.github.ones1kk.asserts.core.file.FilesInterface;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.impl.Objects;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

import static io.github.ones1kk.asserts.core.message.FileErrorMessages.*;
import static io.github.ones1kk.asserts.core.message.SizeComparableErrorMessages.*;

/**
 * <strong> The Files class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Files extends Objects<File> implements FilesInterface {

    private final FileSizeComparable comparable = new FileSizeComparable();

    public Files(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertExists(File actual) {
        if (!actual.exists()) {
            handler.receive(actual, shouldBeExist(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFile(File actual) {
        if (!actual.isFile()) {
            handler.receive(actual, shouldBeFile(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotFile(File actual) {
        if (actual.isFile()) {
            handler.receive(actual, shouldNotBeFile(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsDirectory(File actual) {
        if (!actual.isDirectory()) {
            handler.receive(actual, shouldBeDirectory(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotDirectory(File actual) {
        if (actual.isDirectory()) {
            handler.receive(actual, shouldNotBeDirectory(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsHidden(File actual) {
        if (!actual.isHidden()) {
            handler.receive(actual, shouldBeHidden(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotHidden(File actual) {
        if (actual.isHidden()) {
            handler.receive(actual, shouldNotBeHidden(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanRead(File actual) {
        if (!actual.canRead()) {
            handler.receive(actual, shouldBeReadable(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanNotRead(File actual) {
        if (actual.canRead()) {
            handler.receive(actual, shouldNotBeReadable(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanWrite(File actual) {
        if (!actual.canWrite()) {
            handler.receive(actual, shouldBeWritable(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanNotWrite(File actual) {
        if (actual.canWrite()) {
            handler.receive(actual, shouldNotBeWritable(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanExecute(File actual) {
        if (!actual.canExecute()) {
            handler.receive(actual, shouldBeExecutable(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertCanNotExecute(File actual) {
        if (actual.canExecute()) {
            handler.receive(actual, shouldNotBeExecutable(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasExtension(File actual, String extension) {
        if (!FilenameUtils.getExtension(actual.getName()).equals(extension)) {
            handler.receive(actual, extension, shouldHaveExtension(actual, extension));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHaveExtension(File actual, String extension) {
        if (FilenameUtils.getExtension(actual.getName()).equals(extension)) {
            handler.receive(actual, extension, shouldDoNotHaveExtension(actual, extension));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThan(File actual, File expected) {
        if (comparable.isLargerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeSmallerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSmallerThanOrEqualTo(File actual, File expected) {
        if (comparable.isLargerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeSmallerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThan(File actual, File expected) {
        if (comparable.isSmallerThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeLargerThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLargerThanOrEqualTo(File actual, File expected) {
        if (comparable.isSmallerThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLargerThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetweenSizeOf(File actual, File start, File end) {
        if (comparable.isSmallerThan(actual, start) || comparable.isLargerThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
