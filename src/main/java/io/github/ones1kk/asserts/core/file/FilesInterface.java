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

package io.github.ones1kk.asserts.core.file;

import io.github.ones1kk.asserts.core.feature.comparable.SizeComparable;

import java.io.File;

/**
 * <strong> The FilesInterface class is for a comparable, having File type, assertable assertion implementation class.</strong>
 */
public interface FilesInterface extends SizeComparable<File> {

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
