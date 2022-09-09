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

package com.github.ones1kk.asserts.core.feature.comparable.file;

import java.io.File;

/**
 * <strong> The FileSizeComparable class compares comparable ELEMENT type parameter.</strong>
 */
public class FileSizeComparable {

    public boolean isLargerThan(File actual, File expected) {
        return actual.length() > expected.length();
    }


    public boolean isSmallerThan(File actual, File expected) {
        return actual.length() < expected.length();
    }


    public boolean isSmallerThanOrEqualTo(File actual, File expected) {
        return actual.length() <= expected.length();
    }


    public boolean isLargerThanOrEqualTo(File actual, File expected) {
        return actual.length() >= expected.length();
    }


    public boolean is(File actual, File expected) {
        return actual.equals(expected);
    }
}
