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

import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.FileErrorMessage;
import io.github.ones1kk.assertion.core.message.SizeComparableErrorMessage;
import org.apache.commons.io.FilenameUtils;

import java.io.File;


public class Files extends Objects<File> implements FilesAssertion {

    private final ComparableLanguage<File> comparable = new ComparableLanguageImpl<>();

    /**
     * verify {@code actual} exists.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertExists(AssertionsInfo info, File actual) {
        if (!actual.exists()) {
            throw failures.failure(info, FileErrorMessage.shouldBeExist(actual));
        }
    }

    /**
     * verify {@code actual} is file.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertFile(AssertionsInfo info, File actual) {
        if (!actual.isFile()) {
            throw failures.failure(info, FileErrorMessage.shouldBeFile(actual));
        }
    }

    /**
     * verify {@code actual} is not file.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotFile(AssertionsInfo info, File actual) {
        if (actual.isFile()) {
            throw failures.failure(info, FileErrorMessage.shouldNotBeFile(actual));
        }
    }

    /**
     * verify {@code actual} is directory.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertDirectory(AssertionsInfo info, File actual) {
        if (!actual.isDirectory()) {
            throw failures.failure(info, FileErrorMessage.shouldBeDirectory(actual));
        }
    }

    /**
     * verify {@code actual} is not directory.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotDirectory(AssertionsInfo info, File actual) {
        if (actual.isDirectory()) {
            throw failures.failure(info, FileErrorMessage.shouldNotBeDirectory(actual));
        }
    }

    /**
     * verify {@code actual} is hidden.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertHidden(AssertionsInfo info, File actual) {
        if (!actual.isHidden()) {
            throw failures.failure(info, FileErrorMessage.shouldBeHidden(actual));
        }
    }

    /**
     * verify {@code actual} is not hidden.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotHidden(AssertionsInfo info, File actual) {
        if (actual.isHidden()) {
            throw failures.failure(info, FileErrorMessage.shouldNotBeHidden(actual));
        }
    }

    /**
     * verify {@code actual} can read.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertCanRead(AssertionsInfo info, File actual) {
        if (!actual.canRead()) {
            throw failures.failure(info, FileErrorMessage.shouldBeReadable(actual));
        }
    }

    /**
     * verify {@code actual} cannot be read.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertCanNotRead(AssertionsInfo info, File actual) {
        if (actual.canRead()) {
            throw failures.failure(info, FileErrorMessage.shouldNotBeReadable(actual));
        }
    }

    /**
     * verify {@code actual} can be written.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertCanWrite(AssertionsInfo info, File actual) {
        if (!actual.canWrite()) {
            throw failures.failure(info, FileErrorMessage.shouldBeWritable(actual));
        }
    }

    /**
     * verify {@code actual} cannot be written.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertCanNotWrite(AssertionsInfo info, File actual) {
        if (actual.canWrite()) {
            throw failures.failure(info, FileErrorMessage.shouldNotBeWritable(actual));
        }
    }

    /**
     * verify {@code actual} can be executed.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertCanExecute(AssertionsInfo info, File actual) {
        if (!actual.canExecute()) {
            throw failures.failure(info, FileErrorMessage.shouldBeExecutable(actual));
        }
    }

    /**
     * verify {@code actual} cannot be executed.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertCanNotExecute(AssertionsInfo info, File actual) {
        if (actual.canExecute()) {
            throw failures.failure(info, FileErrorMessage.shouldNotBeExecutable(actual));
        }
    }

    /**
     * verify {@code actual} has extension.
     *
     * @param info      {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual    actual
     * @param extension extension
     */
    @Override
    public void assertHasExtension(AssertionsInfo info, File actual, String extension) {
        if (!FilenameUtils.getExtension(actual.getName()).equals(extension)) {
            throw failures.failure(info, FileErrorMessage.shouldHaveExtension(actual, extension));
        }
    }

    /**
     * verify {@code actual} does not have extension.
     *
     * @param info      {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual    actual
     * @param extension extension
     */
    @Override
    public void assertDoesNotHaveExtension(AssertionsInfo info, File actual, String extension) {
        if (FilenameUtils.getExtension(actual.getName()).equals(extension)) {
            throw failures.failure(info, FileErrorMessage.shouldDoNotHaveExtension(actual, extension));
        }
    }

    /**
     * verify {@code actual} size is smaller than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLessThan(AssertionsInfo info, File actual, File expected) {
        if (comparable.isGreaterThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeSmallerThan(actual, expected));
        }
    }

    /**
     * verify {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertLessThanOrEqualTo(AssertionsInfo info, File actual, File expected) {
        if (comparable.isGreaterThan(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeSmallerThanOrEqualTo(actual, expected));
        }
    }

    /**
     * verify {@code actual} size is larger than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertGreaterThan(AssertionsInfo info, File actual, File expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeLargerThan(actual, expected));
        }
    }

    /**
     * verify {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertGreaterThanOrEqualTo(AssertionsInfo info, File actual, File expected) {
        if (comparable.isLessThan(actual, expected)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeLargerThanOrEqualTo(actual, expected));
        }
    }

    /**
     * verify {@code actual} size is between {@code start} and {@code end}
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     * @param start  start
     * @param end    end
     */
    @Override
    public void assertBetween(AssertionsInfo info, File actual, File start, File end) {
        if (comparable.isLessThan(actual, start) || comparable.isGreaterThan(actual, end)) {
            throw failures.failure(info, SizeComparableErrorMessage.shouldBeBetween(actual, start, end));
        }
    }

}
