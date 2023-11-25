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

import io.github.ones1kk.assertion.core.feature.compare.ComparableAssertion;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.ObjectsAssertion;

import java.io.File;

public interface FilesAssertion extends ObjectsAssertion<File>, ComparableAssertion<File> {

    void assertExists(AssertionsInfo info, File actual);

    void assertFile(AssertionsInfo info, File actual);

    void assertNotFile(AssertionsInfo info, File actual);

    void assertDirectory(AssertionsInfo info, File actual);

    void assertNotDirectory(AssertionsInfo info, File actual);

    void assertHidden(AssertionsInfo info, File actual);

    void assertNotHidden(AssertionsInfo info, File actual);

    void assertCanRead(AssertionsInfo info, File actual);

    void assertCanNotRead(AssertionsInfo info, File actual);

    void assertCanWrite(AssertionsInfo info, File actual);

    void assertCanNotWrite(AssertionsInfo info, File actual);

    void assertCanExecute(AssertionsInfo info, File actual);

    void assertCanNotExecute(AssertionsInfo info, File actual);

    void assertHasExtension(AssertionsInfo info, File actual, String extension);

    void assertDoesNotHaveExtension(AssertionsInfo info, File actual, String extension);

}
