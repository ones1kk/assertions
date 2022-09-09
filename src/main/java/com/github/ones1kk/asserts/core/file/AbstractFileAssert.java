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

package com.github.ones1kk.asserts.core.file;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.io.File;

/**
 * <strong> The AbstractShortAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br><br>
 * <p> This is that implements the assertion method of the File type and verify assertion.</p>
 *
 * @param <SELF>
 */
public class AbstractFileAssert<SELF extends AbstractFileAssert<SELF>> extends AbstractObjectAssert<SELF, File> implements FileAssertInterface<SELF> {

    private final FilesInterface files;

    public AbstractFileAssert(Class<?> self, File actual) {
        super(self, actual);
        this.files = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} exists or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF exists() {
        files.assertExists(actual);
        return self;
    }

    /**
     * Verify {@code actual} is file or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isFile() {
        files.assertIsFile(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not file or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotFile() {
        files.assertIsNotFile(actual);
        return self;
    }

    /**
     * Verify {@code actual} is directory or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isDirectory() {
        files.assertIsDirectory(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not directory or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotDirectory() {
        files.assertIsNotDirectory(actual);
        return self;
    }

    /**
     * Verify {@code actual} is hidden or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isHidden() {
        files.assertIsHidden(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not hidden or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotHidden() {
        files.assertIsNotHidden(actual);
        return self;
    }

    /**
     * Verify {@code actual} can read or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF canRead() {
        files.assertCanRead(actual);
        return self;
    }

    /**
     * Verify {@code actual} cannot be read or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF canNotRead() {
        files.assertCanNotRead(actual);
        return self;
    }

    /**
     * Verify {@code actual} can be written or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF canWrite() {
        files.assertCanWrite(actual);
        return self;
    }

    /**
     * Verify {@code actual} cannot be written or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF canNotWrite() {
        files.assertCanNotWrite(actual);
        return self;
    }

    /**
     * Verify {@code actual} can be executed or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF canExecute() {
        files.assertCanExecute(actual);
        return self;
    }

    /**
     * Verify {@code actual} cannot be executed or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF canNotExecute() {
        files.assertCanNotExecute(actual);
        return self;
    }

    /**
     * Verify {@code actual} has extension or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF hasExtension(String extension) {
        files.assertHasExtension(actual, extension);
        return self;
    }

    /**
     * Verify {@code actual} does not have extension or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotHaveExtension(String extension) {
        files.assertDoesNotHaveExtension(actual, extension);
        return self;
    }

    /**
     * Verify {@code actual} size is smaller than {@code expected}.
     *
     * @param expected greater than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThan(File expected) {
        files.assertIsSmallerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThanOrEqualTo(File expected) {
        files.assertIsSmallerThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is larger than {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThan(File expected) {
        files.assertIsLargerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThanOrEqualTo(File expected) {
        files.assertIsLargerThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is between {@code start} and {@code end}
     *
     * @param start smaller than or Equal to {@code actual}
     * @param end   larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isBetween(File start, File end) {
        files.assertIsBetween(actual, start, end);
        return self;
    }
}
