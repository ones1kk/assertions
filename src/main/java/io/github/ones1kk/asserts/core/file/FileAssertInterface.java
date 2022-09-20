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

import io.github.ones1kk.asserts.core.feature.comparable.SizeComparableAssert;

import java.io.File;

/**
 * <strong> The FileAssertInterface class is for a comparable, having File Type, assertable interface class.</strong>
 *
 * @param <SELF> {@code self}.
 */
public interface FileAssertInterface<SELF> extends SizeComparableAssert<SELF, File> {

    SELF exists();

    SELF isFile();

    SELF isNotFile();

    SELF isDirectory();

    SELF isNotDirectory();

    SELF isHidden();

    SELF isNotHidden();

    SELF canRead();

    SELF canNotRead();

    SELF canWrite();

    SELF canNotWrite();

    SELF canExecute();

    SELF canNotExecute();

    SELF hasExtension(String extension);

    SELF doesNotHaveExtension(String extension);
}
