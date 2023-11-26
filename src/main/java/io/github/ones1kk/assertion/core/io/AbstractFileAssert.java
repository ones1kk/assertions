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
package io.github.ones1kk.assertion.core.io;

import io.github.ones1kk.assertion.core.AbstractAssert;
import io.github.ones1kk.assertion.core.feature.comparable.Measurable;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

import java.io.File;

/**
 * <strong> The AbstractShortAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the File type and verify assertion.</p>
 */
public class AbstractFileAssert extends AbstractAssert<AbstractFileAssert, File> implements FileAssertion<AbstractFileAssert>, Measurable<AbstractFileAssert, File> {

    private final FilesAssertion files;

    public AbstractFileAssert(Class<?> self, File actual) {
        super(self, actual);
        this.files = new Files();
    }

    /**
     * verify {@code actual} exists.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert exists() {
        files.assertExists(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is file.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert isFile() {
        files.assertFile(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not file.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert isNotFile() {
        files.assertNotFile(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is directory.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert isDirectory() {
        files.assertDirectory(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not directory.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert isNotDirectory() {
        files.assertNotDirectory(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is hidden.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert isHidden() {
        files.assertHidden(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not hidden.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert isNotHidden() {
        files.assertNotHidden(info, actual);
        return self;
    }

    /**
     * verify {@code actual} can read.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert canRead() {
        files.assertCanRead(info, actual);
        return self;
    }

    /**
     * verify {@code actual} cannot be read.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert canNotRead() {
        files.assertCanNotRead(info, actual);
        return self;
    }

    /**
     * verify {@code actual} can be written.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert canWrite() {
        files.assertCanWrite(info, actual);
        return self;
    }

    /**
     * verify {@code actual} cannot be written.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert canNotWrite() {
        files.assertCanNotWrite(info, actual);
        return self;
    }

    /**
     * verify {@code actual} can be executed.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert canExecute() {
        files.assertCanExecute(info, actual);
        return self;
    }

    /**
     * verify {@code actual} cannot be executed.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert canNotExecute() {
        files.assertCanNotExecute(info, actual);
        return self;
    }

    /**
     * verify {@code actual} has extension.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert hasExtension(String extension) {
        files.assertHasExtension(info, actual, extension);
        return self;
    }

    /**
     * verify {@code actual} does not have extension.
     *
     * @return {@link AbstractFileAssert}.
     */
    @Override
    public AbstractFileAssert doesNotHaveExtension(String extension) {
        files.assertDoesNotHaveExtension(info, actual, extension);
        return self;
    }

    /**
     * verify {@code actual} size is smaller than {@code expected}.
     *
     * @param expected greater than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractFileAssert isSmallerThan(File expected) {
        files.assertLessThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractFileAssert isSmallerThanOrEqualTo(File expected) {
        files.assertLessThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is larger than {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractFileAssert isLargerThan(File expected) {
        files.assertGreaterThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractFileAssert isLargerThanOrEqualTo(File expected) {
        files.assertGreaterThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is between {@code start} and {@code end}
     *
     * @param start smaller than or Equal to {@code actual}
     * @param end   larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractFileAssert isBetweenSizeOf(File start, File end) {
        files.assertBetween(info, actual, start, end);
        return self;
    }
}
